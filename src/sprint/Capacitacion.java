package sprint;
/*
 * @AuthorDavid Morales
 */
import java.time.LocalDate;

public class Capacitacion {
	private int identificadorC;
	private int runCliente;
	private LocalDate dia;
	private String hora;
	private String lugar;
	private int duracion;
	private int cantidadAsistentes;
	/**
	 * @param identificadorC
	 * @param runCliente
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param duracion
	 * @param cantidadAsistentes
	 */
	public Capacitacion(int identificadorC, int runCliente, LocalDate dia, String hora, String lugar, int duracion,
			int cantidadAsistentes) {
		super();
		this.identificadorC = identificadorC;
		this.runCliente = runCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}
	public int getIdentificadorC() {
		return identificadorC;
	}
	public void setIdentificadorC(int identificadorC) {
		this.identificadorC = identificadorC;
	}
	public int getRunCliente() {
		return runCliente;
	}
	public void setRunCliente(int runCliente) {
		this.runCliente = runCliente;
	}
	public LocalDate getDia() {
		return dia;
	}
	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}
	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}
	@Override
	public String toString() {
		return "Capacitacion \nid Capacitacion: " + identificadorC + "\nRun del cliente: " + runCliente + "\ndia: " + (dia.toString())
				+ "\nhora: " + hora + "\nlugar: " + lugar + "\nduracion: " + duracion + " minutos."+ "\ncantidad de asistentes: "
				+ cantidadAsistentes;
	}

}
