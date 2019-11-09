-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 09-Nov-2019 às 17:21
-- Versão do servidor: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projeto_final`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `comentarios`
--

CREATE TABLE `comentarios` (
  `id` int(11) NOT NULL,
  `id_pessoa` int(11) NOT NULL,
  `texto_comentado` varchar(255) NOT NULL,
  `id_resposta` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pagamento`
--

CREATE TABLE `pagamento` (
  `id` int(11) NOT NULL,
  `identificador_processo_viagem` int(11) NOT NULL,
  `cod_orgao_superior` float NOT NULL,
  `nome_orgao_superior` varchar(255) NOT NULL,
  `cod_orgao_pagador` float NOT NULL,
  `nome_orgao_pagador` varchar(255) NOT NULL,
  `cod_unidade_gestora_pagadora` float NOT NULL,
  `nome_unidade_gestora_pagadora` varchar(255) NOT NULL,
  `tipo_pagamento` varchar(255) NOT NULL,
  `valor` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `passagem`
--

CREATE TABLE `passagem` (
  `id` int(11) NOT NULL,
  `identificador_processo_viagem` int(11) NOT NULL,
  `meio_transporte` varchar(255) NOT NULL,
  `pais_origem_ida` varchar(255) NOT NULL,
  `uf_origem_ida` varchar(255) NOT NULL,
  `cidade_origem_ida` varchar(255) NOT NULL,
  `pais_destino_ida` varchar(255) NOT NULL,
  `uf_destino_ida` varchar(255) NOT NULL,
  `cidade_destino_ida` varchar(255) NOT NULL,
  `pais_origem_volta` varchar(255) NOT NULL,
  `uf_origem_volta` varchar(255) NOT NULL,
  `cidade_origem_volta` varchar(255) NOT NULL,
  `pais_destino_volta` varchar(255) NOT NULL,
  `uf_destino_volta` varchar(255) NOT NULL,
  `cidade_destino_volta` varchar(255) NOT NULL,
  `valor_passagem` float NOT NULL,
  `taxa_servico` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `trecho`
--

CREATE TABLE `trecho` (
  `id` int(11) NOT NULL,
  `identificador_processo_viagem` int(11) NOT NULL,
  `sequencia_trecho` int(11) NOT NULL,
  `origem_data` varchar(255) NOT NULL,
  `origem_pais` varchar(255) NOT NULL,
  `origem_uf` varchar(255) NOT NULL,
  `origem_cidade` varchar(255) NOT NULL,
  `destino_data` varchar(255) NOT NULL,
  `destino_pais` varchar(255) NOT NULL,
  `destino_uf` varchar(255) NOT NULL,
  `destino_cidade` varchar(255) NOT NULL,
  `meio_transporte` varchar(255) NOT NULL,
  `numero_diarias` float NOT NULL,
  `missao` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`id`, `nome`, `email`, `senha`) VALUES
(33, 'Raphael Policena', 'phaelpolicena@gmail.com', 'senha123'),
(34, 'Raphael Policena', 'phaelpolicena@gmail.com', 'senha123'),
(35, 'Raphael Policena', 'phaelpolicena@gmail.com', 'senha123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `viagem`
--

CREATE TABLE `viagem` (
  `id` int(11) NOT NULL,
  `identificador_processo_viagem` int(11) NOT NULL,
  `cod_orgao_superior` float NOT NULL,
  `nome_orgao_superior` varchar(255) NOT NULL,
  `nome_orgao_solicitante` varchar(255) NOT NULL,
  `cpf_viajante` varchar(255) NOT NULL,
  `nome_viajante` varchar(255) NOT NULL,
  `cargo_viajante` varchar(255) NOT NULL,
  `periodo_data_inicio` varchar(255) NOT NULL,
  `periodo_data_fim` varchar(255) NOT NULL,
  `destinos` varchar(255) NOT NULL,
  `motivo` varchar(255) NOT NULL,
  `valor_diarias` float NOT NULL,
  `valor_passagens` float NOT NULL,
  `valor_outros_gastos` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comentarios`
--
ALTER TABLE `comentarios`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pagamento`
--
ALTER TABLE `pagamento`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `passagem`
--
ALTER TABLE `passagem`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `trecho`
--
ALTER TABLE `trecho`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `viagem`
--
ALTER TABLE `viagem`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `comentarios`
--
ALTER TABLE `comentarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `pagamento`
--
ALTER TABLE `pagamento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `passagem`
--
ALTER TABLE `passagem`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `trecho`
--
ALTER TABLE `trecho`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;
--
-- AUTO_INCREMENT for table `viagem`
--
ALTER TABLE `viagem`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
