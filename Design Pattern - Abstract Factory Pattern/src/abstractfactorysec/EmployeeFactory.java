
package abstractfactorysec;


public class EmployeeFactory extends AbstractFactory<Employee>{

    @Override
    public Employee create(String type) {
     if(type.equalsIgnoreCase("fulltime"))
        return new FullTime();
    else if(type.equalsIgnoreCase("parttime"))
        return new PartTime();
    else
        return null;
    }
    
    
    /*public Employee create(String type)
    {  
    if(type.equalsIgnoreCase("fulltime"))
        return new FullTime();
    else if(type.equalsIgnoreCase("parttime"))
        return new PartTime();
    else
        return null;
    }*/
}
