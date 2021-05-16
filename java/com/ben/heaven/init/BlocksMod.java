package com.ben.heaven.init;

import com.ben.heaven.Heaven;
import com.ben.heaven.References;
import com.ben.heaven.blocks.BlockBasic;
import com.ben.heaven.blocks.BlockFurniture;
import com.ben.heaven.blocks.BlockGrassMod;
import com.ben.heaven.blocks.BlockLeavesMod;
import com.ben.heaven.blocks.BlockLogMod;
import com.ben.heaven.blocks.BlockPlankMod;
import com.ben.heaven.blocks.BlockSaplingMod;
import com.ben.heaven.blocks.CadmiumBlockOre;
import com.ben.heaven.blocks.CarbonBlockOre;
import com.ben.heaven.blocks.CopperBlockOre;
import com.ben.heaven.blocks.FindiumBlockOre;
import com.ben.heaven.blocks.LavaDecoBlock;
import com.ben.heaven.blocks.LeadBlockOre;
import com.ben.heaven.blocks.MagicBlockOre;
import com.ben.heaven.blocks.MagicDirt;
import com.ben.heaven.blocks.MagicGrass;
import com.ben.heaven.blocks.MagnetiteBlockOre;
import com.ben.heaven.blocks.MercureBlockOre;
import com.ben.heaven.blocks.NickelBlockOre;
import com.ben.heaven.blocks.PlatiniumBlockOre;
import com.ben.heaven.blocks.ShinyBlockOre;
import com.ben.heaven.blocks.SilverBlockOre;
import com.ben.heaven.blocks.TinBlockOre;
import com.ben.heaven.blocks.UraniumBlockOre;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = References.MODID)
public class BlocksMod {
	public static Block copper_block, silver_block, lead_block, tin_block, platinium_block, nickel_block, carbon_block,
			mercure_block, magnetite_block, 
			copper_ore, silver_ore, lead_ore, tin_ore, platinium_ore, nickel_ore, carbon_ore, mercure_ore, findium_ore, 
			cadmium_ore, uranium_ore, shiny_ore, magnetite_ore, magic_ore, 
			lava_deco_block,
			magic_grass, magic_dirt, magic_stone,
			pink_magic_grass, blue_magic_grass, green_magic_grass, yellow_magic_grass, 
			pink_magic_tree_trunk, pink_magic_tree_leaves, pink_magic_tree_plank, pink_magic_tree_sapling, 
			yellow_magic_tree_trunk, yellow_magic_tree_leaves, yellow_magic_tree_plank, yellow_magic_tree_sapling, 
			blue_magic_tree_trunk, blue_magic_tree_leaves, blue_magic_tree_plank, blue_magic_tree_sapling, 
			green_magic_tree_trunk, green_magic_tree_leaves,green_magic_tree_plank, green_magic_tree_sapling,
			cherry_tree_trunk, cherry_tree_leaves, cherry_tree_plank, cherry_tree_sapling,
			oliver_tree_trunk, oliver_tree_leaves, oliver_tree_plank, oliver_tree_sapling			
			;
	

	public static void init() {
		// blocks
		copper_block = new BlockBasic("copper_block", Material.ROCK).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(3.0F).setResistance(5.0F);
		silver_block = new BlockBasic("silver_block", Material.ROCK).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(3.0F).setResistance(5.0F);
		lead_block = new BlockBasic("lead_block", Material.ROCK).setCreativeTab(Heaven.tabHeavenOres).setHardness(3.0F)
				.setResistance(5.0F);
		tin_block = new BlockBasic("tin_block", Material.ROCK).setCreativeTab(Heaven.tabHeavenOres).setHardness(3.0F)
				.setResistance(5.0F);
		platinium_block = new BlockBasic("platinium_block", Material.ROCK).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(3.0F).setResistance(5.0F);
		nickel_block = new BlockBasic("nickel_block", Material.ROCK).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(3.0F).setResistance(5.0F);
		carbon_block = new BlockBasic("carbon_block", Material.ROCK).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(3.0F).setResistance(5.0F);
		mercure_block = new BlockBasic("mercure_block", Material.ROCK).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(3.0F).setResistance(5.0F);
		magnetite_block = new BlockBasic("magnetite_block", Material.ROCK).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(3.0F).setResistance(5.0F);

		// ores
		copper_ore = new CopperBlockOre("copper_ore", Material.ROCK, 1).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(5.0F).setResistance(10.0F);
		silver_ore = new SilverBlockOre("silver_ore", Material.ROCK, 1).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(5.0F).setResistance(10.0F);
		lead_ore = new LeadBlockOre("lead_ore", Material.ROCK, 2).setCreativeTab(Heaven.tabHeavenOres).setHardness(5.0F)
				.setResistance(10.0F);
		tin_ore = new TinBlockOre("tin_ore", Material.ROCK, 2).setCreativeTab(Heaven.tabHeavenOres).setHardness(5.0F)
				.setResistance(10.0F);
		platinium_ore = new PlatiniumBlockOre("platinium_ore", Material.ROCK, 2).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(5.0F).setResistance(10.0F);
		nickel_ore = new NickelBlockOre("nickel_ore", Material.ROCK, 2).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(5.0F).setResistance(10.0F);
		carbon_ore = new CarbonBlockOre("carbon_ore", Material.ROCK, 2).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(5.0F).setResistance(10.0F);
		mercure_ore = new MercureBlockOre("mercure_ore", Material.ROCK, 2).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(5.0F).setResistance(10.0F);
		findium_ore = new FindiumBlockOre("findium_ore", Material.ROCK, 2).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(5.0F).setResistance(10.0F);
		cadmium_ore = new CadmiumBlockOre("cadmium_ore", Material.ROCK, 2).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(5.0F).setResistance(10.0F);
		uranium_ore = new UraniumBlockOre("uranium_ore", Material.ROCK, 2).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(5.0F).setResistance(10.0F);
		shiny_ore = new ShinyBlockOre("shiny_ore", Material.ROCK, 2).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(5.0F).setResistance(10.0F);
		magnetite_ore = new MagnetiteBlockOre("magnetite_ore", Material.ROCK, 2).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(5.0F).setResistance(10.0F);
		magic_ore = new MagicBlockOre("magic_ore", Material.ROCK, 2).setCreativeTab(Heaven.tabHeavenOres)
				.setHardness(5.0F).setResistance(10.0F);
		
		// decoblocks
		lava_deco_block = new LavaDecoBlock("lava_deco_block", Material.GLASS).setCreativeTab(Heaven.tabHeavenDeco)
				.setHardness(0.3F).setResistance(10.0F).setLightLevel(1.0F);

		// biomes
		magic_grass = new MagicGrass("magic_grass", Material.GRASS).setCreativeTab(Heaven.tabHeavenNatural)
				.setHardness(0.6F).setResistance(0.0F);
		magic_dirt = new MagicDirt("magic_dirt", Material.GRASS).setCreativeTab(Heaven.tabHeavenNatural)
				.setHardness(0.6F).setResistance(0.0F);
		magic_stone = new BlockBasic("magic_stone", Material.ROCK).setCreativeTab(Heaven.tabHeavenNatural)
				.setHardness(0.6F).setResistance(5.0F);
		pink_magic_grass = new BlockGrassMod("pink_magic_grass", Material.GROUND)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.0F).setResistance(0.0F);
		blue_magic_grass = new BlockGrassMod("blue_magic_grass", Material.GROUND)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.0F).setResistance(0.0F);
		green_magic_grass = new BlockGrassMod("green_magic_grass", Material.GROUND)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.0F).setResistance(0.0F);
		yellow_magic_grass = new BlockGrassMod("yellow_magic_grass", Material.GROUND)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.0F).setResistance(0.0F);

		// tree
		pink_magic_tree_trunk = new BlockLogMod("pink_magic_tree_trunk", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(2.0F).setResistance(0.0F);
		pink_magic_tree_leaves = new BlockLeavesMod("pink_magic_tree_leaves", Material.LEAVES)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.2F).setResistance(0.0F);
		pink_magic_tree_plank = new BlockPlankMod("pink_magic_tree_plank", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(2.0F).setResistance(5.0F);
		pink_magic_tree_sapling = new BlockSaplingMod("pink_magic_tree_sapling", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.0F).setResistance(0.0F);
		yellow_magic_tree_trunk = new BlockLogMod("yellow_magic_tree_trunk", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(2.0F).setResistance(0.0F);
		yellow_magic_tree_leaves = new BlockLeavesMod("yellow_magic_tree_leaves", Material.LEAVES)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.2F).setResistance(0.0F);
		yellow_magic_tree_plank = new BlockPlankMod("yellow_magic_tree_plank", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(2.0F).setResistance(5.0F);
		yellow_magic_tree_sapling = new BlockSaplingMod("yellow_magic_tree_sapling", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.0F).setResistance(0.0F);
		blue_magic_tree_trunk = new BlockLogMod("blue_magic_tree_trunk", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(2.0F).setResistance(0.0F);
		blue_magic_tree_leaves = new BlockLeavesMod("blue_magic_tree_leaves", Material.LEAVES)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.2F).setResistance(0.0F);
		blue_magic_tree_plank = new BlockPlankMod("blue_magic_tree_plank", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(2.0F).setResistance(5.0F);
		blue_magic_tree_sapling = new BlockSaplingMod("blue_magic_tree_sapling", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.0F).setResistance(0.0F);
		green_magic_tree_trunk = new BlockLogMod("green_magic_tree_trunk", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(2.0F).setResistance(0.0F);
		green_magic_tree_leaves = new BlockLeavesMod("green_magic_tree_leaves", Material.LEAVES)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.2F).setResistance(0.0F);
		green_magic_tree_plank = new BlockPlankMod("green_magic_tree_plank", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(2.0F).setResistance(5.0F);
		green_magic_tree_sapling = new BlockSaplingMod("green_magic_tree_sapling", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.0F).setResistance(0.0F);
		cherry_tree_trunk = new BlockLogMod("cherry_tree_trunk", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(2.0F).setResistance(0.0F);
		cherry_tree_leaves = new BlockLeavesMod("cherry_tree_leaves", Material.LEAVES)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.2F).setResistance(0.0F);
		cherry_tree_plank = new BlockPlankMod("cherry_tree_plank", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(2.0F).setResistance(5.0F);
		cherry_tree_sapling = new BlockSaplingMod("cherry_tree_sapling", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.0F).setResistance(0.0F);
		oliver_tree_trunk = new BlockLogMod("oliver_tree_trunk", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(2.0F).setResistance(0.0F);
		oliver_tree_leaves = new BlockLeavesMod("oliver_tree_leaves", Material.LEAVES)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.2F).setResistance(0.0F);
		oliver_tree_plank = new BlockPlankMod("oliver_tree_plank", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(2.0F).setResistance(5.0F);
		oliver_tree_sapling = new BlockSaplingMod("oliver_tree_sapling", Material.WOOD)
				.setCreativeTab(Heaven.tabHeavenNatural).setHardness(0.0F).setResistance(0.0F);
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		// blocks
		event.getRegistry().registerAll(copper_block, silver_block, lead_block, tin_block, platinium_block,
				nickel_block, carbon_block, mercure_block, magnetite_block);

		// ores
		event.getRegistry().registerAll(copper_ore, silver_ore, lead_ore, tin_ore, platinium_ore, nickel_ore,
				carbon_ore, mercure_ore, findium_ore, cadmium_ore, uranium_ore, shiny_ore, magnetite_ore, magic_ore);

		// decoblocks
		event.getRegistry().registerAll(lava_deco_block);


		// biomes
		event.getRegistry().registerAll(magic_grass, magic_dirt, magic_stone, blue_magic_grass, green_magic_grass, yellow_magic_grass,
				pink_magic_grass);

		// tree
		event.getRegistry().registerAll(pink_magic_tree_trunk, pink_magic_tree_leaves, pink_magic_tree_plank,
				pink_magic_tree_sapling, yellow_magic_tree_trunk, yellow_magic_tree_leaves, yellow_magic_tree_plank,
				yellow_magic_tree_sapling, blue_magic_tree_trunk, blue_magic_tree_leaves, blue_magic_tree_plank,
				blue_magic_tree_sapling, green_magic_tree_trunk, green_magic_tree_leaves, green_magic_tree_plank,
				green_magic_tree_sapling, cherry_tree_trunk, cherry_tree_leaves, cherry_tree_plank, cherry_tree_sapling,
				oliver_tree_trunk, oliver_tree_leaves, oliver_tree_plank, oliver_tree_sapling);
	}

	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(

				// blocks
				new ItemBlock(copper_block).setRegistryName(copper_block.getRegistryName()),
				new ItemBlock(silver_block).setRegistryName(silver_block.getRegistryName()),
				new ItemBlock(lead_block).setRegistryName(lead_block.getRegistryName()),
				new ItemBlock(tin_block).setRegistryName(tin_block.getRegistryName()),
				new ItemBlock(platinium_block).setRegistryName(platinium_block.getRegistryName()),
				new ItemBlock(nickel_block).setRegistryName(nickel_block.getRegistryName()),
				new ItemBlock(carbon_block).setRegistryName(carbon_block.getRegistryName()),
				new ItemBlock(mercure_block).setRegistryName(mercure_block.getRegistryName()),
				new ItemBlock(magnetite_block).setRegistryName(magnetite_block.getRegistryName()),

				// ores
				new ItemBlock(copper_ore).setRegistryName(copper_ore.getRegistryName()),
				new ItemBlock(silver_ore).setRegistryName(silver_ore.getRegistryName()),
				new ItemBlock(lead_ore).setRegistryName(lead_ore.getRegistryName()),
				new ItemBlock(tin_ore).setRegistryName(tin_ore.getRegistryName()),
				new ItemBlock(platinium_ore).setRegistryName(platinium_ore.getRegistryName()),
				new ItemBlock(nickel_ore).setRegistryName(nickel_ore.getRegistryName()),
				new ItemBlock(carbon_ore).setRegistryName(carbon_ore.getRegistryName()),
				new ItemBlock(mercure_ore).setRegistryName(mercure_ore.getRegistryName()),
				new ItemBlock(findium_ore).setRegistryName(findium_ore.getRegistryName()),
				new ItemBlock(cadmium_ore).setRegistryName(cadmium_ore.getRegistryName()),
				new ItemBlock(uranium_ore).setRegistryName(uranium_ore.getRegistryName()),
				new ItemBlock(shiny_ore).setRegistryName(shiny_ore.getRegistryName()),
				new ItemBlock(magnetite_ore).setRegistryName(magnetite_ore.getRegistryName()),
				new ItemBlock(magic_ore).setRegistryName(magic_ore.getRegistryName()),

				// decoblock
				new ItemBlock(lava_deco_block).setRegistryName(lava_deco_block.getRegistryName()),
				
				// biomes
				new ItemBlock(magic_grass).setRegistryName(magic_grass.getRegistryName()),
				new ItemBlock(magic_dirt).setRegistryName(magic_dirt.getRegistryName()),
				new ItemBlock(magic_stone).setRegistryName(magic_stone.getRegistryName()),
				new ItemBlock(pink_magic_grass).setRegistryName(pink_magic_grass.getRegistryName()),
				new ItemBlock(blue_magic_grass).setRegistryName(blue_magic_grass.getRegistryName()),
				new ItemBlock(green_magic_grass).setRegistryName(green_magic_grass.getRegistryName()),
				new ItemBlock(yellow_magic_grass).setRegistryName(yellow_magic_grass.getRegistryName()),

				// tree
				new ItemBlock(pink_magic_tree_trunk).setRegistryName(pink_magic_tree_trunk.getRegistryName()),
				new ItemBlock(pink_magic_tree_leaves).setRegistryName(pink_magic_tree_leaves.getRegistryName()),
				new ItemBlock(pink_magic_tree_plank).setRegistryName(pink_magic_tree_plank.getRegistryName()),
				new ItemBlock(pink_magic_tree_sapling).setRegistryName(pink_magic_tree_sapling.getRegistryName()),
				new ItemBlock(yellow_magic_tree_trunk).setRegistryName(yellow_magic_tree_trunk.getRegistryName()),
				new ItemBlock(yellow_magic_tree_leaves).setRegistryName(yellow_magic_tree_leaves.getRegistryName()),
				new ItemBlock(yellow_magic_tree_plank).setRegistryName(yellow_magic_tree_plank.getRegistryName()),
				new ItemBlock(yellow_magic_tree_sapling).setRegistryName(yellow_magic_tree_sapling.getRegistryName()),
				new ItemBlock(blue_magic_tree_trunk).setRegistryName(blue_magic_tree_trunk.getRegistryName()),
				new ItemBlock(blue_magic_tree_leaves).setRegistryName(blue_magic_tree_leaves.getRegistryName()),
				new ItemBlock(blue_magic_tree_plank).setRegistryName(blue_magic_tree_plank.getRegistryName()),
				new ItemBlock(blue_magic_tree_sapling).setRegistryName(blue_magic_tree_sapling.getRegistryName()),
				new ItemBlock(green_magic_tree_trunk).setRegistryName(green_magic_tree_trunk.getRegistryName()),
				new ItemBlock(green_magic_tree_leaves).setRegistryName(green_magic_tree_leaves.getRegistryName()),
				new ItemBlock(green_magic_tree_plank).setRegistryName(green_magic_tree_plank.getRegistryName()),
				new ItemBlock(green_magic_tree_sapling).setRegistryName(green_magic_tree_sapling.getRegistryName()),
				new ItemBlock(cherry_tree_trunk).setRegistryName(cherry_tree_trunk.getRegistryName()),
				new ItemBlock(cherry_tree_leaves).setRegistryName(cherry_tree_leaves.getRegistryName()),
				new ItemBlock(cherry_tree_plank).setRegistryName(cherry_tree_plank.getRegistryName()),
				new ItemBlock(cherry_tree_sapling).setRegistryName(cherry_tree_sapling.getRegistryName()),
				new ItemBlock(oliver_tree_trunk).setRegistryName(oliver_tree_trunk.getRegistryName()),
				new ItemBlock(oliver_tree_leaves).setRegistryName(oliver_tree_leaves.getRegistryName()),
				new ItemBlock(oliver_tree_plank).setRegistryName(oliver_tree_plank.getRegistryName()),
				new ItemBlock(oliver_tree_sapling).setRegistryName(oliver_tree_sapling.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		// blocks
		registerRender(Item.getItemFromBlock(copper_block));
		registerRender(Item.getItemFromBlock(silver_block));
		registerRender(Item.getItemFromBlock(lead_block));
		registerRender(Item.getItemFromBlock(tin_block));
		registerRender(Item.getItemFromBlock(platinium_block));
		registerRender(Item.getItemFromBlock(nickel_block));
		registerRender(Item.getItemFromBlock(carbon_block));
		registerRender(Item.getItemFromBlock(mercure_block));
		registerRender(Item.getItemFromBlock(magnetite_block));

		// ores
		registerRender(Item.getItemFromBlock(copper_ore));
		registerRender(Item.getItemFromBlock(silver_ore));
		registerRender(Item.getItemFromBlock(lead_ore));
		registerRender(Item.getItemFromBlock(tin_ore));
		registerRender(Item.getItemFromBlock(platinium_ore));
		registerRender(Item.getItemFromBlock(nickel_ore));
		registerRender(Item.getItemFromBlock(carbon_ore));
		registerRender(Item.getItemFromBlock(mercure_ore));
		registerRender(Item.getItemFromBlock(findium_ore));
		registerRender(Item.getItemFromBlock(cadmium_ore));
		registerRender(Item.getItemFromBlock(uranium_ore));
		registerRender(Item.getItemFromBlock(shiny_ore));
		registerRender(Item.getItemFromBlock(magnetite_ore));
		registerRender(Item.getItemFromBlock(magic_ore));
		
		// decoblocks
		registerRender(Item.getItemFromBlock(lava_deco_block));
		
		// biomes
		registerRender(Item.getItemFromBlock(magic_grass));
		registerRender(Item.getItemFromBlock(magic_dirt));
		registerRender(Item.getItemFromBlock(magic_stone));
		registerRender(Item.getItemFromBlock(pink_magic_grass));
		registerRender(Item.getItemFromBlock(blue_magic_grass));
		registerRender(Item.getItemFromBlock(green_magic_grass));
		registerRender(Item.getItemFromBlock(yellow_magic_grass));
		
		// tree
		registerRender(Item.getItemFromBlock(pink_magic_tree_trunk));
		registerRender(Item.getItemFromBlock(pink_magic_tree_leaves));
		registerRender(Item.getItemFromBlock(pink_magic_tree_plank));
		registerRender(Item.getItemFromBlock(pink_magic_tree_sapling));
		registerRender(Item.getItemFromBlock(yellow_magic_tree_trunk));
		registerRender(Item.getItemFromBlock(yellow_magic_tree_leaves));
		registerRender(Item.getItemFromBlock(yellow_magic_tree_plank));
		registerRender(Item.getItemFromBlock(yellow_magic_tree_sapling));
		registerRender(Item.getItemFromBlock(blue_magic_tree_trunk));
		registerRender(Item.getItemFromBlock(blue_magic_tree_leaves));
		registerRender(Item.getItemFromBlock(blue_magic_tree_plank));
		registerRender(Item.getItemFromBlock(blue_magic_tree_sapling));
		registerRender(Item.getItemFromBlock(green_magic_tree_trunk));
		registerRender(Item.getItemFromBlock(green_magic_tree_leaves));
		registerRender(Item.getItemFromBlock(green_magic_tree_plank));
		registerRender(Item.getItemFromBlock(green_magic_tree_sapling));
		registerRender(Item.getItemFromBlock(cherry_tree_trunk));
		registerRender(Item.getItemFromBlock(cherry_tree_leaves));
		registerRender(Item.getItemFromBlock(cherry_tree_plank));
		registerRender(Item.getItemFromBlock(cherry_tree_sapling));
		registerRender(Item.getItemFromBlock(oliver_tree_trunk));
		registerRender(Item.getItemFromBlock(oliver_tree_leaves));
		registerRender(Item.getItemFromBlock(oliver_tree_plank));
		registerRender(Item.getItemFromBlock(oliver_tree_sapling));

	}

	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}