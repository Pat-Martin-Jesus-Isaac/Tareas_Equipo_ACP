package Unidad3_ActividadesFecha;
import java.time.LocalDate;
import java.time.Period;
public class Actividad3_16_Frecuencias {

	
	private String primerNombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Actividad3_16_Frecuencias(String primerNombre, String apellido, LocalDate fechaNacimiento) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }

    public int calcularFrecuenciaCardiacaMaxima() {
        int edad = calcularEdad();
        return 220 - edad;
    }

    public String calcularRangoFrecuenciaCardiacaEsperada() {
        int frecuenciaMaxima = calcularFrecuenciaCardiacaMaxima();
        int rangoMinimo = (int) (frecuenciaMaxima * 0.5);
        int rangoMaximo = (int) (frecuenciaMaxima * 0.85);
        return rangoMinimo + " - " + rangoMaximo;
    }

}
