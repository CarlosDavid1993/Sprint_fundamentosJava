package sprint;
import java.util.*;
public class VisitaTerreno {
	
	private int irunCliente;
	private Date dia;
	private String hora;
	private String lugar;
	private String comentario;
	
	private int identificadorT;
	public VisitaTerreno(int identificadorT, int irunCliente, Date dia, String hora, String lugar, String comentario) {
		super();
		this.identificadorT = identificadorT;
		this.irunCliente = irunCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentario = comentario;
	}
	public int getIrunCliente() {
		return irunCliente;
	}
	public void setIrunCliente(int irunCliente) {
		this.irunCliente = irunCliente;
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
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public int getIdentificadorT() {
		return identificadorT;
	}
	public void setIdentificadorT(int identificadorT) {
		this.identificadorT = identificadorT;
	}
	@Override
	public String toString() {
		return "VisitaTerreno [irunCliente=" + irunCliente + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar
				+ ", comentario=" + comentario + ", identificadorT=" + identificadorT + "]";
	}
	
	
}
