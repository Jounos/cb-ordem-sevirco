CREATE TABLE IF NOT EXISTS Produtos_Vendidos(
	produto_vendido_id integer GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	nome varchar(50) NOT NULL,
	preco numeric(6, 2) NOT NULL,
	quantidade integer NOT NULL,
	data_venda date NOT NULL,
	colaborador_id integer REFERENCES Colaboradores(colaborador_id),
	cliente_id integer REFERENCES Clientes(cliente_id)
);