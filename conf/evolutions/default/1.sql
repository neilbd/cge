# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table event (
  id                        integer not null,
  name                      varchar(255),
  room                      varchar(255),
  date                      varchar(255),
  time                      varchar(255),
  desc                      varchar(255),
  attendence                integer,
  color                     varchar(255),
  constraint pk_event primary key (id))
;

create sequence event_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists event;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists event_seq;

