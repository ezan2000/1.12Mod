package com.Radiation_iwnl.firstmod.init;

import java.util.ArrayList;
import java.util.List;

import com.Radiation_iwnl.firstmod.blocks.BlockBase;
import com.Radiation_iwnl.firstmod.blocks.RubyBlock;
import com.Radiation_iwnl.firstmod.blocks.RubyOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON); 
	public static final Block SAPPHIRE_BLOCK = new BlockBase("sapphire_block", Material.IRON);
	public static final Block POOP_BLOCK = new BlockBase("poop_block", Material.SPONGE);
	public static final Block BURNT_NETHER_BLOCK = new BlockBase("burnt_nether_block", Material.ROCK); 
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK); 
}
