CREATE SEQUENCE "PH_SEQUENCE" MINVALUE 1 MAXVALUE 100000 INCREMENT BY 1 START WITH 1001;

create table Ph (
   id NUMBER(10)    DEFAULT PH_SEQUENCE.nextval NOT NULL,
   brand VARCHAR(20) default NULL,
   price     INT  default NULL,
   PRIMARY KEY (id)
);

describe Ph;

select * from Ph;