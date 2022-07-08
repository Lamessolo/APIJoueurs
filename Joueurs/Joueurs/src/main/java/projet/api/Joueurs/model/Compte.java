package projet.api.Joueurs.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name="COMPTES")
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "compte_id")
	
	private int compteId;
	private String nom;
	private String reference;
	
	// Relation (Compte , Joueurs) , 1 compte possede plusieurs joueurs
	@OneToMany(
			   cascade = CascadeType.ALL, 
			   orphanRemoval = true, 
			   fetch = FetchType.EAGER)
				@JoinColumn(name = "compte_id")
	private List<Joueur> joueurs = new ArrayList<>();
	
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	// Getters et Setters
	public int getCompteId() {
		return compteId;
	}
	public void setCompteId(int compteId) {
		this.compteId = compteId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
