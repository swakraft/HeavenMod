package com.ben.heaven.init;

import com.ben.heaven.Heaven;
import com.ben.heaven.References;
import com.ben.heaven.items.ItemBasic;
import com.ben.heaven.items.axe.ItemAxeCarbon;
import com.ben.heaven.items.axe.ItemAxeCopper;
import com.ben.heaven.items.axe.ItemAxePlatinium;
import com.ben.heaven.items.axe.ItemAxeSilver;
import com.ben.heaven.items.food.ItemFoodMod;
import com.ben.heaven.items.hoe.ItemHoeCarbon;
import com.ben.heaven.items.hoe.ItemHoeCopper;
import com.ben.heaven.items.hoe.ItemHoePlatinium;
import com.ben.heaven.items.hoe.ItemHoeSilver;
import com.ben.heaven.items.pickaxe.ItemPickaxeCarbon;
import com.ben.heaven.items.pickaxe.ItemPickaxeCopper;
import com.ben.heaven.items.pickaxe.ItemPickaxePlatinium;
import com.ben.heaven.items.pickaxe.ItemPickaxeSilver;
import com.ben.heaven.items.shovel.ItemShovelCarbon;
import com.ben.heaven.items.shovel.ItemShovelCopper;
import com.ben.heaven.items.shovel.ItemShovelPlatinium;
import com.ben.heaven.items.shovel.ItemShovelSilver;
import com.ben.heaven.items.sword.ItemSwordCarbon;
import com.ben.heaven.items.sword.ItemSwordCopper;
import com.ben.heaven.items.sword.ItemSwordLead;
import com.ben.heaven.items.sword.ItemSwordPlatinium;
import com.ben.heaven.items.sword.ItemSwordShiny;
import com.ben.heaven.items.sword.ItemSwordSilver;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = References.MODID)
public class ItemsMod {
	public static ToolMaterial copperMaterial = EnumHelper.addToolMaterial("copperMaterial", 2, 250, 2, 1, 10);
	public static ToolMaterial silverMaterial = EnumHelper.addToolMaterial("silverMaterial", 2, 300, 3, 2, 15);
	public static ToolMaterial leadMaterial = EnumHelper.addToolMaterial("leadMaterial", 2, 350, 2, 3, 20);
	public static ToolMaterial platiniumMaterial = EnumHelper.addToolMaterial("platiniumMaterial", 3, 700, 6, 3, 25);
	public static ToolMaterial carbonMaterial = EnumHelper.addToolMaterial("carbonMaterial", 2, 750, 10, 3, 25);
	public static ToolMaterial shinyMaterial = EnumHelper.addToolMaterial("shinyMaterial", 3, 800, 6, 3, 25);
	// name, harvestLevel, maxUses, efficiency, damage, enchantability

	public static Item 
			copper_ingot, silver_ingot, lead_ingot, tin_ingot, platinium_ingot, nickel_ingot, carbon_shard,
			mercure_ingot, magnetite_ingot, magic_gem, 
			iron_powder, gold_powder, diamond_powder, copper_powder, silver_powder, lead_powder, tin_powder, platinium_powder, 
			nickel_powder, carbon_powder, magnetite_powder, bronze_powder, steel_powder, invar_powder, carbonite_powder, shiny_powder,
			magic_powder, 
			copper_sword, silver_sword, lead_sword, platinium_sword, carbon_sword, shiny_sword, 
			copper_pickaxe, silver_pickaxe, carbon_pickaxe, platinium_pickaxe,
			copper_hoe, silver_hoe, carbon_hoe, platinium_hoe,
			copper_axe, silver_axe, carbon_axe, platinium_axe,
			copper_shovel, silver_shovel, carbon_shovel, platinium_shovel,
			bronze_ingot, steel_ingot, invar_ingot,	carbonite_ingot, shiny_ingot,
			findium_ingot, cadmium_ingot, uranium_ingot, 
			stone_stick, iron_stick, copper_wire, wire,	electronic_part, copper_gear, iron_gear, silver_gear, platinium_gear, copper_coil,
			battery, battery_part, electric_motor, stator, 
			blue_flask, pink_flask, green_flask, yellow_flask,
			cherry, olive, olive_cocktail;

	public static void init() {
		// ingots
		copper_ingot = new ItemBasic("copper_ingot").setCreativeTab(Heaven.tabHeavenOres);
		silver_ingot = new ItemBasic("silver_ingot").setCreativeTab(Heaven.tabHeavenOres);
		lead_ingot = new ItemBasic("lead_ingot").setCreativeTab(Heaven.tabHeavenOres);
		tin_ingot = new ItemBasic("tin_ingot").setCreativeTab(Heaven.tabHeavenOres);
		platinium_ingot = new ItemBasic("platinium_ingot").setCreativeTab(Heaven.tabHeavenOres);
		nickel_ingot = new ItemBasic("nickel_ingot").setCreativeTab(Heaven.tabHeavenOres);
		carbon_shard = new ItemBasic("carbon_shard").setCreativeTab(Heaven.tabHeavenOres);
		mercure_ingot = new ItemBasic("mercure_ingot").setCreativeTab(Heaven.tabHeavenOres);
		magnetite_ingot = new ItemBasic("magnetite_ingot").setCreativeTab(Heaven.tabHeavenOres);
		magic_gem = new ItemBasic("magic_gem").setCreativeTab(Heaven.tabHeavenOres);
		
		//ore powder
		iron_powder = new ItemBasic("iron_powder").setCreativeTab(Heaven.tabHeavenOres);
		gold_powder = new ItemBasic("gold_powder").setCreativeTab(Heaven.tabHeavenOres);
		diamond_powder = new ItemBasic("diamond_powder").setCreativeTab(Heaven.tabHeavenOres);
		copper_powder = new ItemBasic("copper_powder").setCreativeTab(Heaven.tabHeavenOres);
		silver_powder = new ItemBasic("silver_powder").setCreativeTab(Heaven.tabHeavenOres);
		lead_powder = new ItemBasic("lead_powder").setCreativeTab(Heaven.tabHeavenOres);
		tin_powder = new ItemBasic("tin_powder").setCreativeTab(Heaven.tabHeavenOres);
		platinium_powder = new ItemBasic("platinium_powder").setCreativeTab(Heaven.tabHeavenOres);
		nickel_powder = new ItemBasic("nickel_powder").setCreativeTab(Heaven.tabHeavenOres);
		carbon_powder = new ItemBasic("carbon_powder").setCreativeTab(Heaven.tabHeavenOres);
		magnetite_powder = new ItemBasic("magnetite_powder").setCreativeTab(Heaven.tabHeavenOres);
		bronze_powder = new ItemBasic("bronze_powder").setCreativeTab(Heaven.tabHeavenOres);
		steel_powder = new ItemBasic("steel_powder").setCreativeTab(Heaven.tabHeavenOres);
		invar_powder = new ItemBasic("invar_powder").setCreativeTab(Heaven.tabHeavenOres);
		carbonite_powder = new ItemBasic("carbonite_powder").setCreativeTab(Heaven.tabHeavenOres);
		shiny_powder = new ItemBasic("shiny_powder").setCreativeTab(Heaven.tabHeavenOres);
		magic_powder = new ItemBasic("magic_powder").setCreativeTab(Heaven.tabHeavenOres);
		
		// swords
		copper_sword = new ItemSwordCopper(ItemsMod.copperMaterial, "copper_sword")
				.setCreativeTab(Heaven.tabHeavenTools);
		silver_sword = new ItemSwordSilver(ItemsMod.silverMaterial, "silver_sword")
				.setCreativeTab(Heaven.tabHeavenTools);
		lead_sword = new ItemSwordLead(ItemsMod.leadMaterial, "lead_sword").setCreativeTab(Heaven.tabHeavenTools);
		platinium_sword = new ItemSwordPlatinium(ItemsMod.leadMaterial, "platinium_sword")
				.setCreativeTab(Heaven.tabHeavenTools);
		carbon_sword = new ItemSwordCarbon(ItemsMod.leadMaterial, "carbon_sword").setCreativeTab(Heaven.tabHeavenTools);
		shiny_sword = new ItemSwordShiny(ItemsMod.leadMaterial, "shiny_sword").setCreativeTab(Heaven.tabHeavenTools);
		
		//pickaxe
		copper_pickaxe = new ItemPickaxeCopper(ItemsMod.copperMaterial, "copper_pickaxe").setCreativeTab(Heaven.tabHeavenTools);
		silver_pickaxe = new ItemPickaxeSilver(ItemsMod.silverMaterial, "silver_pickaxe").setCreativeTab(Heaven.tabHeavenTools);
		carbon_pickaxe = new ItemPickaxeCarbon(ItemsMod.carbonMaterial, "carbon_pickaxe").setCreativeTab(Heaven.tabHeavenTools);
		platinium_pickaxe = new ItemPickaxePlatinium(ItemsMod.platiniumMaterial, "platinium_pickaxe").setCreativeTab(Heaven.tabHeavenTools);
		
		//hoe
		copper_hoe = new ItemHoeCopper(ItemsMod.copperMaterial, "copper_hoe").setCreativeTab(Heaven.tabHeavenTools);
		silver_hoe = new ItemHoeSilver(ItemsMod.silverMaterial, "silver_hoe").setCreativeTab(Heaven.tabHeavenTools);
		carbon_hoe = new ItemHoeCarbon(ItemsMod.carbonMaterial, "carbon_hoe").setCreativeTab(Heaven.tabHeavenTools);
		platinium_hoe = new ItemHoePlatinium(ItemsMod.platiniumMaterial, "platinium_hoe").setCreativeTab(Heaven.tabHeavenTools);
		
		//axe
		copper_axe = new ItemAxeCopper(ItemsMod.copperMaterial, 2, 4, "copper_axe").setCreativeTab(Heaven.tabHeavenTools);
		silver_axe = new ItemAxeSilver(ItemsMod.silverMaterial, 2, 4, "silver_axe").setCreativeTab(Heaven.tabHeavenTools);
		carbon_axe = new ItemAxeCarbon(ItemsMod.carbonMaterial, 3, 6, "carbon_axe").setCreativeTab(Heaven.tabHeavenTools);
		platinium_axe = new ItemAxePlatinium(ItemsMod.platiniumMaterial, 4, 4, "platinium_axe").setCreativeTab(Heaven.tabHeavenTools);

		//shovel
		copper_shovel = new ItemShovelCopper(ItemsMod.copperMaterial, "copper_shovel").setCreativeTab(Heaven.tabHeavenTools);
		silver_shovel = new ItemShovelSilver(ItemsMod.silverMaterial, "silver_shovel").setCreativeTab(Heaven.tabHeavenTools);
		carbon_shovel = new ItemShovelCarbon(ItemsMod.carbonMaterial, "carbon_shovel").setCreativeTab(Heaven.tabHeavenTools);
		platinium_shovel = new ItemShovelPlatinium(ItemsMod.platiniumMaterial, "platinium_shovel").setCreativeTab(Heaven.tabHeavenTools);
		
		// aliages
		bronze_ingot = new ItemBasic("bronze_ingot").setCreativeTab(Heaven.tabHeavenOres);
		steel_ingot = new ItemBasic("steel_ingot").setCreativeTab(Heaven.tabHeavenOres);
		invar_ingot = new ItemBasic("invar_ingot").setCreativeTab(Heaven.tabHeavenOres);
		carbonite_ingot = new ItemBasic("carbonite_ingot").setCreativeTab(Heaven.tabHeavenOres);
		shiny_ingot = new ItemBasic("shiny_ingot").setCreativeTab(Heaven.tabHeavenOres);

		// energies
		findium_ingot = new ItemBasic("findium_ingot").setCreativeTab(Heaven.tabHeavenOres);
		cadmium_ingot = new ItemBasic("cadmium_ingot").setCreativeTab(Heaven.tabHeavenOres);
		uranium_ingot = new ItemBasic("uranium_ingot").setCreativeTab(Heaven.tabHeavenOres);

		// items
		stone_stick = new ItemBasic("stone_stick").setCreativeTab(Heaven.tabHeavenMaterials);
		iron_stick = new ItemBasic("iron_stick").setCreativeTab(Heaven.tabHeavenMaterials);
		copper_wire = new ItemBasic("copper_wire").setCreativeTab(Heaven.tabHeavenMaterials);
		wire = new ItemBasic("wire").setCreativeTab(Heaven.tabHeavenMaterials);
		electronic_part = new ItemBasic("electronic_part").setCreativeTab(Heaven.tabHeavenMaterials);
		copper_gear = new ItemBasic("copper_gear").setCreativeTab(Heaven.tabHeavenMaterials);
		iron_gear = new ItemBasic("iron_gear").setCreativeTab(Heaven.tabHeavenMaterials);
		silver_gear = new ItemBasic("silver_gear").setCreativeTab(Heaven.tabHeavenMaterials);
		platinium_gear = new ItemBasic("platinium_gear").setCreativeTab(Heaven.tabHeavenMaterials);
		copper_coil = new ItemBasic("copper_coil").setCreativeTab(Heaven.tabHeavenMaterials);
		battery = new ItemBasic("battery").setCreativeTab(Heaven.tabHeavenMaterials);
		battery_part = new ItemBasic("battery_part").setCreativeTab(Heaven.tabHeavenMaterials);
		electric_motor = new ItemBasic("electric_motor").setCreativeTab(Heaven.tabHeavenMaterials);
		stator = new ItemBasic("stator").setCreativeTab(Heaven.tabHeavenMaterials);
		
		blue_flask = new ItemBasic("blue_flask").setCreativeTab(Heaven.tabHeavenNatural);
		pink_flask = new ItemBasic("pink_flask").setCreativeTab(Heaven.tabHeavenNatural);
		green_flask = new ItemBasic("green_flask").setCreativeTab(Heaven.tabHeavenNatural);
		yellow_flask = new ItemBasic("yellow_flask").setCreativeTab(Heaven.tabHeavenNatural);
		
		//nourriture
		cherry = new ItemFoodMod("cherry", 1, 2, false).setCreativeTab(Heaven.tabHeavenNuriture);
		olive = new ItemFoodMod("olive", 1, 2, false).setCreativeTab(Heaven.tabHeavenNuriture);
		olive_cocktail = new ItemFoodMod("olive_cocktail", 1, 2, false).setCreativeTab(Heaven.tabHeavenNuriture);
		
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		// ingots
		event.getRegistry().registerAll(copper_ingot, silver_ingot, lead_ingot, tin_ingot, platinium_ingot,
				nickel_ingot, carbon_shard, mercure_ingot, magnetite_ingot, magic_gem);
		//ore powder
		event.getRegistry().registerAll(iron_powder, gold_powder, diamond_powder, copper_powder, silver_powder, lead_powder, tin_powder, platinium_powder, 
				nickel_powder, carbon_powder, magnetite_powder, bronze_powder, steel_powder, invar_powder, carbonite_powder, shiny_powder, magic_powder);
		// swords
		event.getRegistry().registerAll(copper_sword, silver_sword, lead_sword, platinium_sword,
				carbon_sword, shiny_sword);
		//pickaxe
		event.getRegistry().registerAll(copper_pickaxe, silver_pickaxe, carbon_pickaxe, platinium_pickaxe);
		
		//hoe
		event.getRegistry().registerAll(copper_hoe, silver_hoe, carbon_hoe, platinium_hoe);
		
		//axe
		event.getRegistry().registerAll(copper_axe, silver_axe, carbon_axe, platinium_axe);
		
		//shovel
		event.getRegistry().registerAll(copper_shovel, silver_shovel, carbon_shovel, platinium_shovel);

		// alliages
		event.getRegistry().registerAll(bronze_ingot, steel_ingot, invar_ingot, carbonite_ingot, shiny_ingot);

		// energies
		event.getRegistry().registerAll(findium_ingot, cadmium_ingot, uranium_ingot);

		// items
		event.getRegistry().registerAll(stone_stick, iron_stick, copper_wire, wire, electronic_part, copper_gear, iron_gear,
				silver_gear, platinium_gear, copper_coil, battery, battery_part, electric_motor, stator);
		//natural
		event.getRegistry().registerAll(blue_flask, pink_flask, green_flask, yellow_flask);
		//nourriture
		event.getRegistry().registerAll(cherry, olive, olive_cocktail);
	}

	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		// ingots
		registerRender(copper_ingot);
		registerRender(silver_ingot);
		registerRender(lead_ingot);
		registerRender(tin_ingot);
		registerRender(platinium_ingot);
		registerRender(nickel_ingot);
		registerRender(carbon_shard);
		registerRender(mercure_ingot);
		registerRender(magnetite_ingot);
		registerRender(magic_gem);
		
		//ore powder
		registerRender(iron_powder);
		registerRender(gold_powder);
		registerRender(diamond_powder);
		registerRender(copper_powder);
		registerRender(silver_powder);
		registerRender(lead_powder);
		registerRender(tin_powder);
		registerRender(platinium_powder);
		registerRender(nickel_powder);
		registerRender(carbon_powder);
		registerRender(magnetite_powder);
		registerRender(bronze_powder);
		registerRender(steel_powder);
		registerRender(invar_powder);
		registerRender(carbonite_powder);
		registerRender(shiny_powder);
		registerRender(magic_powder);
		
		// swords
		registerRender(copper_sword);
		registerRender(silver_sword);
		registerRender(lead_sword);
		registerRender(platinium_sword);
		registerRender(carbon_sword);
		registerRender(shiny_sword);
		
		//pickaxe
		registerRender(copper_pickaxe);
		registerRender(silver_pickaxe);
		registerRender(carbon_pickaxe);
		registerRender(platinium_pickaxe);
				
		//hoe
		registerRender(copper_hoe);
		registerRender(silver_hoe);
		registerRender(carbon_hoe);
		registerRender(platinium_hoe);
		
		//axe
		registerRender(copper_axe);
		registerRender(silver_axe);
		registerRender(carbon_axe);
		registerRender(platinium_axe);
		
		//shovel
		registerRender(copper_shovel);
		registerRender(silver_shovel);
		registerRender(carbon_shovel);
		registerRender(platinium_shovel);

		// alliages
		registerRender(bronze_ingot);
		registerRender(steel_ingot);
		registerRender(invar_ingot);
		registerRender(carbonite_ingot);
		registerRender(shiny_ingot);

		// energies
		registerRender(findium_ingot);
		registerRender(cadmium_ingot);
		registerRender(uranium_ingot);

		// items
		registerRender(stone_stick);
		registerRender(iron_stick);
		registerRender(copper_wire);
		registerRender(wire);
		registerRender(electronic_part);
		registerRender(copper_gear);
		registerRender(iron_gear);
		registerRender(silver_gear);
		registerRender(platinium_gear);
		registerRender(copper_coil);
		registerRender(battery);
		registerRender(battery_part);
		registerRender(electric_motor);
		registerRender(stator);
		
		//natural
		registerRender(blue_flask);
		registerRender(pink_flask);
		registerRender(green_flask);
		registerRender(yellow_flask);
		
		//nourriture
		registerRender(cherry);
		registerRender(olive);
		registerRender(olive_cocktail);
	}

	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
