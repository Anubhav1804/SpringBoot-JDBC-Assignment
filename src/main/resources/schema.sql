-- CREATING TABLE
-- CREATE TABLE TABLE_NAME

CREATE TABLE Learner(
--  COLUMN_NAME TYPE REQUIRED
    ID INTEGER NOT NULL,
    FirstName VARCHAR(255) NOT NULL,
    LastName VARCHAR(255) NOT NULL,
    Email VARCHAR(30) NOT NULL,
    Password VARCHAR(12) NOT NULL,
    Course_Id INTEGER NOT NULL,
    PRIMARY KEY(ID)
);

