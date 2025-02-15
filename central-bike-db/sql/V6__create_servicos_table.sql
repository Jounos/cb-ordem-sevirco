CREATE TABLE IF NOT EXISTS Produtos(
	produto_id integer GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	preco numeric(6, 2) NOT NULL,
	quantidade integer NOT NULL,
	data_inclusao timestamp DEFAULT current_timestamp,
	data_exclusao timestamp
);