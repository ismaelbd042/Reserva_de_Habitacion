package reservaHabitacion;

/**
 * @author Ismael y Pablo
 * @version
 */
public class Cliente {

	private int numCliente;
	private String nombre;
	private String tel;

	/**
	 * Constructor de la clase Cliente
	 * 
	 * @param numCliente
	 * @param nombre
	 * @param tel
	 */
	public Cliente(int numCliente, String nombre, String tel) {
		this.numCliente = numCliente;
		this.nombre = nombre;
		this.tel = tel;
	}

	/**
	 * Getter para saber el numero del cliente
	 * 
	 * @return Devuelve el numero del cliente
	 */
	public int getNumCliente() {
		return numCliente;
	}

	/**
	 * Setter para establecer el numero del cliente
	 * 
	 * @param numCliente El numero del cliente
	 */
	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	/**
	 * Getter para saber el nombre del cliente
	 * 
	 * @return Devuelve el nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter para establecer el nombre del cliente
	 * 
	 * @param nombre El nombre del cliente
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter para saber el telefono nombre del cliente
	 * 
	 * @return Devuelve el telefono nombre del cliente
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * Setter para establecer el telefono del cliente
	 * 
	 * @param tel El telefono del cliente
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * Realiza una reserva de habitacion
	 */
	public void HacerReserva() {

	}

	/**
	 * Cancela una reserva de habitacion
	 */
	public void CancelarReserva() {

	}

}
