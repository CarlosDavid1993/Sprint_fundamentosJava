package sprint;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        menuPrincipal(contenedor);
    }

        public static void menuPrincipal(Contenedor contenedor) {
            Scanner scan = new Scanner(System.in);
            String input = "";

            while (!input.equals("9")) {
                System.out.println("ASESORIA PREVENCION DE RIESGO");
                System.out.println("________________________________");
                System.out.println("[1] ALMACENAR CLIENTE");
                System.out.println("[2] ALMACENAR PROFESIONAL");
                System.out.println("[3] ALMACENAR ADMINISTRATIVO");
                System.out.println("[4] ALMACENAR CAPACITACION");
                System.out.println("[5] ELIMINAR USUARIO");
                System.out.println("[6] MOSTRAR LISTA DE USUARIOS");
                System.out.println("[7] MOSTRAR LISTA DE USUARIOS POR TIPO");
                System.out.println("[8] LISTA CAPACITACIONES");
                System.out.println("[9] SALIR");
                System.out.println("________________________________");
                System.out.println("Ingrese una opcion: ");
                try {
                    input = scan.nextLine();
                } catch (Exception e) {
                    System.out.println("Input invalido, intente otra vez.");
                }
                if (input.equals("1")) {
                    contenedor.almacenarCliente();
                }
                if (input.equals("2")) {
                    contenedor.almacenarProfesional();
                }
                if (input.equals("3")) {
                    contenedor.almacenarAdmin();
                }
                if (input.equals("6")) {
                    contenedor.listarUsuarios();
                }
                if (input.equals("7")) {
                    contenedor.listarUsuariosTipo(contenedor.instanciaAsesoria);
                }
            }

            scan.close();
        }



//        Cliente pruebaCliente = new Cliente("Mauricio", LocalDate.of(1991, 1, 1), 179950901, "Gutierrez", 92849190, "AFP Modelo", 1, "Calle 123", "Vina del Mar", 31);
//        pruebaCliente.analizarUsuario();
//        pruebaCliente.mostrarEdad();
//        pruebaCliente.obtenerNombre();
//        Profesional pruebaPro = new Profesional("Carlos", LocalDate.of(1990, 8, 20), 185524146, "Ingeniero Informatico", LocalDate.of(2022, 5, 20));
//        pruebaPro.mostrarEdad();
//        pruebaPro.analizarUsuario();
//        Administrativo pruebaAdm = new Administrativo("David", LocalDate.of(1988, 4, 17), 159964842, "Recursos Humanos", "3 años de Trabajo");
//        pruebaAdm.analizarUsuario();
//        System.out.println(pruebaCliente.toString());

}