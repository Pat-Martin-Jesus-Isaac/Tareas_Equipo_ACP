package Unidad10_ActividadesFecha;

public class AU10_EJ10_13esfera extends AU10_EJ10_13FugurasDimencional {

	    private double radio;

	    public void Esfera(double radio) {
	        this.radio = radio;
	    }

	    public double obtenerRadio() {
	        return radio;
	    }

	    public void establecerRadio(double radio) {
	        this.radio = radio;
	    }

	    public double obtenerAreaSuperficial() {
	        return 4 * Math.PI * radio * radio;
	    }

	    public double obtenerVolumen() {
	        return 4.0 / 3.0 * Math.PI * radio * radio * radio;
	    }

	    public String obtenerDescripcion() {
	        return String.format("Esfera de radio %.2f", radio);
	    }
	}


