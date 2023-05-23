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
public  class BasicRemote extends RemoteControl{

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    void power() {
        if(device.isEnable())
        {
            device.disable();
        }   
        else
        {
            device.enable();
        }
    }

    @Override
    void VolumeDown() {
        if(device.isEnable()==true)
        {
            int currentV= device.getVolume();
            device.setChannel(currentV - 1);
        }
        else
        {
            System.out.println("Turn On your Device first");
        }
    }

    @Override
    void VolumeUp() {

            int currentV= device.getVolume();
            device.setChannel(currentV + 1);
        
     
    }

    @Override
    void ChannelDown() {

            int currentC= device.getChannel();
            device.setChannel(currentC - 1);  
    }

    @Override
    void ChannelUp() {
            int currentC= device.getChannel();
            device.setChannel(currentC + 1);
    }
    public void printStatus1()
    {
        device.printStatus();
    }
    
}
