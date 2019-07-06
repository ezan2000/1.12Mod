package com.Radiation_iwnl.firstmod.items.armor;

import com.Radiation_iwnl.firstmod.Main;
import com.Radiation_iwnl.firstmod.init.ModItems;
import com.Radiation_iwnl.firstmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class OpArmorBase extends ItemArmor implements IHasModel {
	
	PotionEffect effect; 
	PotionEffect effect2; 
	public OpArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn,PotionEffect effect,PotionEffect effect2) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name); 
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);  
		this.effect = effect; 
		this.effect2 = effect2; 
		ModItems.ITEMS.add(this); 
	}
	@Override 
	public void registerModels() {
		Main.proxy.registerItemRenderer(this,0,"inventory"); 
	}
	
	@Override
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
	
	    player.addPotionEffect(new PotionEffect(effect.getPotion(),effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(),effect.doesShowParticles()));
		player.addPotionEffect(new PotionEffect(effect2.getPotion(),effect2.getDuration(), effect2.getAmplifier(), effect2.getIsAmbient(),effect2.doesShowParticles()));

	}
	

}
