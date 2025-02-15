CREATE TABLE IF NOT EXISTS Usuarios(
	usuario_id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	usuario varchar(50) NOT NULL,
	senha varchar(100) NOT NULL,
	data_inclusao timestamp DEFAULT current_timestamp,
	data_exclusao timestamp
);