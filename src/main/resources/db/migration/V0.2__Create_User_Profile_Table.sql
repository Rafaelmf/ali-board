CREATE TYPE profile_status AS ENUM ('active', 'inactive', 'blocked');
CREATE TYPE payment AS ENUM ('card', 'cash', 'billet');


CREATE TABLE USER_PROFILE (
    id SERIAL PRIMARY KEY ,
    status profile_status,
    name varchar(255),
    email varchar(255),
    telephone varchar(255),
    birthday date,
    payment_method payment,
    registry_date date,
    unsubscribe_date date
);