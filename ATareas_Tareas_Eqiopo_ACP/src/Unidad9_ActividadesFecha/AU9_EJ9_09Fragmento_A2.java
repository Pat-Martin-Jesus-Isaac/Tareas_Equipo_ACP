package Unidad9_ActividadesFecha;

public class AU9_EJ9_09Fragmento_A2 extends AU9_EJ9_09Fragmento_A {
//a) Supongamos que tenemos una clase "Empleado" con un método "ingresos", y una subclase 
//llamada "Gerente" que extiende la clase "Empleado" y sobrescribe el método "ingresos". Dentro 
//del método "ingresos" de la clase "Gerente", podemos utilizar la llamada a super para llamar 
//al método "ingresos" de la superclase "Empleado", como se muestra a continuación:
private double bono;
    
    @Override
    public void ingresos() {
        super.ingresos(); // Llamada al método ingresos de la superclase
        System.out.println("El bono del gerente es: " + bono);
    }
}


