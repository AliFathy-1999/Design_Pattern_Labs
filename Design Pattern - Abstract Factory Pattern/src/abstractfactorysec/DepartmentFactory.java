
package abstractfactorysec;


public class DepartmentFactory extends AbstractFactory<Department>{

    @Override
    public Department create(String type) {
    if(type.equalsIgnoreCase("HR"))
        return new HR();
    else if(type.equalsIgnoreCase("IT"))
        return new IT();
    else
        return null;
    }        
    
    
    /*
    Simple Factory 
    public Department create(String type)
    {  
    if(type.equalsIgnoreCase("HR"))
        return new HR();
    else if(type.equalsIgnoreCase("IT"))
        return new IT();
    else
        return null;
    }*/
    
    
}
