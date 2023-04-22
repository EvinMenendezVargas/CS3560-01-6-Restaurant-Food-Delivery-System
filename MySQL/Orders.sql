USE restaurant;

--create a new table
CREATE TABLE `orders` (
  -- enter column names with their data types
  `orderID` int NOT NULL,
  `foodItemID` int NOT NULL,
  `customerID` int NOT NULL,
  `num_of_items` int NOT NULL,
  `total_price` decimal(10,0) NOT NULL,
  `order_status` varchar(45) NOT NULL,
  
  -- set orderID as primary key
  PRIMARY KEY (`orderID`),
  
  -- foreign key
  KEY `foodItemID_idx` (`foodItemID`),
  KEY `customerID_idx` (`customerID`),
  CONSTRAINT `customerID` FOREIGN KEY (`customerID`) REFERENCES `customer` (`customerID`),
  CONSTRAINT `foodItemID` FOREIGN KEY (`foodItemID`) REFERENCES `menuItem` (`foodItemID`)
)

--example values to test
INSERT INTO orders VALUES(1, 1, 1, 1, 16.99, 'In Transit');
