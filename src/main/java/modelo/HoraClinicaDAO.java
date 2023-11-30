package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.mysql.jdbc.PreparedStatement;

import utils.Conexion;

public class HoraClinicaDAO {
	
	public static int validar (String rut, String nombreMascota, String hora, String fecha) {
	Connection con;
	Conexion cn = new Conexion();
	
	PreparedStatement ps;
	ResultSet rs;
	String us = "";
	int valido = 0;
	String sql = "Select * from clinica.agenda where rut = ?, nombreMascota = ?, hora=?  and fecha = ?";
	try {
		
		con = cn.getConnection();
		ps = (PreparedStatement) con.prepareStatement(sql);
		ps = setString(1,rut);
		ps = setString(2,nombreMascota);
		ps = setString(3,hora);
		ps = setString(4,fecha);
		
		rs = ps.executeQuery();
		while(rs.next()) {
			us = rs.getString("rut");
		}
		if(us.equals("128837620")) {
			valido = 1;
		}else{
			valido = 0;
		}
	}catch(Exception e) {}
	
	return valido;
	}

	private static PreparedStatement setString(int i, String user) {
		// TODO Auto-generated method stub
		return null;
	}

}

