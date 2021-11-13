package PerScholasCafe.src.com.perscholas.cafe;

abstract class Product 
{
    // Create variables
    private String name;
    private double price;
    private String description;
    private int quantity; 

    Product()
    {
        super();
    }

    // Product field declaration
    Product(String name, double price, String description)
    {
        super();
        setName(name);
        setPrice(price);
        setDescription(description);
    }
    
    // Getters and setters
    void setName(String name)
    {
        this.name = name;
    }

    String getName() 
    {
        return name;
    }

    void setPrice(double price)
    {
        this.price = price;
    }

    double getPrice()
    {
        return price;
    }

    void setDescription(String description)
    {
        this.description = description;
    }

    String getDescription()
    {
        return description;
    }

    void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    Integer getQuantity()
    {
        return quantity;
    }
}

