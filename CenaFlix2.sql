CREATE DATABASE cenaflix2;
USE cenaflix;

CREATE TABLE `autenticacao`(
	id int not null auto_increment primary key,
	login_name varchar(100),
    login_password text,
    login_tipo varchar(30)
);

CREATE TABLE `repositoriopodcast`(
	id int not null auto_increment primary key,
	produtor varchar(100),
    nome_episodio varchar(100),
    numero_episodio int,
    duracao varchar(20),
    url varchar(100),
    status char(1)
);




