/*
 * Autor: Alejandro Gallego Gragera.
 * Correo electrónico: alejandro.gallegogragera@alumnos.upm.es
 */
package progii.juegotablero.model.ajedrez.piezas;

import list.ArrayList;
import list.IList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.ControlJugadoresAjedrez;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

public class Peon extends PiezaAjedrez {

    /**
     * Calcula los movimientos válidos del peón según las reglas del ajedrez:
     *
     * 1. Avance de 1 casilla hacia delante, sólo si está vacía.
     * 2. Avance de 2 casillas desde la posición inicial, sólo si ambas están vacías.
     * 3. Captura diagonal (±1 columna, 1 fila adelante), sólo si hay una pieza enemiga.
     *
     * Dirección de avance:
     *   - BLANCO (id=0): fila de inicio ajedrez=2 → matriz=6, avanza decreciendo fila (incFila=-1)
     *   - NEGRO  (id=1): fila de inicio ajedrez=7 → matriz=1, avanza incrementando fila (incFila=+1)
     *
     * Nota: se trabaja internamente con coordenadas de matriz (0-7).
     */
    @Override
    public IList<Casilla> movimientosValidos() {
        IList<Casilla> resultado = new ArrayList<>();

        int filaActual    = super.getFila();
        int columnaActual = super.getColumna();

        // BLANCO: avanza hacia arriba  → incFila = -1, posición inicial = fila 6
        // NEGRO: avanza hacia abajo   → incFila = +1, posición inicial = fila 1
        boolean esBlanco  = (this.getJugador().getId() == ControlJugadoresAjedrez.BLANCO);
        int     incFila   = esBlanco ? -1 : 1;
        int     filaInicial = esBlanco ? 6 : 1;

        int filaFrente = filaActual + incFila;

        //1. Avance de 1 casilla 
        if (movimientoDentroLimites(filaFrente, columnaActual) && queHay(filaFrente, columnaActual) == null) {
                resultado.add(resultado.size(), new Casilla(filaFrente, columnaActual));
                }

                // 2. Avance de 2 casillas desde la posición inicial 
                int filaDos = filaFrente + incFila;
                if (filaActual == filaInicial && movimientoDentroLimites(filaDos, columnaActual)) {
                    PiezaAjedrez piezaDos = queHay(filaDos, columnaActual);
                    if (piezaDos == null) {
                        resultado.add(resultado.size(), new Casilla(filaDos, columnaActual));
                    }
                }

        // 3. Capturas diagonales 
        int[] desplazamientosColumna = {-1, +1};
        for (int dCol : desplazamientosColumna) {
            int colCaptura = columnaActual + dCol;
            if (movimientoDentroLimites(filaFrente, colCaptura)) {
                PiezaAjedrez piezaCaptura = queHay(filaFrente, colCaptura);
                if (piezaCaptura != null
                        && piezaCaptura.getJugador().getId() != this.getJugador().getId()) {
                    resultado.add(resultado.size(), new Casilla(filaFrente, colCaptura));
                }
            }
        }

        return resultado;
    }

    
    

    public Peon(Jugador jugador, int fila, char columna) {
        super(jugador, TipoPiezaAjedrez.PEON, fila, columna);
    }
}
