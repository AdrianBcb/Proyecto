package clases;

public class alumnos extends Persona {
String Tutor;
String Telefono;
public String Direccion;
public alumnos(String nombre, String apellidos, String sexo, String nacionalidad, String tutor, String telefono,
		String direccion) {
	super(nombre, apellidos, sexo, nacionalidad);
	Tutor = tutor;
	Telefono = telefono;
	Direccion = direccion;
}
public String getTutor() {
	return Tutor;
}
public void setTutor(String tutor) {
	Tutor = tutor;
}
public String getTelefono() {
	return Telefono;
}
public void setTelefono(String telefono) {
	Telefono = telefono;
}
public String getDireccion() {
	return Direccion;
}
public void setDireccion(String direccion) {
	Direccion = direccion;
}

}
