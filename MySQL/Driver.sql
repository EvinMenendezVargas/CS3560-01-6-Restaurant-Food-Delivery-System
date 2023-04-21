USE restaurant;

CREATE TABLE `driver` (
  `driverID` int NOT NULL,
  `driver_first_name` varchar(45) NOT NULL,
  `driver_last_name` varchar(45) NOT NULL,
  `availability` varchar(45) NOT NULL,
  `phone_number` varchar(45) NOT NULL,
  PRIMARY KEY (`driverID`)
)

INSERT INTO driver VALUES(1, 'Bill', 'Buttons', 'available', '112-345-4455');
