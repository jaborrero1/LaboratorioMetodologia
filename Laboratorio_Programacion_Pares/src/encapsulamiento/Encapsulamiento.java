package encapsulamiento;

/**
 * @author JORGE
 * @author BRYAN
 *
 */

public class Encapsulamiento {
	
public static void main(String[] args) {
		
	Alumno alum1 = new Alumno();
	Alumno alum2 = new Alumno();
	
	alum1.setNoControl(65134);
	alum1.nombre = "Jorge";
	alum1.apellidos = "Borrero";
	alum1.setEmail("jborrero@gmail.com");
	alum1.verDatos();
	System.out.println("Accediendo al No. de control " + 
			alum1.getNoControl()+ " Que es privado");
	
	System.out.println();
	
	alum2.setNoControl(54512);
	alum2.nombre = "Nicole";
	alum2.apellidos = "Andrade";
	alum2.setEmail("nandrade@gmail.com");
	alum2.verDatos();
	System.out.println("Accediendo al No. de control " + 
			alum2.getNoControl()+ " Que es privado");
	
	}
}
