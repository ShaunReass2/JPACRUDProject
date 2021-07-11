-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mkdirMoto
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mkdirMoto` ;

-- -----------------------------------------------------
-- Schema mkdirMoto
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mkdirMoto` DEFAULT CHARACTER SET utf8 ;
USE `mkdirMoto` ;

-- -----------------------------------------------------
-- Table `motorcycle`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `motorcycle` ;

CREATE TABLE IF NOT EXISTS `motorcycle` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NULL,
  `make` VARCHAR(50) NULL,
  `model` VARCHAR(50) NULL,
  `year` INT(50) NULL,
  `market` VARCHAR(50) NULL,
  `fuel_type` VARCHAR(50) NULL,
  `fuel_tank_capacity_in_gallons` DOUBLE(10,1) NULL,
  `miles_per_gallon` DOUBLE(10,1) NULL,
  `range_in_miles` INT(50) NULL,
  `weight_in_pounds_wet` INT(50) NULL,
  `pannier_capable` VARCHAR(50) NULL,
  `price_new_in_us_dollars` DOUBLE(10000,2) NULL,
  `description` VARCHAR(50) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS ridemaster@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'ridemaster'@'localhost' IDENTIFIED BY 'ridemaster';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'ridemaster'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `motorcycle`
-- -----------------------------------------------------
START TRANSACTION;
USE `mkdirMoto`;
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (1, 'Elsa', 'BMW', 'R1200GSA', 2012, 'Adventure', 'AKI 91', 8.7, 40, 348, 565, 'Yes', 23500.00, 'Adventure style motorcycle, capable of anything ranging from a quick Starbucks run to a multi-year jaunt around the world. ');
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (2, 'Hilde', 'BMW', 'R1250GSA', 2019, 'Adventure', 'AKI 91', 7.93, 42, 333, 590, 'Yes', 25,400.00, 'Adventure style motorcycle, capable of anything ranging from a quick Starbucks run to a multi-year jaunt around the world. ');
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (3, 'Heidi', 'BMW', 'f800ST', 2008, 'Adventure', 'AKI 91', 4.2, 60, 252, 256, 'Yes', 12,500.00, 'A zippy sport touring motorcycle, perfectly at home running errands around town or a quick month-long ride from the Lower 48 to Alaska. ');
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (4, 'Hannah', 'KTM', '1290 Super Adventure R', 2021, 'Adventure', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (5, 'Anna', 'KTM', '690 Adventure R', 2021, 'Adventure', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (6, 'Alessandra', 'Ducati', 'Multistrada 950 S', 2021, 'Adventure', NULL, NULL, NULL, NULL, 450, NULL, NULL, NULL);
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (7, 'Harumi', 'Kawasaki', 'KLR650', 2013, 'Adventure', 'AKI 87', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (8, 'Haruka', 'Honda', 'Africa Twin', 2020, 'Adventure', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (9, 'Bella', 'Aprilia ', 'RSV4', 2021, 'Racing', 'AKI 93', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (10, 'Saika', 'Yamaha', 'Super Tenere 700', 2021, 'Adventure ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (11, 'Amelia', 'BMW', 'M1000RR', 2021, 'Racing', 'AKI 93', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (12, 'Ada', 'BMW', 'S1000RR', 2021, 'Racing', 'AKI 93', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (13, 'Poppy', 'Triump', 'Tiger 1200 Range', 2021, 'Adventure', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (14, 'Grace', 'Harley-Davidson', 'Pan America 1250 Special', 2021, 'Touring', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `motorcycle` (`id`, `name`, `make`, `model`, `year`, `market`, `fuel_type`, `fuel_tank_capacity_in_gallons`, `miles_per_gallon`, `range_in_miles`, `weight_in_pounds_wet`, `pannier_capable`, `price_new_in_us_dollars`, `description`) VALUES (15, 'Ichicka', 'Suzuki ', 'Hayabusa Matthew Lee Spacial Edition', 2020, 'Racing', 'AKI 93', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

COMMIT;

