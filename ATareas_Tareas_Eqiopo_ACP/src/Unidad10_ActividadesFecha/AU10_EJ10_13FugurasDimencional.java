package Unidad10_ActividadesFecha;

public class AU10_EJ10_13FugurasDimencional{
	public abstract class Figura {
	    public abstract String obtenerDescripcion();
	}

	public abstract class FiguraBidimensional extends Figura {
	    public abstract double obtenerArea();
	}

	public abstract class FiguraTridimensional extends Figura {
	    public abstract double obtenerAreaSuperficial();
	    public abstract double obtenerVolumen();
	}
	
	}
