CREATE USER edu IDENTIFIED by edu12;

grant connect, resource to edu;

alter user edu default tablespace users;