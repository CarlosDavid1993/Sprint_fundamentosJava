package sprint;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente prueba = new Cliente("Mauricio", LocalDate.of(1991, 01, 01), 179950901,"Gutierrez", 92849190, "AFP Modelo", 1, "Calle 123", "Vina del Mar", 31);
        prueba.analizarUsuario();
        prueba.mostrarEdad();
    }

}