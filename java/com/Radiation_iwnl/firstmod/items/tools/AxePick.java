package com.Radiation_iwnl.firstmod.items.tools;

import java.util.Set;

import com.Radiation_iwnl.firstmod.Main;
import com.Radiation_iwnl.firstmod.init.ModItems;
import com.Radiation_iwnl.firstmod.util.IHasModel;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class AxePick extends ItemPickaxe implements IHasModel  {

	public AxePick(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name); 
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS); 
		ModItems.ITEMS.add(this);  
		
	}
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
	return ImmutableSet.of("pickaxe", "axe");
	}
	 @Override
	 public boolean canHarvestBlock(IBlockState block) {
	 return EFFECTIVE_ON.contains(block.getBlock()) ? true : super.canHarvestBlock(block);
	 }
	 public float getDestroySpeed(ItemStack stack, IBlockState state) {Material material = state.getMaterial();
	 if( material == Material.WOOD && material == Material.PLANTS && material == Material.VINE) {
	 return this.efficiency;
	 }
	  
	 return EFFECTIVE_ON.contains(state.getBlock()) ? this.efficiency : super.getDestroySpeed(stack, state);
	 }
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this,0,"inventory");  
		
	}
}
