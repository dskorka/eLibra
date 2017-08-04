INSERT INTO article
select * from CSVREAD('classpath:db/importData/article.csv', 'id,title,shortDescription,imageSrc');