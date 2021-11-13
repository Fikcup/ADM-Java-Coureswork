package PerScholasCafe.src.com.perscholas.cafe;

public class Espresso extends Product 
{
    // Variable decloration
    boolean extraShot;
    boolean macchiato;

    Espresso()
    {
        super();
    }

    // Espresso field decloration
    Espresso(String name, double price, String description, boolean extraShot, boolean macchiato)
    {
        setName(name);
        setPrice(price);
        setDescription(description);
        setExtraShot(extraShot);
        setMacchiato(macchiato);
    }

    // Getters and setters
    public boolean getExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean getMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }

    // Addon price calculations
    public double calculateEspressoAddons()
    {
        double extraShotPrice;
        double macchiatoPrice;

        if (extraShot)
        {
            extraShotPrice = 2.00;
        }
        else
        {
            extraShotPrice = 0.00;
        }

        if (macchiato)
        {
            macchiatoPrice = 1.00;
        }
        else
        {
            macchiatoPrice = 0.00;
        }

        return extraShotPrice + macchiatoPrice;
    }
}
