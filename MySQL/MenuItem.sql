-- use the database
USE restaurant;

-- create new table within
CREATE TABLE `menuItem` (
  
  -- input column name with their dataypes
  `foodItemID` int NOT NULL,
  `categoryID` int NOT NULL,
  `itemName` varchar(45) NOT NULL,
  `itemPrice` varchar(45) NOT NULL,
  `itemQuantity` int NOT NULL,
 
  
  -- set primary key named deliveryID
  PRIMARY KEY (`foodItemID`)
  
  -- foreign key
  KEY `categoryID_idx` (`categoryID`),
  CONSTRAINT `categoryID` FOREIGN KEY (`categoryID`) REFERENCES `Menu` (`categoryID`)
)

-- example value
INSERT INTO menuItem VALUES(1, 'Pizza', '12.00', 2);
