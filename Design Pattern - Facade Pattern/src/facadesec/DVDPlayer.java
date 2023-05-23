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
public class DVDPlayer {
    String movie;

    public DVDPlayer() {
        
    }
    public void setMovie(String movie)
    {
        this.movie=movie;
    }
    public void on()
    {
        System.out.println("DVD on");
    }
    public void off()
    {
        System.out.println("DVD off");
    } 
    public void StartMovie()
    {
        System.out.println("Movie started");
    }
    public void EndMovie()
    {
        System.out.println("Movie ended");
    }       
}
