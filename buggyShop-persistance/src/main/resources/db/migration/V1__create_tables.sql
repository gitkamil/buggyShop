
SET client_encoding = 'UTF8';

CREATE TABLE buggyshop."ARTICLE" (
    "ARTICLE_CODE" integer NOT NULL,
    "NAME" character varying(20),
    "PRICE" numeric(10,2),
    "QUANTITY" numeric(10,2)
);
ALTER TABLE buggyshop."ARTICLE" OWNER TO buggyshop;
ALTER TABLE ONLY buggyshop."ARTICLE" ADD CONSTRAINT "ARTICLE_PK" PRIMARY KEY ("ARTICLE_CODE");