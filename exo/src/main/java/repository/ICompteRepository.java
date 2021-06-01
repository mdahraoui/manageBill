package repository;

import java.util.List;

import domains.Client;
import domains.Compte;

public interface ICompteRepository {

	void insert(Compte ludo);

    void update(Compte compte);

    void update(List<Compte> comptes);

    void delete(Integer numero);

    Compte find(Integer numero);

    List<Compte> find(List<Integer> numeros);

    List<Compte> find(String nom);

    List<Compte> find(Boolean fermer);
}
