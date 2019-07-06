package com.Radiation_iwnl.firstmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase {

	public RubyBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL); 
		// how long it takes to mine 
		setHardness(5.0F); 
		//explosion resistance
		setResistance(30.0F); 
		// mining level
		setHarvestLevel("pickaxe", 2);
		// how much light the block emits 
		setLightLevel(1.0F);  
		// how easy it is for light to pass through (window/glass)
		//setLightOpacity(1);
		// Makes Block like bedrock 
		//setBlockUnbreakable(); 
	} 

}
