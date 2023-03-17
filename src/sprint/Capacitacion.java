package sprint;

public class Capacitacion {
	private int identificadorC;
	private int runCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
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
	public Capacitacion(int identificadorC, int runCliente, String dia, String hora, String lugar, String duracion,
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
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
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
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
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
		return "Capacitacion [identificadorC=" + identificadorC + ", runCliente=" + runCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + "]";
	}

}
