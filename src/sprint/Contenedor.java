package sprint;

import java.util.ArrayList;
public class Contenedor {
	
	private ArrayList<Usuario> ListaUsuarios;
	private ArrayList<Capacitacion> ListaCapacitaciones;
	
	public void agregarUsuario(Usuario usuario) {
		ListaUsuarios.add(usuario);
	}
	public void eliminarUsuario(Usuario usuario) {
		ListaUsuarios.remove(usuario);
	}

}
