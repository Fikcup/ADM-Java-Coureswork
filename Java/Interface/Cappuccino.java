package Interface;

public class Cappuccino extends Product 
{
    boolean peppermint = false;
    boolean whippedCream = false;

    Cappuccino()
    {
        super();
    }

    Cappuccino(boolean peppermint, boolean whippedCream)
    {
        setPeppermint(peppermint);
        setWhippedCream(whippedCream);
    }

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

    
}
