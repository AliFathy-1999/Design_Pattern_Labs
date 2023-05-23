
package remotebridgesec;


public class TV implements Device{

    
    private boolean on;
    private int volume =50;
    final private int maxV=100;
    final private int minV=0;
    private int channel=1;
    
    @Override
    public boolean isEnable() {
       return on;
    }

    @Override
    public void enable() {
       on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        
        if(percent > maxV)
        {
            volume=maxV;
        }
        else if(percent < minV)
        {
            volume=minV;
        }
        else
            this.volume=percent;
    }

    @Override
    public int getChannel() {
       return channel;
    }

    @Override
    public void setChannel(int percent1) {
        this.channel=percent1;
    }
    @Override
    public void printStatus()
    {
        System.out.println("Device : TV ");
        System.out.println("TV enabled : "+on);
        System.out.println("TV volume : "+volume);
        System.out.println("TV channel : "+channel);
    }
}
