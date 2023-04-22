-- use the database
USE restaurant;

-- create new table within
CREATE TABLE `menuItem` (
  
  -- input column name with their dataypes
  `foodItemID` int NOT NULL,
  `itemName` varchar(45) NOT NULL,
  `itemPrice` varchar(45) NOT NULL,
  `itemQuantity` int NOT NULL,
 
  
  -- set primary key named deliveryID
  PRIMARY KEY (`foodItemID`)
)

-- example value
INSERT INTO delivery VALUES(1, 'Pizza', '12.00', 2);
