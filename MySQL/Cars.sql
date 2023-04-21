USE restaurant;

CREATE TABLE `cars` (
  `carsID` int NOT NULL,
  `car_model` varchar(45) NOT NULL,
  `car_color` varchar(45) NOT NULL,
  `license_plate_num` varchar(45) NOT NULL,
  PRIMARY KEY (`carsID`)
)

INSERT INTO cars VALUES(1, 'Honda Civic', 'White', '5RTX678');
