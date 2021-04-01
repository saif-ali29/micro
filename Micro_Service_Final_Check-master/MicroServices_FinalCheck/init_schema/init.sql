DROP SCHEMA IF EXISTS docker_movie;
create schema docker_movie;
use docker_movie

create table movie(id long,title varchar(100), boxOffice varchar(15),active boolean, dateOfLaunch date,genre varchar(45), teaser boolean,PRIMARY KEY(id));


insert into movielist(id,title,boxOffice,active,dateOfLaunch,genre,teaser)
values
(100,"The Avengers","123,1234,123",true,"2017-12-17","Thriller",true),
(101,"The Quite Place","123,1234,123",true,"2017-12-17","Suspense",true),
(102,"Titanic","123,1234,123",true,"2017-12-17","Romance",true),
(103,"Avtar","123,1234,123",true,"2017-12-17","Adventure",true),
(104,"Inferno","123,1234,123",true,"2017-12-17","Mystry",true);