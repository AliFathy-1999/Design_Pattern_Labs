
package protectionproxyexample;


public class RealInternetConnection implements InternetConnection {

    @Override
    public void ConnectTo(String DomainName) {
        System.out.println("Connecting to "+DomainName);
    }
    
}
