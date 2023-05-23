
package cafedecoratorsec;


public class Vanilla extends Decorator{
    Beverage Bev;

    public Vanilla(Beverage Bev) {
        this.Bev = Bev;
    }

    @Override
    public double getCost() {
        return Bev.getCost() + 15;
    }

    @Override
    public String toString() {
        return   Bev + " Vanilla";
    }
    
}
