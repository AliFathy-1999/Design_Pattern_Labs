
package cafedecoratorsec;


public class Hazelnut extends Decorator{

    Beverage Bev;

    public Hazelnut(Beverage Bev) {
        this.Bev = Bev;
    }

    @Override
    public double getCost() {
        return Bev.getCost() + 20;
    }

    @Override
    public String toString() {
        return   Bev + " Hazelunt";
    }
    
}
