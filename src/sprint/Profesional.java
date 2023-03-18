package sprint;

import java.time.LocalDate;

public class Profesional extends Usuario {
    String titulo;
    LocalDate fechaIngreso;

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("TITULO: " + titulo);
        System.out.println("FECHA INGRESO: " + fechaIngreso.toString());
    }

    public Profesional(String nombre, LocalDate fechaNacimiento, int run, String titulo, LocalDate fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public Profesional() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", run=" + run +
                '}';
    }
}
