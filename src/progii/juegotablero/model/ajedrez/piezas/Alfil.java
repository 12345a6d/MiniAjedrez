package progii.juegotablero.model.ajedrez.piezas;

import list.ArrayList;
import list.IList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;



public class Alfil extends PiezaAjedrez {



	@Override
	public IList<Casilla> movimientosValidos() {
		IList<Casilla> resultado = new ArrayList<>();
		
		// Según el modelo vertical descendente de la matriz.
		casillasVisitables(resultado, 1,1);
		
		//Según el modelo horizontal izquierda de la matriz.
		casillasVisitables(resultado, 1,-1);
		
		//Según el modelo vertical ascendente de la matriz.
		casillasVisitables(resultado, -1,1);
		
		//Según el modelo horizontal derecha de la matriz.
		casillasVisitables(resultado, -1,-1);
		
		return resultado;
	}
public Alfil(Jugador jugador,int fila, char columna) {
super(jugador,TipoPiezaAjedrez.ALFIL,fila,columna);}



}
