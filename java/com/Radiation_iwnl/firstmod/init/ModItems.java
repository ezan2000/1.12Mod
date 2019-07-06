package com.Radiation_iwnl.firstmod.init;

import java.util.ArrayList;
import java.util.List;

import com.Radiation_iwnl.firstmod.items.ItemBase;
import com.Radiation_iwnl.firstmod.items.armor.ArmorBase;
import com.Radiation_iwnl.firstmod.items.armor.OpArmorBase;
import com.Radiation_iwnl.firstmod.items.food.FoodBase;
import com.Radiation_iwnl.firstmod.items.food.FoodEffectBase;
import com.Radiation_iwnl.firstmod.items.tools.AxePick;
import com.Radiation_iwnl.firstmod.items.tools.ToolAxe;
import com.Radiation_iwnl.firstmod.items.tools.ToolHoe;
import com.Radiation_iwnl.firstmod.items.tools.ToolPickaxe;
import com.Radiation_iwnl.firstmod.items.tools.ToolSpade;
import com.Radiation_iwnl.firstmod.items.tools.ToolSword;
import com.Radiation_iwnl.firstmod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>(); 
	//materials 
		//tools
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 250, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_EMERALD = EnumHelper.addToolMaterial("material_emerald", 3, 2000, 11.0F, 8.0F, 15);
		//armor 
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 15, 
			new int[]{4, 7, 10, 4}, 10,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SAPPHIRE = EnumHelper.addArmorMaterial("armor_material_sapphire", Reference.MOD_ID + ":sapphire", 15, 
			new int[]{4, 7, 10, 4}, 10,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F); 
	public static final ArmorMaterial ARMOR_MATERIAL_EMERALD = EnumHelper.addArmorMaterial("armor_material_emerald", Reference.MOD_ID+ ":emerald", 20, 
			new int[]{6, 9, 12, 6}, 10,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F); 
	
	//items 
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item SAPPHIRE = new ItemBase("sapphire"); 
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	public static final Item POOP = new ItemBase("poop");
	public static final Item MONEY = new ItemBase("money");
	public static final Item BURNT_NETHER = new ItemBase("burnt_nether"); 
	
	//Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword",MATERIAL_RUBY);  
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY); 
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pick",MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe",MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY); 
	
	public static final ItemSword SAPPHIRE_SWORD = new ToolSword("sapphire_sword",MATERIAL_RUBY); 
	public static final ItemSpade SAPPHIRE_SHOVEL = new ToolSpade("sapphire_shovel", MATERIAL_RUBY); 
	public static final ItemPickaxe SAPPHIRE_PICKAXE = new ToolPickaxe("sapphire_pickaxe", MATERIAL_RUBY); 
	public static final ItemAxe SAPPHIRE_AXE = new ToolAxe("sapphire_axe", MATERIAL_RUBY);     
	public static final ItemHoe SAPPHIRE_HOE = new ToolHoe("sapphire_hoe", MATERIAL_RUBY); 
	
	public static final ItemSword EMERALD_SWORD = new ToolSword("emerald_sword",MATERIAL_EMERALD); 
	public static final ItemSpade EMERALD_SHOVEL = new ToolSpade("emerald_shovel",MATERIAL_EMERALD);  
	public static final ItemAxe EMERALD_AXE = new ToolAxe("emerald_axe",MATERIAL_EMERALD); 
	public static final ItemHoe EMERALD_HOE = new ToolHoe("emerald_hoe",MATERIAL_EMERALD); 
	  
	public static final ItemPickaxe PAXEL = new AxePick("paxel",MATERIAL_EMERALD);  
	
	//Armor
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet",ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);  
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chest",ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST); 
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings",ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots",ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET); 
	
	public static final Item SAPPHIRE_HELMET = new ArmorBase("sapphire_helmet",ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.HEAD); 
	public static final Item SAPPHIRE_CHESTPLATE = new ArmorBase("sapphire_chest",ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGGINGS = new ArmorBase("sapphire_leggings",ARMOR_MATERIAL_SAPPHIRE, 2, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS = new ArmorBase("sapphire_boots",ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.FEET);  
	
	public static final Item EMERALD_HELMET = new OpArmorBase("emerald_helmet",ARMOR_MATERIAL_EMERALD,1,EntityEquipmentSlot.HEAD, new PotionEffect(MobEffects.WATER_BREATHING,60,2,false,true),
			new PotionEffect(MobEffects.NIGHT_VISION,60,1,false,true)); 
	public static final Item EMERALD_CHESTPLATE = new OpArmorBase("emerald_chest",ARMOR_MATERIAL_EMERALD,1,EntityEquipmentSlot.CHEST, new PotionEffect(MobEffects.RESISTANCE,60,3,false,true),
			new PotionEffect(MobEffects.STRENGTH,60,4,false,true)); 
	public static final Item EMERALD_LEGGINGS = new OpArmorBase("emerald_leggings",ARMOR_MATERIAL_EMERALD,2,EntityEquipmentSlot.LEGS, new PotionEffect(MobEffects.JUMP_BOOST,60,1,false,true),
			new PotionEffect(MobEffects.FIRE_RESISTANCE,60,3,false,true)); 
	public static final Item EMERALD_BOOTS = new OpArmorBase("emerald_boots",ARMOR_MATERIAL_EMERALD,1,EntityEquipmentSlot.FEET, new PotionEffect(MobEffects.SPEED,60,3,false,true),
			new PotionEffect(MobEffects.REGENERATION,60,1,false,true)); 
	
	//Fo
	//public static final Item EVIL_APPLE = new FoodBase("evil_apple", 4, 2.4f,false );   
	public static final Item EVIL_APPLE = new FoodEffectBase("evil_apple", 4, 2.4f,false, new PotionEffect(MobEffects.POISON, (60*20), 0, false,true));
} 
