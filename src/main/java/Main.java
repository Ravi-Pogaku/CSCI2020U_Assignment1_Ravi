import java.util.Scanner;

/***
 * Factory Pattern Implementation
 * Ravi Pogaku, 100784105
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Pattern, Ravi Pogaku");
        System.out.println("-----------------------------");
        System.out.println("Which cake would you like to buy?");
        System.out.println("1. Chocolate Cake");
        System.out.println("2. Cheese Cake");
        System.out.println("3. Ice cream Cake");
        System.out.println("Choose. (1-3)");

        CakeFactory cakes = new CakeFactory();
        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();

        //Input of 1-3 to instantiate a specific Cake Object
        switch (choice) {
            case 1:
                Cake cake1 = cakes.getCake("chocolate");
                cake1.orderText();
                break;
            case 2:
                Cake cake2 = cakes.getCake("cheese");
                cake2.orderText();
                break;
            case 3:
                Cake cake3 = cakes.getCake("ice cream");
                cake3.orderText();
                break;
            default:
                System.out.println("Please choose a valid option (1-3)");
                break;
        }
    }
}
