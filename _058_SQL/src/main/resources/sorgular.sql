SELECT * FROM customers
WHERE country='DE';


SELECT * FROM customers;
selecT * From customers;

-- Ulkesi Almanya olmayanlar
SELECT * FROM customers
WHERE NOT country= 'DE'

-- Ülkelerin isimlerini tek olaak listeleyelim.
SELECT DISTINCT country FROM customers;

-- yasi 25 ten büyük olanları goster
SELECT * FROM customers
WHERE age > 25;

-- Ülkelerin isimlerini unique tek olaak listeleyelim ve sayılarını da gosterelim
SELECT DISTINCT country FROM customers;
SELECT COUNT (DISTINCT country) FROM customers;

-- Alias (Lakap takmak)
SELECT customer_id AS c_id, first_name AS c_name FROM customers;

-- Alias (Lakap takmak)
SELECT cutomers.customer_id,  customers.first_name  FROM customers c;
SELECT c.customer_id    ,     c.first_name       FROM customers AS c;
SELECT c.customer_id    ,     c.first_name       FROM customers c;

SELECT o.id FROM order o;
select s.id from shp s;

select CONCAT (first_name, ' ', last_name) as full_name FROM customers;
select CONCAT (first_name, ' ', last_name) full_name FROM customers;

-- tabloya yeni bir kayıt ekleyelim.

INSERT INFO customers (first_name, last_name, phone, country, age) 
VALUES	 				('AAA'   , 'BBB'    , '111',  'TR'  ,  25);

INSERT INFO customers (first_name, phone, country, age, last_name) 
VALUES	 				('AAA'   , '111',   'TR' ,  25,    'BBB');


-- tabloya birden fazla kayıt ekleyelim
INSERT INTO customers (first_name, last_name, phone, country, age) 
VALUES	 				('CCC'   , 'BBB'    , '111',  'TR'  ,  32),
						('DDD'   , 'BBB'    , '111',  'TR'  ,  52),
						('EEE'   , 'BBB'    , '111',  'TR'  ,  25);
select * from customers;	

-- SAKIN BÖYLE ID DEGERİ BELİRTİLMEYEN UPDATE YAPMAYIN. 
UPDATE customers SET age=34; SELECT * FROM customers;

-- guncelleme edit update once id degerini belirtmemiz lazım. customer_id =16
UPDATE customers
SET age=28
WHERE customer_id=6;
SELECT * FROM customers; 

UPDATE customers SET age=33 WHERE customer_id=1;
SELECT * FROM customers;

-- güncellediğimiz sonucu görmek için;
SELECT * FROM customers WHERE customer_id=6;
SELECT * FROM customers WHERE country='DE';


-- id değeri 16'dan büyük olan kişilerin ülke kodlarını PL (polonya) yapalım. 
UPDATE customers 
SET country='PL' 
WHERE customer_id > 16; -- WHERE customer_id >= 17;
SELECT * FROM customers;

-- Silme işleminde mutlaka silinecek kaydın ID degerini SECİNİZ. ŞART!!
-- DELETE FROM customers; ==> ASLA bunu YAPMAYIN ( Bu tablodaki tüm verilerinizi siler. Truncate ile farkı DELETE yapınca sayac devam eder. Truncate de etmez) 

-- id değeri 16 olan kaydı silelim
DELETE FROM customers 
WHERE customer_id=16;
SELECT * FROM customers;


-- id değeri 17 olan kaydı silelim
DELETE FROM customers 
WHERE customer_id=17;
SELECT * FROM customers;

-- DİKKAT!! Tabloyu tamamen siler. Tablayu fabrika çıkışı hale getirir.  Her şeyi sıfırlar. 
-- TRUNCATE TABLE customers;  

--A'DAN Z'ye Sıralama için - 0'dan 9'a;
SELECT * FROM customers ORDER BY first_name;
SELECT * FROM customers ORDER BY last_name;
SELECT * FROM customers ORDER BY phone;
SELECT * FROM customers ORDER BY country;

-- Sıralama; 0'DAN 9'A göre sıralama;
SELECT * FROM customers ORDER BY age;

-- Sıralama; Birden fazla durumu dikkate alarak;
SELECT * FROM customers ORDER BY first_name, last_name, age;
SELECT * FROM customers ORDER BY country, age ASC;
-- NOT: A'dan Z'ye sıralamada aslında satırın sonunda ASC var yazmasanda o var.  
-- yani üst satır su sekilde ==> SELECT * FROM customers ORDER BY country, age ASC;

--Z'DAN A'ye Sıralama için  DESC yazmak zorundasın!!
SELECT * FROM customers ORDER BY first_name DESC;

-- DESC 9'dan 0'a sıralama
SELECT * FROM customers ORDER BY age DESC;

-- DESC Sıralama; Birden fazla durumu dikkate alarak;
SELECT * FROM customers ORDER BY first_name, last_name, age DESC;
SELECT * FROM customers ORDER BY country, age DESC;  -- Burada ülkeyi ASC olarak sıralar. AGE', DESC olarak.
SELECT * FROM customers ORDER BY country DESC, age DESC;

--GRUP BY GRUPLAMA

-- Ülke kolonunu seçtik.
SELECT country FROM customers;
-- Ülke adı (kişi sayısı) Gruplamalarda 1 kolonu seçiniz! 
SELECT country, COUNT(*) as numbers FROM customers
GROUP BY country;

SELECT country, COUNT(*) as numbers FROM customers
GROUP BY country ORDER BY country;

-- Gruba şart koymak için WHERE değil HAVING BY olacak.
SELECT country, COUNT(*) as numbers FROM customers
GROUP BY country
HAVING country='TR';

SELECT country, COUNT(*) as numbers FROM customers
WHERE age>20
GROUP BY country
HAVING country='TR';

SELECT * FROM customers
WHERE country='TR';













