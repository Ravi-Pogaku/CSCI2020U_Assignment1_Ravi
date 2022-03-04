/***
 * Instantiation is done by CakeFactory and as such is hid from the user.
 */
public class CakeFactory {
    public Cake getCake(String flavor) {

        if (flavor.equals("chocolate")) {
            return new ChocolateCake();
        }

        else if (flavor.equals("cheese")) {
            return new CheeseCake();
        }

        else if (flavor.equals("ice cream")) {
            return new IcecreamCake();
        }

        return null;
    }
}
