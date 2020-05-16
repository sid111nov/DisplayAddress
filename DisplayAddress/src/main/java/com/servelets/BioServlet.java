package com.servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.objects.Bio;

/**
 * Servlet implementation class BioServlet
 */
@WebServlet(description = "Servlet for Bio Page", urlPatterns = { "/Bio" })
public class BioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Get Bio");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("WEB-INF/views/Bio.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Post Bio");
		Bio bio = new Bio();
		
		HttpSession session = request.getSession();
		String age = (String) request.getParameter("age");
		bio.setAge(Integer.parseInt(age));
		bio.setHeight(Double.parseDouble(request.getParameter("height").toString()));
		bio.setHeightunit(request.getParameter("heightunit").toString());
		bio.setWeight(Double.parseDouble(request.getParameter("weight").toString()));
		bio.setWeightunit(request.getParameter("weightunit").toString());
		session.setAttribute("bio", bio);
		response.sendRedirect("Address");
	}

}
