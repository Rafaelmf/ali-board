CREATE TABLE Company(
    id SERIAL PRIMARY KEY ,
    cnpj varchar(255),
    razao_social text,
    uf varchar(2)
);