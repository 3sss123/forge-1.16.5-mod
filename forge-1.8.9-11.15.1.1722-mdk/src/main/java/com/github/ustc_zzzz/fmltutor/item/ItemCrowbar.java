package com.github.ustc_zzzz.fmltutor.item;

import com.github.ustc_zzzz.fmltutor.creativetab.CreativeTabsLoader;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class ItemCrowbar extends Item{
	public ItemCrowbar(){
		super();
		this.setUnlocalizedName("Crowbar");
		this.setCreativeTab(CreativeTabsLoader.tabFMLTutor);
		this.setMaxStackSize(1);
	}
	@Override
		public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase,EntityLivingBase par3EntityLivingBase) { 
		par1ItemStack.damageItem(1, par3EntityLivingBase);
    if (par3EntityLivingBase.worldObj.isRemote) {
        return true;
    }
    float Angle = (par3EntityLivingBase.rotationYaw/ 180F) * 3.141593F;
    float x = 3f * -MathHelper.sin(Angle);
    float y = 1f;
    float z = 3f * MathHelper.cos(Angle);
    par2EntityLivingBase.setVelocity(x, y, z);
    return true;
}
}
