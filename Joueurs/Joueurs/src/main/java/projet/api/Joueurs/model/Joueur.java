package projet.api.Joueurs.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="JOUEURS")
public class Joueur {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name = "joueur_id")
private int joueurId;

private String nom;

private String prenom;

private String description;

private String pictureUrl;

private int annee;

private int position;

private int points;

//* relation avec les autres classes *//
private Compte compte;
private Selection selection;
private List<Equipe> equipes;
private List<Trophe> trophes;
private Club club;


public int getJoueurId() {
	return joueurId;
}
public void setJoueurId(int joueurId) {
	this.joueurId = joueurId;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getPictureUrl() {
	return pictureUrl;
}
public void setPictureUrl(String pictureUrl) {
	this.pictureUrl = pictureUrl;
}
public int getAnnee() {
	return annee;
}
public void setAnnee(int annee) {
	this.annee = annee;
}
public int getPosition() {
	return position;
}
public void setPosition(int position) {
	this.position = position;
}
public int getPoints() {
	return points;
}
public void setPoints(int points) {
	this.points = points;
}
public Compte getCompte() {
	return compte;
}
public void setCompte(Compte compte) {
	this.compte = compte;
}
public Selection getSelection() {
	return selection;
}
public void setSelection(Selection selection) {
	this.selection = selection;
}
public List<Equipe> getEquipes() {
	return equipes;
}
public void setEquipes(List<Equipe> equipes) {
	this.equipes = equipes;
}




}
