drop user edu CASCADE;

CREATE USER edu identified by edu12 account unlock
default tablespace users;

grant resource, connect
to edu;

