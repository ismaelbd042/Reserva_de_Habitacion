package reservaHabitacion;

/**
 * @author Pablo e Ismael
 *
 */
public class Doble extends Habitacion {

	private boolean minibar;

	/**
	 * Devuelve si tiene o no minibar
	 * 
	 * @return
	 */
	public boolean isMinibar() {
		return minibar;
	}

	/**
	 * Establece si hay minibar o no
	 * 
	 * @param minibar
	 */
	public void setMinibar(boolean minibar) {
		this.minibar = minibar;
	}

	/**
	 * Constructor de la clase suite
	 * 
	 * @param numHabitacion Heredado
	 * @param estado        Heredado
	 * @param numCamas      Heredado
	 * @param metros        Metros de la habitación
	 * @param minibar
	 */
	public Doble(int numHabitacion, String estado, int numCamas, boolean minibar) {
		super(numHabitacion, estado, numCamas);
		this.minibar = minibar;
	}

}
