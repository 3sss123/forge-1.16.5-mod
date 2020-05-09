package com.github.ustc_zzzz.fmltutor.potion;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class PotionLoader {
	public static Potion FallProtection= new PotionFallProtection();

	 @SubscribeEvent
	    public static void registerPotion(RegistryEvent.Register<Potion> event){
	        event.getRegistry().register(FallProtection.setRegistryName("fmltutor:fallprotection"));
	    }
	 @SubscribeEvent
	 public static void registerPotionType(RegistryEvent.Register<PotionType> event){
	     event.getRegistry().register(new PotionType(new PotionEffect(FallProtection, 600, 0)).setRegistryName("fmltutor:fallprotection"));
	 }
}
