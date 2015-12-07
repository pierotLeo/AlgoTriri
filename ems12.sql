CREATE TABLE EMS1
( nom varchar (60) primary key,
  prenom varchar(60)
);

CREATE TABLE EMS2
(
 nom varchar(60),
 matiere varchar(60),
 salle varchar(60),
 primary key(nom,matiere)
);

ALTER TABLE EMS2
	ADD FOREIGN KEY(nom) REFERENCES EMS1(nom)
	DEFERRABLE INITIALLY DEFERRED;
