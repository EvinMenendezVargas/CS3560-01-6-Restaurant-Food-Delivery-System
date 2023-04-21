USE restaurant;

CREATE TABLE `delivery` (
  `deliveryID` int NOT NULL,
  `delivery_date` varchar(45) NOT NULL,
  `delivery_status` varchar(45) NOT NULL,
  `delivery_distance` varchar(45) NOT NULL,
  `pickup_location` varchar(45) NOT NULL,
  `delivery_location` varchar(45) NOT NULL,
  PRIMARY KEY (`deliveryID`)
)

INSERT INTO delivery VALUES(1, '4-21-23', 'In Transit', '2.4 Miles', 'Restaurant', '1234 Street');
