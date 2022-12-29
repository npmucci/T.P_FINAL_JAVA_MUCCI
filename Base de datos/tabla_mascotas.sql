-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-12-2022 a las 19:32:44
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mascotabd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tabla_mascotas`
--

CREATE TABLE `tabla_mascotas` (
  `Nombre` text NOT NULL,
  `Id` tinyint(4) NOT NULL,
  `Propietario` text NOT NULL,
  `Is live` tinyint(1) NOT NULL,
  `Energia` tinyint(4) NOT NULL DEFAULT 80,
  `Cansancio` tinyint(4) NOT NULL,
  `Felicidad` tinyint(4) NOT NULL,
  `Aburrimiento` tinyint(4) NOT NULL,
  `Hambre` tinyint(4) NOT NULL,
  `Suciedad` tinyint(4) NOT NULL,
  `Nacimiento` timestamp NOT NULL DEFAULT current_timestamp(),
  `Muerte` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tabla_mascotas`
--

INSERT INTO `tabla_mascotas` (`Nombre`, `Id`, `Propietario`, `Is live`, `Energia`, `Cansancio`, `Felicidad`, `Aburrimiento`, `Hambre`, `Suciedad`, `Nacimiento`, `Muerte`) VALUES
('MERLINA', 1, 'NATALIA', 0, 80, 10, 90, 10, 0, 0, '2022-12-29 18:24:13', '0000-00-00 00:00:00'),
('MERLINA', 1, 'NATALIA', 0, 80, 10, 90, 10, 0, 0, '2022-12-29 18:24:27', '0000-00-00 00:00:00'),
('TYRION', 2, 'ANDONI', 1, 100, 50, 90, 10, 0, 0, '2022-12-29 18:26:04', '0000-00-00 00:00:00'),
('TYRION', 2, 'ANDONI', 1, 100, 50, 90, 10, 0, 0, '2022-12-29 18:26:11', '0000-00-00 00:00:00'),
('STUART', 3, 'FELIPE', 1, 100, 30, 80, 30, 20, 20, '2022-12-29 18:27:19', '0000-00-00 00:00:00'),
('STUART', 3, 'FELIPE', 1, 100, 30, 80, 30, 20, 20, '2022-12-29 18:27:26', '0000-00-00 00:00:00'),
('MANOLO', 4, 'MARTINA', 1, 80, 10, 80, 30, 0, 0, '2022-12-29 18:28:39', '0000-00-00 00:00:00'),
('MANOLO', 4, 'MARTINA', 1, 80, 10, 80, 30, 0, 0, '2022-12-29 18:28:47', '0000-00-00 00:00:00'),
('HANNA', 5, 'AMPARO', 1, 100, 20, 70, 0, 30, 10, '2022-12-29 18:29:32', '0000-00-00 00:00:00'),
('HANNA', 5, 'AMPARO', 1, 100, 20, 70, 0, 30, 10, '2022-12-29 18:29:42', '0000-00-00 00:00:00'),
('MANUELITA', 6, 'JUANA', 1, 100, 0, 100, 0, 30, 20, '2022-12-29 18:31:52', '0000-00-00 00:00:00'),
('POMPON', 7, 'VERONICA', 1, 80, 0, 100, 0, 0, 0, '2022-12-29 18:31:52', '0000-00-00 00:00:00'),
('MANUELITA', 6, 'JUANA', 1, 100, 0, 100, 0, 30, 20, '2022-12-29 18:32:00', '0000-00-00 00:00:00'),
('POMPON', 7, 'VERONICA', 1, 80, 0, 100, 0, 0, 0, '2022-12-29 18:32:00', '0000-00-00 00:00:00');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
