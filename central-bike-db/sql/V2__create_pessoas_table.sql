CREATE TABLE IF NOT EXISTS Pessoas(
	pessoa_id integer GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	nome varchar(50) NOT NULL,
	cpf char(11) NOT NULL,
	data_nascimento timestamp NOT NULL,
	data_inclusao timestamp DEFAULT current_timestamp,
	data_exclusao timestamp,
	usuario_id INT UNIQUE REFERENCES Usuarios(usuario_id)
);