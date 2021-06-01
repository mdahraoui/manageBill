package service;

import java.math.BigDecimal;

import domains.Compte;

public interface ICompteService {

	 void transfert(Integer numSource, Integer numDestination, Double montant);

	    void crediter(Integer numero, Double montant);

	    Compte getCompte(Integer numero);
}
