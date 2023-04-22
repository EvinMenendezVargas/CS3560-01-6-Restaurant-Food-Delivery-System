USE restaurant;

-- creating new table
CREATE TABLE `cars` (
  
  -- defining colums with their data types
  `carsID` int NOT NULL,
  `car_model` varchar(45) NOT NULL,
  `car_color` varchar(45) NOT NULL,
  `license_plate_num` varchar(45) NOT NULL,
  
  -- set carsID as primary key
  PRIMARY KEY (`carsID`)
)

-- example value added
INSERT INTO cars VALUES(1, 'Honda Civic', 'White', '5RTX678');
