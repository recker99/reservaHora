package modelo;

public class mascota {
	private String rut;
    private String nombreMascota;
    private String tipoMascota;
    private int edad;

    // Constructor, getters y setters

    public mascota(String rut, String nombreMascota, String tipoMascota, int edad) {
        this.rut = rut;
        this.nombreMascota = nombreMascota;
        this.tipoMascota = tipoMascota;
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }
    
    public int getEdad() {
        return edad;
    }


}
