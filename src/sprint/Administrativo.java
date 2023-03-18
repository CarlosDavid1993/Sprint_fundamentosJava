package sprint;

import java.time.LocalDate;

public class Administrativo extends Usuario {
    String area;
    String experiencia;

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("AREA: " + area);
        System.out.println("EXPERIENCIA: " + experiencia);
    }

    public Administrativo(String nombre, LocalDate fechaNacimiento, int run, String area, String experiencia) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.experiencia = experiencia;
    }

    public Administrativo() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", run=" + run +
                '}';
    }
}
