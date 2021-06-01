package service.impl;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domains.Compte;
import repository.impl.CompteRepository;
import service.ICompteService;

@Service
@Transactional
public class CompteService implements ICompteService {

    @Autowired
    private CompteRepository compteRepository;

    @Override
    public void transfert(Integer numSource, Integer numDestination, Double montant) {
        Compte source = compteRepository.find(numSource);
        Compte destination = compteRepository.find(numDestination);
        BigDecimal bd = BigDecimal.valueOf(montant);
        source.setSolde(source.getSolde().add(bd));
        destination.setSolde(destination.getSolde().subtract(bd));
        compteRepository.update(source);
        compteRepository.update(destination);
    }

    @Override
    public void crediter(Integer numero, Double montant) {
        Compte compte = compteRepository.find(numero);
        BigDecimal bd = BigDecimal.valueOf(montant);
        compte.setSolde(compte.getSolde().add(bd));
        compteRepository.update(compte);
    }

    @Override
    public Compte getCompte(Integer numero) {
        return compteRepository.find(numero);
    }
    
}
