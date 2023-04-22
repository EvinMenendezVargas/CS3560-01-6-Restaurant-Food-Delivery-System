-- create a new database named restaurant
CREATE DATABASE restaurant;
USE restaurant;

-- create a first table
CREATE TABLE `customer` (
  
  -- input all the columns with required datatypes
  `customerID` int NOT NULL,
  `customer_first_name` varchar(45) NOT NULL,
  `customer_last_name` varchar(45) NOT NULL,
  `customer_address` varchar(45) NOT NULL,
  `card_name` varchar(45) NOT NULL,
  `card_number` varchar(45) NOT NULL,
  `card_experation_date` varchar(45) NOT NULL,
  `card_ccv` int NOT NULL,
  `phone_number` varchar(45) NOT NULL,
  
  -- set customerID as primary key
  PRIMARY KEY (`customerID`)
)

-- an example value
INSERT INTO customer VALUES(1, 'Nicholas', 'Ramirez', '1234 Amar Rd', 'Nicholas Ramirez', '1234-5678-1234-5678', '06/23', 123, '626-123-4567');
