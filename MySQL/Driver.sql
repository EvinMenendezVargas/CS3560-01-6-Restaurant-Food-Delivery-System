-- use the database
USE restaurant;

-- create new table for driver
CREATE TABLE `driver` (
  
  -- set column values and their datatypes
  `driverID` int NOT NULL,
  `driver_first_name` varchar(45) NOT NULL,
  `driver_last_name` varchar(45) NOT NULL,
  `availability` varchar(45) NOT NULL,
  `phone_number` varchar(45) NOT NULL,
  
  -- primary key as driverID
  PRIMARY KEY (`driverID`)
)

-- example values
INSERT INTO driver VALUES(1, 'Bill', 'Buttons', 'available', '112-345-4455');
