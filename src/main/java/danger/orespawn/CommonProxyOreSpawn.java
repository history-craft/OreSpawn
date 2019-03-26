package danger.orespawn;

import cpw.mods.fml.common.network.simpleimpl.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.relauncher.*;

public class CommonProxyOreSpawn
{
    private SimpleNetworkWrapper network;
    
    public SimpleNetworkWrapper getNetwork() {
        return this.network;
    }
    
    public void registerRenderThings() {
    }
    
    public void registerSoundThings() {
    }
    
    public void registerKeyboardInput() {
    }
    
    public void registerNetworkStuff() {
        (this.network = NetworkRegistry.INSTANCE.newSimpleChannel("RiderControls")).registerMessage((Class)RiderControlMessageHandler.class, (Class)RiderControlMessage.class, 0, Side.SERVER);
    }
    
    public int setArmorPrefix(final String string) {
        return 0;
    }
}
