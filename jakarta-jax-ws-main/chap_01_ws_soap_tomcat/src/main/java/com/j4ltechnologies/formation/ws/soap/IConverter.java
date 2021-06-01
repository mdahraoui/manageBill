package com.j4ltechnologies.formation.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IConverter {

	@WebMethod
	double celsiusFahrenheit(double celsius);

	@WebMethod(exclude = true)
	double kilometreMiles(double kilometre);
}