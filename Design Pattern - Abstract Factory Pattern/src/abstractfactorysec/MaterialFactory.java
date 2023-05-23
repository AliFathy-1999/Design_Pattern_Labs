
package abstractfactorysec;


public class MaterialFactory extends AbstractFactory<Material>{

    @Override
    public Material create(String type) {
    if(type.equalsIgnoreCase("paper"))
        return new Paper();
    else if(type.equalsIgnoreCase("pen"))
        return new Pen();
    else
        return null;        
    }
    
}
