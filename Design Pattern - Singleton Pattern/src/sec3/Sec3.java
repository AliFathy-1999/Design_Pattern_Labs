
package sec3;


public class Sec3 {


    public static void main(String[] args) {
  
           TestSingleton t= TestSingleton.getString();
           TestSingleton t1= TestSingleton.getString();
           TestSingleton t2= TestSingleton.getString();
           TestSingleton t3= TestSingleton.getString();
           TestSingleton t4= TestSingleton.getString();           
           
           System.out.println(t);
           System.out.println(t1);
           System.out.println(t2);
           System.out.println(t3);
           System.out.println(t4);
           System.out.println("-------------------------------------------"); 
           
           TestSingleton2 t22= TestSingleton2.getString();
           TestSingleton2 t23= TestSingleton2.getString();
           TestSingleton2 t24= TestSingleton2.getString();
           
           System.out.println(t22);
           System.out.println(t23);
           System.out.println(t24);
    }
    
}
