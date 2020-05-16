package com.servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.objects.Name;

/**
 * Servlet implementation class NameServlet
 */
@WebServlet("/Name")
public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get Name");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("WEB-INF/views/Name.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post Name");
		Name name = new Name();
		HttpSession session = request.getSession();
		name.setFirstname(request.getParameter("firstname"));
		name.setLastname(request.getParameter("lastname"));
		
		
		session.setAttribute("name", name);
		
		//request.getRequestDispatcher("/WEB-INF/views/Bio.jsp").forward(request, response);
		response.sendRedirect("Bio");
		//request.getRequestDispatcher("Bio").include(request, response);
	}

}
