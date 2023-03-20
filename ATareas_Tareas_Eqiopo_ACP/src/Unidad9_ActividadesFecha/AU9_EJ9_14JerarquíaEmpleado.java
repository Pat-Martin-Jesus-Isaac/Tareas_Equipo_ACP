package Unidad9_ActividadesFecha;

public class AU9_EJ9_14JerarquíaEmpleado {
	
		private String primerNombre; private String apellidoPaterno; private String numeroSeguroSocial;

		public AU9_EJ9_14JerarquíaEmpleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
		this.primerNombre = primerNombre; this.apellidoPaterno = apellidoPaterno; this.numeroSeguroSocial = numeroSeguroSocial;
		}

		public String obtenerPrimerNombre() { return primerNombre;
		}

		public String obtenerApellidoPaterno() { return apellidoPaterno;
		}

		public String obtenerNumeroSeguroSocial() { return numeroSeguroSocial;
		}

		public String toString() {
		 
		return String.format("%s %s%nnúmero de seguro social: %s", obtenerPrimerNombre(), obtenerApellidoPaterno(),
		obtenerNumeroSeguroSocial());
		}
		}

