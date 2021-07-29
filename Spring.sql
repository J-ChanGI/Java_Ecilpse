DROP TABLE MEMBERSHIP;--

CREATE TABLE MEMBERSHIP( 
    MID NVARCHAR2(50) CONSTRAINT MEM_PK PRIMARY KEY,
    MPASSWORD NVARCHAR2(50) NOT NULL,
    MPASSWORDCHECK NVARCHAR2(50) NOT NULL,
    MNAME NVARCHAR2(50) NOT NULL,
    MNUMBER NVARCHAR2(50),
    MEMAIL NVARCHAR2(50),
    MDOMAIN NVARCHAR2(50),
    MADDRESSNUMBER NVARCHAR2(50),
    MROADADDRESS NVARCHAR2(100),
    MLANDADDRESS NVARCHAR2(100),
    MDATAILEDADDRESS NVARCHAR2(100),
    MNOTE NVARCHAR2 (100)
    );
    
SELECT * FROM MEMBERSHIP;

SHOW USER;
----------------------

DROP TABLE GOODSUPLOAD; 
 
DROP SEQUENCE GOODS_SEQ; 

CREATE SEQUENCE GOODS_SEQ
    START WITH 1
    INCREMENT BY  1
    NOCACHE ;


CREATE TABLE GOODSUPLOAD(
    GOODSNAME NVARCHAR2(50) NOT NULL,
    GOODSBRAND NVARCHAR2 (50) NOT NULL,
    GOODSINTRO NVARCHAR2 (50),
    GOODSIMGNAME NVARCHAR2 (50),
    GOODSNUMBER NUMBER (5) CONSTRAINT GOODS_PK PRIMARY KEY,
    CATEGORY NVARCHAR2 (50),
    GOODSPRICE NVARCHAR2 (50),
    GOODSTYPE NVARCHAR2(50));
    
SELECT * FROM GOODSUPLOAD;
-----------------------------------
DROP TABLE CATEGORYS;

CREATE TABLE CATEGORYS (
        CATEGORY NVARCHAR2 (50) CONSTRAINT CATEGORYS_PK PRIMARY KEY);
    
SELECT * FROM CATEGORYS;    
    
INSERT INTO CATEGORYS(CATEGORY) VALUES('A');
INSERT INTO CATEGORYS(CATEGORY) VALUES('B');
INSERT INTO CATEGORYS(CATEGORY) VALUES('C');

--------------------------------
DROP TABLE CART;

CREATE TABLE CART (

    CARTID NVARCHAR2 (50) CONSTRAINT CART_FK REFERENCES MEMBERSHIP(MID) ,
    CARTGOODS NVARCHAR2 (50),
    CARTPRICE NVARCHAR2 (50),
    CARTNUMBER NUMBER (5) CONSTRAINT CART2_FK REFERENCES GOODSUPLOAD(GOODSNUMBER),
    CARTAMOUNT NUMBER (5),
    CARTCODE NUMBER (5),
    CARTIMGNAME NVARCHAR2(50));
    
SELECT * FROM CART;
-----------------------------
DROP TABLE GOODSORDERS;

DROP SEQUENCE OREDER_SEQ;

CREATE SEQUENCE ORDER_SEQ
     START WITH 1
     INCREMENT BY 1
     NOCACHE   ;

CREATE TABLE GOODSORDERS (

    ORDERID NVARCHAR2 (50) CONSTRAINT ORDER_FK REFERENCES MEMBERSHIP(MID) ,
    ORDERMNUMBER NVARCHAR2(50),
    ORDEREMAILE NVARCHAR2(50),
    ORDERDOMAIN NVARCHAR2(50),
    ORDERADDRASSNUMBER NVARCHAR2(50),
    ORDERROADADDRESS NVARCHAR2(50),
    ORDERLANDADDRESS NVARCHAR2(50),
    ORDERDATAILADDRESS NVARCHAR2(100),
    ORDERNOTE NVARCHAR2(50),  
    
    ORDERGOODSNAME NVARCHAR2 (50),
    ORDERGOOODSBRAND NVARCHAR2(50),
    ORDERGOODSPRICE NVARCHAR2 (50),
    ORDERNUMBER NUMBER (5) CONSTRAINT ORDER2_FK REFERENCES GOODSUPLOAD(GOODSNUMBER) ,
    ORDERAMOUNT NUMBER (5),
    ORDERCODE NUMBER (5),
    ORDERIMGNAME NVARCHAR2(50));
    
SELECT * FROM GOODSORDERS;




