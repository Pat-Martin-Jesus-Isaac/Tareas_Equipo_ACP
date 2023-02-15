package Unidad2_ActividadesFecha;
import java.util.Scanner;
public class Actividad_2_16 {

	
	public static void main(String[] args) {
	    try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Escriba el primer numero entero: ");
			int num1 = entrada.nextInt();
			System.out.print("Escriba el segundo numero entero: ");
			int num2 = entrada.nextInt();
			if (num1 > num2) {
			  System.out.println(num1 + " es mas grande");
			} else if (num2 > num1) {
			  System.out.println(num2 + " es mas grande");
			} else {
			  System.out.println("Estos numeros son iguales");
			}
}
	}
}

