drop user eduTest CASCADE;

CREATE USER eduTest identified by eduTest12 account unlock
default tablespace users;

grant resource, connect
to eduTest;