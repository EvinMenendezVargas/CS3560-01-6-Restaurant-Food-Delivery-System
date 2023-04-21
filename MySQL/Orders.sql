USE restaurant;

CREATE TABLE `orders` (
  `orderID` int NOT NULL,
  `num_of_items` int NOT NULL,
  `total_price` double NOT NULL,
  `order_status` varchar(45) NOT NULL,
  PRIMARY KEY (`orderID`)
)

INSERT INTO orders VALUES(1, 1, 16.99, 'In Transit');
