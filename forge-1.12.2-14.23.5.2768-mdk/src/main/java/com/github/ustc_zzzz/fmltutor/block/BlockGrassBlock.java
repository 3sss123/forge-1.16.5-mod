package com.github.ustc_zzzz.fmltutor.block;

import com.github.ustc_zzzz.fmltutor.creativetab.CreativeTabsLoader;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGrassBlock extends Block{
	public BlockGrassBlock()
    {
        super(Material.GROUND);
        this.setUnlocalizedName("grassBlock");
        this.setHardness(0.5F);
        this.setSoundType(blockSoundType);
        this.setCreativeTab(CreativeTabsLoader.tabFMLTutor);
    }
}
