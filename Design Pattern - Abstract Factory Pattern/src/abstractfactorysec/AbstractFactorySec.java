
package abstractfactorysec;

public class AbstractFactorySec {


    public static void main(String[] args) {
        FactoryProvider fp= new FactoryProvider();
        //call factory provider to get specific factory
        
        AbstractFactory<Employee> empFactory = fp.getFactory("emp");
            
        Employee e1 = empFactory.create("partime");
        Employee e2 = empFactory.create("fulltime");
        
        e1.printData();
        e2.printData();
        
        AbstractFactory<Department> DepFactory = fp.getFactory("dep");
            
        Department d1 = DepFactory.create("HR");
        Department d2 = DepFactory.create("IT");
        
        d1.printDep();
        d2.printDep();
        
        AbstractFactory<Material> MatFactory = fp.getFactory("Mat");
            
        Material m1 = MatFactory.create("pen");
        Material m2 = MatFactory.create("paper");
        
        m1.printMat();
        m2.printMat();
        //use factory object to get product
    }
    
}
