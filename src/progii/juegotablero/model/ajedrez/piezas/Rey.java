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

public class Rey extends PiezaAjedrez {

	@Override
	public IList<Casilla> movimientosValidos() {
		IList<Casilla> resultado = new ArrayList<>();
		int filaActual = super.getFila();
		int columnaActual = super.getColumna();

		// Avanzar a la casilla superior de la que se sitúa el rey.
		casillaVisitable(resultado,filaActual,columnaActual-1);

		// Avanzar a la casilla diagonal derecha de la que se sitúa el rey.
		casillaVisitable(resultado,filaActual+1,columnaActual-1);

		// Avanzar a la casilla de la derecha de la que se sitúa el rey.
		casillaVisitable(resultado,filaActual+1,columnaActual);

		// Avanzar a la casilla diagonal inferior derecha de la que se sitúa el rey.
		casillaVisitable(resultado,filaActual+1,columnaActual+1);

		// Avanzar a la casilla inferior de la que se sitúa el rey.
		casillaVisitable(resultado,filaActual,columnaActual+1);

		// Avanzar a la casilla diagonal inferior izquierda de la que se sitúa el rey.
		casillaVisitable(resultado,filaActual-1,columnaActual+1);

		// Avanzar a la casilla de la izquierda de la que se sitúa el rey.
		casillaVisitable(resultado,filaActual-1,columnaActual);

		// Avanzar a la casilla diagonal superior izquierda de la que se encuentra el rey.
		casillaVisitable(resultado,filaActual-1,columnaActual-1);

		return resultado;
	}
	public Rey (Jugador jugador, int fila, char columna) {
		super(jugador,TipoPiezaAjedrez.REY,fila,columna);}

}
