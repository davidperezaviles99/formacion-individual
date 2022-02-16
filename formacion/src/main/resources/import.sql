INSERT INTO comunidades(nombre) VALUES ("Andalucia")
INSERT INTO comunidades(nombre) VALUES ("Madrid")
INSERT INTO comunidades(nombre) VALUES ("Cataluña")
INSERT INTO comunidades(nombre) VALUES ("Galicia")


INSERT INTO alumnos(nombre,apellido,dni,email,telefono,direccion,cp,comunidad_id) VALUES("David", "Perez", "121212A","david1@gmail.com",121212, "Sevilla", 41020,1)
INSERT INTO alumnos(nombre,apellido,dni,email,telefono,direccion,cp,comunidad_id) VALUES("David", "Perez", "121212B","david2@gmail.com",121213, "Sevilla", 41020,2)
INSERT INTO alumnos(nombre,apellido,dni,email,telefono,direccion,cp,comunidad_id) VALUES("David", "Perez", "121212C","david3@gmail.com",121214, "Sevilla", 41020,3)
INSERT INTO alumnos(nombre,apellido,dni,email,telefono,direccion,cp,comunidad_id) VALUES("David", "Perez", "121212D","david4@gmail.com",121215, "Sevilla", 41020,4)

INSERT INTO usuarios (username,password,enabled) VALUES ("David",'$2a$10$HPhGGMxuUdb0JWbBqa2p5OjJoegynViABgNs8EyBW3w4Q.DjXsKW.',1);
INSERT INTO usuarios (username,password,enabled) VALUES ("Admin",'$2a$10$vrlQnP0xtr9W1unwU96mGuir15OHDiw9ugTm.krpS1dP9iTJTfCpi',1);

INSERT INTO roles (nombre) VALUES("ROLE_USER");
INSERT INTO roles (nombre) VALUES("ROLE_ADMIN");

INSERT INTO usuarios_roles (usuario_id,role_id) VALUES(1,1);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES(2,2);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES(2,1);