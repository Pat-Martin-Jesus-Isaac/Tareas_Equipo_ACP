package Unidad3_ActividadesFecha;

public class PruebaFecha {
	public static void main(String[] args) {
		Actividad3_14_Fecha fecha = new Actividad3_14_Fecha(2, 21, 2023);
        fecha.mostrarFecha();

        fecha.establecerMes(3);
        fecha.establecerDia(1);
        fecha.establecerAnio(2030);

        fecha.mostrarFecha();
    }
}

