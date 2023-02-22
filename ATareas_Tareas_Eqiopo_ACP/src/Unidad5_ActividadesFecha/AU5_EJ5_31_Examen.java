package Unidad5_ActividadesFecha;
import java.util.Scanner;
public class AU5_EJ5_31_Examen {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Preguntas y respuestas
        String[] preguntas = {
                "¿Que es el calentamiento global?",
                "¿Cual es la principal causa del calentamiento global?",
                "¿Cuales son algunos de los efectos del calentamiento global?",
                "¿Que se puede hacer para reducir el calentamiento global?",
                "¿Cual es la temperatura promedio que se espera que aumente en el siglo XXI debido al calentamiento global?"
        };
        System.out.println("***Respuestas: seleccione su respues usando los numero 1,2,3,4***");
        String[][] opciones = {
        		   
{"Aumento de la temperatura de la Tierra", "Aumento de la humedad de la Tierra", "Aumento de la presión atmosférica", "Aumento del oxígeno en la atmósfera"},
{"Emisiones de gases de efecto invernadero", "La actividad solar", "Los volcanes", "El viento solar"},
{"Derretimiento de los glaciares", "Aumento del nivel del mar", "Cambios en los patrones climáticos", "Todas las anteriores"},
 {"Usar mas energia renovable", "Conducir menos", "Comprar productos locales", "Todas las anteriores"},
{"1-2 °C", "3-4 °C", "5-6 °C", "7-8 °C"}
        };  
        int[] respuestasCorrectas = {1, 1, 4, 4, 2};
        
        // Mostrar las preguntas y opciones
        int numPreguntas = preguntas.length;
        int numRespuestasPosibles = opciones[0].length;
        int respuestasCorrectasCount = 0;
        for (int i = 0; i < numPreguntas; i++) {
            System.out.println("Pregunta " + (i+1) + ": " + preguntas[i]);
            for (int j = 0; j < numRespuestasPosibles; j++) {
                System.out.println((j+1) + ". " + opciones[i][j]);
            }
            int respuesta = sc.nextInt();
            if (respuesta == respuestasCorrectas[i]) {
                respuestasCorrectasCount++;
            }
        }
      
        // Mostrar el mensaje al usuario
        if (respuestasCorrectasCount == 5) {
            System.out.println("Excelente");
        } else if (respuestasCorrectasCount == 4) {
            System.out.println("Muy bien");
        } else {
System.out.println("Es tiempo de aprender mas sobre el calentamiento global");
System.out.println("Aquí hay algunos sitios web donde puede encontrar más información:");
System.out.println("- https://www.epa.gov/espanol/calentamiento-global-cambios-climaticos");
 System.out.println("- https://www.nationalgeographic.com/especiales/calentamiento-global/");
System.out.println("- https://www.greenpeace.org/international/campaign/global-warming-and-energy/");
        }
    }
}
