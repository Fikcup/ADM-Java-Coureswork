USE banking;

SELECT p.name AS "Product", t.name AS "Type"
  FROM product
p JOIN product_type t USING (product_type_cd)
  ORDER BY product_type_cd;