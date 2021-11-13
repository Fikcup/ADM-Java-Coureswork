USE classicmodels;

DELIMITER // 

DROP PROCEDURE if EXISTS addcart;

CREATE PROCEDURE addcart (
  p_id INT, p_customerNumber INT, p_orderNumber INT, p_productCode VARCHAR (11), p_quantity INT
)
  BEGIN
    INSERT INTO shoppingcart VALUES (p_id, p_customerNumber, p_orderNumber, p_productCode, p_quantity);
  END;
//
 
DELIMITER ;

CALL addcart (
  1, 129, 10111, 'S12_3990', 7
)