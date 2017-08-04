INSERT INTO article
select * from CSVREAD('classpath:db/importData/article.csv', 'id,title,shortDescription,imageSrc');

INSERT INTO book
select * from CSVREAD('classpath:db/importData/books.csv', 'id,title,author,bookRentStatus,imageSrc');