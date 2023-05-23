
package cafedecoratorsec;


public class CafeDecoratorSec {


    public static void main(String[] args) {
        Beverage Bev=new Decaf();
        Bev = new Vanilla(Bev);
        System.out.println("Beverage is "+Bev);
        System.out.println("The cost of this Beverage = "+Bev.getCost());
        System.out.println("**********************************");
        Bev = new Caramel(Bev);
        System.out.println("Beverage is "+Bev);
        System.out.println("The cost of this Beverage = "+Bev.getCost());
        System.out.println("**********************************");
        Beverage BevHaz=new Espresso();
        BevHaz = new Hazelnut(BevHaz);
        System.out.println("Beverage is "+BevHaz);
        System.out.println("The cost of this Beverage = "+BevHaz.getCost());
        
    }
    
}
