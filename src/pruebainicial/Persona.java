
package pruebainicial;

enum Genero {H,M};
public class Persona {
	Genero persona;

	public Persona(Genero persona) {
		super();
		this.persona = persona;
	}
	


	public Genero getPersona() {
		return persona;
	}



	public void setPersona(Genero persona) {
		this.persona = persona;
	}



	public String toString() {
		return "Persona [persona=" + persona + "]";
	}
	
}
