/***
 * One of the three concrete classes on this implementation.
 */
public class ChocolateCake extends Cake {

    public ChocolateCake() {
        super("chocolate", 9.99);
    }

    @Override
    public void orderText() {
        System.out.println("You ordered " + flavor + " cake! \n It will be $" + price + ".");
    }
}
