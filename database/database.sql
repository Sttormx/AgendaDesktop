-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 09-Jun-2021 às 06:28
-- Versão do servidor: 10.4.14-MariaDB
-- versão do PHP: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `teste`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `local`
--

CREATE TABLE `local` (
  `Local_ID` int(11) NOT NULL,
  `Descr` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tarefa`
--

CREATE TABLE `tarefa` (
  `Tarefa_ID` int(11) NOT NULL,
  `Titulo` varchar(15) NOT NULL,
  `Descr` varchar(30) NOT NULL,
  `Duracao` decimal(10,2) NOT NULL,
  `User_ID` int(11) NOT NULL,
  `Local_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `User_ID` int(11) NOT NULL,
  `User` varchar(20) NOT NULL,
  `Senha` varchar(20) NOT NULL,
  `Nome` varchar(20) NOT NULL,
  `Notificacoes` int(11) NOT NULL,
  `Template` int(11) NOT NULL,
  `Administrador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuariotarefa`
--

CREATE TABLE `usuariotarefa` (
  `DataTarefa` date NOT NULL,
  `HoraTarefa` date NOT NULL,
  `User_ID` int(11) NOT NULL,
  `Tarefa_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `local`
--
ALTER TABLE `local`
  ADD PRIMARY KEY (`Local_ID`);

--
-- Índices para tabela `tarefa`
--
ALTER TABLE `tarefa`
  ADD PRIMARY KEY (`Tarefa_ID`),
  ADD KEY `fk_User_ID` (`User_ID`),
  ADD KEY `fk_Local_ID` (`Local_ID`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`User_ID`);

--
-- Índices para tabela `usuariotarefa`
--
ALTER TABLE `usuariotarefa`
  ADD KEY `fk_Userr_ID` (`User_ID`),
  ADD KEY `fk_Tarefa_ID` (`Tarefa_ID`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `local`
--
ALTER TABLE `local`
  MODIFY `Local_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `tarefa`
--
ALTER TABLE `tarefa`
  MODIFY `Tarefa_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `User_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tarefa`
--
ALTER TABLE `tarefa`
  ADD CONSTRAINT `fk_Local_ID` FOREIGN KEY (`Local_ID`) REFERENCES `local` (`Local_ID`),
  ADD CONSTRAINT `fk_User_ID` FOREIGN KEY (`User_ID`) REFERENCES `usuario` (`User_ID`);

--
-- Limitadores para a tabela `usuariotarefa`
--
ALTER TABLE `usuariotarefa`
  ADD CONSTRAINT `fk_Tarefa_ID` FOREIGN KEY (`Tarefa_ID`) REFERENCES `tarefa` (`Tarefa_ID`),
  ADD CONSTRAINT `fk_Userr_ID` FOREIGN KEY (`User_ID`) REFERENCES `usuario` (`User_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;