package clases;

public class profesores extends Persona {
	public String AñoNac;
	public String Asignatura;
	public profesores(String nombre, String apellidos, String sexo, String nacionalidad, String añoNac,
			String asignatura) {
		super(nombre, apellidos, sexo, nacionalidad);
		AñoNac = añoNac;
		Asignatura = asignatura;
	}
	public String getAñoNac() {
		return AñoNac;
	}
	public void setAñoNac(String añoNac) {
		AñoNac = añoNac;
	}
	public String getAsignatura() {
		return Asignatura;
	}
	public void setAsignatura(String asignatura) {
		Asignatura = asignatura;
	}
	
}
