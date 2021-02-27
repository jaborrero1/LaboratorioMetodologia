package abstraccion;

/*
 * Jorge Borrero
 */

public class Abstraccion {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado("Jorge", 21, 2500, "0231456345", "El Callejon #50");
		Empleado emp2 = new Empleado("Nicole", 22, 3000, "0251486255", "El Isido #48");
		
		emp1.verDatos();
		emp2.verDatos();
	}
}
