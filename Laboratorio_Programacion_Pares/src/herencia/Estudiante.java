package herencia;

/**
 * 
 * @author BRYAN
 *
 */
public class Estudiante extends Persona{

	private double nFinal;
	
	public Estudiante(String pNombre, String pApellido, int pEdad, double pNFinal) {
		super(pNombre, pApellido, pEdad);
		this.nFinal = pNFinal;
	}
	
	//METODOS GET Y SET

	public double getnFinal() {
		return nFinal;
	}


	public void setnFinal(float nFinal) {
		this.nFinal = nFinal;
	}

	public void mostrarDatos() {
		System.out.println("Nombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nNota Final: "+nFinal);
	}
}
