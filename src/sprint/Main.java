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
            	System.out.println("  *** Asesoria prevencion de riesgos *** ");
                System.out.println("");
                System.out.println("");
                System.out.println(" Elija una opcion: ");
                System.out.println("");
                System.out.println("[1] ALMACENAR CLIENTE");                
                System.out.println("[2] ALMACENAR PROFESIONAL");             
                System.out.println("[3] ALMACENAR ADMINISTRATIVO");                
                System.out.println("[4] ALMACENAR CAPACITACION");                
                System.out.println("[5] ELIMINAR USUARIO");                
                System.out.println("[6] MOSTRAR LISTA DE USUARIOS");                
                System.out.println("[7] MOSTRAR LISTA DE USUARIOS POR TIPO");              
                System.out.println("[8] LISTA CAPACITACIONES");
                System.out.println("[9] SALIR");
                System.out.println("");
                System.out.println("Ingrese una opcion [1-9]: ");
                
                try {
                    input = scan.nextLine();
                } catch (Exception e) {
                    System.out.println("Input invalido, intente otra vez.");
                }
                
                if (input.equals("1")) { //almacena cliente
                    contenedor.almacenarCliente();
                }
                
                if (input.equals("2")) { //almacena profesional
                    contenedor.almacenarProfesional();
                }
                
                if (input.equals("3")) { // almacena administrativo
                    contenedor.almacenarAdmin();
                }
                
                if (input.equals("4")) { //almacena capacitacion
                    
                }
                
                if (input.equals("5")) { // elimina Usuario (cliente, profesional o administrativo)
                    
                }
                
                if (input.equals("6")) { //lista todo tipo de usuarios
                    contenedor.listarUsuarios();
                }
                
                if (input.equals("7")) { //lista tipo de usuario cliente, profesional o administrativo
                    contenedor.listarUsuariosTipo(contenedor.instanciaAsesoria);
                }
                
                if (input.equals("8")) { //lista capacitaciones
                	
                }
                
                if (input.equals("9")) { //salir del programa
                    
                }
            }

            scan.close();
        }
}