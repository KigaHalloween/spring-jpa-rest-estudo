CREATE TABLE CLIENTE(
    idCliente INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR (50),
    Email VARCHAR (50),
    Telefone INTEGER
);

CREATE TABLE CARRO(
    idCarro INTEGER PRIMARY KEY AUTO_INCREMENT,
    Placa VARCHAR(7),
    Nome VARCHAR (50),
    Marca VARCHAR (50)
);

CREATE TABLE GRUPO(
    idGrupo INTEGER PRIMARY KEY AUTO_INCREMENT,
    ID_CARRO INTEGER REFERENCES CARRO (idCarro)
 );

CREATE TABLE PEDIDO(
    idPedido INTEGER PRIMARY KEY AUTO_INCREMENT,
    ID_CLIENTE INTEGER REFERENCES CLIENTE(idCliente),
    ID_CARRO INTEGER REFERENCES CARRO (idCarro),
    dataAluguel DATE,
    dataDevolucoa DATE,
    valorDiaria DOUBLE,
    validade BIT
);