package fr.managebill.repositories.inter;


import org.springframework.data.repository.CrudRepository;


import fr.managebill.entities.Utilisateur;

public interface IUtilisateurRepository extends CrudRepository<Utilisateur, Integer> {


}
