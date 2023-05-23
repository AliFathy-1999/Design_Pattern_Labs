
package sec3;


public class TestSingleton {
    private static TestSingleton singleObject=new TestSingleton();
    
    private TestSingleton()
    {
    }
    
    public static TestSingleton getString()
    {
        return singleObject;
    }
}
