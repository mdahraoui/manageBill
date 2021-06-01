package com.j4ltechnologies.formation.ws.soap.ws.impls;

import com.j4ltechnologies.formation.ws.soap.entities.Compte;
import com.j4ltechnologies.formation.ws.soap.manager.CompteManager;
import com.j4ltechnologies.formation.ws.soap.ws.IWsCompte;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Classe WsCompte, créée le 03/05/2021 à 22:28
 *
 * @author Joachim Zadi
 * @version 1.0 du 03/05/2021
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class WsCompte implements IWsCompte {

    @Inject
    CompteManager manager;

    @Override
    public Compte findCompte(String numero) {
        return manager.findCompte(numero);
    }

    @Override
    public void createCompte(String numero) {
        manager.createCompte(numero);
    }

    @Override
    public void crediter(String numero, Integer montant) {
        manager.crediter(numero, montant);
    }

    @Override
    public void debiter(String numero, Integer montant) {
        manager.debiter(numero, montant);
    }
}
