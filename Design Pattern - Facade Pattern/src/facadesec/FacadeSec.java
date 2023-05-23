
package facadesec;


public class FacadeSec {


    public static void main(String[] args) {
       
        DVDPlayer dvd=new DVDPlayer();
        Light light= new Light("Living room");
        PopCornMachine pop=new PopCornMachine();
        
        Facade f =new Facade(dvd, pop, light);
        f.watchMovie("test");
        System.out.println("-----------------*------------------");
        f.EndMovie();
    }
    
}
