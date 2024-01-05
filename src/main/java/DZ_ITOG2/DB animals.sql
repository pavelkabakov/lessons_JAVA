DROP DATABASE IF EXISTS animals;
CREATE DATABASE animals;
USE animals;

-- Pets
DROP TABLE IF EXISTS Pets;
CREATE TABLE Pets (
	id SERIAL PRIMARY KEY, -- SERIAL = BIGINT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE
    AnimalsName VARCHAR(50),
    AnimalsType VARCHAR(50),
    BirthDate DATE,
    Commands VARCHAR(50)
);

INSERT INTO Pets (id, AnimalsName, AnimalsType, BirthDate, Commands) VALUES 
(1, 'Fido', 'Dog', '2020-01-01','Sit, Stay, Fetch'),
(2, 'Whiskers', 'Cat', '2019-05-15','Sit, Pounce'),
(3, 'Hammy', 'Hamster', '2021-03-10', 'Roll, Hide'),
(4, 'Buddy', 'Dog', '2018-12-10','Sit, Paw, Bark'),
(5, 'Smudge', 'Cat', '2020-02-20','Sit, Pounce, Scratch'),
(6, 'Peanut', 'Hamster', '2021-08-01','Roll, Spin'),
(7, 'Bella', 'Dog', '2019-11-11','Sit, Stay, Roll'),
(8, 'Oliver', 'Cat', '2020-06-30','Meow, Scratch, Jump');

-- Pack Animals
DROP TABLE IF EXISTS PackAnimals;
CREATE TABLE PackAnimals (
	id SERIAL PRIMARY KEY, -- SERIAL = BIGINT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE
    AnimalsName VARCHAR(50),
    AnimalsType VARCHAR(50),
    BirthDate DATE,
    Commands VARCHAR(50)
);

INSERT INTO PackAnimals (id, AnimalsName, AnimalsType, BirthDate, Commands) VALUES 
(1, 'Thunder', 'Horse', '2015-07-21','Trot, Canter, Gallop'),
(2, 'Sandy', 'Camel', '2016-11-03','Walk, Carry Load'),
(3, 'Eeyore', 'Donkey', '2017-09-18', 'Walk, Carry Load, Bray'),
(4, 'Storm', 'Horse', '2014-05-05','Trot, Canter'),
(5, 'Dune', 'Camel', '2018-12-12','Walk, Sit'),
(6, 'Burro', 'Donkey', '2019-01-23','Walk, Bray, Kick'),
(7, 'Blaze', 'Horse', '2016-02-29','Trot, Jump, Gallop'),
(8, 'Sahara', 'Camel', '2015-08-14','Walk, Run');

SELECT *
FROM Pets
UNION SELECT *
FROM PackAnimals;
