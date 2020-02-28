
--! Tabell for chili som er koblet til databasen!--
CREATE TABLE chili(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name_of_chili VARCHAR(255) NOT NULL,
  scoville_of_chili BIGINT NOT NULL,
  origin_of_chili VARCHAR(255) NOT NULL,
  color_of_chili VARCHAR (255) NOT NULL,
  imageurl VARCHAR(255) NOT NULL,
  videourl VARCHAR(255) NOT NULL,
  spiciness_level VARCHAR(255) NOT NULL
);