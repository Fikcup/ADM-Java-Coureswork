package PerScholasCafe.src.com.perscholas.cafe;

public class Coffee extends Product
{
    // Variable decloration
    boolean sugar = false;
    boolean milk = false;

    Coffee()
    {
        super();
    }

    // Coffee decloration
    Coffee(String name, double price, String description, boolean sugar, boolean milk)
    {
        setName(name);
        setPrice(price);
        setDescription(description);
        setSugar(sugar);
        setMilk(milk);
    }

    // Getters and setters
    public boolean getSugar() 
    {
        return sugar;
    }

    public void setSugar(boolean sugar) 
    {
        this.sugar = sugar;
    }

    public boolean getMilk() 
    {
        return milk;
    }

    public void setMilk(boolean milk) 
    {
        this.milk = milk;
    }
}
