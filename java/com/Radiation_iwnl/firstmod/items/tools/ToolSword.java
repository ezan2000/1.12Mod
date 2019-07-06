package com.Radiation_iwnl.firstmod.items.tools;

import com.Radiation_iwnl.firstmod.Main;
import com.Radiation_iwnl.firstmod.init.ModItems;
import com.Radiation_iwnl.firstmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {


	public ToolSword(String name, ToolMaterial material) 
	{ 
		super(material); 
		setUnlocalizedName(name); 
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT); 
		
		ModItems.ITEMS.add(this); 
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this,0,"inventory"); 
		
	}

}
