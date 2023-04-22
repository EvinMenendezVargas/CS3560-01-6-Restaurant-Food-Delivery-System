USE restaurant; -- use database

-- create new table
CREATE TABLE `menu` (
  
  -- create columns and set their dataypes
  `categoryID` int NOT NULL,
  `category_name` varchar(45) NOT NULL,
  
  -- set categoryID as primary key
  PRIMARY KEY (`categoryID`)
)

-- example value
INSERT INTO menu VALUES(1, 'Entree');
