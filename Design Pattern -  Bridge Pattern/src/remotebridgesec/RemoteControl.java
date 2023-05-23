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
public abstract class RemoteControl {
    
    Device device;
    
    public RemoteControl(Device device) {
    this.device=device;
    }
    abstract void power();
    abstract void VolumeDown();
    abstract void VolumeUp();
    abstract void ChannelDown();
    abstract void ChannelUp();
    
}
