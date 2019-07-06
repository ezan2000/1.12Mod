package com.Radiation_iwnl.firstmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	//must initailize in main file 
	public static void init() {
		GameRegistry.addSmelting(ModItems.RUBY, new ItemStack(ModBlocks.RUBY_BLOCK, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.RUBY_BLOCK, new ItemStack(Blocks.DIAMOND_BLOCK, 2), 3.0f);
		GameRegistry.addSmelting(Items.NETHERBRICK, new ItemStack(ModItems.BURNT_NETHER, 1), 1f); 
		
	}

}
