# --- !Ups

CREATE TABLE Neighbour (
  id_neighbour INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  unit         VARCHAR(10)      NULL,
  credit       INTEGER UNSIGNED NULL,
  phone        VARCHAR(12)      NULL,
  PRIMARY KEY (id_neighbour)
);

CREATE TABLE ParkingSpace (
  id_parking_space INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  id_neighbour     INTEGER UNSIGNED NOT NULL,
  location         VARCHAR(10)      NULL,
  available        BOOL             NULL,
  from_date        DATE             NULL,
  to_date          DATE             NULL,
  PRIMARY KEY (id_parking_space),
  INDEX ParkingSpace_FKIndex1(id_neighbour),
  CONSTRAINT fk_parking_space_neighbour FOREIGN KEY (id_neighbour) REFERENCES Neighbour (id_neighbour)
);


CREATE TABLE Borrow (
  id_borrow        INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  id_neighbour     INTEGER UNSIGNED NOT NULL,
  id_parking_space INTEGER UNSIGNED NOT NULL,
  from_date        DATE             NULL,
  to_date          DATE             NULL,
  PRIMARY KEY (id_borrow),
  INDEX Borrow_FKIndex1(id_neighbour),
  INDEX Borrow_FKIndex2(id_parking_space),
  CONSTRAINT fk_borrow_neighbour FOREIGN KEY (id_neighbour) REFERENCES Neighbour (id_neighbour),
  CONSTRAINT fk_borrow_parking_space FOREIGN KEY (id_parking_space) REFERENCES ParkingSpace (id_parking_space)
);
# --- !Downs

DROP TABLE IF EXISTS Borrow;
DROP TABLE IF EXISTS ParkingSpace;
DROP TABLE IF EXISTS Neighbour;

