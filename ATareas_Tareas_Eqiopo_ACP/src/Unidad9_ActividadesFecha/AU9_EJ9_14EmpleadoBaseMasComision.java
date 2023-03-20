package Unidad9_ActividadesFecha;

public class AU9_EJ9_14EmpleadoBaseMasComision extends AU9_EJ9_14EmpleadoPorComision{
	private double salarioBase;

	public AU9_EJ9_14EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) { 
		super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas,tarifaComision);
	 
	this.salarioBase = salarioBase;
	}

	public double ingresos() {
	return salarioBase + super.ingresos();
	}

	public String toString() {
	return String.format("empleado con salario base más comisión: %s%nsalario base: $%,.2f",super.toString(), salarioBase);
	}
	}


