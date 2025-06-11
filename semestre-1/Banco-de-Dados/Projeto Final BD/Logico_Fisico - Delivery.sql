CREATE TABLE `cliente` (
  `id_cliente` int PRIMARY KEY,
  `nome` varchar(100),
  `email` varchar(100),
  `telefone` varchar(20),
  `endereco` text
);

CREATE TABLE `estabelecimento` (
  `id_estabelecimento` int PRIMARY KEY,
  `nome` varchar(100),
  `endereco` text,
  `telefone` varchar(20)
);

CREATE TABLE `produto` (
  `id_produto` int PRIMARY KEY,
  `nome` varchar(100),
  `descricao` text,
  `preco` decimal,
  `id_estabelecimento` int
);

CREATE TABLE `pedido` (
  `id_pedido` int PRIMARY KEY,
  `id_cliente` int,
  `id_estabelecimento` int,
  `data_hora` datetime,
  `status` varchar(50)
);

CREATE TABLE `pedido_produto` (
  `id_pedido` int,
  `id_produto` int,
  `quantidade` int
);

CREATE TABLE `entrega` (
  `id_entrega` int PRIMARY KEY,
  `id_pedido` int,
  `data_prevista` datetime,
  `data_realizada` datetime,
  `status` varchar(50)
);

CREATE TABLE `pagamento` (
  `id_pagamento` int PRIMARY KEY,
  `id_pedido` int,
  `metodo` varchar(50),
  `valor` decimal,
  `status` varchar(50),
  `data_pagamento` datetime
);

ALTER TABLE `produto` ADD FOREIGN KEY (`id_estabelecimento`) REFERENCES `estabelecimento` (`id_estabelecimento`);

ALTER TABLE `pedido` ADD FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);

ALTER TABLE `pedido` ADD FOREIGN KEY (`id_estabelecimento`) REFERENCES `estabelecimento` (`id_estabelecimento`);

ALTER TABLE `pedido_produto` ADD FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`);

ALTER TABLE `pedido_produto` ADD FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`);

ALTER TABLE `entrega` ADD FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`);

ALTER TABLE `pagamento` ADD FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`);
