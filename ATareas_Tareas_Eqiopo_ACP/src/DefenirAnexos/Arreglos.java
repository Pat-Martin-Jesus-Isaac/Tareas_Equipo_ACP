package DefenirAnexos; //organiza las clases en diferentes directorios ocarpetas
import java.util.Scanner; //lee la entrada del usuario desde la consola
public class Arreglos { // accede a cualquier parte del programa

	    public static void main(String[] args) { // se ejecuta al inicio del programa 
	        Scanner scanner = new Scanner(System.in);// lee la entrada del usuadio desde la cosola
	        char[] palabra = new char[5]; // almacena la palabra ingresada por el usuario
	        System.out.print("Ingrese una palabra de 5 letras: "); //imprime mensaje
	        String input = scanner.next();//lee la entrada de codigo y almacena en una variable (input) 
	        if (input.length() == 5) {//comprueba si la longitud de la palabra ingresada por el usuario si es igual a 5
	            palabra = input.toCharArray();//convierte la palabra ingresada por el usuario en un arreglo de caracteres y asigna la variable (palabra)
	            if (palabra[0] == palabra[4] && palabra[1] == palabra[3]) {
	                System.out.println(input + " es un palindromo.");
	            } else {
	                System.out.println(input + " no es un palindromo.");
	            }
	        } else {
	            System.out.println("La palabra debe tener 5 letras.");
	        }
	        scanner.close();
	    }

	}

