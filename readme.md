## Prepare a Database

```sql
create database jdbc_test;
CREATE TABLE COMPANY(
   ID INT PRIMARY KEY     NOT NULL,
   NAME           TEXT    NOT NULL,
   AGE            INT     NOT NULL,
   ADDRESS        CHAR(50),
   SALARY         REAL
);
CREATE SEQUENCE company_id_seq OWNED BY company.id;
ALTER TABLE company ALTER COLUMN id SET DEFAULT nextval('company_id_seq');

insert into company (name, age) values ('Tom', 32), ('Tony', 25);
insert into company (name, age) values ('Alice', 18), ('Bob', 19);
```
