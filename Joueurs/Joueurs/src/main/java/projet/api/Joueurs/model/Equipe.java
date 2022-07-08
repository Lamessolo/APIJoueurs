package projet.api.Joueurs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="EQUIPES")
public class Equipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "equipe_id")
	private int equipeId;
	private String nom;
	private String pays;
	
	// Getters et Setters
	public int getEquipeId() {
		return equipeId;
	}
	public void setEquipeId(int equipeId) {
		this.equipeId = equipeId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
	
	
}
