package PerScholasCafe.src.com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp 
{
    public void main()
    {
        // Create instances of product
        Product coffee = new Coffee("coffee", 3.50, "full-bodied dark roast", false, false);
        Product espresso = new Espresso("espresso", 2.50, "one shot of blonde, high-caffeine espresso", false, false);
        Product cappuccino = new Cappuccino("cappuccino", 3.50, "double shot of espresso with steamed whole milk", false, false);

        // Check if customer wants addons
        Espresso checkAddonsEspresso = new Espresso();
        Cappuccino checkAddonsCappuccino = new Cappuccino();

        // Scanner created to prompt user for quantity of items
        Scanner askQuantity = new Scanner(System.in);

        // Coffee code
        System.out.println("Please enter the quantity of coffee: ");
        int coffeeQuantity = askQuantity.nextInt();
        System.out.println(coffee + ": " + coffeeQuantity);

        // Espresso code
        System.out.println("Please enter the quantity of espresso: ");
        int espressoQuantity = askQuantity.nextInt();
        System.out.println(espresso + ": " + espressoQuantity);

        // Espresso addons
        System.out.println("Would you like an extra shot?");
        checkAddonsEspresso.extraShot = askQuantity.nextBoolean();
        System.out.println("Would you like a macchiato?");
        checkAddonsEspresso.macchiato = askQuantity.nextBoolean();

        // Cappuccino addons
        System.out.println("Would you like peppermint?");
        checkAddonsCappuccino.peppermint = askQuantity.nextBoolean();
        System.out.println("Would you like whipped cream?");
        checkAddonsCappuccino.whippedCream = askQuantity.nextBoolean();

        // Cappuccino code
        System.out.print("Please enter the quantity of cappuccino: ");
        int cappuccinoQuantity = askQuantity.nextInt();
        System.out.print(cappuccino + ": " + cappuccinoQuantity);

        askQuantity.close();

        // Order instance
        Order order = new Order(coffeeQuantity, coffee.getPrice(), espressoQuantity, espresso.getPrice(), cappuccinoQuantity, cappuccino.getPrice());

        // Subtotal table
        System.out.format("%-20s, %20.2f, %-20s, %-20.2f, %-20s, %-20.2f", "Subtotal", order.calculateSubtotal(), "Sales Tax", order.calculateSalesTax(), "Sales Total", order.calculateSalesTotal());
        System.out.println();
    }
}
