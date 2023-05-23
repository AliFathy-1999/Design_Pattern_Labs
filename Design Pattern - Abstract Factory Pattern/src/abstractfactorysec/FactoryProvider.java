
package abstractfactorysec;


public class FactoryProvider {
    
    public AbstractFactory getFactory(String type)
    {
        if(type.equalsIgnoreCase("dept"))
        {
            return new DepartmentFactory();
        }
        else if(type.equalsIgnoreCase("emp"))
        {
            return new EmployeeFactory();
        }
        else if(type.equalsIgnoreCase("Mat"))    
        {
            return new MaterialFactory();
        }
        else
            return null;
    }
}
