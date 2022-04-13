
select count(*) from receipt;
select sum(id) from receipt;
select avg(id) from receipt;
select max(id) from receipt;
select min(id) from receipt;

select r.id,
       p.name as "Кто",
       p.birthday as "Родился",
       c.title as "Потратил в городе",
       s.title as "Потратил в магазине",
       r.processed_at as "Когда",
       r.amount  as "Сколько"
from
    receipt r
        join people p on r.people_id = p.id
        join shop s on r.shop_id = s.id
        join city c on s.city_id = c.id
where
        c.title = 'Жлобин'
  and r.amount >30;

select
    avg(r.amount)
from
    receipt r
        join people p on r.people_id = p.id
        join shop s on r.shop_id = s.id
        join city c on s.city_id = c.id
where
        c.title = 'Жлобин'
  and r.amount >30;
