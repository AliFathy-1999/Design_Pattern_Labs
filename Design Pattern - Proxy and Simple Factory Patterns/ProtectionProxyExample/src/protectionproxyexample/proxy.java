
package protectionproxyexample;

import java.util.ArrayList;


public class proxy implements InternetConnection{

    private RealInternetConnection real;
    
    private static ArrayList<String>BannedSites;
    
    static
    {
       BannedSites = new ArrayList<>();
       BannedSites.add("www.facebook.com");
       BannedSites.add("www.abc.com");
    }
    
    @Override
    public void ConnectTo(String DomainName) {
        if(BannedSites.contains(DomainName))
        {
            System.out.println("Access denied");
        
        }
        else
        {
            if(real==null)
            real= new RealInternetConnection();
            real.ConnectTo(DomainName);
            
        }
        
    }
    
}
