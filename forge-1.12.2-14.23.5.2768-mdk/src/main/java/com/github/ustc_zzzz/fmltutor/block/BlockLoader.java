package com.github.ustc_zzzz.fmltutor.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class BlockLoader {
	public static Block grassBlock = new BlockGrassBlock();

	 @SubscribeEvent
	    public static void registerBlock(RegistryEvent.Register<Block> event){
	        event.getRegistry().register(grassBlock.setRegistryName("fmltutor:grass_block"));
	    }
	 @SubscribeEvent
	 public static void registerItems(RegistryEvent.Register<Item> event){
	     event.getRegistry().register(new ItemBlock(grassBlock).setRegistryName("fmltutor:grass_block"));
	 }
	 @SubscribeEvent
	 public static void registerItemBlockModel(ModelRegistryEvent event){
	     ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(grassBlock),0,new ModelResourceLocation(grassBlock.getRegistryName(),"inventory"));
	 }
}
