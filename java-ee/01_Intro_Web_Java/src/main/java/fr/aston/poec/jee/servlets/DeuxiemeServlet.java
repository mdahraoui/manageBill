package fr.aston.poec.jee.servlets;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deux")
public class DeuxiemeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet de la classe " + getClass().getSimpleName());

	
		String message = "Un petit bonjour depuis la servlet";
		request.setAttribute("msg", message);
		
		LocalTime heure = LocalTime.now();
		request.setAttribute("heure", heure);
		
		String prenom = request.getParameter("prenom");
		System.out.println(prenom);
		
		request.setAttribute("login", prenom);
		
		request.getRequestDispatcher("/premiere.jsp").forward(request, response);		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost de la classe " + getClass().getSimpleName());
	}
}