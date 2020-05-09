package com.github.ustc_zzzz.fmltutor.crafting;

import com.github.ustc_zzzz.fmltutor.block.BlockLoader;
import com.github.ustc_zzzz.fmltutor.item.ItemLoader;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class CraftingLoader {
	 public CraftingLoader(){
	        GameRegistry.addSmelting(BlockLoader.grassBlock, new ItemStack(Items.IRON_AXE), 0.5F);
	    }
	 @SubscribeEvent
	    public static void getVanillaFurnaceFuelValue(FurnaceFuelBurnTimeEvent event) {
	        if(event.getItemStack().getItem() == (ItemLoader.goldenEgg)){
	            event.setBurnTime(5000);
	        }
	    }
}
