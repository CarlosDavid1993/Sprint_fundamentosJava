package sprint;

import java.time.LocalDate;

public class Cliente extends Usuario {
    public Cliente(String nombre, LocalDate fechaNacimiento, int run, String apellido, int telefono, String afp, int sistemaSalud, String direccion, String comunna, int edad) {
        super(nombre, fechaNacimiento, run);
        this.apellido = apellido;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comunna = comunna;
        this.edad = edad;
    }
    public Cliente() {
        super();
    }

    String apellido;
    int telefono;
    String afp;
    int sistemaSalud;
    String direccion;
    String comunna;
    int edad;

    public String obtenerNombre() {
        return nombre + " " + apellido;
    }

    public String obtenerSistemaSalud() {
        if (sistemaSalud == 1) {
            return "Fonasa";
        }
        if (sistemaSalud == 2) {
            return "Isapre";
        }
        else return null;
    }
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("DIRECCION: " + direccion);
        System.out.println("COMUNA: " + comunna);
    }
}
