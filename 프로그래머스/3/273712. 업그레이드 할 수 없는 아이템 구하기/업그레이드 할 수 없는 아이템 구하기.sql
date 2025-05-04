-- 코드를 작성해주세요

select item_id, item_name, rarity
from item_info
where item_id not in(
select distinct PARENT_ITEM_ID
from ITEM_TREE
where PARENT_ITEM_ID is not null)
order by item_id desc;