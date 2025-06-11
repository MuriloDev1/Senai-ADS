## DDL - Data Definition Language

// CreatedAt
CREATE TABLE cliente (
    id SERIAL PRIMARY KEY,
    ativo BOOLEAN NOT NULL DEFAULT TRUE, 
);
 
 // Especialização de pessoa = Total 
CREATE TABLE pessoa_fisica (
    id INTEGER PRIMARY KEY REFERENCES cliente(id) ON DELETE CASCADE,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) UNIQUE NOT NULL,
    nascimento DATE NOT NULL 
);

CREATE TABLE pessoa_juridica (
    id INTEGER PRIMARY KEY REFERENCES cliente(id) ON DELETE CASCADE,
    nome_fantasia VARCHAR(100) NOT NULL,
    razao_social VARCHAR(100) NOT NULL,
    cnpj VARCHAR(18) UNIQUE NOT NULL,
);

CREATE TABLE endereco (
    id SERIAL PRIMARY KEY,
    cliente_id INTEGER REFERENCES cliente(id) ON DELETE CASCADE,
    logradouro VARCHAR(100) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    complemento VARCHAR(100),
    bairro VARCHAR(100) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    estado VARCHAR(2) NOT NULL,
    cep VARCHAR(2) NOT NULL,
    tipo VARCHAR(12) NOT NULL CHECK (tipo IN ('Comercial', 'Residencial')) DEFAULT 'Residencial',
);

CREATE TABLE telefone (
    id SERIAL PRIMARY KEY,
    cliente_id INTEGER REFERENCES cliente(id) ON DELETE CASCADE,
    ddd VARCHAR(2) NOT NULL,
    numero VARCHAR(15) NOT NULL,
    tipo VARCHAR(12) NOT NULL CHECK (tipo IN ('Fixo', 'Movel', 'Recado')) DEFAULT 'Fixo',
);

CREATE TABLE email (
    id SERIAL PRIMARY KEY,
    cliente_id INTEGER REFERENCES cliente(id) ON DELETE CASCADE,
    email VARCHAR(200) NOT NULL,
);

-- Veiculo, Equipa, Acessorios, Compativel, Modelo -- 

CREATE TABLE veiculo (
    id SERIAL PRIMARY KEY,
    cliente_id INTEGER REFERENCES cliente(id) ON DELETE CASCADE,
    placa VARCHAR(8) UNIQUE NOT NULL,
    ano INTEGER NOT NULL,
    cor VARCHAR(20) NOT NULL,
    chassi VARCHAR(20) UNIQUE NOT NULL,
)

CREATE TABLE acessorio (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(200) NOT NULL,
    preco NUMERIC(10, 2) NOT NULL,
    tipo VARCHAR(20) NOT NULL CHECK (tipo IN ('Interno', 'Externo')) DEFAULT 'Interno',
)

CREATE TABLE equipamento (
    cliente_id INTEGER REFERENCES cliente(id) ON DELETE CASCADE,
    veiculo_id INTEGER REFERENCES veiculo(id) ON DELETE CASCADE,
    FOREIGN KEY (cliente_id, veiculo_id),
)

CREATE TABLE compativel (
    acessorio_id INTEGER REFERENCES acessorio(id) ON DELETE CASCADE,
    veiculo_id INTEGER REFERENCES veiculo(id) ON DELETE CASCADE,
    FOREIGN KEY (acessorio_id, veiculo_id),
    modelo VARCHAR(20) NOT NULL CHECK (tipo IN("Compatível", "Incompatível")) DEFAULT 'Compatível',
)