package projet.api.Joueurs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projet.api.Joueurs.model.Joueur;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur,Integer> {

}
