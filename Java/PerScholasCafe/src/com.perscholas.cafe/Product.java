package perscholascafe.src.com.perscholas.cafe;

public class Product 
{
    private String name;
    private double price;
    private String description;
    private int quantity; 
    private double total;

    public Product()
    {
        super();
    }

    public Product(String name, double price, String description)
    {
        setName(name);
        setPrice(price);
        setDescription(description);
    }
    
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

    public void calculateProductTotal()
    {
        this.total = (double) Math.round((getPrice() * getQuantity()) * 100) / 100;
    }
}
