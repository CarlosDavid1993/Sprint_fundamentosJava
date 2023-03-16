package sprint;

import java.util.Date;

public class Revision extends VisitaTerreno{
	private int identificadorR;
	private int identificadorT;
	private String nombreRevision;
	private String etalle;
	private int estado;
	
	public Revision(int identificadorT, int irunCliente, Date dia, String hora, String lugar, String comentario,
			int identificadorR, int identificadorT2, String nombreRevision, String etalle, int estado) {
		super(identificadorT, irunCliente, dia, hora, lugar, comentario);
		this.identificadorR = identificadorR;
		identificadorT = identificadorT2;
		this.nombreRevision = nombreRevision;
		this.etalle = etalle;
		this.estado = estado;
	}

	public int getIdentificadorR() {
		return identificadorR;
	}

	public void setIdentificadorR(int identificadorR) {
		this.identificadorR = identificadorR;
	}

	public int getIdentificadorT() {
		return identificadorT;
	}

	public void setIdentificadorT(int identificadorT) {
		this.identificadorT = identificadorT;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public String getEtalle() {
		return etalle;
	}

	public void setEtalle(String etalle) {
		this.etalle = etalle;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Revision [identificadorR=" + identificadorR + ", identificadorT=" + identificadorT + ", nombreRevision="
				+ nombreRevision + ", etalle=" + etalle + ", estado=" + estado + ", getIdentificadorR()="
				+ getIdentificadorR() + ", getIdentificadorT()=" + getIdentificadorT() + ", getNombreRevision()="
				+ getNombreRevision() + ", getEtalle()=" + getEtalle() + ", getEstado()=" + getEstado()
				+ ", getIrunCliente()=" + getIrunCliente() + ", getDia()=" + getDia() + ", getHora()=" + getHora()
				+ ", getLugar()=" + getLugar() + ", getComentario()=" + getComentario() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



	
	}


