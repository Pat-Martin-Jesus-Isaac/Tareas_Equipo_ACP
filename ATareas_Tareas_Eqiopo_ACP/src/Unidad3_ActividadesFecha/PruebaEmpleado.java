package Unidad3_ActividadesFecha;

public class PruebaEmpleado {
	 public static void main(String[] args) {
		 Actividad3_13_ClaseEpleado empleado1 = new Actividad3_13_ClaseEpleado("Alegria", "Aguirre", 3000);
		 Actividad3_13_ClaseEpleado empleado2 = new Actividad3_13_ClaseEpleado("Sara", "Cuo", 4000);

	        System.out.printf("El salario anual de %s %s es $%.2f%n", empleado1.obtenerPrimerNombre(), 
	                empleado1.obtenerApellidoPaterno(), empleado1.obtenerSalarioAnual());
	        System.out.printf("El salario anual de %s %s es $%.2f%n", empleado2.obtenerPrimerNombre(), 
	                empleado2.obtenerApellidoPaterno(), empleado2.obtenerSalarioAnual());

	        empleado1.darAumento(10);
	        empleado2.darAumento(10);

	        System.out.printf("Despues del aumento del 10%%, el salario anual de %s %s es $%.2f%n", empleado1.obtenerPrimerNombre(),
	                empleado1.obtenerApellidoPaterno(), empleado1.obtenerSalarioAnual());
	        System.out.printf("Despues del aumento del 10%%, el salario anual de %s %s es $%.2f%n", empleado2.obtenerPrimerNombre(),
	                empleado2.obtenerApellidoPaterno(), empleado2.obtenerSalarioAnual());
	    }
	}

