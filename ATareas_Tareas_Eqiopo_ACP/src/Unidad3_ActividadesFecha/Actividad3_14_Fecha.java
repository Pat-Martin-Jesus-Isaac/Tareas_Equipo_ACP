package Unidad3_ActividadesFecha;

public class Actividad3_14_Fecha {

	
	private int mes;
    private int dia;
    private int anio;

    public Actividad3_14_Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public int obtenerMes() {
        return mes;
    }

    public void establecerMes(int mes) {
        this.mes = mes;
    }

    public int obtenerDia() {
        return dia;
    }

    public void establecerDia(int dia) {
        this.dia = dia;
    }

    public int obtenerAnio() {
        return anio;
    }

    public void establecerAnio(int anio) {
        this.anio = anio;
    }

    public void mostrarFecha() {
        System.out.printf("%d/%d/%d%n", mes, dia, anio);
    }
}




