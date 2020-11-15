
SET client_encoding = 'UTF8';

CREATE TABLE buggyshop."ARTICLE" (
    "ARTICLE_CODE" integer NOT NULL,
    "NAME" character varying(20),
    "PRICE" numeric(10,2),
    "QUANTITY" numeric(10,2)
);
ALTER TABLE buggyshop."ARTICLE" OWNER TO buggyshop;
ALTER TABLE ONLY buggyshop."ARTICLE" ADD CONSTRAINT "ARTICLE_PK" PRIMARY KEY ("ARTICLE_CODE");



CREATE TABLE buggyshop."CLIENT" (
"CLIENT_ID" integer NOT NULL,
"LAST_NAME" character varying(50) NOT NULL,
"NAME" character varying(30) NOT NULL,
"CITY" character varying(30) NOT NULL,
"STREET" character varying(50) NOT NULL,
"HOUSE_NUMBER" character varying(10) NOT NULL,
"TELEPHON_NUMBER" character varying(12) NOT NULL
);
ALTER TABLE buggyshop."CLIENT" OWNER TO buggyshop;
ALTER TABLE ONLY buggyshop."CLIENT" ADD CONSTRAINT "CLIENT_PK" PRIMARY KEY ("CLIENT_ID");



CREATE TABLE buggyshop."INVOICE" (
"INVOICE_ID" integer NOT NULL,
"ISSUE_DATE" date NOT NULL,
"VALUE" numeric(10,2) NOT NULL,
"CLIENT_ID" integer NOT NULL
);
ALTER TABLE buggyshop."INVOICE" OWNER TO buggyshop;
ALTER TABLE ONLY buggyshop."INVOICE" ADD CONSTRAINT "INVOICE_PK" PRIMARY KEY ("INVOICE_ID");
ALTER TABLE ONLY buggyshop."INVOICE" ADD CONSTRAINT "INVOICE_FK" FOREIGN KEY ("CLIENT_ID") REFERENCES buggyshop."CLIENT"("CLIENT_ID");


CREATE TABLE buggyshop."POSITION" (
"POSITION_ID" integer NOT NULL,
"QUANTITY" numeric(10,2) NOT NULL,
"VALUE" numeric(10,2) NOT NULL,
"ARTICLE_CODE" integer NOT NULL,
"INVOICE_ID" integer NOT NULL,
"KLIENT_ID" integer NOT NULL
);


ALTER TABLE buggyshop."POSITION" OWNER TO buggyshop;
ALTER TABLE ONLY buggyshop."POSITION" ADD CONSTRAINT "POSITION_PK" PRIMARY KEY ("POSITION_ID", "INVOICE_ID");
ALTER TABLE ONLY buggyshop."POSITION" ADD CONSTRAINT "POSITION_FK" FOREIGN KEY ("POSITION_ID") REFERENCES buggyshop."INVOICE"("INVOICE_ID");
ALTER TABLE ONLY buggyshop."POSITION" ADD CONSTRAINT "POSITION_FK2" FOREIGN KEY ("ARTICLE_CODE") REFERENCES buggyshop."ARTICLE"("ARTICLE_CODE");

