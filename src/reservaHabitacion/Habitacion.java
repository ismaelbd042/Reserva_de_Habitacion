package reservaHabitacion;

/**
 * @author Pablo e Ismael
 *
 */
public class Habitacion {

	private int numHabitacion;
	private String estado;
	private int numCamas;

	/**
	 * Getter para obtener el número de habitacion
	 * 
	 * @return Devuelve el número de habitación
	 */
	public int getNumHabitacion() {
		return numHabitacion;
	}

	/**
	 * Setter para introducir el nombre de la habitación
	 * 
	 * @param numHabitacion Numero de la habitación
	 */
	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	/**
	 * Getter para obtener el estado de la habitación
	 * 
	 * @return Devuelve el estado de la habitación
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Setter para introducir el estado de la habitación
	 * 
	 * @param estado Estado de la habitación
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Getter para obtener el número de camas
	 * 
	 * @return Devuelve la cantidad de camas
	 */
	public int getNumCamas() {
		return numCamas;
	}

	/**
	 * Setter para introducir el número de camas
	 * 
	 * @param numCamas
	 */
	public void setNumCamas(int numCamas) {
		this.numCamas = numCamas;
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param numHabitacion Número de la habitación
	 * @param estado        Estado de la habitación (ocupada o libre)
	 * @param numCamas      Número de camas
	 */
	public Habitacion(int numHabitacion, String estado, int numCamas) {
		super();
		this.numHabitacion = numHabitacion;
		this.estado = estado;
		this.numCamas = numCamas;
	}
}
