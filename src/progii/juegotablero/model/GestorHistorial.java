
/*
 * Autor: Alejandro Gallego Gragera.
 * Correo electrónico: alejandro.gallegogragera@alumnos.upm.es
 */
package progii.juegotablero.model;


import progii.juegotablero.exceptions.MovimientoException;
import stacks.exceptions.EmptyStackException;
import stacks.Stack;



/**
 * Clase que gestiona el historial de movimientos de la partida
 * 
 *
 */
public class GestorHistorial {

	/**
	 * Pila con los movimientos a deshacer
	 */
	private Stack <Movimiento> pilaDeshacer;


	/**
	 * Pila con los movimientos a rehacer
	 */
	private Stack <Movimiento> pilaRehacer;

	/**
	 * Crea e inicializa las pilas del gestor del historial
	 */
	public GestorHistorial() {
		pilaDeshacer = new Stack <Movimiento>();
		pilaRehacer = new Stack <Movimiento>();
	}

	/**
	 * Guarda un nuevo movimientos en el historial
	 * @param movimiento Movimiento a guardar
	 */
	public void guardarMovimiento (Movimiento movimiento) {
		pilaDeshacer.push(movimiento);
		if(!pilaRehacer.isEmpty()) {
			pilaRehacer.makeEmpty();
		}
	}

	/**
	 * Devuelve el último movimiento realizado y lo elimina de la pila de deshacer
	 * @return El movimiento a deshacer
	 * @throws MovimientoException En caso de que no haya movimientos que deshacer
	 * @throws  
	 */
	public Movimiento deshacer () throws MovimientoException{
		if(pilaDeshacer.isEmpty()) {
			throw new MovimientoException("No se puede deshacer porque no hay movimientos para deshacer");}

		Movimiento movimiento = null;
		try {
			movimiento = pilaDeshacer.pop();
			pilaRehacer.push(movimiento);
		} catch(EmptyStackException e) {
			e.getMessage();
		}
		return movimiento;

	}


	/**
	 * Devuelve el último movimiento deshecho y lo elimina de la pila de rehacer
	 * @return El movimiento a rehacer
	 * @throws MovimientoException En caso de que no haya movimientos que rehacer
	 */
	public Movimiento rehacer() throws MovimientoException {
		if (pilaRehacer.isEmpty()) {
			throw new MovimientoException("No se puede rehacer porque no hay movimientos para rehacer");
		}
		Movimiento movimiento = null;
		try {
			movimiento = pilaRehacer.pop();
			pilaDeshacer.push(movimiento);

		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
		return movimiento;
	}
}
