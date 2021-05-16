package com.ben.heaven;

import com.ben.heaven.init.ArmorMod;
import com.ben.heaven.init.BiomeInit;
import com.ben.heaven.init.BlocksMod;
import com.ben.heaven.init.EntityInit;
import com.ben.heaven.init.ItemsMod;
import com.ben.heaven.proxy.ServerProxy;
import com.ben.heaven.recipes.SmeltingRecipesMod;
import com.ben.heaven.util.handlers.RenderHandler;
import com.ben.heaven.world.WorldGenMinableHeaven;
import com.ben.heaven.world.WorldGenNaturalHeaven;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.MINECRAFT_VERSION)
public class Heaven 
{
	
    @Instance(References.MODID)
    public static Heaven instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY, modId = References.MODID)
	public static ServerProxy proxy;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		BlocksMod.init();
		ItemsMod.init();
		ArmorMod.init();
		
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.register();
		SmeltingRecipesMod.init();
		GameRegistry.registerWorldGenerator(new WorldGenMinableHeaven(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenNaturalHeaven(), 0);
		
		BiomeInit.registerBiome();
		
		
     
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event)
	{
		
	}
	
	public static CreativeTabs tabHeavenDeco = new CreativeTabs("tabHeavenDeco")
	{
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem()
		{
			return new ItemStack(BlocksMod.lava_deco_block);
		}
		
	};
	
	public static CreativeTabs tabHeavenOres = new CreativeTabs("tabHeavenOres")
	{
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem()
		{
			return new ItemStack(BlocksMod.shiny_ore);
		}
		
	};
	
	public static CreativeTabs tabHeavenTools = new CreativeTabs("tabHeavenTools")
	{
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem()
		{
			return new ItemStack(ItemsMod.shiny_sword);
		}
		
	};
	
	public static CreativeTabs tabHeavenMaterials = new CreativeTabs("tabHeavenMaterials")
	{
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem()
		{
			return new ItemStack(ItemsMod.electronic_part);
		}
	};
	
	public static CreativeTabs tabHeavenArmor = new CreativeTabs("tabHeavenArmor")
	{
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem()
		{
			return new ItemStack(ArmorMod.mercure_chestplate);
		}
	};
	
	public static CreativeTabs tabHeavenNatural = new CreativeTabs("tabHeavenNatural")
	{
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem()
		{
			return new ItemStack(BlocksMod.pink_magic_tree_leaves);
		}
	};
	
	public static CreativeTabs tabHeavenNuriture = new CreativeTabs("tabHeavenNuriture")
	{
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem()
		{
			return new ItemStack(ItemsMod.cherry);
		}
	};
}
