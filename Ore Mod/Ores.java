package populo.mod.ores;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import populo.mod.ores.armor.AluminumArmor;
import populo.mod.ores.armor.AmethystArmor;
import populo.mod.ores.armor.CitrineArmor;
import populo.mod.ores.armor.CopperArmor;
import populo.mod.ores.armor.EmeraldArmor;
import populo.mod.ores.armor.GrapheneArmor;
import populo.mod.ores.armor.LeadArmor;
import populo.mod.ores.armor.ObsidianArmor;
import populo.mod.ores.armor.RoseQuartzArmor;
import populo.mod.ores.armor.RubyArmor;
import populo.mod.ores.armor.SapphireArmor;
import populo.mod.ores.armor.SilverArmor;
import populo.mod.ores.armor.TinArmor;
import populo.mod.ores.armor.TungstenArmor;
import populo.mod.ores.blocks.OBlock;
import populo.mod.ores.blocks.Ore;
import populo.mod.ores.materials.Ingot;
import populo.mod.ores.tab.OreTabClass;
import populo.mod.ores.tools.Axe;
import populo.mod.ores.tools.Hoe;
import populo.mod.ores.tools.Pickaxe;
import populo.mod.ores.tools.Shovel;
import populo.mod.ores.tools.Sword;
import populo.mod.ores.world.Plant;
import populo.mod.ores.world.TunSeed;
import populo.mod.ores.world.TungstenFuel;
import populo.mod.ores.world.WorldGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;




@Mod(modid="Ores", name="Ore Mod", version="1.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Ores {

	@Instance(value="Ore Mod")
	public static Ores instance;
	
	@SidedProxy(clientSide="populo.mod.ores.client.ClientProxy", serverSide="populo.mod.ores.CommonProxy")
	public static CommonProxy proxy;
	
	//enum tools
	
	public static EnumToolMaterial RubyTools = EnumHelper.addToolMaterial("Ruby Tools",  3,  1000,  5.0F, 5.0F, 10);
	public static EnumToolMaterial SapphireTools = EnumHelper.addToolMaterial("Sapphire Tools",  3, 3000, 7.4F, 8.0F, 20);
	public static EnumToolMaterial SilverTools = EnumHelper.addToolMaterial("Silver Tools", 1, 364, 8.7F, 5.2F, 23);
	public static EnumToolMaterial CopperTools = EnumHelper.addToolMaterial("Copper Tools", 2, 254, 5.2F, 6.1F, 42);
	public static EnumToolMaterial LeadTools = EnumHelper.addToolMaterial("Lead Tools", 3, 932, 7.1F, 8.3F, 13);
	public static EnumToolMaterial TinTools = EnumHelper.addToolMaterial("Tin Tools", 2, 562, 4.2F, 4.1F, 42);
	public static EnumToolMaterial AluminumTools = EnumHelper.addToolMaterial("Aluminum Tools", 1, 315, 6.3F, 5.1F, 19);
	public static EnumToolMaterial GrapheneTools = EnumHelper.addToolMaterial("Graphene Tools", 3, 9857, 9.6F, 10.4F, 53);
	public static EnumToolMaterial AmethystTools = EnumHelper.addToolMaterial("Amethyst Tools", 3, 2843, 8.2F, 7.9F, 48);
	public static EnumToolMaterial CitrineTools = EnumHelper.addToolMaterial("Citrine Tools", 2, 2644, 8.4F, 8.3F, 36);
	public static EnumToolMaterial RoseQuartzTools = EnumHelper.addToolMaterial("Rose Quartz Tools", 2, 1852, 6.2F, 2.5F, 42);
	public static EnumToolMaterial ObsidianTools = EnumHelper.addToolMaterial("Obsidian Tools",3, 2300, 10.0F, 4.5F, 25);
	public static EnumToolMaterial TungstenTools = EnumHelper.addToolMaterial("Tungsten Tools", 3, 1562, 17.0F, 14.0F, 28);
	public static EnumToolMaterial EmeraldTools =  EnumHelper.addToolMaterial("Emerald Tools", 3, 6342, 8.4F, 6.7F, 40);
	
	//enum armor
	
	public static EnumArmorMaterial RubyArmor = EnumHelper.addArmorMaterial("Ruby Armor", 29, new int[]{5, 7, 8, 6}, 10);
	public static EnumArmorMaterial SapphireArmor = EnumHelper.addArmorMaterial("Sapphire Armor", 36, new int[]{8,  10, 12, 9}, 20);
	public static EnumArmorMaterial SilverArmor = EnumHelper.addArmorMaterial("Silver Armor", 8, new int[]{2, 3, 5, 2}, 23);
	public static EnumArmorMaterial CopperArmor = EnumHelper.addArmorMaterial("Copper Armor", 14, new int[]{4,  6, 6, 3}, 42);
	public static EnumArmorMaterial LeadArmor = EnumHelper.addArmorMaterial("Lead Armor", 17, new int[]{6, 7, 7, 4}, 13);
	public static EnumArmorMaterial TinArmor = EnumHelper.addArmorMaterial("Tin Armor", 15, new int[]{6, 6, 5, 5}, 42);
	public static EnumArmorMaterial AluminumArmor = EnumHelper.addArmorMaterial("Aluminum Armor", 17, new int[]{2, 4, 2, 1}, 19);
	public static EnumArmorMaterial GrapheneArmor = EnumHelper.addArmorMaterial("Graphene Armor", 40, new int[]{14, 18, 19, 17}, 53);
	public static EnumArmorMaterial AmethystArmor = EnumHelper.addArmorMaterial("Amethyst Armor", 36, new int[]{12, 16, 14, 11}, 48);
	public static EnumArmorMaterial CitrineArmor = EnumHelper.addArmorMaterial("Citrine Armor", 24, new int[]{10, 13, 12, 11}, 36);
	public static EnumArmorMaterial RoseQuartzArmor = EnumHelper.addArmorMaterial("Rose Quartz Armor", 14, new int[]{5, 6, 8, 4}, 42);
	public static EnumArmorMaterial ObsidianArmor = EnumHelper.addArmorMaterial("Obsidian Armor",  40, new int[] {5, 10, 8, 5}, 30);
	public static EnumArmorMaterial TungstenArmor = EnumHelper.addArmorMaterial("Tungsten Armor", 30, new int[] {3, 8, 7, 5}, 20);
	public static EnumArmorMaterial EmeraldArmor = EnumHelper.addArmorMaterial("Emerald Armor", 47, new int[]{17, 16, 18, 15}, 40);
	
	//ruby
	
	public static Item rubyPick, rubyAxe, rubyHoe, rubyShovel, rubySword, rubyHelmet, rubyChest, rubyLeggings, rubyBoots, rubyIngot;
	public static Block rubyOre, rubyBlock;
	//sapphire
	
	public static Item sapPick, sapAxe, sapHoe, sapShovel, sapSword, sapHelmet, sapChest, sapLeggings, sapBoots, sapIngot;
	public static Block sapOre, sapBlock;
	
	//silver
	
	public static Item silPick, silAxe, silHoe, silShovel, silSword, silHelmet, silChest, silLeggings, silBoots, silIngot;
	public static Block silOre, silBlock;
	
	//copper
	
	public static Item copPick, copAxe, copHoe, copShovel, copSword, copHelmet, copChest, copLeggings, copBoots, copIngot;
	public static Block copOre, copBlock;
	
	//lead
	
	public static Item leadPick, leadAxe, leadHoe, leadShovel, leadSword, leadHelmet, leadChest, leadLeggings, leadBoots, leadIngot;
	public static Block leadOre, leadBlock;
	
	//tin
	
	public static Item tinPick, tinAxe, tinHoe, tinShovel, tinSword, tinHelmet, tinChest, tinLeggings, tinBoots, tinIngot;
	public static Block tinOre, tinBlock;
	
	//aluminum
	
	public static Item aluPick, aluAxe, aluHoe, aluShovel, aluSword, aluHelmet, aluChest, aluLeggings, aluBoots, aluIngot;
	public static Block aluOre, aluBlock;
	
	//graphene
	
	public static Item graPick, graAxe, graHoe, graShovel, graSword, graHelmet, graChest, graLeggings, graBoots, graIngot;
	public static Block graOre, graBlock;
	
	//amethyst
	
	public static Item amePick, ameAxe, ameHoe, ameShovel, ameSword, ameHelmet, ameChest, ameLeggings, ameBoots, ameIngot;
	public static Block ameOre, ameBlock;
	
	//citrine
	
	public static Item citPick, citAxe, citHoe, citShovel, citSword, citHelmet, citChest, citLeggings, citBoots, citIngot;
	public static Block citOre, citBlock;
	
	//rose quartz
	
	public static Item rosePick, roseAxe, roseHoe, roseShovel, roseSword, roseHelmet, roseChest, roseLeggings, roseBoots, roseIngot;
	public static Block roseOre, roseBlock;
	
	//tiger eye
	
	public static Item obsPick, obsAxe, obsHoe, obsShovel, obsSword, obsHelmet, obsChest, obsLeggings, obsBoots, obsIngot;

	//tungsten

	public static Item tunPick, tunAxe, tunHoe, tunShovel, tunSword, tunHelmet, tunChest, tunLeggings, tunBoots, tunIngot, tunMolten, tunNugget, tungSeed;
	public static Block tunOre, tunBlock, tunMoltenBlock, tunPlant;
	
	//emerald
	
	public static Item emPick, emAxe, emHoe, emShovel, emSword, emHelmet, emChest, emLeggings, emBoots, emIngot;

	
	public static CreativeTabs oreModTab = new OreTabClass(CreativeTabs.getNextID(), "Ore Mod Tab");
	
	
	@EventHandler
	public void preInt(FMLPreInitializationEvent event) {
		
		//ingots
		
		rubyIngot = new Ingot(6000, 64, Ores.oreModTab).setUnlocalizedName("rubyIngot");
		sapIngot = new Ingot(6001, 64, Ores.oreModTab).setUnlocalizedName("sapIngot");
		silIngot = new Ingot(6002, 64, Ores.oreModTab).setUnlocalizedName("silIngot");
		copIngot = new Ingot(6003, 64, Ores.oreModTab).setUnlocalizedName("copIngot");
		leadIngot = new Ingot(6004, 64, Ores.oreModTab).setUnlocalizedName("leadIngot");
		tinIngot = new Ingot(6005, 64, Ores.oreModTab).setUnlocalizedName("tinIngot");
		aluIngot = new Ingot(6006, 64, Ores.oreModTab).setUnlocalizedName("aluIngot");
		graIngot = new Ingot(6007, 64, Ores.oreModTab).setUnlocalizedName("graIngot");
		ameIngot = new Ingot(6008, 64, Ores.oreModTab).setUnlocalizedName("ameIngot");
		citIngot = new Ingot(6009, 64, Ores.oreModTab).setUnlocalizedName("citIngot");
		roseIngot = new Ingot(6010, 64, Ores.oreModTab).setUnlocalizedName("roseIngot");
		obsIngot = new Ingot(6011, 64, Ores.oreModTab).setUnlocalizedName("obsIngot");
		tunIngot = new Ingot(6129, 64, Ores.oreModTab).setUnlocalizedName("tunIngot");
		tunMolten = new Ingot(6130, 64, Ores.oreModTab).setUnlocalizedName("tunMI");
	

		//pickaxes

		rubyPick = (ItemPickaxe) new Pickaxe(6012, RubyTools).setUnlocalizedName("rubyPick");
		sapPick = (ItemPickaxe) new Pickaxe(6013, SapphireTools).setUnlocalizedName("sapPick");
		silPick = (ItemPickaxe) new Pickaxe(6014, SilverTools).setUnlocalizedName("silPick");
		copPick = (ItemPickaxe) new Pickaxe(6015, CopperTools).setUnlocalizedName("copPick");
		leadPick = (ItemPickaxe) new Pickaxe(6016, LeadTools).setUnlocalizedName("leadPick");
		tinPick = (ItemPickaxe) new Pickaxe(6017, TinTools).setUnlocalizedName("tinPick");
		aluPick = (ItemPickaxe) new Pickaxe(6018, AluminumTools).setUnlocalizedName("aluPick");
		graPick = (ItemPickaxe) new Pickaxe(6019, GrapheneTools).setUnlocalizedName("graPick");
		amePick = (ItemPickaxe) new Pickaxe(6020, AmethystTools).setUnlocalizedName("amePick");
		citPick = (ItemPickaxe) new Pickaxe(6021, CitrineTools).setUnlocalizedName("citPick");
		rosePick = (ItemPickaxe) new Pickaxe(6022, RoseQuartzTools).setUnlocalizedName("rosePick");
		obsPick = (ItemPickaxe) new Pickaxe(6023, ObsidianTools).setUnlocalizedName("obsPick");
		emPick = (ItemPickaxe) new Pickaxe(6024, EmeraldTools).setUnlocalizedName("emPick");
		tunPick = (ItemPickaxe) new Pickaxe(6131, TungstenTools).setUnlocalizedName("tunPick");

		//axes

		rubyAxe = (ItemAxe) new Axe(6025, RubyTools).setUnlocalizedName("rubyAxe");
		sapAxe = (ItemAxe) new Axe(6026, SapphireTools).setUnlocalizedName("sapAxe");
		silAxe = (ItemAxe) new Axe(6027, SilverTools).setUnlocalizedName("silAxe");
		copAxe = (ItemAxe) new Axe(6028, CopperTools).setUnlocalizedName("copAxe");
		leadAxe = (ItemAxe) new Axe(6029, LeadTools).setUnlocalizedName("leadAxe");
		tinAxe = (ItemAxe) new Axe(6030, TinTools).setUnlocalizedName("tinAxe");
		aluAxe = (ItemAxe) new Axe(6031, AluminumTools).setUnlocalizedName("aluAxe");
		graAxe = (ItemAxe) new Axe(6032, GrapheneTools).setUnlocalizedName("graAxe");
		ameAxe = (ItemAxe) new Axe(6033, AmethystTools).setUnlocalizedName("ameAxe");
		citAxe = (ItemAxe) new Axe(6034, CitrineTools).setUnlocalizedName("citAxe");
		roseAxe = (ItemAxe) new Axe(6035, RoseQuartzTools).setUnlocalizedName("roseAxe");
		obsAxe = (ItemAxe) new Axe(6036, ObsidianTools).setUnlocalizedName("obsAxe");
		emAxe = (ItemAxe) new Axe(6037, EmeraldTools).setUnlocalizedName("emAxe");
		tunAxe = (ItemAxe) new Axe(6132, TungstenTools).setUnlocalizedName("tunAxe");

		//hoes

		rubyHoe = (ItemHoe) new Hoe(6038, RubyTools).setUnlocalizedName("rubyHoe");
		sapHoe = (ItemHoe) new Hoe(6039, SapphireTools).setUnlocalizedName("sapHoe");
		silHoe = (ItemHoe) new Hoe(6040, SilverTools).setUnlocalizedName("silHoe");
		copHoe = (ItemHoe) new Hoe(6041, CopperTools).setUnlocalizedName("copHoe");
		leadHoe = (ItemHoe) new Hoe(6042, LeadTools).setUnlocalizedName("leadHoe");
		tinHoe = (ItemHoe) new Hoe(6043, TinTools).setUnlocalizedName("tinHoe");
		aluHoe = (ItemHoe) new Hoe(6044, AluminumTools).setUnlocalizedName("aluHoe");
		graHoe = (ItemHoe) new Hoe(6045, GrapheneTools).setUnlocalizedName("graHoe");
		ameHoe = (ItemHoe) new Hoe(6046, AmethystTools).setUnlocalizedName("ameHoe");
		citHoe = (ItemHoe) new Hoe(6047, CitrineTools).setUnlocalizedName("citHoe");
		roseHoe = (ItemHoe) new Hoe(6048, RoseQuartzTools).setUnlocalizedName("roseHoe");
		obsHoe = (ItemHoe) new Hoe(6049, ObsidianTools).setUnlocalizedName("obsHoe");
		emHoe = (ItemHoe) new Hoe(6050, EmeraldTools).setUnlocalizedName("emHoe");
		tunHoe = (ItemHoe) new Hoe(6133, TungstenTools).setUnlocalizedName("tunHoe");

		//shovels

		rubyShovel = (ItemSpade) new Shovel(6051, RubyTools).setUnlocalizedName("rubyShovel");
		sapShovel = (ItemSpade) new Shovel(6052, SapphireTools).setUnlocalizedName("sapShovel");
		silShovel = (ItemSpade) new Shovel(6053, SilverTools).setUnlocalizedName("silShovel");
		copShovel = (ItemSpade) new Shovel(6054, CopperTools).setUnlocalizedName("copShovel");
		leadShovel = (ItemSpade) new Shovel(6055, LeadTools).setUnlocalizedName("leadShovel");
		tinShovel = (ItemSpade) new Shovel(6056, TinTools).setUnlocalizedName("tinShovel");
		aluShovel = (ItemSpade) new Shovel(6057, AluminumTools).setUnlocalizedName("aluShovel");
		graShovel = (ItemSpade) new Shovel(6058, GrapheneTools).setUnlocalizedName("graShovel");
		ameShovel = (ItemSpade) new Shovel(6059, AmethystTools).setUnlocalizedName("ameShovel");
		citShovel = (ItemSpade) new Shovel(6060, CitrineTools).setUnlocalizedName("citShovel");
		roseShovel = (ItemSpade) new Shovel(6061, RoseQuartzTools).setUnlocalizedName("roseShovel");
		obsShovel = (ItemSpade) new Shovel(6062, ObsidianTools).setUnlocalizedName("obsShovel");
		emShovel = (ItemSpade) new Shovel(6063, EmeraldTools).setUnlocalizedName("emShovel");
		tunShovel = (ItemSpade) new Shovel(6163, TungstenTools).setUnlocalizedName("tunShovel");

		//swords

		rubySword = (ItemSword) new Sword(6064, RubyTools).setUnlocalizedName("rubySword");
		sapSword = (ItemSword) new Sword(6065, SapphireTools).setUnlocalizedName("sapSword");
		silSword = (ItemSword) new Sword(6066, SilverTools).setUnlocalizedName("silSword");
		copSword = (ItemSword) new Sword(6067, CopperTools).setUnlocalizedName("copSword");
		leadSword = (ItemSword) new Sword(6068, LeadTools).setUnlocalizedName("leadSword");
		tinSword = (ItemSword) new Sword(6069, TinTools).setUnlocalizedName("tinSword");
		aluSword = (ItemSword) new Sword(6070, AluminumTools).setUnlocalizedName("aluSword");
		graSword = (ItemSword) new Sword(6071, GrapheneTools).setUnlocalizedName("graSword");
		ameSword = (ItemSword) new Sword(6072, AmethystTools).setUnlocalizedName("ameSword");
		citSword = (ItemSword) new Sword(6073, CitrineTools).setUnlocalizedName("citSword");
		roseSword = (ItemSword) new Sword(6074, RoseQuartzTools).setUnlocalizedName("roseSword");
		obsSword = (ItemSword) new Sword(6075, ObsidianTools).setUnlocalizedName("obsSword");
		emSword = (ItemSword) new Sword(6076, EmeraldTools).setUnlocalizedName("emSword");
		tunSword = (ItemSword) new Sword(6164, TungstenTools).setUnlocalizedName("tunSword");
		
		//helmets
		
		rubyHelmet = (ItemArmor) new RubyArmor(6077, RubyArmor, 5, 0).setUnlocalizedName("rubyHelmet");
		sapHelmet = (ItemArmor) new SapphireArmor(6078, SapphireArmor, 5, 0).setUnlocalizedName("sapHelmet");
		silHelmet = (ItemArmor) new SilverArmor(6079, SilverArmor, 5, 0).setUnlocalizedName("silHelmet");
		copHelmet = (ItemArmor) new CopperArmor(6080, CopperArmor, 5, 0).setUnlocalizedName("copHelmet");
		leadHelmet = (ItemArmor) new LeadArmor(6081, LeadArmor, 5, 0).setUnlocalizedName("leadHelmet");
		tinHelmet = (ItemArmor) new TinArmor(6082, TinArmor, 5, 0).setUnlocalizedName("tinHelmet");
		aluHelmet = (ItemArmor) new AluminumArmor(6083, AluminumArmor, 5, 0).setUnlocalizedName("aluHelmet");
		graHelmet = (ItemArmor) new GrapheneArmor(6084, GrapheneArmor, 5, 0).setUnlocalizedName("graHelmet");
		ameHelmet = (ItemArmor) new AmethystArmor(6085, AmethystArmor, 5, 0).setUnlocalizedName("ameHelmet");
		citHelmet = (ItemArmor) new CitrineArmor(6086, CitrineArmor, 5, 0).setUnlocalizedName("citHelmet");
		roseHelmet = (ItemArmor) new RoseQuartzArmor(6087, RoseQuartzArmor, 5, 0).setUnlocalizedName("roseHelmet");
		obsHelmet = (ItemArmor) new ObsidianArmor(6088, ObsidianArmor, 5, 0).setUnlocalizedName("obsHelmet");
		emHelmet = (ItemArmor) new EmeraldArmor(6089, EmeraldArmor, 5, 0).setUnlocalizedName("emHelmet");
		tunHelmet = (ItemArmor) new TungstenArmor(6165, TungstenArmor, 5, 0).setUnlocalizedName("tunHelmet");
		
		//chestplates
		
		rubyChest = (ItemArmor) new RubyArmor(6090, RubyArmor, 5, 1).setUnlocalizedName("rubyChest");
		sapChest = (ItemArmor) new SapphireArmor(6091, SapphireArmor, 5, 1).setUnlocalizedName("sapChest");
		silChest = (ItemArmor) new SilverArmor(6092, SilverArmor, 5, 1).setUnlocalizedName("silChest");
		copChest = (ItemArmor) new CopperArmor(6093, CopperArmor, 5, 1).setUnlocalizedName("copChest");
		leadChest = (ItemArmor) new LeadArmor(6094, LeadArmor, 5, 1).setUnlocalizedName("leadChest");
		tinChest = (ItemArmor) new TinArmor(6095, TinArmor, 5, 1).setUnlocalizedName("tinChest");
		aluChest = (ItemArmor) new AluminumArmor(6096, AluminumArmor, 5, 1).setUnlocalizedName("aluChest");
		graChest = (ItemArmor) new GrapheneArmor(6097, GrapheneArmor, 5, 1).setUnlocalizedName("graChest");
		ameChest = (ItemArmor) new AmethystArmor(6098, AmethystArmor, 5, 1).setUnlocalizedName("ameChest");
		citChest = (ItemArmor) new CitrineArmor(6099, CitrineArmor, 5, 1).setUnlocalizedName("citChest");
		roseChest = (ItemArmor) new RoseQuartzArmor(6100, RoseQuartzArmor, 5, 1).setUnlocalizedName("roseChest");
		obsChest = (ItemArmor) new ObsidianArmor(6101, ObsidianArmor, 5, 1).setUnlocalizedName("obsChest");
		emChest = (ItemArmor) new EmeraldArmor(6102, EmeraldArmor, 5, 1).setUnlocalizedName("emChest");
		tunChest = (ItemArmor) new TungstenArmor(6166, TungstenArmor, 5, 1).setUnlocalizedName("tunChest");
		
		//leggings
		
		rubyLeggings = (ItemArmor) new RubyArmor(6103, RubyArmor, 5, 2).setUnlocalizedName("rubyLeggings");
		sapLeggings = (ItemArmor) new SapphireArmor(6104, SapphireArmor, 5, 2).setUnlocalizedName("sapLeggings");
		silLeggings = (ItemArmor) new SilverArmor(6105, SilverArmor, 5, 2).setUnlocalizedName("silLeggings");
		copLeggings = (ItemArmor) new CopperArmor(6106, CopperArmor, 5, 2).setUnlocalizedName("copLeggings");
		leadLeggings = (ItemArmor) new LeadArmor(6107, LeadArmor, 5, 2).setUnlocalizedName("leadLeggings");
		tinLeggings = (ItemArmor) new TinArmor(6108, TinArmor, 5, 2).setUnlocalizedName("tinLeggings");
		aluLeggings = (ItemArmor) new AluminumArmor(6109, AluminumArmor, 5, 2).setUnlocalizedName("aluLeggings");
		graLeggings = (ItemArmor) new GrapheneArmor(6110, GrapheneArmor, 5, 2).setUnlocalizedName("graLeggings");
		ameLeggings = (ItemArmor) new AmethystArmor(6111, AmethystArmor, 5, 2).setUnlocalizedName("ameLeggings");
		citLeggings = (ItemArmor) new CitrineArmor(6112, CitrineArmor, 5, 2).setUnlocalizedName("citLeggings");
		roseLeggings = (ItemArmor) new RoseQuartzArmor(6113, RoseQuartzArmor, 5, 2).setUnlocalizedName("roseLeggings");
		obsLeggings = (ItemArmor) new ObsidianArmor(6114, ObsidianArmor, 5, 2).setUnlocalizedName("obsLeggings");
		emLeggings = (ItemArmor) new EmeraldArmor(6115, EmeraldArmor, 5, 2).setUnlocalizedName("emLeggings");
		tunLeggings = (ItemArmor) new TungstenArmor(6167, TungstenArmor, 5, 2).setUnlocalizedName("tunLeggings");
		
		//boots
		
		rubyBoots = (ItemArmor) new RubyArmor(6116, RubyArmor, 5, 3).setUnlocalizedName("rubyBoots");
		sapBoots = (ItemArmor) new SapphireArmor(6117, SapphireArmor, 5, 3).setUnlocalizedName("sapBoots");
		silBoots = (ItemArmor) new SilverArmor(6118, SilverArmor, 5, 3).setUnlocalizedName("silBoots");
		copBoots = (ItemArmor) new CopperArmor(6119, CopperArmor, 5, 3).setUnlocalizedName("copBoots");
		leadBoots = (ItemArmor) new LeadArmor(6120, LeadArmor, 5, 3).setUnlocalizedName("leadBoots");
		tinBoots = (ItemArmor) new TinArmor(6121, TinArmor, 5, 3).setUnlocalizedName("tinBoots");
		aluBoots = (ItemArmor) new AluminumArmor(6122, AluminumArmor, 5, 3).setUnlocalizedName("aluBoots");
		graBoots = (ItemArmor) new GrapheneArmor(6123, GrapheneArmor, 5, 3).setUnlocalizedName("graBoots");
		ameBoots = (ItemArmor) new AmethystArmor(6124, AmethystArmor, 5, 3).setUnlocalizedName("ameBoots");
		citBoots = (ItemArmor) new CitrineArmor(6125, CitrineArmor, 5, 3).setUnlocalizedName("citBoots");
		roseBoots = (ItemArmor) new RoseQuartzArmor(6126, RoseQuartzArmor, 5, 3).setUnlocalizedName("roseBoots");
		obsBoots = (ItemArmor) new ObsidianArmor(6127, ObsidianArmor, 5, 3).setUnlocalizedName("obsBoots");
		emBoots = (ItemArmor) new EmeraldArmor(6128, EmeraldArmor, 5, 3).setUnlocalizedName("emBoots");
		tunBoots = (ItemArmor) new TungstenArmor(6168, TungstenArmor, 5, 3).setUnlocalizedName("tunBoots");
		
		//ores
		
		rubyOre = new Ore(3500, "rubyOre").setUnlocalizedName("rubyOre").setHardness(7.3F);
		sapOre = new Ore(3501, "sapOre").setUnlocalizedName("sapOre").setHardness(7.4F);
		silOre = new Ore(3502, "silOre").setUnlocalizedName("silOre").setHardness(7.8F);
		copOre = new Ore(3503, "copOre").setUnlocalizedName("copOre").setHardness(3.6F);
		leadOre = new Ore(3505, "leadOre").setUnlocalizedName("leadOre").setHardness(9.1F);
		tinOre = new Ore(3506, "tinOre").setUnlocalizedName("tinOre").setHardness(4.2F);
		aluOre = new Ore(3507, "aluOre").setUnlocalizedName("aluOre").setHardness(4.6F);
		graOre = new Ore(3508, "graOre").setUnlocalizedName("graOre").setHardness(16.2F);
		ameOre = new Ore(3509, "ameOre").setUnlocalizedName("ameOre").setHardness(7.3F);
		citOre = new Ore(3510, "citOre").setUnlocalizedName("citOre").setHardness(8.4F);
		roseOre = new Ore(3511, "roseOre").setUnlocalizedName("roseOre").setHardness(8.5F);
		tunOre = new Ore(3525, "tunOre").setUnlocalizedName("tunOre").setHardness(5.0F);
		
		
		//blocks
		
		rubyBlock = new OBlock(3513, "rubyBlock").setUnlocalizedName("rubyBlock").setHardness(8.6F);
		sapBlock = new OBlock(3514, "sapBlock").setUnlocalizedName("sapBlock").setHardness(9.4F);
		silBlock = new OBlock(3515, "silBlock").setUnlocalizedName("silBlock").setHardness(6.1F);
		copBlock = new OBlock(3516, "copBlock").setUnlocalizedName("copBlock").setHardness(4.7F);
		leadBlock = new OBlock(3517, "leadBlock").setUnlocalizedName("leadBlock").setHardness(13.6F);
		tinBlock = new OBlock(3518, "tinBlock").setUnlocalizedName("tinBlock").setHardness(6.4F);
		aluBlock = new OBlock(3519, "aluBlock").setUnlocalizedName("aluBlock").setHardness(7.3F);
		graBlock = new OBlock(3520, "graBlock").setUnlocalizedName("graBlock").setHardness(20.3F);
		ameBlock = new OBlock(3521, "ameBlock").setUnlocalizedName("ameBlock").setHardness(7.1F);
		citBlock = new OBlock(3522, "citBlock").setUnlocalizedName("citBlock").setHardness(8.2F);
		roseBlock = new OBlock(3523, "roseBlock").setUnlocalizedName("roseBlock").setHardness(9.1F);
		tunBlock = new OBlock(3526, "tunBlock").setUnlocalizedName("tunBlock").setHardness(8.0F);
		tunMoltenBlock = new OBlock(3527, "tunMBlock").setUnlocalizedName("tunMBlock").setHardness(3.5F);
		
		
		//seeds
		
		tunPlant = new Plant(3528).setUnlocalizedName("tunPlant");
		tunNugget = (ItemSeeds) new TunSeed(6169, Ores.tunPlant.blockID, Block.slowSand.blockID).setCreativeTab(Ores.oreModTab).setUnlocalizedName("tunNugget");
		MinecraftForge.addGrassSeed(new ItemStack(Ores.tunNugget), 1);
		
		/*
		 * ADD TEXTURES TO TUNGSTEN
		 * ADD TUNGSTEN PLANTS
		 * ADD TUNGSTEN NUGGETS
		 */
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
		proxy.registerBlocks();
		
		//world gen
		/*
		 * Tweak!!!
		 */
		
		GameRegistry.registerWorldGenerator(new WorldGen());
		
		//smelting
		
		GameRegistry.addSmelting(Ores.rubyOre.blockID, new ItemStack(Ores.rubyIngot, 1), 5.0F);
		GameRegistry.addSmelting(Ores.sapOre.blockID, new ItemStack(Ores.sapIngot, 1), 5.0F);
		GameRegistry.addSmelting(Ores.silOre.blockID, new ItemStack(Ores.silIngot, 1), 5.0F);
		GameRegistry.addSmelting(Ores.copOre.blockID, new ItemStack(Ores.copIngot, 1), 5.0F);
		GameRegistry.addSmelting(Ores.leadOre.blockID, new ItemStack(Ores.leadIngot, 1), 5.0F);
		GameRegistry.addSmelting(Ores.tinOre.blockID, new ItemStack(Ores.tinIngot, 1), 5.0F);
		GameRegistry.addSmelting(Ores.aluOre.blockID, new ItemStack(Ores.aluIngot, 1), 5.0F);
		GameRegistry.addSmelting(Ores.graOre.blockID, new ItemStack(Ores.graIngot, 1), 5.0F);
		GameRegistry.addSmelting(Ores.ameOre.blockID, new ItemStack(Ores.ameIngot, 1), 5.0F);
		GameRegistry.addSmelting(Ores.citOre.blockID, new ItemStack(Ores.citIngot, 1), 5.0F);
		GameRegistry.addSmelting(Ores.roseOre.blockID, new ItemStack(Ores.roseIngot, 1), 5.0F);
		GameRegistry.addSmelting(Block.obsidian.blockID, new ItemStack(Ores.obsIngot, 1), 5.0F);
		GameRegistry.addSmelting(Ores.tunIngot.itemID, new ItemStack(Ores.tunMolten, 1), 7.0F);
		GameRegistry.addSmelting(Ores.tunOre.blockID, new ItemStack(Ores.tunMoltenBlock, 1), 7.0F);

		/*
		 * Crafting
		 */

		//blocks <--> ingots

		GameRegistry.addRecipe(new ItemStack(Ores.rubyBlock, 1), new Object[] {
			"###", "###", "###", '#', Ores.rubyIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.rubyIngot, 9), new Object[] {
			"#", '#', Ores.rubyBlock
		});
		GameRegistry.addRecipe(new ItemStack(Ores.sapBlock, 1), new Object[] {
			"###", "###", "###", '#', Ores.sapIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.sapIngot, 9), new Object[] {
			"#", '#', Ores.sapBlock
		});
		GameRegistry.addRecipe(new ItemStack(Ores.silBlock, 1), new Object[] {
			"###", "###", "###", '#', Ores.silIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.silIngot, 9), new Object[] {
			"#", '#', Ores.silBlock
		});
		GameRegistry.addRecipe(new ItemStack(Ores.copBlock, 1), new Object[] {
			"###", "###", "###", '#', Ores.copIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.copIngot, 9), new Object[] {
			"#", '#', Ores.copBlock
		});
		GameRegistry.addRecipe(new ItemStack(Ores.leadBlock, 1), new Object[] {
			"###", "###", "###", '#', Ores.leadIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.leadIngot, 9), new Object[] {
			"#", '#', Ores.leadBlock
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tinBlock, 1), new Object[] {
			"###", "###", "###", '#', Ores.tinIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tinIngot, 9), new Object[] {
			"#", '#', Ores.tinBlock
		});
		GameRegistry.addRecipe(new ItemStack(Ores.aluBlock, 1), new Object[] {
			"###", "###", "###", '#', Ores.aluIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.aluIngot, 9), new Object[] {
			"#", '#', Ores.aluBlock
		});
		GameRegistry.addRecipe(new ItemStack(Ores.graBlock, 1), new Object[] {
			"###", "###", "###", '#', Ores.graIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.graIngot, 9), new Object[] {
			"#", '#', Ores.graBlock
		});
		GameRegistry.addRecipe(new ItemStack(Ores.ameBlock, 1), new Object[] {
			"###", "###", "###", '#', Ores.ameIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.ameIngot, 9), new Object[] {
			"#", '#', Ores.ameBlock
		});
		GameRegistry.addRecipe(new ItemStack(Ores.citBlock, 1), new Object[] {
			"###", "###", "###", '#', Ores.citIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.citIngot, 9), new Object[] {
			"#", '#', Ores.citBlock
		});
		GameRegistry.addRecipe(new ItemStack(Ores.roseBlock, 1), new Object[] {
			"###", "###", "###", '#', Ores.roseIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.roseIngot, 9), new Object[] {
			"#", '#', Ores.roseBlock
		});
		GameRegistry.addRecipe(new ItemStack(Block.obsidian, 1), new Object[] {
			"###", "###", "###", '#', Ores.obsIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tunBlock, 1), new Object[] {
			"###", "###", "###", '#', Ores.tunIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tunIngot, 9), new Object[] {
			"#", '#', Ores.tunBlock
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tunMoltenBlock, 1), new Object[] {
			"###", "###", "###", '#', Ores.tunMolten
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tunMolten, 9), new Object[] {
			"#", '#', Ores.tunMoltenBlock
		});
		
		/*
		 * items
		 */
		
		//ruby
		
		GameRegistry.addRecipe(new ItemStack(Ores.rubySword, 1), new Object[] {
			"#", "#", "s", '#', Ores.rubyIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.rubyHoe, 1), new Object[] {
			"## ", " s ", " s ", '#', Ores.rubyIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.rubyHoe, 1), new Object[] {
			" ##", " s ", " s ", '#', Ores.rubyIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.rubyShovel, 1), new Object[] {
			"#", "s", "s", '#', Ores.rubyIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.rubyPick, 1), new Object[] {
			"###", " s ", " s ", '#', Ores.rubyIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.rubyAxe, 1), new Object[] {
			"## ", "#s ", " s ", '#', Ores.rubyIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.rubyHoe, 1), new Object[] {
			" ##", " s#", " s ", '#', Ores.rubyIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.rubyHelmet, 1), new Object[] {
			"###", "# #", '#', Ores.rubyIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.rubyChest, 1), new Object[] {
			"# #", "###", "###", '#', Ores.rubyIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.rubyLeggings, 1), new Object[] {
			"###", "# #", "# #", '#', Ores.rubyIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.rubyBoots, 1), new Object[] {
			"# #", "# #", '#', Ores.rubyIngot
		});
		
		//sapphire
		
		GameRegistry.addRecipe(new ItemStack(Ores.sapSword, 1), new Object[] {
			"#", "#", "s", '#', Ores.sapIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.sapHoe, 1), new Object[] {
			"## ", " s ", " s ", '#', Ores.sapIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.sapHoe, 1), new Object[] {
			" ##", " s ", " s ", '#', Ores.sapIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.sapShovel, 1), new Object[] {
			"#", "s", "s", '#', Ores.sapIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.sapPick, 1), new Object[] {
			"###", " s ", " s ", '#', Ores.sapIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.sapAxe, 1), new Object[] {
			"## ", "#s ", " s ", '#', Ores.sapIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.sapHoe, 1), new Object[] {
			" ##", " s#", " s ", '#', Ores.sapIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.sapHelmet, 1), new Object[] {
			"###", "# #", '#', Ores.sapIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.sapChest, 1), new Object[] {
			"# #", "###", "###", '#', Ores.sapIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.sapLeggings, 1), new Object[] {
			"###", "# #", "# #", '#', Ores.sapIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.sapBoots, 1), new Object[] {
			"# #", "# #", '#', Ores.sapIngot
		});
		
		//silver
		
		GameRegistry.addRecipe(new ItemStack(Ores.silSword, 1), new Object[] {
			"#", "#", "s", '#', Ores.silIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.silHoe, 1), new Object[] {
			"## ", " s ", " s ", '#', Ores.silIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.silHoe, 1), new Object[] {
			" ##", " s ", " s ", '#', Ores.silIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.silShovel, 1), new Object[] {
			"#", "s", "s", '#', Ores.silIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.silPick, 1), new Object[] {
			"###", " s ", " s ", '#', Ores.silIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.silAxe, 1), new Object[] {
			"## ", "#s ", " s ", '#', Ores.silIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.silHoe, 1), new Object[] {
			" ##", " s#", " s ", '#', Ores.silIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.silHelmet, 1), new Object[] {
			"###", "# #", '#', Ores.silIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.silChest, 1), new Object[] {
			"# #", "###", "###", '#', Ores.silIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.silLeggings, 1), new Object[] {
			"###", "# #", "# #", '#', Ores.silIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.silBoots, 1), new Object[] {
			"# #", "# #", '#', Ores.silIngot
		});
		
		//copper
		
		GameRegistry.addRecipe(new ItemStack(Ores.copSword, 1), new Object[] {
			"#", "#", "s", '#', Ores.copIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.copHoe, 1), new Object[] {
			"## ", " s ", " s ", '#', Ores.copIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.copHoe, 1), new Object[] {
			" ##", " s ", " s ", '#', Ores.copIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.copShovel, 1), new Object[] {
			"#", "s", "s", '#', Ores.copIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.copPick, 1), new Object[] {
			"###", " s ", " s ", '#', Ores.copIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.copAxe, 1), new Object[] {
			"## ", "#s ", " s ", '#', Ores.copIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.copHoe, 1), new Object[] {
			" ##", " s#", " s ", '#', Ores.copIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.copHelmet, 1), new Object[] {
			"###", "# #", '#', Ores.copIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.copChest, 1), new Object[] {
			"# #", "###", "###", '#', Ores.copIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.copLeggings, 1), new Object[] {
			"###", "# #", "# #", '#', Ores.copIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.copBoots, 1), new Object[] {
			"# #", "# #", '#', Ores.copIngot
		});
		
		//lead
		
		GameRegistry.addRecipe(new ItemStack(Ores.leadSword, 1), new Object[] {
			"#", "#", "s", '#', Ores.leadIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.leadHoe, 1), new Object[] {
			"## ", " s ", " s ", '#', Ores.leadIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.leadHoe, 1), new Object[] {
			" ##", " s ", " s ", '#', Ores.leadIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.leadShovel, 1), new Object[] {
			"#", "s", "s", '#', Ores.leadIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.leadPick, 1), new Object[] {
			"###", " s ", " s ", '#', Ores.leadIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.leadAxe, 1), new Object[] {
			"## ", "#s ", " s ", '#', Ores.leadIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.leadHoe, 1), new Object[] {
			" ##", " s#", " s ", '#', Ores.leadIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.leadHelmet, 1), new Object[] {
			"###", "# #", '#', Ores.leadIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.leadChest, 1), new Object[] {
			"# #", "###", "###", '#', Ores.leadIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.leadLeggings, 1), new Object[] {
			"###", "# #", "# #", '#', Ores.leadIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.leadBoots, 1), new Object[] {
			"# #", "# #", '#', Ores.leadIngot
		});
		
		//tin
		
		GameRegistry.addRecipe(new ItemStack(Ores.tinSword, 1), new Object[] {
			"#", "#", "s", '#', Ores.tinIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tinHoe, 1), new Object[] {
			"## ", " s ", " s ", '#', Ores.tinIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tinHoe, 1), new Object[] {
			" ##", " s ", " s ", '#', Ores.tinIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tinShovel, 1), new Object[] {
			"#", "s", "s", '#', Ores.tinIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tinPick, 1), new Object[] {
			"###", " s ", " s ", '#', Ores.tinIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tinAxe, 1), new Object[] {
			"## ", "#s ", " s ", '#', Ores.tinIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tinHoe, 1), new Object[] {
			" ##", " s#", " s ", '#', Ores.tinIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tinHelmet, 1), new Object[] {
			"###", "# #", '#', Ores.tinIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tinChest, 1), new Object[] {
			"# #", "###", "###", '#', Ores.tinIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tinLeggings, 1), new Object[] {
			"###", "# #", "# #", '#', Ores.tinIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tinBoots, 1), new Object[] {
			"# #", "# #", '#', Ores.tinIngot
		});
		
		//aluminum
		
		GameRegistry.addRecipe(new ItemStack(Ores.aluSword, 1), new Object[] {
			"#", "#", "s", '#', Ores.aluIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.aluHoe, 1), new Object[] {
			"## ", " s ", " s ", '#', Ores.aluIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.aluHoe, 1), new Object[] {
			" ##", " s ", " s ", '#', Ores.aluIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.aluShovel, 1), new Object[] {
			"#", "s", "s", '#', Ores.aluIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.aluPick, 1), new Object[] {
			"###", " s ", " s ", '#', Ores.aluIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.aluAxe, 1), new Object[] {
			"## ", "#s ", " s ", '#', Ores.aluIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.aluHoe, 1), new Object[] {
			" ##", " s#", " s ", '#', Ores.aluIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.aluHelmet, 1), new Object[] {
			"###", "# #", '#', Ores.aluIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.aluChest, 1), new Object[] {
			"# #", "###", "###", '#', Ores.aluIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.aluLeggings, 1), new Object[] {
			"###", "# #", "# #", '#', Ores.aluIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.aluBoots, 1), new Object[] {
			"# #", "# #", '#', Ores.aluIngot
		});
		
		//graphene
		
		GameRegistry.addRecipe(new ItemStack(Ores.graSword, 1), new Object[] {
			"#", "#", "s", '#', Ores.graIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.graHoe, 1), new Object[] {
			"## ", " s ", " s ", '#', Ores.graIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.graHoe, 1), new Object[] {
			" ##", " s ", " s ", '#', Ores.graIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.graShovel, 1), new Object[] {
			"#", "s", "s", '#', Ores.graIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.graPick, 1), new Object[] {
			"###", " s ", " s ", '#', Ores.graIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.graAxe, 1), new Object[] {
			"## ", "#s ", " s ", '#', Ores.graIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.graHoe, 1), new Object[] {
			" ##", " s#", " s ", '#', Ores.graIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.graHelmet, 1), new Object[] {
			"###", "# #", '#', Ores.graIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.graChest, 1), new Object[] {
			"# #", "###", "###", '#', Ores.graIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.graLeggings, 1), new Object[] {
			"###", "# #", "# #", '#', Ores.graIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.graBoots, 1), new Object[] {
			"# #", "# #", '#', Ores.graIngot
		});
		
		//amethyst
		
		GameRegistry.addRecipe(new ItemStack(Ores.ameSword, 1), new Object[] {
			"#", "#", "s", '#', Ores.ameIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.ameHoe, 1), new Object[] {
			"## ", " s ", " s ", '#', Ores.ameIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.ameHoe, 1), new Object[] {
			" ##", " s ", " s ", '#', Ores.ameIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.ameShovel, 1), new Object[] {
			"#", "s", "s", '#', Ores.ameIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.amePick, 1), new Object[] {
			"###", " s ", " s ", '#', Ores.ameIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.ameAxe, 1), new Object[] {
			"## ", "#s ", " s ", '#', Ores.ameIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.ameHoe, 1), new Object[] {
			" ##", " s#", " s ", '#', Ores.ameIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.ameHelmet, 1), new Object[] {
			"###", "# #", '#', Ores.ameIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.ameChest, 1), new Object[] {
			"# #", "###", "###", '#', Ores.ameIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.ameLeggings, 1), new Object[] {
			"###", "# #", "# #", '#', Ores.ameIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.ameBoots, 1), new Object[] {
			"# #", "# #", '#', Ores.ameIngot
		});
		
		//citrine
		
		GameRegistry.addRecipe(new ItemStack(Ores.citSword, 1), new Object[] {
			"#", "#", "s", '#', Ores.citIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.citHoe, 1), new Object[] {
			"## ", " s ", " s ", '#', Ores.citIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.citHoe, 1), new Object[] {
			" ##", " s ", " s ", '#', Ores.citIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.citShovel, 1), new Object[] {
			"#", "s", "s", '#', Ores.citIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.citPick, 1), new Object[] {
			"###", " s ", " s ", '#', Ores.citIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.citAxe, 1), new Object[] {
			"## ", "#s ", " s ", '#', Ores.citIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.citHoe, 1), new Object[] {
			" ##", " s#", " s ", '#', Ores.citIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.citHelmet, 1), new Object[] {
			"###", "# #", '#', Ores.citIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.citChest, 1), new Object[] {
			"# #", "###", "###", '#', Ores.citIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.citLeggings, 1), new Object[] {
			"###", "# #", "# #", '#', Ores.citIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.citBoots, 1), new Object[] {
			"# #", "# #", '#', Ores.citIngot
		});
		
		//rose
		
		GameRegistry.addRecipe(new ItemStack(Ores.roseSword, 1), new Object[] {
			"#", "#", "s", '#', Ores.roseIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.roseHoe, 1), new Object[] {
			"## ", " s ", " s ", '#', Ores.roseIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.roseHoe, 1), new Object[] {
			" ##", " s ", " s ", '#', Ores.roseIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.roseShovel, 1), new Object[] {
			"#", "s", "s", '#', Ores.roseIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.rosePick, 1), new Object[] {
			"###", " s ", " s ", '#', Ores.roseIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.roseAxe, 1), new Object[] {
			"## ", "#s ", " s ", '#', Ores.roseIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.roseHoe, 1), new Object[] {
			" ##", " s#", " s ", '#', Ores.roseIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.roseHelmet, 1), new Object[] {
			"###", "# #", '#', Ores.roseIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.roseChest, 1), new Object[] {
			"# #", "###", "###", '#', Ores.roseIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.roseLeggings, 1), new Object[] {
			"###", "# #", "# #", '#', Ores.roseIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.roseBoots, 1), new Object[] {
			"# #", "# #", '#', Ores.roseIngot
		});
		
		//obsidian
		
		GameRegistry.addRecipe(new ItemStack(Ores.obsSword, 1), new Object[] {
			"#", "#", "s", '#', Ores.obsIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.obsHoe, 1), new Object[] {
			"## ", " s ", " s ", '#', Ores.obsIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.obsHoe, 1), new Object[] {
			" ##", " s ", " s ", '#', Ores.obsIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.obsShovel, 1), new Object[] {
			"#", "s", "s", '#', Ores.obsIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.obsPick, 1), new Object[] {
			"###", " s ", " s ", '#', Ores.obsIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.obsAxe, 1), new Object[] {
			"## ", "#s ", " s ", '#', Ores.obsIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.obsHoe, 1), new Object[] {
			" ##", " s#", " s ", '#', Ores.obsIngot, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.obsHelmet, 1), new Object[] {
			"###", "# #", '#', Ores.obsIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.obsChest, 1), new Object[] {
			"# #", "###", "###", '#', Ores.obsIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.obsLeggings, 1), new Object[] {
			"###", "# #", "# #", '#', Ores.obsIngot
		});
		GameRegistry.addRecipe(new ItemStack(Ores.obsBoots, 1), new Object[] {
			"# #", "# #", '#', Ores.obsIngot
		});
		
		//emerald
		
		GameRegistry.addRecipe(new ItemStack(Ores.emSword, 1), new Object[] {
			"#", "#", "s", '#', Item.emerald, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.emHoe, 1), new Object[] {
			"## ", " s ", " s ", '#', Item.emerald, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.emHoe, 1), new Object[] {
			" ##", " s ", " s ", '#', Item.emerald, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.emShovel, 1), new Object[] {
			"#", "s", "s", '#', Item.emerald, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.emPick, 1), new Object[] {
			"###", " s ", " s ", '#', Item.emerald, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.emAxe, 1), new Object[] {
			"## ", "#s ", " s ", '#', Item.emerald, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.emHoe, 1), new Object[] {
			" ##", " s#", " s ", '#', Item.emerald, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.emHelmet, 1), new Object[] {
			"###", "# #", '#', Item.emerald
		});
		GameRegistry.addRecipe(new ItemStack(Ores.emChest, 1), new Object[] {
			"# #", "###", "###", '#', Item.emerald
		});
		GameRegistry.addRecipe(new ItemStack(Ores.emLeggings, 1), new Object[] {
			"###", "# #", "# #", '#', Item.emerald
		});
		GameRegistry.addRecipe(new ItemStack(Ores.emBoots, 1), new Object[] {
			"# #", "# #", '#', Item.emerald
		});
		
		//tungsten
		
		GameRegistry.addRecipe(new ItemStack(Ores.tunSword, 1), new Object[] {
			"#", "#", "s", '#', Ores.tunMolten, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tunHoe, 1), new Object[] {
			"## ", " s ", " s ", '#', Ores.tunMolten, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tunHoe, 1), new Object[] {
			" ##", " s ", " s ", '#', Ores.tunMolten, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tunShovel, 1), new Object[] {
			"#", "s", "s", '#', Ores.tunMolten, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tunPick, 1), new Object[] {
			"###", " s ", " s ", '#', Ores.tunMolten, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tunAxe, 1), new Object[] {
			"## ", "#s ", " s ", '#', Ores.tunMolten, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tunHoe, 1), new Object[] {
			" ##", " s#", " s ", '#', Ores.tunMolten, 's', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tunHelmet, 1), new Object[] {
			"###", "# #", '#', Ores.tunMolten
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tunChest, 1), new Object[] {
			"# #", "###", "###", '#', Ores.tunMolten
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tunLeggings, 1), new Object[] {
			"###", "# #", "# #", '#', Ores.tunMolten
		});
		GameRegistry.addRecipe(new ItemStack(Ores.tunBoots, 1), new Object[] {
			"# #", "# #", '#', Ores.tunMolten
		});
		
		//tungsten fuel
		
		GameRegistry.registerFuelHandler(new TungstenFuel());
		
		//names ruby
		
		LanguageRegistry.addName(rubyPick, "Ruby Pickaxe");
		LanguageRegistry.addName(rubyAxe, "Ruby Axe");
		LanguageRegistry.addName(rubyHoe, "Ruby Hoe");
		LanguageRegistry.addName(rubyShovel, "Ruby Shovel");
		LanguageRegistry.addName(rubySword, "Ruby Sword");
		LanguageRegistry.addName(rubyIngot, "Ruby Ingot");
		LanguageRegistry.addName(rubyHelmet, "Ruby Helmet");
		LanguageRegistry.addName(rubyChest, "Ruby Chestplate");
		LanguageRegistry.addName(rubyLeggings, "Ruby Leggings");
		LanguageRegistry.addName(rubyBoots, "Ruby Boots");

		//names sapphire

		LanguageRegistry.addName(sapPick, "Sapphire Pickaxe");
		LanguageRegistry.addName(sapAxe, "Sapphire Axe");
		LanguageRegistry.addName(sapHoe, "Sapphire Hoe");
		LanguageRegistry.addName(sapShovel, "Sapphire Shovel");
		LanguageRegistry.addName(sapSword, "Sapphire Sword");
		LanguageRegistry.addName(sapIngot, "Sapphire Ingot");
		LanguageRegistry.addName(sapHelmet, "Sapphire Helmet");
		LanguageRegistry.addName(sapChest, "Sapphire Chestplate");
		LanguageRegistry.addName(sapLeggings, "Sapphire Leggings");
		LanguageRegistry.addName(sapBoots, "Sapphire Boots");

		//names silver

		LanguageRegistry.addName(silPick, "Silver Pickaxe");
		LanguageRegistry.addName(silAxe, "Silver Axe");
		LanguageRegistry.addName(silHoe, "Silver Hoe");
		LanguageRegistry.addName(silShovel, "Silver Shovel");
		LanguageRegistry.addName(silSword, "Silver Sword");
		LanguageRegistry.addName(silIngot, "Silver Ingot");
		LanguageRegistry.addName(silHelmet, "Silver Helmet");
		LanguageRegistry.addName(silChest, "Silver Chestplate");
		LanguageRegistry.addName(silLeggings, "Silver Leggings");
		LanguageRegistry.addName(silBoots, "Silver Boots");

		//names copper

		LanguageRegistry.addName(copPick, "Copper Pickaxe");
		LanguageRegistry.addName(copAxe, "Copper Axe");
		LanguageRegistry.addName(copHoe, "Copper Hoe");
		LanguageRegistry.addName(copShovel, "Copper Shovel");
		LanguageRegistry.addName(copSword, "Copper Sword");
		LanguageRegistry.addName(copIngot, "Copper Ingot");
		LanguageRegistry.addName(copHelmet, "Copper Helmet");
		LanguageRegistry.addName(copChest, "Copper Chestplate");
		LanguageRegistry.addName(copLeggings, "Copper Leggings");
		LanguageRegistry.addName(copBoots, "Copper Boots");

		//names lead

		LanguageRegistry.addName(leadPick, "Lead Pickaxe");
		LanguageRegistry.addName(leadAxe, "Lead Axe");
		LanguageRegistry.addName(leadHoe, "Lead Hoe");
		LanguageRegistry.addName(leadShovel, "Lead Shovel");
		LanguageRegistry.addName(leadSword, "Lead Sword");
		LanguageRegistry.addName(leadIngot, "Lead Ingot");
		LanguageRegistry.addName(leadHelmet, "Lead Helmet");
		LanguageRegistry.addName(leadChest, "Lead Chestplate");
		LanguageRegistry.addName(leadLeggings, "Lead Leggings");
		LanguageRegistry.addName(leadBoots, "Lead Boots");

		//names tin

		LanguageRegistry.addName(tinPick, "Tin Pickaxe");
		LanguageRegistry.addName(tinAxe, "Tin Axe");
		LanguageRegistry.addName(tinHoe, "Tin Hoe");
		LanguageRegistry.addName(tinShovel, "Tin Shovel");
		LanguageRegistry.addName(tinSword, "Tin Sword");
		LanguageRegistry.addName(tinIngot, "Tin Ingot");
		LanguageRegistry.addName(tinHelmet, "Tin Helmet");
		LanguageRegistry.addName(tinChest, "Tin Chestplate");
		LanguageRegistry.addName(tinLeggings, "Tin Leggings");
		LanguageRegistry.addName(tinBoots, "Tin Boots");

		//names aluminum

		LanguageRegistry.addName(aluPick, "Aluminum Pickaxe");
		LanguageRegistry.addName(aluAxe, "Aluminum Axe");
		LanguageRegistry.addName(aluHoe, "Aluminum Hoe");
		LanguageRegistry.addName(aluShovel, "Aluminum Shovel");
		LanguageRegistry.addName(aluSword, "Baseball Bat");
		LanguageRegistry.addName(aluIngot, "Aluminum Ingot");
		LanguageRegistry.addName(aluHelmet, "Aluminum Helmet");
		LanguageRegistry.addName(aluChest, "Aluminum Chestplate");
		LanguageRegistry.addName(aluLeggings, "Aluminum Leggings");
		LanguageRegistry.addName(aluBoots, "Aluminum Boots");

		//names graphene

		LanguageRegistry.addName(graPick, "Graphene Pickaxe");
		LanguageRegistry.addName(graAxe, "Graphene Axe");
		LanguageRegistry.addName(graHoe, "Graphene Hoe");
		LanguageRegistry.addName(graShovel, "Graphene Shovel");
		LanguageRegistry.addName(graSword, "Graphene Sword");
		LanguageRegistry.addName(graIngot, "Graphene Ingot");
		LanguageRegistry.addName(graHelmet, "Graphene Helmet");
		LanguageRegistry.addName(graChest, "Graphene Chestplate");
		LanguageRegistry.addName(graLeggings, "Graphene Leggings");
		LanguageRegistry.addName(graBoots, "Graphene Boots");

		//names amethyst

		LanguageRegistry.addName(amePick, "Amethyst Pickaxe");
		LanguageRegistry.addName(ameAxe, "Amethyst Axe");
		LanguageRegistry.addName(ameHoe, "Amethyst Hoe");
		LanguageRegistry.addName(ameShovel, "Amethyst Shovel");
		LanguageRegistry.addName(ameSword, "Amethyst Sword");
		LanguageRegistry.addName(ameIngot, "Amethyst Ingot");
		LanguageRegistry.addName(ameHelmet, "Amethyst Helmet");
		LanguageRegistry.addName(ameChest, "Amethyst Chestplate");
		LanguageRegistry.addName(ameLeggings, "Amethyst Leggings");
		LanguageRegistry.addName(ameBoots, "Amethyst Boots");

		//names citrine

		LanguageRegistry.addName(citPick, "Citrine Pickaxe");
		LanguageRegistry.addName(citAxe, "Citrine Axe");
		LanguageRegistry.addName(citHoe, "Citrine Hoe");
		LanguageRegistry.addName(citShovel, "Citrine Shovel");
		LanguageRegistry.addName(citSword, "Citrine Sword");
		LanguageRegistry.addName(citIngot, "Citrine Ingot");
		LanguageRegistry.addName(citHelmet, "Citrine Helmet");
		LanguageRegistry.addName(citChest, "Citrine Chestplate");
		LanguageRegistry.addName(citLeggings, "Citrine Leggings");
		LanguageRegistry.addName(citBoots, "Citrine Boots");

		//names rose quartz

		LanguageRegistry.addName(rosePick, "Rose Quartz Pickaxe");
		LanguageRegistry.addName(roseAxe, "Rose Quartz Axe");
		LanguageRegistry.addName(roseHoe, "Rose Quartz Hoe");
		LanguageRegistry.addName(roseShovel, "Rose Quartz Shovel");
		LanguageRegistry.addName(roseSword, "Rose Quartz Sword");
		LanguageRegistry.addName(roseIngot, "Rose Quartz Ingot");
		LanguageRegistry.addName(roseHelmet, "Rose Quartz Helmet");
		LanguageRegistry.addName(roseChest, "Rose Quartz Chestplate");
		LanguageRegistry.addName(roseLeggings, "Rose Quartz Leggings");
		LanguageRegistry.addName(roseBoots, "Rose Quartz Boots");

		//names obsidian

		LanguageRegistry.addName(obsPick, "Obsidian Pickaxe");
		LanguageRegistry.addName(obsAxe, "Obsidian Axe");
		LanguageRegistry.addName(obsHoe, "Obsidian Hoe");
		LanguageRegistry.addName(obsShovel, "Obsidian Shovel");
		LanguageRegistry.addName(obsSword, "Obsidian Sword");
		LanguageRegistry.addName(obsIngot, "Obsidian Ingot");
		LanguageRegistry.addName(obsHelmet, "Obsidian Helmet");
		LanguageRegistry.addName(obsChest, "Obsidian Chestplate");
		LanguageRegistry.addName(obsLeggings, "Obsidian Leggings");
		LanguageRegistry.addName(obsBoots, "Obsidian Boots");

		//names tungsten

		LanguageRegistry.addName(tunPick, "Tungsten Pickaxe");
		LanguageRegistry.addName(tunAxe, "Tungsten Axe");
		LanguageRegistry.addName(tunHoe, "Tungsten Hoe");
		LanguageRegistry.addName(tunShovel, "Tungsten Shovel");
		LanguageRegistry.addName(tunSword, "Tungsten Sword");
		LanguageRegistry.addName(tunIngot, "Tungsten Ingot");
		LanguageRegistry.addName(tunHelmet, "Tungsten Helmet");
		LanguageRegistry.addName(tunChest, "Tungsten Chestplate");
		LanguageRegistry.addName(tunLeggings, "Tungsten Leggings");
		LanguageRegistry.addName(tunBoots, "Tungsten Boots");
		LanguageRegistry.addName(tunMolten, "Molten Tungsten Ingot");
		LanguageRegistry.addName(tunNugget, "Tungsten Nugget");

		//names emerald
		
		
		LanguageRegistry.addName(emPick, "Emerald Pickaxe");
		LanguageRegistry.addName(emAxe, "Emerald Axe");
		LanguageRegistry.addName(emHoe, "Emerald Hoe");
		LanguageRegistry.addName(emShovel, "Emerald Shovel");
		LanguageRegistry.addName(emSword, "Emerald Sword");
		LanguageRegistry.addName(emHelmet, "Emerald Helmet");
		LanguageRegistry.addName(emChest, "Emerald Chestplate");
		LanguageRegistry.addName(emLeggings, "Emerald Leggings");
		LanguageRegistry.addName(emBoots, "Emerald Boots");

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
