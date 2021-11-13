SELECT t.*, i.LAST_NAME
  FROM acc_transaction t
JOIN account a USING (account_id)
  JOIN individual i USING (cust_id)
WHERE i.LAST_NAME LIKE 'T%';