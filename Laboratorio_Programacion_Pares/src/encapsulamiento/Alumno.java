package encapsulamiento;

/**
 * @author JORGE
 * @author BRYAN
 *
 */

public class Alumno {

	private int noControl;
	private String email;
	public String nombre;
	public String apellidos;
	
	void setNoControl(int NC) {
		this.noControl = NC;
	}
	
	int getNoControl() {
		return noControl;
	}
	
	void setEmail(String EM) {
		this.email = EM;
	}
	
	String getEmail() {
		return email;
	}
	
	void verDatos(){
		System.out.println("No. de Control: " + noControl);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Email: " + email);
	}
	
}
