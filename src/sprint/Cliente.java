package sprint;

import java.time.LocalDate;

public class Cliente extends Usuario {
    String apellido;
    int telefono;
    String afp;
    int sistemaSalud;
    String direccion;
    String comunna;
    int edad;

    public void obtenerNombre() {
        System.out.println(nombre + " " + apellido);
    }

    public String obtenerSistemaSalud() {
        if (sistemaSalud == 1) {
            return "Fonasa";
        }
        if (sistemaSalud == 2) {
            return "Isapre";
        } else return null;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("DIRECCION: " + direccion);
        System.out.println("COMUNA: " + comunna);
    }

    public Cliente(String nombre, LocalDate fechaNacimiento, int run, String apellido, int telefono, String afp,
                   int sistemaSalud, String direccion, String comunna, int edad) {
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
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComunna() {
        return comunna;
    }

    public void setComunna(String comunna) {
        this.comunna = comunna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
