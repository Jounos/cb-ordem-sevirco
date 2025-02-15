CREATE TABLE IF NOT EXISTS Notas(
	nota_id integer GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	servico_prestado_id integer REFERENCES Servicos_Prestados(servico_prestado_id),
	produto_vendido_id integer REFERENCES Produtos_Vendidos(produto_vendido_id),
	colaborador_id integer REFERENCES Colaboradores(colaborador_id),
	cliente_id integer REFERENCES Clientes(cliente_id)
);