USE restaurant;

CREATE TABLE `menu` (
  `menuID` int NOT NULL,
  `food_name` varchar(45) NOT NULL,
  `food_price` double NOT NULL,
  PRIMARY KEY (`menuID`)
)

INSERT INTO menu VALUES(1, 'Pizza', '16.99');
