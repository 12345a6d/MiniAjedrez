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
		
		//Describimos el caballo como un movimiento en L, así que incFila = 2 (si el movimiento es así ¬) o incColumna = 2 (si el movimiento es una L invertida).
		
		//El caballo se mueve dos casillas en horizontal izquierda y una casilla hacia arriba.
		casillaVisitable(resultado,-1,-2);
		
		//El caballo se mueve dos casillas en horizontal izquierda y una casilla hacia abajo.
		casillaVisitable(resultado,1 ,-2);
		
		//El caballo se mueve dos casillas en vertical hacia arriba y una casilla a la derecha.
		casillaVisitable(resultado, -2 ,1);
		
		//El caballo se mueve dos casillas en vertical hacia arriba y una casilla a la izquierda.
		casillaVisitable(resultado,-2,-1);
		
		//El caballo se mueve dos casillas en horizontal derecha y una hacia arriba.
		casillaVisitable(resultado,-1,2);
		
		//El caballo se mueve dos casillas en horizontal derecha y una hacia abajo.
		casillaVisitable(resultado, 1, 2);
		
		//El caballo se mueve dos casillas en vertical hacia abajo y una casilla a la derecha.
		casillaVisitable(resultado, 2,1);
		
		// El caballo se mueve dos casillas en vertical hacia abajo y una casilla a la izquierda.
		casillaVisitable(resultado,2,-1);
		
		return resultado;
	}
	public Caballo (Jugador jugador, int fila, char columna) {
		super(jugador,TipoPiezaAjedrez.CABALLO,fila,columna);}

}
