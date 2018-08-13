insert into adres (id, ulica, nr) values (1,'Zielona',3);
insert into adres (id, ulica, nr) values (2,'Zielona',5);
insert into adres (id, ulica, nr) values (3,'Wiejska',16);

insert into mieszkaniec (id, first_name, last_name, sex) values (1,'wala','wasko','female')
insert into mieszkaniec (id, first_name, last_name, sex) values (2,'ala','dam','female')
insert into mieszkaniec (id, first_name, last_name, sex) values (3,'saala','dcam','male')
insert into mieszkaniec (id, first_name, last_name, sex) values (4,'saala','dcam','male')
insert into mieszkaniec (id, first_name, last_name, sex) values (5,'saala','dcam','male')
insert into mieszkaniec (id, first_name, last_name, sex) values (6,'saala','dcam','male')

INSERT into mieszkanie (id, numer, powierzchnia, mieszkaniec_id) VALUES (1,1,66.6,1);
INSERT into mieszkanie (id, numer, powierzchnia, mieszkaniec_id) VALUES (2,2,21.7,2);
INSERT into mieszkanie (id, numer, powierzchnia, mieszkaniec_id) VALUES (3,3,88.4,3);
INSERT into mieszkanie (id, numer, powierzchnia, mieszkaniec_id) VALUES (4,4,104.9,4);
INSERT into mieszkanie (id, numer, powierzchnia, mieszkaniec_id) VALUES (5,5,70.4,5);
INSERT into mieszkanie (id, numer, powierzchnia, mieszkaniec_id) VALUES (6,7,34.6,6);

INSERT into wspolnota (id, nazwa_wspolnoty, adres_id, mieszkanie_id) VALUES (1, 'klon',1,1);
INSERT into wspolnota (id, nazwa_wspolnoty, adres_id, mieszkanie_id) VALUES (2, 'klon',1,2);
INSERT into wspolnota (id, nazwa_wspolnoty, adres_id, mieszkanie_id) VALUES (3, 'klon',1,3);
INSERT into wspolnota (id, nazwa_wspolnoty, adres_id, mieszkanie_id) VALUES (4, 'klon',1,4);
INSERT into wspolnota (id, nazwa_wspolnoty, adres_id, mieszkanie_id) VALUES (5, 'klon',1,5);
INSERT into wspolnota (id, nazwa_wspolnoty, adres_id, mieszkanie_id) VALUES (6, 'melon',3,6);
INSERT into wspolnota (id, nazwa_wspolnoty, adres_id, mieszkanie_id) VALUES (7, 'melon',3,7);
