package com.github.ustc_zzzz.fmltutor.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class ItemLoader {
	 public static Item goldenEgg = new ItemGoldenEgg();

	@SubscribeEvent
	    public static void registerItem(RegistryEvent.Register<Item> event){
	        event.getRegistry().register(goldenEgg.setRegistryName("fmltutor:golden_Egg"));
	    }
	 @SubscribeEvent
	 public static void registerItemModel(ModelRegistryEvent event){
		 ModelLoader.setCustomModelResourceLocation(goldenEgg,0, new ModelResourceLocation(goldenEgg.getRegistryName(), "inventory"));
	 }
}
