package progii.juegotablero.model.ajedrez.piezas;

import list.IList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

public class Reina extends PiezaAjedrez {

	@Override
	public IList<Casilla> movimientosValidos() {
		// TODO Auto-generated method stub
		return null;
	}
	public Reina (Jugador jugador, TipoPiezaAjedrez tipoPieza, int fila, char columna) {
		super(jugador,tipoPieza,fila,columna);}


}
