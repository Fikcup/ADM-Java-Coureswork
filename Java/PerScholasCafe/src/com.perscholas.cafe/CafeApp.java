package perscholascafe.src.com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp 
{
    public static void main(String[] args)
    {
        Product coffee = new Product("coffee", 3.50, "full-bodied dark roast");
        Product espresso = new Product("espresso", 2.50, "one shot of blonde, high-caffeine espresso");
        Product cappuccino = new Product("cappuccino", 3.50, "double shot of espresso with steamed whole milk");

        Scanner askQuantity = new Scanner(System.in);

        System.out.println("Please enter the quantity of coffee: ");
        int coffeeQuantity = askQuantity.nextInt();
        System.out.println(coffee + ": " + coffeeQuantity);

        System.out.println("Please enter the quantity of espresso: ");
        int espressoQuantity = askQuantity.nextInt();
        System.out.println(espresso + ": " + espressoQuantity);

        System.out.print("Please enter the quantity of cappuccino: ");
        int cappuccinoQuantity = askQuantity.nextInt();
        System.out.print(cappuccino + ": " + cappuccinoQuantity);

        askQuantity.close();

        double tax = 0.09;
        double salesTax = Product.calculateProductTotal() * tax;
        double salesTotal = Product.calculateProductTotal() + salesTax;

        System.out.format("%-20s, %20.2f, %-20s, %-20.2f, %-20s, %-20.2f", "Subtotal", Product.calculateProductTotal(), "Sales Tax", salesTax, "Sales Total", salesTotal);
        System.out.println();
    }
}
