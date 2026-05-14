ackage progii.juegotablero.model.ajedrez.piezas;

import list.ArrayList;
import list.IList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

public class Reina extends PiezaAjedrez {

	@Override
	public IList<Casilla> movimientosValidos() {
		IList<Casilla> resultado = new ArrayList<>();
		
		//Vertical descendente según el modelo interno (matriz)
		casillasVisitables (resultado, 1, 0);
		casillasVisitables (resultado, 1,1);
		
		//Vertical ascendente según el modelo interno (matriz)
		casillasVisitables (resultado, -1, 0);
		casillasVisitables (resultado, -1,1);

		//Horiznotal izquierda según el modelo interno (matriz)
		casillasVisitables (resultado, 0, -1);
		casillasVisitables (resultado, 1,-1);
		
		//Horizontal derecha según el modelo interno (matriz)
		casillasVisitables (resultado, 0, 1);
		casillasVisitables (resultado, -1,-1);
		

		return resultado;
	}
	public Reina (Jugador jugador,int fila, char columna) {
		super(jugador,TipoPiezaAjedrez.REINA,fila,columna);}


}
