
package remotebridgesec;


public class RemoteBridgeSec {

 
    public static void main(String[] args) {
      
        TV tv=new TV();
        BasicRemote remote=new BasicRemote(tv);
        remote.power();
        remote.ChannelUp();
        remote.VolumeUp();       
        remote.printStatus1();
    }
    
}
