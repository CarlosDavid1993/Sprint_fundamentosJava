package sprint;

import java.time.LocalDate;

public class Usuario implements Asesoria{
    String nombre;
    LocalDate fechaNacimiento;
    int run;

    public int mostrarEdad() {
        return 2023 - fechaNacimiento.getYear();
    }

}
