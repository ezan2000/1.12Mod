package com.Radiation_iwnl.firstmod.items.food;

import com.Radiation_iwnl.firstmod.Main;
import com.Radiation_iwnl.firstmod.init.ModItems;
import com.Radiation_iwnl.firstmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel 
{
	
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
		super(amount,saturation,isAnimalFood); 
		setUnlocalizedName(name); 
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD); 
		
		ModItems.ITEMS.add(this); 
		
		
		
	}
	@Override 
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	} 
}
