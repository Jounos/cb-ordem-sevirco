CREATE TABLE IF NOT EXISTS Colaboradores(
	colaborador_id integer GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	data_admissao timestamp,
	salario numeric(9, 2),
	data_recisao timestamp,
	data_inclusao timestamp DEFAULT current_timestamp,
	pessoa_id INT UNIQUE REFERENCES Pessoas(pessoa_id)
);