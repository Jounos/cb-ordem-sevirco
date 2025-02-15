CREATE TABLE IF NOT EXISTS Clientes(
	cliente_id integer GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	pessoa_id integer UNIQUE REFERENCES Pessoas(pessoa_id),
	data_inclusao timestamp DEFAULT current_timestamp
);