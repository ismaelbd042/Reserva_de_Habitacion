package reservaHabitacion;

/**
 * @author Pablo e Ismael
 *
 */
public class Suite extends Habitacion {
	private int metros;
	private String servicio;

	/**
	 * Getter para obtener el número de metros cuadrados de la suite
	 * 
	 * @return Devuelve el número de metros cuadrados
	 */
	public int getMetros() {
		return metros;
	}

	/**
	 * Setter para introducir el número de metros cuadrados de la suite
	 * 
	 * @param metros Número de metros
	 */
	public void setMetros(int metros) {
		this.metros = metros;
	}

	/**
	 * Getter para obtener los sevicios que hay
	 * 
	 * @return Devuelve los servicios de esa habitación
	 */
	public String getservicio() {
		return servicio;
	}

	/**
	 * Setter para introducir los servicios que hay
	 * 
	 * @param servicio Servicios de la habitación
	 */
	public void setservicio(String servicio) {
		this.servicio = servicio;
	}

	/**
	 * Constructor de la clase suite
	 * 
	 * @param numHabitacion Heredado
	 * @param estado        Heredado
	 * @param numCamas      Heredado
	 * @param metros        Metros de la habitación
	 * @param servicio      Servicios de la habitación
	 */
	public Suite(int numHabitacion, String estado, int numCamas, int metros, String servicio) {
		super(numHabitacion, estado, numCamas);
		this.metros = metros;
		this.servicio = servicio;
	}

	/**
	 * Método para calcular los gastos por los servicios
	 */
	public void CalculoGastos() {

	}

}
