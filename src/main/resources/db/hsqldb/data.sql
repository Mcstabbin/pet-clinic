INSERT INTO vets VALUES (1, 'James', 'Carter');
INSERT INTO vets VALUES (2, 'Helen', 'Leary');
INSERT INTO vets VALUES (3, 'Linda', 'Douglas');
INSERT INTO vets VALUES (4, 'Rafael', 'Ortega');
INSERT INTO vets VALUES (5, 'Henry', 'Stevens');
INSERT INTO vets VALUES (6, 'Sharon', 'Jenkins');

INSERT INTO specialties VALUES (1, 'radiology');
INSERT INTO specialties VALUES (2, 'surgery');
INSERT INTO specialties VALUES (3, 'dentistry');

INSERT INTO vet_specialties VALUES (2, 1);
INSERT INTO vet_specialties VALUES (3, 2);
INSERT INTO vet_specialties VALUES (3, 3);
INSERT INTO vet_specialties VALUES (4, 2);
INSERT INTO vet_specialties VALUES (5, 1);

INSERT INTO types VALUES (1, 'cat');
INSERT INTO types VALUES (2, 'dog');
INSERT INTO types VALUES (3, 'lizard');
INSERT INTO types VALUES (4, 'snake');
INSERT INTO types VALUES (5, 'bird');
INSERT INTO types VALUES (6, 'hamster');

INSERT INTO owners VALUES (1, 'George', 'Franklin', '110 W. Liberty St.', 'Madison', '6085551023');
INSERT INTO owners VALUES (2, 'Betty', 'Davis', '638 Cardinal Ave.', 'Sun Prairie', '6085551749');
INSERT INTO owners VALUES (3, 'Eduardo', 'Rodriquez', '2693 Commerce St.', 'McFarland', '6085558763');
INSERT INTO owners VALUES (4, 'Harold', 'Davis', '563 Friendly St.', 'Windsor', '6085553198');
INSERT INTO owners VALUES (5, 'Peter', 'McTavish', '2387 S. Fair Way', 'Madison', '6085552765');
INSERT INTO owners VALUES (6, 'Jean', 'Coleman', '105 N. Lake St.', 'Monona', '6085552654');
INSERT INTO owners VALUES (7, 'Jeff', 'Black', '1450 Oak Blvd.', 'Monona', '6085555387');
INSERT INTO owners VALUES (8, 'Maria', 'Escobito', '345 Maple St.', 'Madison', '6085557683');
INSERT INTO owners VALUES (9, 'David', 'Schroeder', '2749 Blackhawk Trail', 'Madison', '6085559435');
INSERT INTO owners VALUES (10, 'Carlos', 'Estaban', '2335 Independence La.', 'Waunakee', '6085555487');

INSERT INTO pets VALUES (1, 'Leo', '2010-09-07', 1, 1);
INSERT INTO pets VALUES (2, 'Basil', '2012-08-06', 6, 2);
INSERT INTO pets VALUES (3, 'Rosy', '2011-04-17', 2, 3);
INSERT INTO pets VALUES (4, 'Jewel', '2010-03-07', 2, 3);
INSERT INTO pets VALUES (5, 'Iggy', '2010-11-30', 3, 4);
INSERT INTO pets VALUES (6, 'George', '2010-01-20', 4, 5);
INSERT INTO pets VALUES (7, 'Samantha', '2012-09-04', 1, 6);
INSERT INTO pets VALUES (8, 'Max', '2012-09-04', 1, 6);
INSERT INTO pets VALUES (9, 'Lucky', '2011-08-06', 5, 7);
INSERT INTO pets VALUES (10, 'Mulligan', '2007-02-24', 2, 8);
INSERT INTO pets VALUES (11, 'Freddy', '2010-03-09', 5, 9);
INSERT INTO pets VALUES (12, 'Lucky', '2010-06-24', 2, 10);
INSERT INTO pets VALUES (13, 'Sly', '2012-06-08', 1, 10);


INSERT INTO visit_times VALUES (1,'8:00 - 8:30','');
INSERT INTO visit_times VALUES (2,'8:30 - 9:00','');
INSERT INTO visit_times VALUES (3,'9:00 - 9:30','');
INSERT INTO visit_times VALUES (4,'9:30 - 10:00','');
INSERT INTO visit_times VALUES (5,'10:00 - 10:30','');
INSERT INTO visit_times VALUES (6,'10:30 - 11:00','');
INSERT INTO visit_times VALUES (7,'11:00 - 11:30','');
INSERT INTO visit_times VALUES (8,'11:30 - 12:00','');
INSERT INTO visit_times VALUES (9,'12:00 - 12:30','');
INSERT INTO visit_times VALUES (10,'12:30 - 1:00','');
INSERT INTO visit_times VALUES (11,'1:00 - 1:30','');
INSERT INTO visit_times VALUES (12,'1:30 - 2:00','');
INSERT INTO visit_times VALUES (13,'2:00 - 2:30','');
INSERT INTO visit_times VALUES (14,'2:30 - 3:00','');
INSERT INTO visit_times VALUES (15,'3:00 - 3:30','');
INSERT INTO visit_times VALUES (16,'3:30 - 4:00','');
INSERT INTO visit_times VALUES (17,'4:00 - 4:30','');
INSERT INTO visit_times VALUES (18,'4:30 - 5:00','');


INSERT INTO visits VALUES (1, 7, 1, '2013-01-01', 1, 'rabies shot');
INSERT INTO visits VALUES (2, 8, 2, '2013-01-02', 1, 'rabies shot');
INSERT INTO visits VALUES (3, 8, 1, '2013-01-03', 1,  'neutered');
INSERT INTO visits VALUES (4, 7, 2, '2013-01-04', 2, 'spayed');


