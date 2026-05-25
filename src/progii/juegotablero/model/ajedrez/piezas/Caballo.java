/*
 * Autor: Alejandro Gallego Gragera.
 * Correo electrónico: alejandro.gallegogragera@alumnos.upm.es
 */

package progii.juegotablero.model.ajedrez.piezas;

import list.ArrayList;
import list.IList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

public class Caballo extends PiezaAjedrez {

	@Override
	public IList<Casilla> movimientosValidos() {
		IList<Casilla> resultado = new ArrayList<>();
		int filaActual = super.getFila();
		int columnaActual = super.getColumna();
		//Describimos el caballo como un movimiento en L, así que incFila = 2 (si el movimiento es así ¬) o incColumna = 2 (si el movimiento es una L invertida).

		//El caballo se mueve dos casillas en horizontal izquierda y una casilla hacia arriba.
		casillaVisitable(resultado,filaActual-1, columnaActual-2);

		//El caballo se mueve dos casillas en horizontal izquierda y una casilla hacia abajo.
		casillaVisitable(resultado,filaActual+1 , columnaActual-2);

		//El caballo se mueve dos casillas en vertical hacia arriba y una casilla a la derecha.
		casillaVisitable(resultado, filaActual-2 ,columnaActual +1);

		//El caballo se mueve dos casillas en vertical hacia arriba y una casilla a la izquierda.
		casillaVisitable(resultado,filaActual-2,columnaActual-1);

		//El caballo se mueve dos casillas en horizontal derecha y una hacia arriba.
		casillaVisitable(resultado,filaActual-1,columnaActual+2);

		//El caballo se mueve dos casillas en horizontal derecha y una hacia abajo.
		casillaVisitable(resultado, filaActual+1, columnaActual+2);

		//El caballo se mueve dos casillas en vertical hacia abajo y una casilla a la derecha.
		casillaVisitable(resultado, filaActual+2,columnaActual+1);

		// El caballo se mueve dos casillas en vertical hacia abajo y una casilla a la izquierda.
		casillaVisitable(resultado,filaActual+2,columnaActual-1);

		return resultado;
	}
	public Caballo (Jugador jugador, int fila, char columna) {
		super(jugador,TipoPiezaAjedrez.CABALLO,fila,columna);}

}
