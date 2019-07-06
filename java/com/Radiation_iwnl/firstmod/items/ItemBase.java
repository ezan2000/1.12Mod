package com.Radiation_iwnl.firstmod.items;

import com.Radiation_iwnl.firstmod.Main;
import com.Radiation_iwnl.firstmod.init.ModItems;
import com.Radiation_iwnl.firstmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) 
	{
		setUnlocalizedName(name); 
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS); 
		
		ModItems.ITEMS.add(this); 
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this,0,"inventory"); 
		
	}

}
