package com.github.ustc_zzzz.fmltutor.creativetab;

import com.github.ustc_zzzz.fmltutor.item.ItemLoader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsFMLTutor extends CreativeTabs{
	 public CreativeTabsFMLTutor()
	    {
	        super("fmltutor");
	    }

	    @Override
	    public Item getTabIconItem()
	    {
	        return ItemLoader.goldenEgg;
	    }
}
