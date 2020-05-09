package com.github.ustc_zzzz.fmltutor.creativetab;

import com.github.ustc_zzzz.fmltutor.item.ItemLoader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabsFMLTutor extends CreativeTabs{
	public CreativeTabsFMLTutor()
    {
        super("fmltutor");
    }

    @Override
    public ItemStack getTabIconItem()
    {
    	return new ItemStack(ItemLoader.goldenEgg);
    }
}
