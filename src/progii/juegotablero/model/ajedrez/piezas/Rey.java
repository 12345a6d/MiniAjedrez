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
		
		// Avanzar a la casilla superior de la que se sitúa el rey.
		casillaVisitable(resultado,0,-1);
		
		// Avanzar a la casilla diagonal derecha de la que se sitúa el rey.
		casillaVisitable(resultado,1,-1);
		
		// Avanzar a la casilla de la derecha de la que se sitúa el rey.
		casillaVisitable(resultado,1,0);
		
		// Avanzar a la casilla diagonal inferior derecha de la que se sitúa el rey.
		casillaVisitable(resultado,1,1);
		
		// Avanzar a la casilla inferior de la que se sitúa el rey.
		casillaVisitable(resultado,0,1);
		
		// Avanzar a la casilla diagonal inferior izquierda de la que se sitúa el rey.
		casillaVisitable(resultado,-1,1);
		
		// Avanzar a la casilla de la izquierda de la que se sitúa el rey.
		casillaVisitable(resultado,-1,0);
		
		// Avanzar a la casilla diagonal superior izquierda de la que se encuentra el rey.
		casillaVisitable(resultado,-1,-1);
		
		return resultado;
	}
	public Rey (Jugador jugador, int fila, char columna) {
		super(jugador,TipoPiezaAjedrez.REY,fila,columna);}

}
