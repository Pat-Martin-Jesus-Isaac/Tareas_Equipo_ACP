package Unidad5_ActividadesFecha;
import java.util.Scanner; 
public class AU5_EJ5_16_Graficos {

	public void Imprime()
	  {      // Abre Imprime
	  System.out.print("\nIntroduzca cinco enteros entre 1 y 30");
	  System.out.println(" y se imprimira un histograma horizontal.\n");  

	  Scanner entrada = new Scanner(System.in);

	  int numero;
	  int contador = 1;

	  while ( contador <= 5 )
	  {         // Abre while
	  System.out.printf("\nPor favor introduzca el numero %d:\n ", contador);
	  numero = entrada.nextInt();

	  if ((1 <= numero) && ( 30 >= numero))
	  {     // Abre if

	  for ( int i = 1; i <= numero; i++ )
	  System.out.print("*");

	  System.out.println();

	  contador++;
	  }       // Cierra if
	  }         // Cierra while
	  

	  }      // Cierra Imprime

	         
	  }        // Cierra clase Deitel_5_16

