package com.Radiation_iwnl.firstmod.blocks;

import java.util.Random;

import com.Radiation_iwnl.firstmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RubyOre extends BlockBase {
	
	public RubyOre(String name, Material material) {
		super(name,material); 
		setSoundType(SoundType.METAL); 
		setHardness(5.0f);  
		setResistance(15.0f); 
		setHarvestLevel("pickaxe", 3); 
		
	}
	
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.RUBY; 
				//item 
	}
	//@Override 
	//public int quantityDropped(Random rand) {
		//int max = 4;
		//int min = 1; 
		//return rand.nextInt(max)+min; 
}

