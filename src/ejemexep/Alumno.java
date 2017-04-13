package ejemexep;
public class Alumno {
	private String nombre;
    private String apellido;
    private Integer edad;
 
    public Alumno(String nombre, String apellido, Integer edad) throws InvalidYearException {
        this.nombre = nombre;
        this.apellido = apellido;
        if (edad <= 0){ 
            throw new InvalidYearException("La edad debe ser mayor a cero");
        }else{
            this.edad = edad;
        }
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getApellido() {
        return apellido;
    }
 
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
 
    public Integer getEdad() {
        return edad;
    }
}
