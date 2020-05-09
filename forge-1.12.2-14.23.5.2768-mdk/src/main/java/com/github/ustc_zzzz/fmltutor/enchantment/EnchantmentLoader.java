package com.github.ustc_zzzz.fmltutor.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EnchantmentLoader {
	public static Enchantment fireBurn = new EnchantmentFireBurn();

    @SubscribeEvent
    public static void registerEnchantment(RegistryEvent.Register<Enchantment> event){
        event.getRegistry().register(fireBurn.setRegistryName("fmltutor:fire_Burn"));
    }
}
