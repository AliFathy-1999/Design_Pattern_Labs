
package protectionproxyexample;

public class ProtectionProxyExample {


    public static void main(String[] args) {
      
        InternetConnection InterConObj= new proxy();
        InterConObj.ConnectTo("www.facebook.com");
        InterConObj.ConnectTo("google");
        
    }
    
}
