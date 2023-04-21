USE restaurant;

--create a new table
CREATE TABLE `orders` (
  -- enter column names with their data types
  `orderID` int NOT NULL,
  `num_of_items` int NOT NULL,
  `total_price` double NOT NULL,
  `order_status` varchar(45) NOT NULL,
  
  -- set orderID as primary key
  PRIMARY KEY (`orderID`)
)

--example values to test
INSERT INTO orders VALUES(1, 1, 16.99, 'In Transit');
