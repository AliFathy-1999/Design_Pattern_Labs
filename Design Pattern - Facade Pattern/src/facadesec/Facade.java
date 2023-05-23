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
public class Facade {
    DVDPlayer dvd;
    PopCornMachine pop;
    Light light;

    public Facade(DVDPlayer dvd, PopCornMachine pop, Light light) {
        this.dvd = dvd;
        this.pop = pop;
        this.light = light;
    }
    
    public void watchMovie(String movie)
    {
        light.dim(50);
        dvd.on();
        dvd.setMovie(movie);
        dvd.StartMovie();
        pop.on();
    }
    public void EndMovie()
    {
        dvd.EndMovie();        
        dvd.off();
        light.dim(0);
        pop.off();
    }    
   
    
}
