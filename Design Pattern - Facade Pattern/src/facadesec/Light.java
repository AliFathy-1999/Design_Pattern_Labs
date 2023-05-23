/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadesec;

/**
 *
 * @author PC
 */
public class Light {
    String room;
    int lightIntensity;

    public Light(String room) {
        this.room = room;
    }
    
    public void dim(int level)
    {
        lightIntensity=level;
        System.out.println("LIGHT : "+lightIntensity);
    }
    public void on()
    {
        dim(100);
    }     
    public void off()
    {
        dim(0);
    }      
    
            
}
