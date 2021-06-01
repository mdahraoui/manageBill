package com.j4ltechnologies.formation.ws.soap.ws;

import com.j4ltechnologies.formation.ws.soap.entities.Compte;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Classe IWsCompte, créée le 03/05/2021 à 22:24
 *
 * @author Joachim Zadi
 * @version 1.0 du 03/05/2021
 */
@WebService
public interface IWsCompte {

    @WebMethod
    Compte findCompte(String numero);

    @WebMethod
    void createCompte(String numero);

    @WebMethod
    void crediter(String numero, Integer montant);

    @WebMethod
    void debiter(String numero, Integer montant);
}
