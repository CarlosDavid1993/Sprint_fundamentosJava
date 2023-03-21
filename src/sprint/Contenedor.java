package sprint;

/*
 * @author Mauricio Gutierrez
 * @author David Morales
 * @author Carlos Carrasco
 * @version 5.0
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Contenedor {
	ArrayList<Usuario> instanciaAsesoria = new ArrayList<Usuario>();
	ArrayList<Capacitacion> objetosCapacitacion = new ArrayList<Capacitacion>();

	// 1 metodo para almacenar clientes
	public void almacenarCliente() {
		Scanner scan = new Scanner(System.in);

		System.out.println("---------NUEVO CLIENTE---------");

		// nombre
		String nombre;
		do {
			System.out.println("NOMBRE (5 a 30 caracteres): ");
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
				System.out.println("Error: La fecha debe estar en formato(DD/MM/AAAA).");
			}
		} while (true);

		// run
		int run = 0;
		boolean inputValido = false;
		do {
			try {
				System.out.println("RUN(sin guion, reemplaze K por un 0: ");
				run = scan.nextInt();
				inputValido = true;
			} catch (Exception e) {
				System.out.println("ingrese rut valido y sin punto ni guion");
				scan.next();
			}
		} while (!inputValido || run <= 0 || run >= 99999999);
		scan.nextLine();
		// apellido
		String apellido;
		do {
			System.out.println("APELLIDO(entre 5 y 30 caracteres): ");
			apellido = scan.nextLine();
			if (apellido.length() < 5 || apellido.length() > 30) {
				System.out.println("Error: El apellido debe tener entre 5 y 30 caracteres.");
			}
		} while (apellido.length() < 5 || apellido.length() > 30);

		// telefono
		int telefono;
		do {
			System.out.println("TELEFONO(solo ingrese numeros sin simbolos): ");
			try {
				telefono = scan.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("telefono debe contener numeros enteros");
				scan.nextLine();
			}
		} while (true);
		scan.nextLine();
		// afp
		String afp;
		do {
			System.out.println("AFP(4 a 30 caracteres): ");
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
			System.out.println("DIRECCION(70 caracteres maximo): ");
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
			System.out.println("COMUNA(50 caracteres maximo): ");
			comuna = scan.nextLine();
		} while (comuna.length() > 50);

		// edad
		int edad;
		do {
			System.out.println("EDAD: ");
			try {
				edad = scan.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("la edad debe ser un numero entero");
				scan.next();
			}
		} while (true);

		Cliente cliente = new Cliente(nombre, fechaNacimiento, run, apellido, telefono, afp, sistemaSalud, direccion,
				comuna, edad);
		instanciaAsesoria.add(cliente);
	}

	// 2 metodo para almacenar profesionales
	public void almacenarProfesional() {
		Scanner scan = new Scanner(System.in);

		System.out.println("---------NUEVO PROFESIONAL---------");

		String nombre;
		do {
			System.out.println("NOMBRE(5 a 30 caracteres): ");
			nombre = scan.nextLine();
			if (nombre.length() < 5 || nombre.length() > 30) {
				System.out.println("Error: El nombre debe tener entre 5 y 30 caracteres.");
			}
		} while (nombre.length() < 5 || nombre.length() > 30 || !nombre.matches("[a-z A-Z]+"));

		// fecha nacimiento
		System.out.println("FECHA NACIMIENTO (DD/MM/AAAA) : ");
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
				System.out.println("RUN(sin guion, reemplace K por un 0: ");
				run = scan.nextInt();
				inputValido = true;
			} catch (Exception e) {
				System.out.println("ingrese rut valido y sin punto ni guion");
				scan.next();
			}
		} while (!inputValido || run <= 0 || run >= 99999999);

		// titulo
		String titulo = scan.nextLine();
		do {
			System.out.println("TITULO(10 caracteres minimo, 50 maximo): ");
			titulo = scan.nextLine();
			if (titulo.length() < 10 || titulo.length() > 50) {
				System.out.println("Error: titulo debe tener entre 10 y 50 caracteres.");
			}
		} while (titulo.length() < 10 || titulo.length() > 50);

		// fecha de ingreso
		System.out.println("FECHA INGRESO (DD/MM/AAAA):  ");
		String fechaIngreso = scan.nextLine();

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaIngresoFormat = LocalDate.parse(fechaIngreso, format);

		// creacion objeto profesional
		Profesional profesional = new Profesional(nombre, fechaNacimiento, run, titulo, fechaIngresoFormat);
		instanciaAsesoria.add(profesional);
	}

	// 3 metodo para almacenar administrativo
	public void almacenarAdmin() {
		Scanner scan = new Scanner(System.in);

		System.out.println("---------NUEVO ADMINISTRATIVO---------");
		String nombre;
		do {
			System.out.println("NOMBRE(5 a 30 caracteres): ");
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
				System.out.println("Error: La fecha debe estar en formato (DD/MM/AAAA)");
			}
		} while (true);

		// run
		int run = 0;
		boolean inputValido = false;
		do {
			try {
				System.out.println("RUN(sin guion, reemplace K por un 0: ");
				run = scan.nextInt();
				inputValido = true;
			} catch (Exception e) {
				System.out.println("ingrese rut valido y sin punto ni guion");
				scan.nextLine();
			}
		} while (!inputValido || run <= 0 || run >= 99999999);

		// area
		String area = scan.nextLine();
		do {
			System.out.println("AREA(5 caracteres minimo, 20 maximo): ");
			area = scan.nextLine();
			if (area.length() < 5 || area.length() > 20) {
				System.out.println("Error: area debe tener entre 5 y 20 caracteres.");
			}
		} while (area.length() < 5 || area.length() > 20);

		// experiencia
		String experiencia;
		do {
			System.out.println("EXPERIENCIA(maximo 100 caracteres): ");
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

	// 4 metodo para almacenar capacitaciones
	public void almacenarCapacitacion() {
		Scanner scan = new Scanner(System.in);
		System.out.println("---------INGRESE CAPACITACION---------");

		int identificadorC;
		do {
			System.out.println("IDENTIFICADOR DE LA CAPACITACION: ");
			try {
				identificadorC = scan.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Error: el identificador de la capacitacion debe ser un numero entero.");
				scan.next();
			}
		} while (true);

		int runCliente = 0;
		boolean inputValido = false;
		do {
			try {
				System.out.println("RUN(sin guion, reemplace K por un 0): ");
				runCliente = scan.nextInt();
				inputValido = true;
			} catch (Exception e) {
				System.out.println("ingrese rut valido y sin punto ni guion");

			}
		} while (!inputValido || runCliente <= 0 || runCliente >= 99999999);

		// dia
		System.out.println("FECHA NACIMIENTO (DD/MM/AAAA) : ");
		LocalDate dia;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			try {
				scan.nextLine();
				String fecha = scan.nextLine();
				dia = LocalDate.parse(fecha, formatter);
				break;
			} catch (DateTimeParseException e) {
				System.out.println("Error: La fecha debe estar en formato DD/MM/AAAA.");
			}
		} while (true);

		// hora
		String hora;
		System.out.println("HORA (HH:MM): ");
		do {
			hora = scan.nextLine();
			String[] partes = hora.split(":");
			if (partes.length == 2) {
				try {
					int horas = Integer.parseInt(partes[0]);
					int minutos = Integer.parseInt(partes[1]);
					if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59) {
						break;
					}
				} catch (NumberFormatException e) {
				}
			}
			System.out.println("Error: La hora debe estar en formato HH:MM (hora 00 y 23, minutos 00 y 59).");
		} while (true);

		// lugar
		String lugar;
		do {
			System.out.println("LUGAR: ");
			lugar = scan.nextLine();
			if (lugar.length() < 5 || lugar.length() > 30) {
				System.out.println("Error: el lugar debe tener entre 5 y 30 caracteres.");
			} else {
				break;
			}
		} while (true);

		// duracion
		int duracion;
		do {
			System.out.println("DURACION (MINUTOS): ");
			try {
				duracion = scan.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Error: la duracion en minutos debe ser un numero entero");
				scan.next();
			}
		} while (true);

		int cantidadAsistentes;
		do {
			System.out.println("CANTIDAD DE ASISTENTES: ");
			try {
				cantidadAsistentes = scan.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Error: la cantidad de asistentes debe ser un numero entero");
				scan.next();
			}
		} while (true);

		Capacitacion cap = new Capacitacion(identificadorC, runCliente, dia, hora, lugar, duracion, cantidadAsistentes);
		objetosCapacitacion.add(cap);
	}

	// 5 para eliminar usuario mediante run
	public void eliminarUsuario() {
		Scanner scan = new Scanner(System.in);
		int run = 0;

		do {
			System.out.println("Ingrese RUN de Usuario a eliminar: ");
			try {
				run = scan.nextInt();
				if (run <= 0 || run >= 99999999) {
					System.out.println("RUN no valido. (Ingrese RUN sin puntos y sin digito verificador.)");
				}
			} catch (Exception e) {
				System.out.println("RUN no valido. (Ingrese RUN sin puntos y sin digito verificador.)");
				scan.nextLine();
			}
		} while (run <= 0 || run >= 99999999);

		boolean usuarioEncontrado = false;
		for (int i = 0; i < instanciaAsesoria.size(); i++) {
			if (instanciaAsesoria.get(i).getRun() == run) {
				instanciaAsesoria.remove(i);
				System.out.println("Usuario Eliminado.");
				usuarioEncontrado = true;
				break;
			}
		}
		if (!usuarioEncontrado) {
			System.out.println("El RUN ingresado no existe en los registros.");
		}
	}

	// 6 lista todos los usuarios (cliente, administrativo, profesional)
	public void listarUsuarios() {
		System.out.println(instanciaAsesoria);
	}

	// 7 lista separando tipo de usuario (cliente, administrativo, profesional)
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

	// 8 muestra capacitaciones creadas en metodo 4 de almacenar capacitaciones
	public void listarCapacitaciones() {
		System.out.println(objetosCapacitacion);
	}

}
