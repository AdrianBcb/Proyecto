package clases;

public class Persona {
private String Nombre;
public String Apellidos;
public String Sexo;
public String Nacionalidad;
 
Persona() {
	
}

public Persona(String nombre, String apellidos, String sexo, String nacionalidad) {
	Nombre = nombre;
	Apellidos = apellidos;
	Sexo = sexo;
	Nacionalidad = nacionalidad;
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public String getApellidos() {
	return Apellidos;
}

public void setApellidos(String apellidos) {
	Apellidos = apellidos;
}

public String getSexo() {
	return Sexo;
}

public void setSexo(String sexo) {
	Sexo = sexo;
}

public String getNacionalidad() {
	return Nacionalidad;
}

public void setNacionalidad(String nacionalidad) {
	Nacionalidad = nacionalidad;
}

}


