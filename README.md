# APIJoueurs
API Java  Joueur pour comparer les joueurs au classement des ballon d'or et leur trophées
Modele de données : 6 Entités : COMPTE, JOUEUR, SELECTION, CLUB, TROPHE, EQUIPE
 - Compte possede un ou plusieurs Joueur(s) relation one to many , mais un Joueur possede un unique Compte relation one to one
   A partir d'un CompteId on recupere une liste<Joueur> , un JoueurId a forcement un compteId associé 
 
 - Compte possede une unique selection relation one to one, une selection possede un ou plusieurs Compte relation one to many
  A partir d'une SelectionId on recupere une liste<Compte>
 
 - Joueur possede une ou plusieurs Equipe(s) relation , une Equipe possede un ou plusieur Joueur(s)  relation Many to many
   A partir d'un JoueurId on recupere une liste<Equipe> 
  A partir d'une EquipeId on recupere une liste<Joueur>
 
 - Joueur possede un Club , mais un Club possede un ou plusieurs joueur(s) one to many many to one
  un JoueurId possede toujours un ClubId associé
  A partir d'un ClubId on recupere une liste<Joueur>
 
 - Joueur possede un plusieurs Trophe(s), un Trophe peut etre possedé par un ou plusieurs Joueur(s)
  un JoueurId possede une liste<trophe> 
  un TropheId possede une liste<Joueur>
