package com.j4ltechnologies.formation.ws.soap.impls;


import com.j4ltechnologies.formation.ws.soap.IConverter;

import javax.jws.WebService;

@WebService(endpointInterface = "com.j4ltechnologies.formation.ws.soap.IConverter")
public class Converter implements IConverter {

	@Override
	public double celsiusFahrenheit(double celsius) {
		return celsius * 9 / 5 + 32;
	}

	@Override
	public double kilometreMiles(double kilometre) {
		return kilometre * 0.621371;
	}
}