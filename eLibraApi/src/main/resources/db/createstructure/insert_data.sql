INSERT INTO article
select * from CSVREAD('classpath:db/importData/article.csv', 'id,title,description,imageSrc, publicationdate');

INSERT INTO book
select * from CSVREAD('classpath:db/importData/books.csv', 'id,title,author,bookRentStatus,imageSrc');