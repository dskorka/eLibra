CREATE TABLE article
(
id                INT           AUTO_INCREMENT  NOT NULL,
title             NVARCHAR(250)                 NOT NULL,
shortDescription  NVARCHAR(200)                 NOT NULL,
imageSrc          NVARCHAR(100)                 NOT NULL,
PRIMARY KEY (id)

);