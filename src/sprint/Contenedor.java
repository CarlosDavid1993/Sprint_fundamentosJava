package sprint;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Contenedor {

	ArrayList<Capacitacion> objetosCapacitacion;
	ArrayList<Asesoria> instanciaAsesoria = new ArrayList<Asesoria>();

	// 1
	public void almacenarCliente() {
		Scanner scan = new Scanner(System.in);

		System.out.println("---------NUEVO CLIENTE---------");

		// nombre
		String nombre;
		do {
			System.out.println("NOMBRE: ");
			nombre = scan.nextLine();
			if (nombre.length() < 5 || nombre.length() > 30) {
				System.out.println("Error: El nombre debe tener entre 5 y 30 caracteres.");
			}
		} while (nombre.length() < 5 || nombre.length() > 30 || !nombre.matches("[a-z A-Z]+"));

		// fecha nacimiento
		System.out.println("FECHA NACIMIENTO (DD/MM/AAAA): ");
		LocalDate fechaNacimiento;
		DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			try {
				String fecha = scan.nextLine();
				fechaNacimiento = LocalDate.parse(fecha, Format);
				break;
			} catch (DateTimeParseException e) {
				System.out.println("Error: La fecha debe estar en formato DD/MM/AAAA.");
			}
		} while (true);

		// run
		int run = 0;
		boolean inputValido = false;
		do {
			try {
				System.out.println("RUN: ");
				run = scan.nextInt();
				scan.nextLine();
				inputValido = true;
			} catch (Exception e) {
				System.out.println("Input invalido");
				scan.nextLine();
			}
		} while (!inputValido || run <= 0 || run >= 100000000);

		// apellido
		String apellido;
		do {
			System.out.println("APELLIDO: ");
			apellido = scan.nextLine();
			if (apellido.length() < 5 || apellido.length() > 30) {
				System.out.println("Error: El apellido debe tener entre 5 y 30 caracteres.");
			}
		} while (apellido.length() < 5 || apellido.length() > 30);

		// telefono
		System.out.println("TELEFONO: ");
		int telefono = scan.nextInt();
		scan.nextLine();

		// afp
		String afp;
		do {
			System.out.println("AFP: ");
			afp = scan.nextLine();
			if (afp.length() < 4 || afp.length() > 30) {
				System.out.println("Error: el nombre de la afp debe tener entre 4 y 30 caracteres.");
			}
		} while (afp.length() < 4 || afp.length() > 30);

		// Sistema de salud
		int sistemaSalud;
		do {
			System.out.println("SISTEMA DE SALUD (1 - Fonasa, 2 - Isapre): ");
			sistemaSalud = scan.nextInt();
			scan.nextLine();
			if (sistemaSalud != 1 && sistemaSalud != 2) {
				System.out.println("Error: Debe ingresar solo 1(fonasa) o 2(isapre).");
			}
		} while (sistemaSalud != 1 && sistemaSalud != 2);

		// direccion
		String direccion;
		do {
			System.out.println("DIRECCION: ");
			direccion = scan.nextLine();
			if (direccion.length() > 70) {
				System.out.println("Error: la direccion puede contener maximo 70 caracteres");
			} else {
				break;
			}
		} while (true);
		// comuna
		String comuna;
		do {
			System.out.println("COMUNA: ");
			comuna = scan.nextLine();
		} while (comuna.length() > 50);

		// edad
		int edad;
		do {
			System.out.println("EDAD: ");
			edad = scan.nextInt();
			scan.nextLine();
		} while (edad < 0 || edad >= 150);

		Cliente cliente = new Cliente(nombre, fechaNacimiento, run, apellido, telefono, afp, sistemaSalud, direccion,
				comuna, edad);
		instanciaAsesoria.add(cliente);
	}

	// 2
	public void almacenarProfesional() {
		Scanner scan = new Scanner(System.in);

		System.out.println("---------NUEVO PROFESIONAL---------");
		String nombre;
		do {
			System.out.println("NOMBRE: ");
			nombre = scan.nextLine();
			if (nombre.length() < 5 || nombre.length() > 30) {
				System.out.println("Error: El nombre debe tener entre 5 y 30 caracteres.");
			}
		} while (nombre.length() < 5 || nombre.length() > 30 || !nombre.matches("[a-z A-Z]+"));

		// fecha nacimiento
		System.out.println("FECHA NACIMIENTO (DD/MM/AAAA): ");
		LocalDate fechaNacimiento;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			try {
				String fecha = scan.nextLine();
				fechaNacimiento = LocalDate.parse(fecha, formatter);
				break;
			} catch (DateTimeParseException e) {
				System.out.println("Error: La fecha debe estar en formato DD/MM/AAAA.");
			}
		} while (true);

		// run
		int run = 0;
		boolean inputValido = false;
		do {
			try {
				System.out.println("RUN: ");
				run = scan.nextInt();
				scan.nextLine();
				inputValido = true;
			} catch (Exception e) {
				System.out.println("Input invalido");
				scan.nextLine();
			}
		} while (!inputValido || run <= 0 || run >= 100000000);
		
		//titulo
		System.out.println("TITULO: ");
		String titulo = scan.nextLine();
		do {
			System.out.println("TITULO: ");
			titulo = scan.nextLine();
			if (titulo.length() < 10 || titulo.length() > 50) {
				System.out.println("Error: titulo debe tener entre 10 y 50 caracteres.");
			}
		} while (titulo.length() < 10 || titulo.length() > 50);

		//fecha de ingreso
		System.out.println("FECHA INGRESO (DD/MM/AAAA): ");
		String fechaIngreso = scan.nextLine();

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaIngresoFormat = LocalDate.parse(fechaIngreso, format);

		//creacion objeto prfesional
		Profesional profesional = new Profesional(nombre, fechaNacimiento, run, titulo, fechaIngresoFormat);
		instanciaAsesoria.add(profesional);
	}

	// 3
	public void almacenarAdmin() {
		Scanner scan = new Scanner(System.in);

		System.out.println("---------NUEVO ADMINISTRATIVO---------");
		String nombre;
		do {
			System.out.println("NOMBRE: ");
			nombre = scan.nextLine();
			if (nombre.length() < 5 || nombre.length() > 30) {
				System.out.println("Error: El nombre debe tener entre 5 y 30 caracteres.");
			}
		} while (nombre.length() < 5 || nombre.length() > 30 || !nombre.matches("[a-z A-Z]+"));

		// fecha nacimiento
		System.out.println("FECHA NACIMIENTO (DD/MM/AAAA): ");
		LocalDate fechaNacimiento;
		DateTimeFormatter formatear = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			try {
				String fecha = scan.nextLine();
				fechaNacimiento = LocalDate.parse(fecha, formatear);
				break;
			} catch (DateTimeParseException e) {
				System.out.println("Error: La fecha debe estar en formato DD/MM/AAAA.");
			}
		} while (true);

		// run
		int run = 0;
		boolean inputValido = false;
		do {
			try {
				System.out.println("RUN: ");
				run = scan.nextInt();
				scan.nextLine();
				inputValido = true;
			} catch (Exception e) {
				System.out.println("Input invalido");
				scan.nextLine();
			}
		} while (!inputValido || run <= 0 || run >= 100000000);
		//area
		System.out.println("AREA: ");
		String area = scan.nextLine();
		do {
			System.out.println("AREA: ");
			area = scan.nextLine();
			if (area.length() < 5 || area.length() > 20) {
				System.out.println("Error: area debe tener entre 5 y 20 caracteres.");
			}
		} while (area.length() < 5 || area.length() > 20);
		
		//experiencia
		String experiencia = scan.nextLine();
		do {
			System.out.println("EXPERIENCIA: ");
			experiencia = scan.nextLine();
			if (experiencia.length() > 100) {
				System.out.println("Error: puede ingresar maximo 100 caracteres");
			} else {
				break;
			}
		} while (true);
		Administrativo administrativo = new Administrativo(nombre, (fechaNacimiento), run, area, experiencia);
		instanciaAsesoria.add(administrativo);
	}

	// 4
	public void almacenarCapacitacion(Capacitacion capacitacion) {
		objetosCapacitacion.add(capacitacion);
	}

	// 5
	public void eliminarUsuario(Usuario usuario) {
		instanciaAsesoria.remove(usuario);
	}

	// 6
	public void listarUsuarios() {
		System.out.println(instanciaAsesoria);
	}

	// 7
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

	// 8
	public void listarCapacitaciones() {
		System.out.println(objetosCapacitacion);
	}
}