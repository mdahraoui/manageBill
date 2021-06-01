package repository.impl;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import domains.Compte;
import repository.ICompteRepository;


@Repository
@Transactional
public class CompteRepository implements ICompteRepository {

	@PersistenceContext
	private EntityManager em;


    public void insert(Compte compte) {
       em.persist(compte);
    }

    @Override
    public void update(Compte compte) {
        em.merge(compte);
    }

    @Override
    public void update(List<Compte> comptes) {
        for (Compte compte : comptes) {
            update(compte);
        }
    }

    @Override
    public void delete(Integer numero) {
       Compte c = em.find(Compte.class, numero);
       em.remove(c);
    }

    @Override
    public Compte find(Integer numero) {
        return em.find(Compte.class, numero);
    }
    @Override
    
	public List<Compte> find(List<Integer> numeros) {
		return em.createQuery("select e from compte e where e.id = :numeros", Compte.class)
				.setParameter("id", numeros).getResultList();
		
	}

    @Override
    public List<Compte> find(String nom) {
       return em.createQuery("select e from compte e where e.nom = :nom", Compte.class)
    		   .setParameter(nom, nom)
    		   .getResultList();
       }

    @Override
    public List<Compte> find(Boolean fermer) {
        return em.createQuery("select e from compte e where e.fermer = :fermer", Compte.class)
        		.setParameter(fermer.toString(),fermer.toString())
        		.getResultList();
    }
}


