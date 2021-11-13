package PerScholasCafe.src.com.perscholas.cafe;

public class Order
{
    // Variable decloration
    private int coffeeQuantity;
    private double coffee;
    private int espressoQuantity;
    private double espresso;
    private int cappuccinoQuantity;
    private double cappuccino;

    public static final double TAX = 0.09;

    // Instantiation to pull methods
    Espresso calcEspresso = new Espresso();
    Cappuccino calcCappuccino = new Cappuccino();

    // Order field declaration
    public Order(int coffeeQuantity, double coffee, int espressoQuantity, double espresso, int cappuccinoQuantity, double cappuccino)
    {
        super();
        setCoffeeQuantity(coffeeQuantity);
        setCoffee(coffee);
        setEspressoQuantity(espressoQuantity);
        setEspresso(espresso);
        setCappuccinoQuantity(cappuccinoQuantity);
        setCappuccino(cappuccino);
    }


    // Getters and setters
    public int getCoffeeQuantity() 
    {
        return coffeeQuantity;
    }

    public void setCoffeeQuantity(int coffeeQuantity)
    {
        this.coffeeQuantity = coffeeQuantity;
    }

    public double getCoffee() 
    {
        return coffee;
    }

    public void setCoffee(double coffee) 
    {
        this.coffee = coffee;
    }

    public int getEspressoQuantity()
    {
        return espressoQuantity;
    }

    public void setEspressoQuantity(int espressoQuantity) 
    {
        this.espressoQuantity = espressoQuantity;
    }

    public double getEspresso() 
    {
        return espresso;
    }

    public void setEspresso(double espresso) 
    {
        this.espresso = espresso;
    }

    public int getCappuccinoQuantity() 
    {
        return cappuccinoQuantity;
    }

    public void setCappuccinoQuantity(int cappuccinoQuantity) 
    {
        this.cappuccinoQuantity = cappuccinoQuantity;
    }

    public double getCappuccino() 
    {
        return cappuccino;
    }

    public void setCappuccino(double cappuccino) 
    {
        this.cappuccino = cappuccino;
    }
    
    // Total calculations
    public double calculateSubtotal()
    {
       return coffee * coffeeQuantity + espresso * espressoQuantity + cappuccino * cappuccinoQuantity + calcEspresso.calculateEspressoAddons() + calcCappuccino.calculateCappuccinoAddons();
    }

    public double calculateSalesTax()
    {
        return calculateSubtotal() * TAX;
    }

    public double calculateSalesTotal()
    {
        return calculateSubtotal() + calculateSalesTax();
    }
}
