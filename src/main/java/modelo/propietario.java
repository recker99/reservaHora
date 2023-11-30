package modelo;

public class propietario {
	 	private String rut;
	    private String nombre;
	    private String apellido;
	    private String direccion;
	    private String correo;
	    private String celular;
	    private String nombreMascota;
	  

	    // Constructor, getters y setters
	
	    public propietario(String rut, String nombre, String apellido, String direccion, String correo, String celular, String nombreMascota) {
	        this.rut = rut;
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.direccion = direccion;
	        this.correo = correo;
	        this.celular = celular;
	        this.nombreMascota = nombreMascota;
	    }

	    public String getRut() {
	        return rut;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }


	    public String getDireccion() {
	        return direccion;
	    }

	    public String getCorreo() {
	        return correo;
	    }


	    public String getCelular() {
	        return celular;
	    }

	    public String getNombreMascota() {
	        return nombreMascota;
	    }

}
