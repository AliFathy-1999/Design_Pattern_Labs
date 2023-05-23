
package section5_simplefactory;


public class ButtonSimpleFactory {
    
     public Button createButton(String type)
     {
        if(type.equals("html"))
            return new HTMLButton();
        else if (type.equals("window"))
            return new WindowsButton();
        else 
            return null;
    
    }
}
