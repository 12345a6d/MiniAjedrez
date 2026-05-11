package progii.juegotablero.model.ajedrez.piezas;

import list.IList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

public class Caballo extends PiezaAjedrez {

	@Override
	public IList<Casilla> movimientosValidos() {
		// TODO Auto-generated method stub
		return null;
	}
	public Caballo (Jugador jugador, int fila, char columna) {
		super(jugador,TipoPiezaAjedrez.CABALLO,fila,columna);}

}
