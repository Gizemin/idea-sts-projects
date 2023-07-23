SELECT * FROM kitap;


SELECT * FROM uye;

SELECT * FROM tur;

select * from yazar;


select * from odunc;


select*
from kitap
join yazar
on kitap.yazar_id=yazar.yazar_id;

select kitap.kitap_id, kitap.kitap_adi, yazar.kitap_yazari, yazar.yazar_id
from kitap
join yazar
on kitap.yazar_id=yazar.yazar_id;

select kitap.kitap_id, kitap.kitap_adi, yazar.kitap_yazari, yazar.yazar_id
from kitap
        inner join yazar
              on kitap.yazar_id=yazar.yazar_id;


select k.kitap_id, k.kitap_adi, y.kitap_yazari, y.yazar_id
from kitap as k
         inner join yazar as y
                    on k.yazar_id=y.yazar_id;

select k.kitap_id, k.kitap_adi, y.kitap_yazari, y.yazar_id
from kitap k
         inner join yazar y
                    on k.yazar_id=y.yazar_id;


select k.kitap_id, k.kitap_adi, y.kitap_yazari, y.yazar_id
from kitap k
         left join yazar y
                    on k.yazar_id=y.yazar_id;

select k.kitap_id, k.kitap_adi, y.kitap_yazari, y.yazar_id
from kitap k
         right join yazar y
                   on k.yazar_id=y.yazar_id;



select k.kitap_id, k.kitap_adi, y.kitap_yazari, y.yazar_id
from kitap k
         full outer join yazar y
                    on k.yazar_id=y.yazar_id;

select kitap_adi  from kitap
UNION
select kitap_yazari from yazar;

select uye_isim AS "kisi isim" from uye
UNION
select kitap_yazari from yazar;

SELECT * FROM kitap
WHERE kitap_id=3;

SELECT *FROM yazar
WHERE yazar_id=3;

SELECT * from kitap
where yazar_id=5;
----- !!!!!!!!! sor ----------
select * from kitap
where yazar_id= (
    select yazar_id FROM yazar WHERE kitap_yazari='Aleksandr Puşkin'
    )

select * from kitap
where yazar_id IN (
    select yazar_id FROM yazar
                    WHERE kitap_yazari like '%a%'

)

SELECT * FROM UYE ;

SELECT *FROM uye
WHERE cinsiyet=true;
SELECT *FROM uye
WHERE cinsiyet!=true;


SELECT *FROM uye
WHERE NOT cinsiyet=true;


SELECT *FROM uye
WHERE cinsiyet <>true;

SELECT count(*) FROM kitap;

SELECT count(*) FROM uye;

select kitap_id , kitap_adi, yayin_tarihi FROM kitap;

SELECT kitap_id , kitap_adi, yayin_tarihi  FROM kitap
             WHERE yayin_tarihi='1925-04-04';

select * from kitap
         LIMIT 2;

select * from uye
         ORDER BY uye_isim;

select * from uye
ORDER BY uye_isim DESC;

select * from uye;

select * from uye
where uye_isim like '%r';

select * from uye
where uye_isim like '%a_';

select * from uye
where uye_isim like '%ra_';


select * from uye
where uye_isim like '%r__';


select * from uye
where uye_isim like '%z__';

select *
from odunc;

select *
from odunc INNER JOIN kitap
ON odunc.kitap_id = kitap.kitap_id;

select k.kitap_id, kitap_adi , odunc_tarihi
from odunc o INNER JOIN kitap k
                      ON o.kitap_id = k.kitap_id;









