-- Adminer 4.8.4 MySQL 10.11.14-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `Arret`;
CREATE TABLE `Arret` (
  `id` int(7) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


DROP TABLE IF EXISTS `Trajet`;
CREATE TABLE `Trajet` (
  `code` varchar(20) NOT NULL,
  `tempsDepart` datetime NOT NULL,
  `tempsArrivee` datetime NOT NULL,
  `idArretDepart` int(7) DEFAULT NULL,
  `idArretArrivee` int(7) DEFAULT NULL,
  PRIMARY KEY (`code`),
  KEY `idArretDepart` (`idArretDepart`),
  KEY `idArretArrivee` (`idArretArrivee`),
  CONSTRAINT `Trajet_ibfk_1` FOREIGN KEY (`idArretDepart`) REFERENCES `Arret` (`id`),
  CONSTRAINT `Trajet_ibfk_2` FOREIGN KEY (`idArretArrivee`) REFERENCES `Arret` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


DROP TABLE IF EXISTS `Utilisateur`;
CREATE TABLE `Utilisateur` (
  `id` int(7) NOT NULL AUTO_INCREMENT,
  `role` enum('admin','employe') NOT NULL,
  `login` varchar(50) NOT NULL,
  `mdp` varchar(256) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `dateEmbauche` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


-- 2025-10-10 08:51:07
