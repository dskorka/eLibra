CREATE TABLE article
(
id                INT           AUTO_INCREMENT  NOT NULL,
title             NVARCHAR(250)                 NOT NULL,
description       NVARCHAR(200)                 NOT NULL,
imageSrc          NVARCHAR(100)                 NOT NULL,
publicationDate   DATETIME                      NOT NULL,
PRIMARY KEY (id)

);

CREATE TABLE book
(
id                 INT           AUTO_INCREMENT  NOT NULL,
title              NVARCHAR(250)                 NOT NULL,
author             NVARCHAR(100)                 NOT NULL,
bookRentStatus     NVARCHAR(100)                 NOT NULL,
imageSrc           NVARCHAR(100)                 NOT NULL,
publicationDate    DATETIME                      NOT NULL,
PRIMARY KEY (id)
);