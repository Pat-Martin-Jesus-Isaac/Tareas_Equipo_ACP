package Unidad10_ActividadesFecha;


	public class AU10_EJ10_13cuadrado extends AU10_EJ10_13FugurasDimencional {
	    private double lado;

	    public void Cuadrado(double lado) {
	        this.lado = lado;
	    }

	    public double obtenerLado() {
	        return lado;
	    }

	    public void establecerLado(double lado) {
	        this.lado = lado;
	    }

	    public double obtenerArea() {
	        return lado * lado;
	    }

	    public String obtenerDescripcion() {
	        return String.format("Cuadrado de lado %.2f", lado);
	    }
	}

