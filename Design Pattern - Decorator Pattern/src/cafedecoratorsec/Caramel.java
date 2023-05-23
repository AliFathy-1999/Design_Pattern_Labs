
package cafedecoratorsec;


public class Caramel extends Decorator{
    Beverage Bev;

    public Caramel(Beverage Bev) {
        this.Bev = Bev;
    }
    
    @Override
    public double getCost() {
        return Bev.getCost() + 10;
    }

    @Override
    public String toString() {
        return  Bev + " Caramel";
    }
    
}
