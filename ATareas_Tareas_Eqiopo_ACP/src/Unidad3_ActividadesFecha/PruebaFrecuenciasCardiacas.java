package Unidad3_ActividadesFecha;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class PruebaFrecuenciasCardiacas {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su primer nombre: ");
        String primerNombre = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese su fecha de nacimiento (MM/dd/yyyy): ");
        String fechaNacimientoStr = scanner.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        Actividad3_16_Frecuencias persona = new Actividad3_16_Frecuencias(primerNombre, apellido, fechaNacimiento);

        System.out.println("Nombre: " + persona.getPrimerNombre() + " " + persona.getApellido());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Frecuencia cardiaca maxima: " + persona.calcularFrecuenciaCardiacaMaxima() + " pulsos por minuto");
        System.out.println("Rango de frecuencia cardiaca esperada: " + persona.calcularRangoFrecuenciaCardiacaEsperada() + " pulsos por minuto");
    }
}
//Este programa solicitará al usuario que ingrese su información,







