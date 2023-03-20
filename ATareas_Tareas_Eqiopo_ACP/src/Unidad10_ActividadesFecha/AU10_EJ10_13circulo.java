package Unidad10_ActividadesFecha;

public class AU10_EJ10_13circulo extends AU10_EJ10_13FugurasDimencional{

	    private double radio;

	    public void Circulo(double radio) {
	        this.radio = radio;
	    }

	    public double obtenerRadio() {
	        return radio;
	    }

	    public void establecerRadio(double radio) {
	        this.radio = radio;
	    }

	    public double obtenerArea() {
	        return Math.PI * radio * radio;
	    }

	    public String obtenerDescripcion() {
	        return String.format("Círculo de radio %.2f", radio);
	    }

}

	