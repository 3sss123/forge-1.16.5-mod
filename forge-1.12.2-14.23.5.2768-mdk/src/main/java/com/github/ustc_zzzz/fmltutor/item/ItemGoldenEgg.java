package com.github.ustc_zzzz.fmltutor.item;

import com.github.ustc_zzzz.fmltutor.FMLTutor;
import com.github.ustc_zzzz.fmltutor.creativetab.CreativeTabsLoader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGoldenEgg extends Item{
	public ItemGoldenEgg()
    {
        this.setUnlocalizedName("goldenEgg");
        this.setCreativeTab(CreativeTabsLoader.tabFMLTutor);
    }
}
