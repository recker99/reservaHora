package modelo;

public class usuario {
	    private String nombreUsuario;
	    private String password;

	    // Constructor, getters y setters
	
	    public usuario(String nombreUsuario, String password) {
	        this.nombreUsuario = nombreUsuario;
	        this.password = password;
	    }

	    public String getNombreUsuario() {
	        return nombreUsuario;
	    }

	    public String getPassword() {
	        return password;
	    }
}
