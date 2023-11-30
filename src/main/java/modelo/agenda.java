package modelo;

import java.sql.Date;

public class agenda {
    private String rut;
    private String nombreMascota;
    private String hora;
    private Date fecha;
     

    // Constructor, getters y setters

    public agenda(String rut, String nombreMascota, String hora, Date fecha) {
        
        this.rut = rut;
        this.nombreMascota = nombreMascota;
        this.hora = hora;
        this.fecha = fecha;
    }

    public String getRut() {
        return rut;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public String getHora() {
        return hora;
    }

    public Date getFecha() {
        return fecha;
    }


}
