package Unidad10_ActividadesFecha;

public class AU10_EJ10_13Imprimir  {

	public class Main {
	    public static void main(String[] args) {

	        Figura[] figuras = new Figura[4];

	        AU10_EJ10_13circulo circulo = new AU10_EJ10_13circulo();
	        circulo.establecerRadio(5);

	        AU10_EJ10_13cuadrado cuadrado = new AU10_EJ10_13cuadrado();
	        cuadrado.establecerLado(4);

	        AU10_EJ10_13cubo cubo = new AU10_EJ10_13cubo();
	        cubo.establecerLado(3);

	        AU10_EJ10_13esfera esfera = new AU10_EJ10_13esfera();
	        esfera.establecerRadio(2);

	        figuras[0] = circulo;
	        figuras[1] = cuadrado;
	        figuras[2] = cubo;
	        figuras[3] = esfera;

	        for (Figura figura : figuras) {
	            System.out.println(figura.obtenerDescripcion());

	            if (figura instanceof FiguraBidimensional) {
	                FiguraBidimensional figuraBidimensional = (FiguraBidimensional) figura;
	                System.out.println("Área: " + figuraBidimensional.obtenerArea());
	            }

	            if (figura instanceof FiguraTridimensional) {
	                FiguraTridimensional figuraTridimensional = (FiguraTridimensional) figura;
	                System.out.println("Área superficial: " + figuraTridimensional.obtenerAreaSuperficial());
	                System.out.println("Volumen: " + figuraTridimensional.obtenerVolumen());
	            }

	            System.out.println();
	        }
	    }
	}
	}


	
