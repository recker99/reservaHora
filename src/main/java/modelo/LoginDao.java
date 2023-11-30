package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.Conexion;

public class LoginDao {
	
    public static int validar(String nombreUsuario, String password) {
    	
    	Connection con;
		Conexion cn = new Conexion();
		
        PreparedStatement ps;
        ResultSet rs;
        String us = "";
        int valido = 0;
        String sql = "SELECT * FROM clinica.usuario WHERE nombreUsuario = ? AND password = ?";
        try {
        	
        	con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                us = rs.getString("nombreUsuario");
            }
             if(us.equals("123")) {
            	 valido = 1;
            } else {
            	valido = 0;
        }
        }catch (Exception e) {}
        return valido;
    }
    	
    private static PreparedStatement setString(int i, String nombreUsuario) {
    		// TODO Auto-generated method stub
    return null;
 }
}
