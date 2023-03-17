package sprint;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente pruebaCliente = new Cliente("Mauricio", LocalDate.of(1991, 1, 1), 179950901, "Gutierrez", 92849190, "AFP Modelo", 1, "Calle 123", "Vina del Mar", 31);
        pruebaCliente.analizarUsuario();
        pruebaCliente.mostrarEdad();
        pruebaCliente.obtenerNombre();
        Profesional pruebaPro = new Profesional("Carlos", LocalDate.of(1990, 8, 20), 185524146, "Ingeniero Informatico", LocalDate.of(2022, 5, 20));
        pruebaPro.mostrarEdad();
        pruebaPro.analizarUsuario();
        Administrativo pruebaAdm = new Administrativo("David", LocalDate.of(1988, 4, 17), 159964842, "Recursos Humanos", "3 años de Trabajo");
        pruebaAdm.analizarUsuario();
        System.out.println(pruebaCliente.toString());

    }
}