USE mockSBA;

SELECT i.name, i.price
  FROM items i
JOIN (SELECT order_id, item_id, COUNT(item_id) AS itm_cnt 
  FROM order_items oi 
  GROUP BY oi.item_id) o 
    ON i.ITEM_ID = o.ITEM_ID
WHERE o.itm_cnt >=2;