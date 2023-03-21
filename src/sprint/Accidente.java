package sprint;
/*
 * @Author Mauricio Gutierrez, David Morales, Carlos Carrasco
 */
import java.util.Date;
public class Accidente {
	private int identificadorA;
	private int runCliente;
	private Date dia;
	private String hora;
	private String lugar;
	private String duracion;
	private String Origen;
	private String Consecuencias;
	/**
	 * @param identificadorA
	 * @param runCliente
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param duracion
	 * @param origen
	 * @param consecuencias
	 */
	public Accidente(int identificadorA, int runCliente, Date dia, String hora, String lugar, String duracion,
			String origen, String consecuencias) {
		super();
		this.identificadorA = identificadorA;
		this.runCliente = runCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		Origen = origen;
		Consecuencias = consecuencias;
	}
	public int getIdentificadorA() {
		return identificadorA;
	}
	public void setIdentificadorA(int identificadorA) {
		this.identificadorA = identificadorA;
	}
	public int getRunCliente() {
		return runCliente;
	}
	public void setRunCliente(int runCliente) {
		this.runCliente = runCliente;
	}
	public Date getDia() {
		return dia;
	}
	public void setDia(Date dia) {
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
	public String getOrigen() {
		return Origen;
	}
	public void setOrigen(String origen) {
		Origen = origen;
	}
	public String getConsecuencias() {
		return Consecuencias;
	}
	public void setConsecuencias(String consecuencias) {
		Consecuencias = consecuencias;
	}
	@Override
	public String toString() {
		return "Accidente [identificadorA=" + identificadorA + ", runCliente=" + runCliente + ", dia=" + dia + ", hora="
				+ hora + ", lugar=" + lugar + ", duracion=" + duracion + ", Origen=" + Origen + ", Consecuencias="
				+ Consecuencias + "]";
	}

}