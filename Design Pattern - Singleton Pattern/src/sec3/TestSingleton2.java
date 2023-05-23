
package sec3;


public class TestSingleton2 {
    private static TestSingleton2 singleObject=null;
    
    private TestSingleton2()
    {
           
    }
    
    public static TestSingleton2 getString()
    {
        if(singleObject == null)
            singleObject = new TestSingleton2();
        return singleObject;
    }
    
}
