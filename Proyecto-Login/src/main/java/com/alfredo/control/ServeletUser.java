package com.alfredo.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alfredo.DAO.UsuarioDao;
import com.alfredo.model.TbUsuariosp;

/**
 * Servlet implementation class ServeletUser
 */
public class ServeletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletUser() {
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
		//doGet(request, response);
		
		String usu = request.getParameter("user");
		String contra = request.getParameter("pass");
		String cerrarSeccion = request.getParameter("btncerrar");
		
		
		if (cerrarSeccion!=null) {
			if(cerrarSeccion.equals("Cerrar")) {
				
				HttpSession cerrarSecciones = (HttpSession) request.getSession();
				cerrarSecciones.invalidate();
				
				response.sendRedirect("index.jsp");
			}
		}
		else {
			
		
		
		TbUsuariosp user = new TbUsuariosp();
		
		UsuarioDao usuDao = new UsuarioDao();
		
		user.setUsuario(usu);
		user.setContrasena(contra);
		
		int verificacion=usuDao.EntradaUsuario(user).size();
		
		if(verificacion==1) {
			HttpSession seccion = request.getSession(true);
			seccion.setAttribute("user",usu);
			response.sendRedirect("Principal.jsp");
		}else {
			System.out.println("Error de secion");
		}
		}
		//response.sendRedirect("index.jsp");
		
	}

}
