package com.github.ustc_zzzz.fmltutor.item;

import com.github.ustc_zzzz.fmltutor.creativetab.CreativeTabsLoader;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemRedstoneApple extends ItemFood{
	 public ItemRedstoneApple()
	    {
	        super(4, 0.6F, true);
	        this.setAlwaysEdible();
	        this.setUnlocalizedName("redstoneApple");
	        this.setCreativeTab(CreativeTabsLoader.tabFMLTutor);
	        this.setPotionEffect(Potion.absorption.id, 10, 1, 1.0F);
	    }
}
