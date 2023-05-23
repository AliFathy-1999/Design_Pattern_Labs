

package remotebridgesec;


public class AdvancedRemote extends BasicRemote{
    
    public AdvancedRemote(Device device) {
        super(device);
    }
    public void mute()
    {
        device.setChannel(0);
    }
}
