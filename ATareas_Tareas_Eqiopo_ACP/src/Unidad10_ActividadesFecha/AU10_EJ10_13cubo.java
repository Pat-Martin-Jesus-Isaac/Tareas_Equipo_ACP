package Unidad10_ActividadesFecha;

public class AU10_EJ10_13cubo extends AU10_EJ10_13FugurasDimencional {
	 private double lado;

	    public void Cubo(double lado) {
	        this.lado = lado;
	    }

	    public double obtenerLado() {
	        return lado;
	    }

	    public void establecerLado(double lado) {
	        this.lado = lado;
	    }

	    public double obtenerAreaSuperficial() {
	        return 6 * lado * lado;
	    }

	    public double obtenerVolumen() {
	        return lado * lado * lado;
	    }

	    public String obtenerDescripcion() {
	        return String.format("Cubo de lado %.2f", lado);
	    }
	}

