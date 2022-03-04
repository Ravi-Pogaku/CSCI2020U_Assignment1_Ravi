/***
 * Factory Pattern can be done with either an interface or abstract class. I have chosen an abstract class for
 * my implementation. This is the reason why extension is very easy, usefulness of this method depends on what methods
 * are in this class.
 */
public abstract class Cake {
    protected String flavor = "";
    protected double price = 0.0;

    /***
     * superclass constructor, called in all sub-classes
     * @param flavor - cake flavor
     * @param price  - cake price
     */
    public Cake(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    /***
     * The function implemented in all sub-classes
     */
    public abstract void orderText();

}
