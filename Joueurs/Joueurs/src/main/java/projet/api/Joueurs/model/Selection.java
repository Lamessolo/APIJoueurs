package projet.api.Joueurs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="SELECTIONS")
public class Selection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "selection_id")
	private int selectionId;
	private String nom;
	
	
	
	
	// Getters et setters
	public int getSelectionId() {
		return selectionId;
	}
	public void setSelectionId(int selectionId) {
		this.selectionId = selectionId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
