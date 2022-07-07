# APIJoueurs
API Java  Joueur pour comparer les joueurs au classement des ballon d'or et leur trophées
Modele de données : 5 Entités : COMPTE, JOUEUR, SELECTION, CLUB, TROPHE
 - Compte possede un ou plusieurs Joueur(s) relation one to many , mais un Joueur possede un unique Compte relation one to one
 - Compte possede une unique selection relation one to one, une selection possede un ou plusieurs Compte relation one to many
 - Joueur possede une ou plusieurs Equipe(s) relation , une Equipe possede un ou plusieur Joueur(s)  relation Many to many
 - Joueur possede un Club , mais un Club possede un ou plusieurs joueur(s) one to many many to one
 - Joueur possede un plusieurs Trophe(s) , un Trophe peut etre possedé par un ou plusieurs Joueur(s)
