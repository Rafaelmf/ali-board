CREATE TABLE MOVIE(
    id SERIAL PRIMARY KEY ,
    title varchar(255),
    original_title varchar(255),
    vimeo_id int,
    overview text,
    popularity int,
    original_language varchar(10),
    poster_path varchar(255),
    backdrop_path varchar(255),
    release_date date,
    vote_average decimal,
    vote_count decimal
);