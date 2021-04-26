CREATE TABLE m_user (
    id INT NOT NULL PRIMARY KEY,
    sei VARCHAR(200) NOT NULL,
    mei VARCHAR(200) NOT NULL,
    age INT NOT NULL,
    department_code VARCHAR(200) NOT NULL,
    length_of_service INT NOT NULL
);
CREATE TABLE m_busyo (
    department_code VARCHAR(200) NOT NULL PRIMARY KEY,
    name VARCHAR(200) NOT NULL
);
