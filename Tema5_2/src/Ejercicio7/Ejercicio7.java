package Ejercicio7;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfazEmpleado i;
		Empleado e2;

		i = new InterfazEmpleado(new Empleado());
		System.out.println("visualizo datos del empleado");
		i.verDatos();
		System.out.println("fin datos empleado");
		i.leerDatos();
		System.out.println("visualizo datos de empleado");
		i.verDatos();
		System.out.println("fin datos empleado");
		e2 = new Empleado();
		i = new InterfazEmpleado(e2);
		i.leerDatos();
		System.out.println("visualizo datos empleado");
		i.verDatos();
		System.out.println("fin de datos empleado");
	}

}
