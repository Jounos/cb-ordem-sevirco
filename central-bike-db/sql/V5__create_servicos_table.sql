CREATE TABLE IF NOT EXISTS Servicos(
	servico_id integer GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	nome varchar(50) NOT NULL,
	preco numeric(5,2) NOT NULL,
	data_inclusao timestamp DEFAULT current_timestamp,
	data_exclusao timestamp
); 