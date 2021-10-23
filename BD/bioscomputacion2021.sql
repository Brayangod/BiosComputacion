-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-10-2021 a las 20:53:40
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bioscomputacion2021`
--
CREATE DATABASE IF NOT EXISTS `bioscomputacion2021` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bioscomputacion2021`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `apertura`
--

CREATE TABLE `apertura` (
  `id_apertura` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `fecha` datetime NOT NULL,
  `saldo_apertura` decimal(20,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caja`
--

CREATE TABLE `caja` (
  `id_caja` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `estado` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `caja`
--

INSERT INTO `caja` (`id_caja`, `nombre`, `estado`) VALUES
(1, 'CAJA 1', 'CERRADA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cierre`
--

CREATE TABLE `cierre` (
  `id_cierre` int(11) NOT NULL,
  `id_apertura` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `saldo_cierre` decimal(20,2) NOT NULL,
  `fecha_cierre` datetime NOT NULL,
  `diferencia_cierre` decimal(20,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parametrizacion`
--

CREATE TABLE `parametrizacion` (
  `porcentaje_ganancias` decimal(5,2) NOT NULL,
  `valor_dolar` decimal(15,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

--
-- Volcado de datos para la tabla `parametrizacion`
--

INSERT INTO `parametrizacion` (`porcentaje_ganancias`, `valor_dolar`) VALUES
('50.00', '99.50');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id_persona` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `dni` varchar(20) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `planilla`
--

CREATE TABLE `planilla` (
  `id_movimiento` int(11) NOT NULL,
  `nom_vendedor` varchar(60) NOT NULL,
  `fecha_movimiento` datetime NOT NULL,
  `rubro` varchar(100) NOT NULL,
  `observacion` varchar(100) NOT NULL,
  `tipo_moneda` varchar(60) NOT NULL,
  `ingresos` decimal(20,2) DEFAULT NULL,
  `egresos` decimal(20,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL,
  `nombre_rubro` varchar(100) DEFAULT NULL,
  `nombre_subrubro` varchar(100) DEFAULT NULL,
  `nombre_producto` varchar(100) NOT NULL,
  `codigo_barra` bigint(20) DEFAULT NULL,
  `codigo_proveedor` varchar(100) DEFAULT NULL,
  `precio_costo` decimal(20,2) NOT NULL,
  `precio_efectivo` decimal(20,2) NOT NULL,
  `precio_cuotas` decimal(20,2) NOT NULL,
  `porcentaje_ganancias` decimal(6,2) NOT NULL,
  `stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rubro_planilla`
--

CREATE TABLE `rubro_planilla` (
  `id_rubro` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rubro_producto`
--

CREATE TABLE `rubro_producto` (
  `id_rubro` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subrubro_planilla`
--

CREATE TABLE `subrubro_planilla` (
  `id_subrubro` int(11) NOT NULL,
  `id_rubro` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subrubro_producto`
--

CREATE TABLE `subrubro_producto` (
  `id_subrubro` int(11) NOT NULL,
  `id_rubro` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `id_persona` int(11) NOT NULL,
  `login` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `estado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `apertura`
--
ALTER TABLE `apertura`
  ADD PRIMARY KEY (`id_apertura`) USING BTREE,
  ADD KEY `usuarioApertura` (`id_usuario`);

--
-- Indices de la tabla `caja`
--
ALTER TABLE `caja`
  ADD PRIMARY KEY (`id_caja`) USING BTREE;

--
-- Indices de la tabla `cierre`
--
ALTER TABLE `cierre`
  ADD PRIMARY KEY (`id_cierre`) USING BTREE,
  ADD KEY `aperturaFK` (`id_apertura`),
  ADD KEY `usuarioFKs` (`id_usuario`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id_persona`) USING BTREE,
  ADD KEY `nombre` (`nombre`);

--
-- Indices de la tabla `planilla`
--
ALTER TABLE `planilla`
  ADD PRIMARY KEY (`id_movimiento`) USING BTREE;

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`) USING BTREE,
  ADD KEY `rubronombreFK` (`nombre_rubro`) USING BTREE,
  ADD KEY `subrubronombreFK` (`nombre_subrubro`) USING BTREE;

--
-- Indices de la tabla `rubro_planilla`
--
ALTER TABLE `rubro_planilla`
  ADD PRIMARY KEY (`id_rubro`) USING BTREE,
  ADD UNIQUE KEY `nombre` (`nombre`) USING BTREE;

--
-- Indices de la tabla `rubro_producto`
--
ALTER TABLE `rubro_producto`
  ADD PRIMARY KEY (`id_rubro`) USING BTREE,
  ADD UNIQUE KEY `nombre` (`nombre`) USING BTREE;

--
-- Indices de la tabla `subrubro_planilla`
--
ALTER TABLE `subrubro_planilla`
  ADD PRIMARY KEY (`id_subrubro`) USING BTREE,
  ADD UNIQUE KEY `nombreSubRubro` (`nombre`) USING BTREE,
  ADD KEY `rubroFK` (`id_rubro`) USING BTREE;

--
-- Indices de la tabla `subrubro_producto`
--
ALTER TABLE `subrubro_producto`
  ADD PRIMARY KEY (`id_subrubro`) USING BTREE,
  ADD UNIQUE KEY `nombreSubRubro` (`nombre`) USING BTREE,
  ADD KEY `rubroFK` (`id_rubro`) USING BTREE;

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`) USING BTREE,
  ADD KEY `usuarioFK` (`id_persona`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `apertura`
--
ALTER TABLE `apertura`
  MODIFY `id_apertura` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `caja`
--
ALTER TABLE `caja`
  MODIFY `id_caja` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `cierre`
--
ALTER TABLE `cierre`
  MODIFY `id_cierre` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `id_persona` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `planilla`
--
ALTER TABLE `planilla`
  MODIFY `id_movimiento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `rubro_planilla`
--
ALTER TABLE `rubro_planilla`
  MODIFY `id_rubro` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `rubro_producto`
--
ALTER TABLE `rubro_producto`
  MODIFY `id_rubro` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `subrubro_planilla`
--
ALTER TABLE `subrubro_planilla`
  MODIFY `id_subrubro` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `subrubro_producto`
--
ALTER TABLE `subrubro_producto`
  MODIFY `id_subrubro` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cierre`
--
ALTER TABLE `cierre`
  ADD CONSTRAINT `aperturaFK` FOREIGN KEY (`id_apertura`) REFERENCES `apertura` (`id_apertura`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuarioFKs` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `rubronombreFK` FOREIGN KEY (`nombre_rubro`) REFERENCES `rubro_producto` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `subrubronombreFK` FOREIGN KEY (`nombre_subrubro`) REFERENCES `subrubro_producto` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `subrubro_planilla`
--
ALTER TABLE `subrubro_planilla`
  ADD CONSTRAINT `subrubro_planilla_ibfk_1` FOREIGN KEY (`id_rubro`) REFERENCES `rubro_planilla` (`id_rubro`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `subrubro_producto`
--
ALTER TABLE `subrubro_producto`
  ADD CONSTRAINT `rubroFK` FOREIGN KEY (`id_rubro`) REFERENCES `rubro_producto` (`id_rubro`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuarioFK` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id_persona`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
