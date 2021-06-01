package fr.aston.poec.jee.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PremiereServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("Init de la servlet " + getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet de la classe " + getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost de la classe " + getClass().getSimpleName());
	}
	
	@Override
	public void destroy() {
		System.out.println("Avant destruction de la servlet "+getClass().getSimpleName());
	}
}

/*
 * Une servlet est une classe Java qui etend la classe HttpServlet
 * 
 * Par convention, un projet web en Java EE doit contenir un fichier web.xml
 * Le web.xml soit imperativement se trouver dans le dossier WEB-INF
 */