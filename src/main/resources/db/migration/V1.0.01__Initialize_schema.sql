create sequence id_seq;

create table resorts (
  id          integer primary key not null default nextval('id_seq'),
  name        varchar not null unique,
  description varchar
);