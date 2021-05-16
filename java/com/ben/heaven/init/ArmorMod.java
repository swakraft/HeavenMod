package com.ben.heaven.init;

import com.ben.heaven.Heaven;
import com.ben.heaven.References;
import com.ben.heaven.items.armor.ArmorBasic;
import com.ben.heaven.items.armor.MinerChestplate;
import com.ben.heaven.items.armor.MinerHelmet;
import com.ben.heaven.items.armor.TravelBoots;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = References.MODID)
public class ArmorMod
{
	public static ArmorMaterial copperMaterial = EnumHelper.addArmorMaterial("armor_material_copper", References.MODID +":copper", 7, 
			new int[] {1,4,5,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);	
	public static ArmorMaterial silverMaterial = EnumHelper.addArmorMaterial("armor_material_silver", References.MODID +":silver", 7, 
			new int[] {1,4,5,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);	
	public static ArmorMaterial shinyMaterial = EnumHelper.addArmorMaterial("armor_material_shiny", References.MODID +":shiny", 7, 
			new int[] {1,4,5,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);	
	public static ArmorMaterial platiniumMaterial = EnumHelper.addArmorMaterial("armor_material_platinium", References.MODID +":platinium", 7, 
			new int[] {1,4,5,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);	
	public static ArmorMaterial carbonMaterial = EnumHelper.addArmorMaterial("armor_material_carbon", References.MODID +":carbon", 7, 
			new int[] {1,4,5,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);	
	public static ArmorMaterial mercureMaterial = EnumHelper.addArmorMaterial("armor_material_mercure", References.MODID +":mercure", 7, 
			new int[] {1,4,5,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	
	public static ArmorMaterial travelbootsMaterial = EnumHelper.addArmorMaterial("armor_material_travelboots", References.MODID +":travelboots", 7, 
			new int[] {1,4,5,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	public static ArmorMaterial minerMaterial = EnumHelper.addArmorMaterial("armor_material_miner", References.MODID +":miner", 7, 
			new int[] {1,4,5,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
		
	public static Item copper_helmet, copper_chestplate, copper_leggings, copper_boots, 
					silver_helmet, silver_chestplate, silver_leggings, silver_boots,
					shiny_helmet, shiny_chestplate, shiny_leggings, shiny_boots,
					platinium_helmet, platinium_chestplate, platinium_leggings, platinium_boots,
					carbon_helmet, carbon_chestplate, carbon_leggings, carbon_boots,
					mercure_helmet, mercure_chestplate, mercure_leggings, mercure_boots,
					travel_boots, miner_helmet, miner_chestplate;
					
	public static void init()
	{
		//copper
		copper_helmet = new ArmorBasic("copper_helmet", copperMaterial, 1, EntityEquipmentSlot.HEAD).setCreativeTab(Heaven.tabHeavenArmor);
		copper_chestplate = new ArmorBasic("copper_chestplate", copperMaterial, 1, EntityEquipmentSlot.CHEST).setCreativeTab(Heaven.tabHeavenArmor);
		copper_leggings = new ArmorBasic("copper_leggings", copperMaterial, 1, EntityEquipmentSlot.LEGS).setCreativeTab(Heaven.tabHeavenArmor);
		copper_boots = new ArmorBasic("copper_boots", copperMaterial, 1, EntityEquipmentSlot.FEET).setCreativeTab(Heaven.tabHeavenArmor);
		//silver
		silver_helmet = new ArmorBasic("silver_helmet", silverMaterial, 1, EntityEquipmentSlot.HEAD).setCreativeTab(Heaven.tabHeavenArmor);
		silver_chestplate = new ArmorBasic("silver_chestplate", silverMaterial, 1, EntityEquipmentSlot.CHEST).setCreativeTab(Heaven.tabHeavenArmor);
		silver_leggings = new ArmorBasic("silver_leggings", silverMaterial, 1, EntityEquipmentSlot.LEGS).setCreativeTab(Heaven.tabHeavenArmor);
		silver_boots = new ArmorBasic("silver_boots", silverMaterial, 1, EntityEquipmentSlot.FEET).setCreativeTab(Heaven.tabHeavenArmor);
		//shiny
		shiny_helmet = new ArmorBasic("shiny_helmet", shinyMaterial, 1, EntityEquipmentSlot.HEAD).setCreativeTab(Heaven.tabHeavenArmor);
		shiny_chestplate = new ArmorBasic("shiny_chestplate", shinyMaterial, 1, EntityEquipmentSlot.CHEST).setCreativeTab(Heaven.tabHeavenArmor);
		shiny_leggings = new ArmorBasic("shiny_leggings", shinyMaterial, 1, EntityEquipmentSlot.LEGS).setCreativeTab(Heaven.tabHeavenArmor);
		shiny_boots = new ArmorBasic("shiny_boots", shinyMaterial, 1, EntityEquipmentSlot.FEET).setCreativeTab(Heaven.tabHeavenArmor);
		//platinium
		platinium_helmet = new ArmorBasic("platinium_helmet", platiniumMaterial, 1, EntityEquipmentSlot.HEAD).setCreativeTab(Heaven.tabHeavenArmor);
		platinium_chestplate = new ArmorBasic("platinium_chestplate", platiniumMaterial, 1, EntityEquipmentSlot.CHEST).setCreativeTab(Heaven.tabHeavenArmor);
		platinium_leggings = new ArmorBasic("platinium_leggings", platiniumMaterial, 1, EntityEquipmentSlot.LEGS).setCreativeTab(Heaven.tabHeavenArmor);
		platinium_boots = new ArmorBasic("platinium_boots", platiniumMaterial, 1, EntityEquipmentSlot.FEET).setCreativeTab(Heaven.tabHeavenArmor);
		//carbon
		carbon_helmet = new ArmorBasic("carbon_helmet", carbonMaterial, 1, EntityEquipmentSlot.HEAD).setCreativeTab(Heaven.tabHeavenArmor);
		carbon_chestplate = new ArmorBasic("carbon_chestplate", carbonMaterial, 1, EntityEquipmentSlot.CHEST).setCreativeTab(Heaven.tabHeavenArmor);
		carbon_leggings = new ArmorBasic("carbon_leggings", carbonMaterial, 1, EntityEquipmentSlot.LEGS).setCreativeTab(Heaven.tabHeavenArmor);
		carbon_boots = new ArmorBasic("carbon_boots", carbonMaterial, 1, EntityEquipmentSlot.FEET).setCreativeTab(Heaven.tabHeavenArmor);
		//mercure
		mercure_helmet = new ArmorBasic("mercure_helmet", mercureMaterial, 1, EntityEquipmentSlot.HEAD).setCreativeTab(Heaven.tabHeavenArmor);
		mercure_chestplate = new ArmorBasic("mercure_chestplate", mercureMaterial, 1, EntityEquipmentSlot.CHEST).setCreativeTab(Heaven.tabHeavenArmor);
		mercure_leggings = new ArmorBasic("mercure_leggings", mercureMaterial, 1, EntityEquipmentSlot.LEGS).setCreativeTab(Heaven.tabHeavenArmor);
		mercure_boots = new ArmorBasic("mercure_boots", mercureMaterial, 1, EntityEquipmentSlot.FEET).setCreativeTab(Heaven.tabHeavenArmor);
		
		//spe
		travel_boots = new TravelBoots("travel_boots", travelbootsMaterial, 1, EntityEquipmentSlot.FEET).setCreativeTab(Heaven.tabHeavenArmor);
		miner_helmet = new MinerHelmet("miner_helmet", minerMaterial, 1, EntityEquipmentSlot.HEAD).setCreativeTab(Heaven.tabHeavenArmor);
		miner_chestplate = new MinerChestplate("miner_chestplate", minerMaterial, 1, EntityEquipmentSlot.CHEST).setCreativeTab(Heaven.tabHeavenArmor);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(copper_helmet, copper_chestplate, copper_leggings, copper_boots,
				silver_helmet, silver_chestplate, silver_leggings, silver_boots,
				shiny_helmet, shiny_chestplate, shiny_leggings, shiny_boots,
				platinium_helmet, platinium_chestplate, platinium_leggings, platinium_boots,
				carbon_helmet, carbon_chestplate, carbon_leggings, carbon_boots,
				mercure_helmet, mercure_chestplate, mercure_leggings, mercure_boots,
				travel_boots, miner_helmet, miner_chestplate);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event)
	{
		//copper
		registerRender(copper_helmet);
		registerRender(copper_chestplate);
		registerRender(copper_leggings);
		registerRender(copper_boots);
		//silver
		registerRender(silver_helmet);
		registerRender(silver_chestplate);
		registerRender(silver_leggings);
		registerRender(silver_boots);
		//shiny
		registerRender(shiny_helmet);
		registerRender(shiny_chestplate);
		registerRender(shiny_leggings);
		registerRender(shiny_boots);
		//platinium
		registerRender(platinium_helmet);
		registerRender(platinium_chestplate);
		registerRender(platinium_leggings);
		registerRender(platinium_boots);
		//carbon
		registerRender(carbon_helmet);
		registerRender(carbon_chestplate);
		registerRender(carbon_leggings);
		registerRender(carbon_boots);
		//mercure
		registerRender(mercure_helmet);
		registerRender(mercure_chestplate);
		registerRender(mercure_leggings);
		registerRender(mercure_boots);
		//spe
		registerRender(travel_boots);
		registerRender(miner_helmet);
		registerRender(miner_chestplate);
	}
	
	private static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
