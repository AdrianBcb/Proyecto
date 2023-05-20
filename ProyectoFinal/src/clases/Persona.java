package clases;

public class Persona {
private String Nombre;
public String Apellidos;
public String Direccion;
public String Sexo;
public int AñoNac;
public String Nacionalidad;
 
Persona() {
	
}

public Persona(String nombre, String apellidos, String direccion, String sexo, int añoNac, String nacionalidad) {
	Nombre = nombre;
	Apellidos = apellidos;
	Direccion = direccion;
	Sexo = sexo;
	AñoNac = añoNac;
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
public String getDireccion() {
	return Direccion;
}
public void setDireccion(String direccion) {
	Direccion = direccion;
}
public String getSexo() {
	return Sexo;
}
public void setSexo(String sexo) {
	Sexo = sexo;
}
public int getAñoNac() {
	return AñoNac;
}
public void setAñoNac(int añoNac) {
	AñoNac = añoNac;
}
public String getNacionalidad() {
	return Nacionalidad;
}
public void setNacionalidad(String nacionalidad) {
	Nacionalidad = nacionalidad;
}

}


