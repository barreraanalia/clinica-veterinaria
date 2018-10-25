-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2018 a las 06:17:57
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clinica_veterinaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL,
  `nombrecompleto` varchar(45) DEFAULT NULL,
  `persona.alternativa` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `documento` int(11) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idcliente`, `nombrecompleto`, `persona.alternativa`, `direccion`, `documento`, `telefono`) VALUES
(4, 'moreno christian', NULL, 'mitre 1224', NULL, NULL),
(5, 'luciano rosa', NULL, 'caseros 1000', NULL, NULL),
(6, 'alvaro rosa', NULL, 'mitre 1500', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `idmascota` int(11) NOT NULL,
  `idcliente` int(11) NOT NULL,
  `sexo` varchar(45) DEFAULT NULL,
  `especie` varchar(45) DEFAULT NULL,
  `alias` varchar(45) DEFAULT NULL,
  `codigo` varchar(45) DEFAULT NULL,
  `pesoPromedio` double DEFAULT NULL,
  `color.pelo` varchar(45) DEFAULT NULL,
  `fecha.nacimiento` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `idtratamiento` int(11) NOT NULL,
  `tipo.tratamiento` varchar(20) NOT NULL,
  `codigo.tratamiento` varchar(45) DEFAULT NULL,
  `importe` double NOT NULL,
  `tratamiento.activo` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visitaatencion`
--

CREATE TABLE `visitaatencion` (
  `idvisitaatencion` int(11) NOT NULL,
  `idmascota` int(11) NOT NULL,
  `idtratamiento` int(11) NOT NULL,
  `detallles` text,
  `fecha.visita` varchar(45) DEFAULT NULL,
  `peso` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idcliente`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`idmascota`),
  ADD KEY `idcliente_idx` (`idcliente`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`idtratamiento`);

--
-- Indices de la tabla `visitaatencion`
--
ALTER TABLE `visitaatencion`
  ADD PRIMARY KEY (`idvisitaatencion`),
  ADD UNIQUE KEY `idtratamiento_UNIQUE` (`idtratamiento`),
  ADD KEY `idmascota_idx` (`idmascota`),
  ADD KEY `fk_visitaatencion_tratamiento1_idx` (`idtratamiento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `idmascota` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `visitaatencion`
--
ALTER TABLE `visitaatencion`
  MODIFY `idvisitaatencion` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `idcliente` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `visitaatencion`
--
ALTER TABLE `visitaatencion`
  ADD CONSTRAINT `fk_visitaatencion_tratamiento1` FOREIGN KEY (`idtratamiento`) REFERENCES `tratamiento` (`idtratamiento`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idmascota` FOREIGN KEY (`idmascota`) REFERENCES `mascota` (`idmascota`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
