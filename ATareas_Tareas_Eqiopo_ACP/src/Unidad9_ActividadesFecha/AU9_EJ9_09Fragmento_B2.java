package Unidad9_ActividadesFecha;

public class AU9_EJ9_09Fragmento_B2 extends AU9_EJ9_09Fragmento_B {
//b) Supongamos que tenemos una clase "Animal" con un método "hacerSonido", y una 
//subclase llamada "Perro" que sobrescribe el método "hacerSonido". Podemos utilizar la 
//anotación "@Override" antes del método "hacerSonido" en la clase "Perro" para indicar 
//que estamos sobrescribiendo el método de la superclase, como se muestra a continuación:
	
	 @Override
	    public void hacerSonido() {
	        System.out.println("El perro ladra.");
	    }
}
