package reservaHabitacion;

import java.util.Date;

/**
 * @author Ismael y Pablo
 *
 */
public class Reserva {

	private int numReserva;
	private Date fechaEntrada;
	private Date fechaSalida;
	private int numPersonas;

	/**
	 * Constructor de la clase reserva
	 * 
	 * @param numReserva
	 * @param fechaEntrada
	 * @param fechaSalida
	 * @param numPersonas
	 */
	public Reserva(int numReserva, Date fechaEntrada, Date fechaSalida, int numPersonas) {
		this.numReserva = numReserva;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.numPersonas = numPersonas;
	}

	/**
	 * Getter para saber el numero de la reserva
	 * 
	 * @return Devuelve el numero de la reserva
	 */
	public int getNumReserva() {
		return numReserva;
	}

	/**
	 * Setter para establecer el numero de la reserva
	 * 
	 * @param numReserva El numero de la reserva
	 */
	public void setNumReserva(int numReserva) {
		this.numReserva = numReserva;
	}

	/**
	 * Getter para saber la fecha de entrada de la reserva
	 * 
	 * @return Devuelve el numero de personas que hay en la reserva
	 */
	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * Setter para establecer la fecha de entrada de la reserva
	 * 
	 * @param fechaEntrada La fecha de entrada de la reserva
	 */
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * Getter para saber la fecha de salida de la reserva
	 * 
	 * @return Devuelve la fecha de salida de la reserva
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * Setter para establecer la fecha de salida de la reserva
	 * 
	 * @param fechaSalida La fecha de salida de la reserva
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * Getter para saber el numero de personas que hay en la reserva
	 * 
	 * @return Devuelve el numero de personas que hay en la reserva
	 */
	public int getNumPersonas() {
		return numPersonas;
	}

	/**
	 * Setter para establecer el numero de personas que hay en la reserva
	 * 
	 * @param numPersonas El numero de personas que hay en la reserva
	 */
	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	/**
	 * Nos muestra los atributos de la clase
	 */
	public void ConsultarReserva() {

	}

	/**
	 * Modifica algunos de los atributos de la clase
	 */
	public void ModificarReserva() {

	}
}
