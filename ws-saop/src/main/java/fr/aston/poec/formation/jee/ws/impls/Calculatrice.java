package fr.aston.poec.formation.jee.ws.impls;

import javax.jws.WebService;

import fr.aston.poec.formation.jee.ws.ICalculatrice;

@WebService(endpointInterface = "fr.aston.poec.formation.jee.ws.ICalculatrice")
public class Calculatrice implements ICalculatrice {

	@Override
	public double addition(double x, double y) {
		return x + y;
	}

	@Override
	public double soustraction(double x, double y) {
		return x - y;
	}

	@Override
	public double multiplication(double x, double y) {
		return x * y;
	}

	@Override
	public double division(double x, double y) {
		return x / y;
	}

	@Override
	public int modulo(int x, int y) {
		return x % y;
	}

}
