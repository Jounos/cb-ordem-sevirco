CREATE TABLE IF NOT EXISTS Servicos_Prestados(
	servico_prestado_id integer GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	nome varchar(50) NOT NULL,
	preco numeric(5, 2),
	data_servico_prestado date NOT NULL,
	colaborador_id integer REFERENCES Colaboradores(colaborador_id),
	cliente_id integer REFERENCES Clientes(cliente_id),
	data_inclusao timestamp DEFAULT current_timestamp
);