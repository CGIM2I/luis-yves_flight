INSERT INTO Localite(id , ville , aeroport)  VALUES ( 1 , 'Paris' , 'Paris-Orly' )
INSERT INTO Localite(id , ville , aeroport)  VALUES ( 2 , 'Paris' , 'Paris-Roissy' )
INSERT INTO Localite(id , ville , aeroport)  VALUES ( 3 , 'Toulouse' , 'Toulouse-Blagnac' )
INSERT INTO Localite(id , ville , aeroport)  VALUES ( 4 , 'Nice' , 'Nice-' )

INSERT INTO Vol(num , dateArrivee , dateDepart,prix, refLocArrivee,refLocDepart) VALUES ( 1 , '2017-09-20 18:10:00' ,'2017-09-20 19:30:00' ,800 , 1 , 2 )
INSERT INTO Vol(num , dateArrivee , dateDepart,prix, refLocArrivee,refLocDepart) VALUES ( 2 , '2017-9-25 18:10:00' ,'2017-12-25 19:30:00' ,800 , 2 , 1 )


INSERT INTO PERSONNE (TYPEPERSONNE, ID, EMAIL, NOM, PRENOM, TELEPHONE, CODEPOSTAL, NUMETRUE, PAYS, VILLE) VALUES ('CLI', 1, 'yvessav@free.fr', 'savang', 'yves', '0145253573', '75007', '8 villa de Ségur', 'France', 'Paris')
INSERT INTO PERSONNE (TYPEPERSONNE, ID, EMAIL, NOM, PRENOM, TELEPHONE, CODEPOSTAL, NUMETRUE, PAYS, VILLE) VALUES ('CLI', 2, 'babel@free.fr', 'joris', 'boris', '0620020630', '89255', '19 rue de la Perche', 'France', 'Perpete')
INSERT INTO PERSONNE (TYPEPERSONNE, ID, EMAIL, NOM, PRENOM, TELEPHONE, CODEPOSTAL, NUMETRUE, PAYS, VILLE) VALUES ('CLI', 3, 'babel@free.fr', 'joris', 'boris', '0620020630', '89255', '19 rue de la Perche', 'France', 'Perpete')