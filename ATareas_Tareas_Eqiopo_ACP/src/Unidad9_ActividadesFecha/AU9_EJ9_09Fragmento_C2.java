package Unidad9_ActividadesFecha;

public class AU9_EJ9_09Fragmento_C2 extends AU9_EJ9_09Fragmento_C{
//Supongamos que tenemos una clase "Estudiante" este tiene su propio constructor que toma tres 
//argumentos, además de los dos 
//argumentos necesarios para el constructor de la superclase "Persona". Podemos utilizar la 
//llamada a super en el constructor de la clase "Estudiante" para llamar al constructor de la 
//superclase "Persona" y pasarle los dos argumentos necesarios, como se muestra a continuación:
	
//En este ejemplo, la línea de código "super(nombre, edad);" en el constructor de la clase 
//"Estudiante" llama al constructor de la superclase "Persona" y pasa los argumentos "nombre" 
//y "edad". Luego, la subclase "Estudiante" puede asignar el valor del tercer argumento "escuela" 
//a su propio atributo "escuela".
private String escuela;
    
    public AU9_EJ9_09Fragmento_C2(String nombre, int edad, String escuela) {
        super(nombre, edad); // Llamada al constructor de la superclase
    }

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
}
