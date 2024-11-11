psql postgres -c "CREATE DATABASE sonhos WITH OWNER = dreamlord ENCODING = 'UTF-8'"
psql sonhos -f SKEL.sql
