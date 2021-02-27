package abstraccion;

/**
 * @author JORGE
 * @author BRYAN
 *
 */

import javax.swing.JOptionPane;

public class Empleado extends Persona {

	double sueldo;
	String telefono;
	String direccion;
	
	public Empleado(String nombre, int edad, double sueldo, String telefono, String direccion) {
		super(nombre, edad);
		this.sueldo = sueldo;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	
	@Override
	
	public void verDatos() {
		JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + 
				edad + "\nSueldo: " +sueldo + "\nTelefono: " + telefono + 
				"\nDireccion: " + direccion,"Datos del Empleado", 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
}
