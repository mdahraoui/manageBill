package fr.aston.poec.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.aston.poec.models.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String mdp = request.getParameter("mdp");

		if(email.equalsIgnoreCase("stagiaire@aston.fr") && mdp.equals("Password147")) {
			//Il est conduit sur la page de conversion
			
			User user = new User(email, mdp);
			
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			
			response.sendRedirect("converter");
		}else {
			//Il reconduit sur la page de login
			String message = "Utilisateur inconnue du syteme";
			request.setAttribute("msgError", message);
			
			//doGet(request, response);
			response.sendRedirect("login");
		}
	}
}
