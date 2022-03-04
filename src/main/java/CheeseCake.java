/***
 * One of the three concrete classes on this implementation.
 */
public class CheeseCake extends Cake {

    public CheeseCake() {
        super("cheese", 11.99);
    }

    @Override
    public void orderText() {
        System.out.println("You ordered " + flavor + " cake! \n It will be $" + price + ".");
    }
}
