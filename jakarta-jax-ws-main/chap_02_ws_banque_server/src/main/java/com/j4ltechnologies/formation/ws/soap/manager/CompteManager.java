package com.j4ltechnologies.formation.ws.soap.manager;

import com.j4ltechnologies.formation.ws.soap.entities.Compte;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * Classe CompteManager, créée le 03/05/2021 à 21:11
 *
 * @author Joachim Zadi
 * @version 1.0 du 03/05/2021
 */
@Stateless
public class CompteManager {

    @PersistenceContext(unitName = "BANQUE_PU")
    private EntityManager em;

    public Compte findCompte(String numero) {
        TypedQuery<Compte> query = em.createQuery("select c from Compte c where c.numero = :numero", Compte.class);
        query.setParameter("numero", numero);
        return query.getSingleResult();
    }

    public void createCompte(String numero) {
        Compte compte = new Compte();
        compte.setNumero(numero);
        compte.setSolde(100);
        em.persist(compte);
    }

    public void crediter(String numero, Integer montant) {
        if (montant >= 0) {
            Compte compte = findCompte(numero);
            int soldeActuel = compte.getSolde();
            compte.setSolde(soldeActuel + montant);
            System.out.println("Compte credité avec succes ");
            em.merge(compte);
        }
    }

    public void debiter(String numero, Integer montant) {
        if (montant >= 0) {
            Compte compte = findCompte(numero);
            int soldeActuel = compte.getSolde();
            int nouveauMontant = soldeActuel-montant;
            if(nouveauMontant<0){
                throw new RuntimeException("Montant du retrait trop elevé !!!");
            }
            compte.setSolde(nouveauMontant);
            System.out.println("Compte debié avec succes ");
            em.merge(compte);
        }
    }
}