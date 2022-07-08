package projet.api.Joueurs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="TROPHES")
public class Trophe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "trophe_id")
	private int tropheId;
	private String nom;
	private String caracteristique;
	
	
	
	// Getters et Setters
	public int getTropheId() {
		return tropheId;
	}
	public void setTropheId(int tropheId) {
		this.tropheId = tropheId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCaracteristique() {
		return caracteristique;
	}
	public void setCaracteristique(String caracteristique) {
		this.caracteristique = caracteristique;
	}
	
	
	
}
