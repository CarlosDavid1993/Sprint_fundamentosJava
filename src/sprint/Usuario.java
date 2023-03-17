package sprint;

import java.time.LocalDate;

public abstract class Usuario implements Asesoria {
    public Usuario(String nombre, LocalDate fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public Usuario() {
    }

    String nombre;
    LocalDate fechaNacimiento;
    int run;

    public void mostrarEdad() {
        System.out.println("El usuario tiene " + (LocalDate.ofEpochDay(LocalDate.now().toEpochDay() - fechaNacimiento.toEpochDay()).getYear() - 1970) + " años");
    }

    public void analizarUsuario() {
        System.out.println("NOMBRE: " + nombre);
        System.out.println("RUN: " + run);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }
}
