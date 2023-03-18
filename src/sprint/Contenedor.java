package sprint;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Contenedor {

    private ArrayList<Capacitacion> objetosCapacitacion;
    ArrayList<Asesoria> instanciaAsesoria = new ArrayList<Asesoria>();

    public void almacenarCliente() {
        Scanner scan = new Scanner(System.in);

        System.out.println("---------NUEVO CLIENTE---------");
        System.out.println("NOMBRE: ");
        String nombre = scan.nextLine();
        System.out.println("FECHA NACIMIENTO: ");
        String fechaNacimiento = scan.nextLine();
        System.out.println("RUN: ");
        int run = scan.nextInt();
        scan.nextLine();
        System.out.println("APELLIDO: ");
        String apellido = scan.nextLine();
        System.out.println("TELEFONO: ");
        int telefono = scan.nextInt();
        scan.nextLine();
        System.out.println("AFP: ");
        String afp = scan.nextLine();
        System.out.println("SISTEMA DE SALUD: [1] FONASA, [2] ISAPRE");
        int sistemaSalud = scan.nextInt();
        scan.nextLine();
        System.out.println("DIRECCION: ");
        String direccion = scan.nextLine();
        System.out.println("COMUNA: ");
        String comuna = scan.nextLine();
        System.out.println("EDAD: ");
        int edad = scan.nextInt();
        scan.nextLine();

        Cliente cliente = new Cliente(nombre, LocalDate.parse(fechaNacimiento), run, apellido, telefono, afp,
                sistemaSalud, direccion, comuna, edad);
        instanciaAsesoria.add(cliente);
    }

    public void almacenarProfesional() {
        Scanner scan = new Scanner(System.in);

        System.out.println("---------NUEVO PROFESIONAL---------");
        System.out.println("NOMBRE: ");
        String nombre = scan.nextLine();
        System.out.println("FECHA NACIMIENTO: ");
        String fechaNacimiento = scan.nextLine();
        System.out.println("RUN: ");
        int run = scan.nextInt();
        scan.nextLine();
        System.out.println("TITULO: ");
        String titulo = scan.nextLine();
        System.out.println("FECHA INGRESO: ");
        String fechaIngreso = scan.nextLine();

        Profesional profesional = new Profesional(nombre, LocalDate.parse(fechaNacimiento), run, titulo,
                LocalDate.parse(fechaIngreso));
        instanciaAsesoria.add(profesional);
    }

    public void almacenarAdmin() {
        Scanner scan = new Scanner(System.in);

        System.out.println("---------NUEVO ADMINISTRATIVO---------");
        System.out.println("NOMBRE: ");
        String nombre = scan.nextLine();
        System.out.println("FECHA NACIMIENTO: ");
        String fechaNacimiento = scan.nextLine();
        System.out.println("RUN: ");
        int run = scan.nextInt();
        scan.nextLine();
        System.out.println("AREA: ");
        String area = scan.nextLine();
        System.out.println("EXPERIENCIA: ");
        String experiencia = scan.nextLine();

        Administrativo administrativo = new Administrativo(nombre, LocalDate.parse(fechaNacimiento), run, area, experiencia);
        instanciaAsesoria.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        objetosCapacitacion.add(capacitacion);
    }

    public void eliminarUsuario(Usuario usuario) {
        instanciaAsesoria.remove(usuario);
    }

    public void listarUsuarios() {
        System.out.println(instanciaAsesoria);
    }

    public void listarUsuariosTipo(ArrayList instanciaAsesoria) {
        Scanner scan = new Scanner(System.in);
        String input = "";

        System.out.println("________________________________");
        System.out.println("[1] CLIENTES");
        System.out.println("[2] PROFESIONALES");
        System.out.println("[3] ADMINISTRATIVOS");
        System.out.println("________________________________");
        System.out.println("SELECCIONE TIPO DE USUARIO: ");
        input = scan.nextLine();

        if (input.equals("1")) {
            System.out.println("Clientes: ");
            for (int i = 0; i < instanciaAsesoria.size(); i++) {
                if (instanciaAsesoria.get(i) instanceof Cliente) {
                    System.out.println(instanciaAsesoria.get(i));
                }
            }
        }
        if (input.equals("2")) {
            System.out.println("Profesional: ");
            for (int i = 0; i < instanciaAsesoria.size(); i++) {
                if (instanciaAsesoria.get(i) instanceof Profesional) {
                    System.out.println(instanciaAsesoria.get(i));
                }
            }
        }
        if (input.equals("3")) {
            System.out.println("Administrativo: ");
            for (int i = 0; i < instanciaAsesoria.size(); i++) {
                if (instanciaAsesoria.get(i) instanceof Administrativo) {
                    System.out.println(instanciaAsesoria.get(i));
                }
            }
        }
    }

    public void listarCapacitaciones() {
        System.out.println(objetosCapacitacion);
    }
}
