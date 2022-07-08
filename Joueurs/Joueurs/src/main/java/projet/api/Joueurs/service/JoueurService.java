package projet.api.Joueurs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projet.api.Joueurs.model.Joueur;
import projet.api.Joueurs.repository.JoueurRepository;

@Service
public class JoueurService {

	@Autowired
	private JoueurRepository joueurRepository;
	
	public List<Joueur> getJoueurs(){		
		return joueurRepository.findAll();
	}
	
	public Optional<Joueur> getJoueurById (int id) {
		return joueurRepository.findById(id);
	}
}
