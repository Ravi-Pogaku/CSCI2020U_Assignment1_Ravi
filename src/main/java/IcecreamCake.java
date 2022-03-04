/***
 * One of the three concrete classes on this implementation.
 */
public class IcecreamCake extends Cake {

    public IcecreamCake() {
        super("ice cream", 9.49);
    }

    @Override
    public void orderText() {
        System.out.println("You ordered " + flavor + " cake! \n It will be $" + price + ".");
    }
}
