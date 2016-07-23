# --- !Ups

create table event (
  id                        integer auto_increment not null,
  organization_name         varchar(255),
  location                  varchar(255),
  room                      varchar(255),
  tmp_date                  timestamp,
  time                      varchar(255),
  description               varchar(255),
  attendence                integer,
  tag                       varchar(255),
  hour                      integer,
  minute                    integer,
  date                      timestamp,
  date_to_use               varchar(255),
  phone_number              varchar(255),
  email                     varchar(255),
  constraint pk_event primary key (id))
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists event;

SET REFERENTIAL_INTEGRITY TRUE;

