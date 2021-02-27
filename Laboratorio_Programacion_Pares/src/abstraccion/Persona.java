package abstraccion;

/*
 * Jorge Borrero
 */

public abstract class Persona {
	String nombre;
	int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//creacion Metodo abstracto
	
	abstract public void verDatos();

}
