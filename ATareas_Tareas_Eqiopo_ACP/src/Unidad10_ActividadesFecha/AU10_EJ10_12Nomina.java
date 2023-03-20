package Unidad10_ActividadesFecha;

public class AU10_EJ10_12Nomina {
	{

		private final String nombre;
		private final String apellidoPaterno;
		private final String numeroSocial;
		
		//constructor
		public AU10_EJ10_12Nomina (String nombre, String apellidoPaterno, String numeroSocial )
		{
			this.nombre=nombre;
			this.apellidoPaterno=apellidoPaterno;
			this.numeroSocial=numeroSocial;
			
		}
		
		//obtener................................ 
		public String obtenerNombre()
		{
			return nombre;
		}
		public String obtenerApellidoPaterno()
		{
			return apellidoPaterno;
		}
		public String obtenerNumeroSocial()
		{
			return numeroSocial;
		}
		
		@Override
		public String toString()
		{
			return String.format("%s %s%nnumero de seguro social: %s",obtenerNombre(), obtenerApellidoPaterno(),obtenerNumeroSocial());
		}

		public double ingresos() {
			return 0;
		} 
			
		

		
		
		
	}
}
