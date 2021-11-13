package PerScholasCafe.src.com.perscholas.cafe;

public class Cappuccino extends Product 
{
    // Variable decloration
    boolean peppermint = false;
    boolean whippedCream = false;

    Cappuccino()
    {
        super();
    }

    // Cappuccino field decloration
    Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream)
    {
        setName(name);
        setPrice(price);
        setDescription(description);
        setPeppermint(peppermint);
        setWhippedCream(whippedCream);
    }

    // Getters and setters
    public boolean getPeppermint() {
        return peppermint;
    }

    public void setPeppermint(boolean peppermint) {
        this.peppermint = peppermint;
    }

    public boolean getWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    // Addon price decloration
    public double calculateCappuccinoAddons()
    {
        double peppermintPrice;
        double whippedCreamPrice;

        if (peppermint)
        {
            peppermintPrice = 2.00;
        }
        else
        {
            peppermintPrice = 0.00;
        }

        if (whippedCream)
        {
            whippedCreamPrice = 1.00;
        }
        else
        {
            whippedCreamPrice = 0.00;
        }

        return peppermintPrice + whippedCreamPrice;
    }
}