package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.HoraClinicaDAO;

/**
 * Servlet implementation class RegistroHoraClinicaServlet
 */
public class RegistroHoraClinicaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroHoraClinicaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String rut, nombreMascota, hora, fecha, msg="";
				
				// 1. recibir los parametros
				rut = request.getParameter("rut");
				nombreMascota = request.getParameter("nombreMascota");
				hora = request.getParameter("hora");
				fecha = request.getParameter("fecha");
				
				// 2. validar
				try {
					if(HoraClinicaDAO.validar(rut, nombreMascota, hora, fecha)>0) {
						msg = "datos correctos";
					}else{
						msg = "datos incorretos";
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				// 3. ejecute logica de negocio
				msg = msg.toUpperCase();
				
				// 4. seleccionar proxima vista
				RequestDispatcher despachador = request.getRequestDispatcher("/mensaje.jsp");
				
				// 5. preparar los datos para vista seleccionada
				request.setAttribute("mensaje", msg);
				
				// 6. despachar
				despachador.forward(request, response);
			}


}
