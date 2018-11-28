package dbp.nextek;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "nextek", name = "NexTek", version = "unfinished")
public class Main {

	@Mod.Instance("nextek")
	public static Main instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		System.out.println("supercoder probably broke the enet");
	}
	
	public void init(FMLInitializationEvent event){
		System.out.println("e99999 is being a lazy bum");
	}
	
	public void postInit(FMLPostInitializationEvent event){
		System.out.println("greg still hasn't made a blast furnace yet");
	}
}
