/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotebridgesec;

/**
 *
 * @author PC
 */
public interface Device {
    
    public boolean isEnable();
    public void enable();
    public void disable();
    public int getVolume();
    public void setVolume(int percent);
    public int getChannel();
    public void setChannel(int percent);
    public void printStatus();
}
