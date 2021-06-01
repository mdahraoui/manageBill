package com.j4ltechnologies.formation.ws.soap.client;

import com.j4ltechnologies.formation.ws.soap.WsCompte;
import com.j4ltechnologies.formation.ws.soap.WsCompteService;

/**
 * Classe Main, créée le 04/05/2021 à 07:25
 *
 * @author Joachim Zadi
 * @version 1.0 du 04/05/2021
 */
public class Main {
    public static void main(String[] args) {
        WsCompteService compteService = new WsCompteService();
        WsCompte compte = compteService.getWsComptePort();
        compte.createCompte("001");
        compte.crediter("001", 490);
    }
}
