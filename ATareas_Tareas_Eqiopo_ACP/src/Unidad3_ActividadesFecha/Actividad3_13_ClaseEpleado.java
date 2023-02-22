package Unidad3_ActividadesFecha;

public class Actividad3_13_ClaseEpleado {
	private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    public Actividad3_13_ClaseEpleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        }
    }
    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public void establecerApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public double obtenerSalarioMensual() {
        return salarioMensual;
    }

    public void establecerSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public double obtenerSalarioAnual() {
        return salarioMensual * 12;
    }

    public void darAumento(double porcentaje) {
        double aumento = salarioMensual * porcentaje / 100;
        salarioMensual += aumento;
    }
}
