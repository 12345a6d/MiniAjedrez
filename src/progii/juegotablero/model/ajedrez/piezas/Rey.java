package progii.juegotablero.model.ajedrez.piezas;

import list.IList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

public class Rey extends PiezaAjedrez {

	@Override
	public IList<Casilla> movimientosValidos() {
		// TODO Auto-generated method stub
		return null;
	}
	public Rey (Jugador jugador, int fila, char columna) {
		super(jugador,TipoPiezaAjedrez.REY,fila,columna);}

}
