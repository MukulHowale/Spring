INSERT INTO AUTHOR(AUTHOR_ID,AUTHOR_ADDRESS,AUTHOR_AGE,AUTHOR_NAME)
VALUES ('101','US','25','Jack Sparrow');

INSERT INTO AUTHOR(AUTHOR_ID,AUTHOR_ADDRESS,AUTHOR_AGE,AUTHOR_NAME)
VALUES ('102','UAE','31','Hasbulla');


INSERT INTO BOOK(BOOK_ID,BOOK_CATEGORY,BOOK_PAGES,BOOK_PRICE,BOOK_PUBLICATION,BOOK_NAME,AUTHOR_AUTHOR_ID)
VALUES ('901','Fiction','200','500','Jam Publication','Tango','101');

INSERT INTO BOOK(BOOK_ID,BOOK_CATEGORY,BOOK_PAGES,BOOK_PRICE,BOOK_PUBLICATION,BOOK_NAME,AUTHOR_AUTHOR_ID)
VALUES ('902','Kids','150','200','Kids Publication','Yeaeye','102');

INSERT INTO BOOK(BOOK_ID,BOOK_CATEGORY,BOOK_PAGES,BOOK_PRICE,BOOK_PUBLICATION,BOOK_NAME,AUTHOR_AUTHOR_ID)
VALUES ('903','Adult','800','1200','GoGoaGone Publication','LetsDoIt','101');