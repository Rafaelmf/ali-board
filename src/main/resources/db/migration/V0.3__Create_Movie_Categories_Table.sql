CREATE TYPE genre AS ENUM ('Action', 'Comedy', 'Drama', 'Fantasy', 'Horror', 'Mystery', 'Romance', 'Thriller', 'Western');

CREATE TABLE MOVIE_GENRE (
    id SERIAL PRIMARY KEY ,
    movie_genre genre
);

CREATE TABLE MOVIE_REL_GENRE (
    id SERIAL PRIMARY KEY,
    movie_id int REFERENCES MOVIE(id),
    movie_genre_id int REFERENCES MOVIE_GENRE(id)
);

