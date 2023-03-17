package sprint;

import java.time.LocalDate;

public class Usuario implements Asesoria {
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
        System.out.println("El usuario tiene " + (LocalDate.ofEpochDay(LocalDate.now().toEpochDay() - fechaNacimiento.toEpochDay()).getYear() - 1970)  + " años");
    }

    public void analizarUsuario() {
        System.out.println("NOMBRE: " + nombre);
        System.out.println("RUN: " + run);
    }
}
