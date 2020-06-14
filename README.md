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

select Pessoa.Nome as pessoaName, Pessoa.Cidade, Pessoa.Endereco,
Carro.Marca, Carro.Nome as carroName, Pessoa.ID_Pessoa 
from Pessoa 
inner join Carro
on Pessoa.ID_Pessoa = Carro.ID_Pessoa
```
