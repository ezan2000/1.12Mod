package com.Radiation_iwnl.firstmod.items.tools;

import com.Radiation_iwnl.firstmod.Main;
import com.Radiation_iwnl.firstmod.init.ModItems;
import com.Radiation_iwnl.firstmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {
	
	public ToolPickaxe(String name, ToolMaterial material) 
	{ 
		super(material); 
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
