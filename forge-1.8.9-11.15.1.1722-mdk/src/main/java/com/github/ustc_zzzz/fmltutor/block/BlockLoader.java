package com.github.ustc_zzzz.fmltutor.block;


import com.google.common.base.Function;

import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {
	public static Block grassBlock = new BlockGrassBlock();
	public static BlockFluidClassic fluidMercury=new BlockFluidMercury();
	public static Block metalFurnace=new BlockMetalFurnace();
    public BlockLoader(FMLPreInitializationEvent event)
    {
        register(grassBlock, "grass_block");
        register(fluidMercury, "fluid_mercury");
        register(metalFurnace, new ItemMultiTexture(metalFurnace, metalFurnace, new Function<ItemStack, String>()
        {
            @Override
            public String apply(ItemStack input)
            {
                return BlockMetalFurnace.EnumMaterial.values()[input.getMetadata() >> 3].getName();
            }
        }), "metal_furnace");
    }
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(grassBlock);
    }
    private static void register(Block block, String name)
    {
        GameRegistry.registerBlock(block.setRegistryName(name));
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block)
    {
        ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
        registerRender(block, 0, block.getRegistryName());
    }
    private static void register(Block block, ItemBlock itemBlock, String name)
    {
        GameRegistry.registerBlock(block.setRegistryName(name), (Class<? extends ItemBlock>) null);
        GameRegistry.registerItem(itemBlock.setRegistryName(name));
        GameData.getBlockItemMap().put(block, itemBlock);
		registerRender(metalFurnace, 0, "iron_furnace");
        registerRender(metalFurnace, 8, "gold_furnace");
    }
    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block, int meta, String name)
    {
        ModelResourceLocation model = new ModelResourceLocation(name, "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, model);
    }

    
}
