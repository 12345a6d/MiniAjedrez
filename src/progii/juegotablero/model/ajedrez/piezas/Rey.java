package progii.juegotablero.model.ajedrez.piezas;

import list.IList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

public class Rey extends PiezaAjedrez {

	@Override
	public IList<Casilla> movimientosValidos() {
		IList<Casilla> resultado = new IList <>();
		casillaVisitable(resultado, -1,1);
		casillaVisitable(resultado,1,0);
		casillaVisitable(resultado, -1,-1);
		casillaVisitable(resultado, 0,1);
		casillaVisitable(resultado, -1,0);
		return resultado;
	}
	public Rey (Jugador jugador, int fila, char columna) {
		super(jugador,TipoPiezaAjedrez.REY,fila,columna);}

}
