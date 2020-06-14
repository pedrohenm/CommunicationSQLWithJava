# CommunicationSQLWithJava

Creating the Tables:
```
CREATE TABLE Pessoa
(
    ID_Pessoa integer IDENTITY(1,1) PRIMARY KEY,
    Nome varchar(255),
    Endereco varchar(255),
    Cidade varchar(255)
);

CREATE TABLE Carro
(
	ID_Carro integer IDENTITY(1,1) PRIMARY KEY,
	Nome varchar(255),
	Marca varchar(255),
    ID_Pessoa integer,
);

ALTER TABLE Carro
ADD CONSTRAINT fk_PesCarro FOREIGN KEY (ID_Pessoa) REFERENCES Pessoa (ID_Pessoa)
```
