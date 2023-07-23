SELECT * FROM tblmusteri;

SELECT * FROM tblurun;

SELECT * FROM tbliletisim;

SELECT * FROM tblsatis;


SELECT * FROM tblsepet;


SELECT * FROM tblmusteri
where ad='Tommy';

SELECT * FROM tblmusteri
where ad='Roz';

SELECT * FROM tblsatis
where musteriid='150';

SELECT * FROM tblsatis
where musteriid IN (200,250,300,350);

select* from tblsepet
where id='1';

select*from tblsepet
where satisid='648';

select*from tblsepet
where satisid='649';

select*from tblsepet
where satisid in(50,100,150,200,250,300,350,400,450,500);

SELECT * FROM tblurun
WHERE id=100;

SELECT * FROM tblurun
WHERE id IN (100,150,200,250);

select * from tblmusteri
JOIN tblsatis ON tblmusteri.id = tblsatis.musteriid;

select mus.ad, mus.soyadi, sts.satistarihi from tblmusteri mus
                  JOIN tblsatis sts ON mus.id = sts.musteriid;

select mus.ad, mus.soyadi, sts.satistarihi, spt.adet from tblmusteri mus
JOIN tblsatis sts ON mus.id = sts.musteriid
JOIN tblsepet spt ON sts.id = spt.satisid;

select mus.ad, mus.soyadi, sts.satistarihi, spt.adet, urn.ad
from tblmusteri mus
JOIN tblsatis sts ON mus.id = sts.musteriid
JOIN tblsepet spt ON sts.id = spt.satisid
JOIN tblurun urn ON spt.urunid = urn.id;

select mus.ad, mus.soyadi, sts.satistarihi, spt.adet, urn.ad
from tblmusteri mus
         JOIN tblsatis sts ON mus.id = sts.musteriid
         JOIN tblsepet spt ON sts.id = spt.satisid
         JOIN tblurun urn ON spt.urunid = urn.id
where mus.ad='Tamara';

select mus.ad, COUNT(mus.ad)
from tblmusteri mus
         JOIN tblsatis sts ON mus.id = sts.musteriid
         JOIN tblsepet spt ON sts.id = spt.satisid
         JOIN tblurun urn ON spt.urunid = urn.id
 group by mus.ad
     HAVING mus.ad='Tamara';

select mus.ad, COUNT(mus.ad)
from tblmusteri mus
         JOIN tblsatis sts ON mus.id = sts.musteriid
         JOIN tblsepet spt ON sts.id = spt.satisid
         JOIN tblurun urn ON spt.urunid = urn.id
group by mus.ad;

select urn.ad, COUNT(urn.ad)
from tblmusteri mus
         JOIN tblsatis sts ON mus.id = sts.musteriid
         JOIN tblsepet spt ON sts.id = spt.satisid
         JOIN tblurun urn ON spt.urunid = urn.id
where mus.ad='Kendal'
group by urn.ad;

select urn.ad, COUNT(urn.ad)
from tblmusteri mus
         JOIN tblsatis sts ON mus.id = sts.musteriid
         JOIN tblsepet spt ON sts.id = spt.satisid
         JOIN tblurun urn ON spt.urunid = urn.id
--where mus.ad='Kendal'
group by urn.ad
HAVING COUNT(urn.ad)>10;

select urn.ad, COUNT(urn.ad)
from tblmusteri mus
         JOIN tblsatis sts ON mus.id = sts.musteriid
         JOIN tblsepet spt ON sts.id = spt.satisid
         JOIN tblurun urn ON spt.urunid = urn.id
--where mus.ad='Kendal'
group by urn.ad
HAVING COUNT(urn.ad)>10
order by COUNT(urn.ad) DESC;

select urn.ad, COUNT(urn.ad)
from tblmusteri mus
         JOIN tblsatis sts ON mus.id = sts.musteriid
         JOIN tblsepet spt ON sts.id = spt.satisid
         JOIN tblurun urn ON spt.urunid = urn.id
--where mus.ad='Kendal'
group by urn.ad
HAVING COUNT(urn.ad)>10
order by urn.ad DESC;

select urn.ad, COUNT(urn.ad)
from tblmusteri mus
         JOIN tblsatis sts ON mus.id = sts.musteriid
         JOIN tblsepet spt ON sts.id = spt.satisid
         JOIN tblurun urn ON spt.urunid = urn.id
--where mus.ad='Kendal'
group by urn.ad
HAVING COUNT(urn.ad)>10
order by urn.ad ASC;

select urn.ad, COUNT(urn.ad)
from tblmusteri mus
         JOIN tblsatis sts ON mus.id = sts.musteriid
         JOIN tblsepet spt ON sts.id = spt.satisid
         JOIN tblurun urn ON spt.urunid = urn.id
--where mus.ad='Kendal'
group by urn.ad
HAVING COUNT(urn.ad)>10
order by urn.ad
LIMIT 3;

select *
from tblmusteri mus
        left JOIN tblsatis sts ON mus.id = sts.musteriid
        RIGHT JOIN tblsepet spt ON sts.id = spt.satisid
        left JOIN tblurun urn ON spt.urunid = urn.id;

select mus.id, mus.ad, urn.id, urn.ad, sts.id, sts.odemesekli
from tblmusteri mus
         left JOIN tblsatis sts ON mus.id = sts.musteriid
         RIGHT JOIN tblsepet spt ON sts.id = spt.satisid
         left JOIN tblurun urn ON spt.urunid = urn.id;

CREATE view musteriurunsatis AS
select mus.id
from tblmusteri mus
         left JOIN tblsatis sts ON mus.id = sts.musteriid
         RIGHT JOIN tblsepet spt ON sts.id = spt.satisid
         left JOIN tblurun urn ON spt.urunid = urn.id;


CREATE view musteriurunsatis AS
select mus.id
from tblmusteri mus
         left JOIN tblsatis sts ON mus.id = sts.musteriid
         RIGHT JOIN tblsepet spt ON sts.id = spt.satisid
         left JOIN tblurun urn ON spt.urunid = urn.id;

SELECT *FROM musteriurunsatis;

CREATE view musteriurunson3 AS
select urn.ad, COUNT(urn.ad)
from tblmusteri mus
         JOIN tblsatis sts ON mus.id = sts.musteriid
         JOIN tblsepet spt ON sts.id = spt.satisid
         JOIN tblurun urn ON spt.urunid = urn.id
group by urn.ad
HAVING COUNT(urn.ad)>10
order by urn.ad
LIMIT 3;


select * from musteriurunson3;

CREATE view musteriurunsatis2 AS
select mus.id as mus_id, mus.ad as mus_ad, urn.id as urn_id, urn.ad as urn_ad, sts.id as sts_id, sts.odemesekli
FROM tblmusteri mus
left join tblsatis sts on mus.id = sts.musteriid
right join tblsepet spt ON sts.id=spt.satisid
left join tblurun urn on spt.urunid = urn.id;

select * from musteriurunsatis2;

select * from musteriurunsatis2
where mus_ad='Lyndel';
























