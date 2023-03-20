package Unidad10_ActividadesFecha;

public class AU10_EJ10_12PrubaSistemaNomina {
	public static void main(String[] args) 
	{
		// crea objetos de las subclases
		AU10_EJ10_12Salario empleadoAsalariado = new AU10_EJ10_12Salario("Jair", "olivarse", "19530658", 800.00);
		AU10_EJ10_12EmpleadoPorHoras empleadoPorHoras = new AU10_EJ10_12EmpleadoPorHoras("luis", "Mendez", "19530659", 16.75, 40);
		  AU10_EJ10_12EmpleadoComision empleadoPorComision = new AU10_EJ10_12EmpleadoComision("Ricardo", "versunza", "19530660", 10000, .06);
		  AU10_EJ10_12Comision empleadoBaseMasComision = new AU10_EJ10_12Comision ("bob", "lewis", "444-444-444", 5000, .04, 300);
		
		  	System.out.println("Empleados procesados por separado:");
		
		  	System.out.printf("%n%s%n%s: $%,.2f%n%n",empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
		  	
		  	System.out.printf("%s%n%s: $%,.2f%n%n",empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
		  	
		  	System.out.printf("%s%n%s: $%,.2f%n%n",empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
	
		  	System.out.printf("%s%n%s: $%,.2f%n%n",empleadoBaseMasComision,"ingresos", empleadoBaseMasComision.ingresos());
		
		// crea un arreglo Empleado de cuatro elementos
		  	 AU10_EJ10_12Nomina[] empleados = new  AU10_EJ10_12Nomina[4];
		
		// inicializa el arreglo con objetos Empleado
		  empleados[0] = empleadoAsalariado;
		  empleados[1] = empleadoPorHoras;
		  empleados[2] = empleadoPorComision;
		  empleados[3] = empleadoBaseMasComision;
		
	 System.out.println("Empleados procesados en forma polimorfica:\n");
	
	 // procesa en forma genérica a cada elemento en el arreglo de empleados
		
	 	for ( AU10_EJ10_12Nomina empleadoActual : empleados)
		 {
	 		System.out.println(empleadoActual);  // invoca a toString
		
	 		// determina si el elemento es un EmpleadoBaseMasComision
	 			if (empleadoActual instanceof AU10_EJ10_12Comision)
	 				{
	 					// conversión descendente de la referencia de Empleado
	 					// a una referencia de EmpleadoBaseMasComision
	 				AU10_EJ10_12Comision empleado =(AU10_EJ10_12Comision) empleadoActual; 
	 					empleado.establecerSalarioBase(1.10 * empleado.obtenerSalarioBase());
	 		
	 		
	 					System.out.printf("el nuevo salario base con 10%% de aumento es: $%,.2f%n",empleado.obtenerSalarioBase());
	 				} // fin de if
	 				
	 			System.out.printf("ingresos $%,.2f%n%n", empleadoActual.ingresos());
	 	  } // fin de for
	 				
	 	
	 	// obtiene el nombre del tipo de cada objeto en el arreglo de empleados
	 		for (int j = 0; j < empleados.length; j++)
	 			{
	 				System.out.printf("El empleado %d es un %s%n", j,empleados[j].getClass().getName());
	 			 } // fin de main
	 				

	}		
	

}
}
