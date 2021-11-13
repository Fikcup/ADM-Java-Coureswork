USE classicmodels;

DELIMITER //

CREATE PROCEDURE removeCart (
  p_id INT, p_customerNumber INT, p_orderNumber INT, p_productCode VARCHAR (11), p_quantity INT
)
  BEGIN 
    DELETE FROM shoppingcart VALUE (p_id, p_customerNumber, p_orderNumber, p_productCode, p_quantity);
  END;
//

DELIMITER ;