package sprint;

import java.time.LocalDate;

public class Usuario implements Asesoria{
    String nombre;
    LocalDate fechaNacimiento;
    int run;

    public void mostrarEdad() {
        System.out.println("El usuario tiene " + (2023 - fechaNacimiento.getYear()) + "años");
    }
    @Override
    public void analizarUsuario() {
        System.out.println("NOMBRE: " + nombre);
        System.out.println("RUN: " + run);
    }
}
