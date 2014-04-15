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
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.EnumHelper;
import populo.mod.ores.armor.AluminumArmor;
import populo.mod.ores.armor.AmethystArmor;
import populo.mod.ores.armor.CitrineArmor;
import populo.mod.ores.armor.CopperArmor;
import populo.mod.ores.armor.EmeraldArmor;
import populo.mod.ores.armor.GrapheneArmor;
import populo.mod.ores.armor.LeadArmor;
import populo.mod.ores.armor.RoseQuartzArmor;
import populo.mod.ores.armor.RubyArmor;
import populo.mod.ores.armor.SapphireArmor;
import populo.mod.ores.armor.SilverArmor;
import populo.mod.ores.armor.TigerEyeArmor;
import populo.mod.ores.armor.TinArmor;
import populo.mod.ores.blocks.OBlock;
import populo.mod.ores.blocks.Ore;
import populo.mod.ores.materials.Ingot;
import populo.mod.ores.tab.OreTabClass;
import populo.mod.ores.tools.Axe;
import populo.mod.ores.tools.Hoe;
import populo.mod.ores.tools.Pickaxe;
import populo.mod.ores.tools.Shovel;
import populo.mod.ores.tools.Sword;
import populo.mod.ores.world.WorldGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;




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
	public static EnumToolMaterial RoseQuartzTools = EnumHelper.addToolMaterial("Rose Quartz Tools", 1, 1852, 6.2F, 2.5F, 42);
	public static EnumToolMaterial TigerEyeTools = EnumHelper.addToolMaterial("Tiger's Eye Tools", 3, 1943, 7.5F, 8.6F, 39);
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
	public static EnumArmorMaterial TigerEyeArmor = EnumHelper.addArmorMaterial("Tiger's Eye Armor", 25, new int[]{10, 14, 12, 13}, 39);
	public static EnumArmorMaterial EmeraldArmor = EnumHelper.addArmorMaterial("Emerald Armor", 47, new int[]{17, 16, 18, 15}, 40);
	
	//ruby
	
	public static Item rubyPick;
	public static Item rubyAxe;
	public static Item rubyHoe;
	public static Item rubyShovel;
	public static Item rubySword;
	public static Item rubyHelmet;
	public static Item rubyChest;
	public static Item rubyLeggings;
	public static Item rubyBoots;
	public static Item rubyIngot;
	public static Block rubyOre;
	public static Block rubyBlock;
	
	//sapphire
	
	public static Item sapPick;
	public static Item sapAxe;
	public static Item sapHoe;
	public static Item sapShovel;
	public static Item sapSword;
	public static Item sapHelmet;
	public static Item sapChest;
	public static Item sapLeggings;
	public static Item sapBoots;
	public static Item sapIngot;
	public static Block sapOre;
	public static Block sapBlock;
	
	//silver
	
	public static Item silPick;
	public static Item silAxe;
	public static Item silHoe;
	public static Item silShovel;
	public static Item silSword;
	public static Item silHelmet;
	public static Item silChest;
	public static Item silLeggings;
	public static Item silBoots;
	public static Item silIngot;
	public static Block silOre;
	public static Block silBlock;
	
	//copper
	
	public static Item copPick;
	public static Item copAxe;
	public static Item copHoe;
	public static Item copShovel;
	public static Item copSword;
	public static Item copHelmet;
	public static Item copChest;
	public static Item copLeggings;
	public static Item copBoots;
	public static Item copIngot;
	public static Block copOre;
	public static Block copBlock;
	
	//lead
	
	public static Item leadPick;
	public static Item leadAxe;
	public static Item leadHoe;
	public static Item leadShovel;
	public static Item leadSword;
	public static Item leadHelmet;
	public static Item leadChest;
	public static Item leadLeggings;
	public static Item leadBoots;
	public static Item leadIngot;
	public static Block leadOre;
	public static Block leadBlock;
	
	//tin
	
	public static Item tinPick;
	public static Item tinAxe;
	public static Item tinHoe;
	public static Item tinShovel;
	public static Item tinSword;
	public static Item tinHelmet;
	public static Item tinChest;
	public static Item tinLeggings;
	public static Item tinBoots;
	public static Item tinIngot;
	public static Block tinOre;
	public static Block tinBlock;
	
	//aluminum
	
	public static Item aluPick;
	public static Item aluAxe;
	public static Item aluHoe;
	public static Item aluShovel;
	public static Item aluSword;
	public static Item aluHelmet;
	public static Item aluChest;
	public static Item aluLeggings;
	public static Item aluBoots;
	public static Item aluIngot;
	public static Block aluOre;
	public static Block aluBlock;
	
	//graphene
	
	public static Item graPick;
	public static Item graAxe;
	public static Item graHoe;
	public static Item graShovel;
	public static Item graSword;
	public static Item graHelmet;
	public static Item graChest;
	public static Item graLeggings;
	public static Item graBoots;
	public static Item graIngot;
	public static Block graOre;
	public static Block graBlock;
	
	//amethyst
	
	public static Item amePick;
	public static Item ameAxe;
	public static Item ameHoe;
	public static Item ameShovel;
	public static Item ameSword;
	public static Item ameHelmet;
	public static Item ameChest;
	public static Item ameLeggings;
	public static Item ameBoots;
	public static Item ameIngot;
	public static Block ameOre;
	public static Block ameBlock;
	
	//citrine
	
	public static Item citPick;
	public static Item citAxe;
	public static Item citHoe;
	public static Item citShovel;
	public static Item citSword;
	public static Item citHelmet;
	public static Item citChest;
	public static Item citLeggings;
	public static Item citBoots;
	public static Item citIngot;
	public static Block citOre;
	public static Block citBlock;
	
	//rose quartz
	
	public static Item rosePick;
	public static Item roseAxe;
	public static Item roseHoe;
	public static Item roseShovel;
	public static Item roseSword;
	public static Item roseHelmet;
	public static Item roseChest;
	public static Item roseLeggings;
	public static Item roseBoots;
	public static Item roseIngot;
	public static Block roseOre;
	public static Block roseBlock;
	
	//tiger eye
	
	public static Item tigPick;
	public static Item tigAxe;
	public static Item tigHoe;
	public static Item tigShovel;
	public static Item tigSword;
	public static Item tigHelmet;
	public static Item tigChest;
	public static Item tigLeggings;
	public static Item tigBoots;
	public static Item tigIngot;
	public static Block tigOre;
	public static Block tigBlock;
	
	//emerald
	
	public static Item emPick;
	public static Item emAxe;
	public static Item emHoe;
	public static Item emShovel;
	public static Item emSword;
	public static Item emHelmet;
	public static Item emChest;
	public static Item emLeggings;
	public static Item emBoots;

	
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
		tigIngot = new Ingot(6011, 64, Ores.oreModTab).setUnlocalizedName("tigIngot");

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
		tigPick = (ItemPickaxe) new Pickaxe(6023, TigerEyeTools).setUnlocalizedName("tigPick");
		emPick = (ItemPickaxe) new Pickaxe(6024, EmeraldTools).setUnlocalizedName("emPick");

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
		tigAxe = (ItemAxe) new Axe(6036, TigerEyeTools).setUnlocalizedName("tigAxe");
		emAxe = (ItemAxe) new Axe(6037, EmeraldTools).setUnlocalizedName("emAxe");

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
		tigHoe = (ItemHoe) new Hoe(6049, TigerEyeTools).setUnlocalizedName("tigHoe");
		emHoe = (ItemHoe) new Hoe(6050, EmeraldTools).setUnlocalizedName("emHoe");

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
		tigShovel = (ItemSpade) new Shovel(6062, TigerEyeTools).setUnlocalizedName("tigShovel");
		emShovel = (ItemSpade) new Shovel(6063, EmeraldTools).setUnlocalizedName("emShovel");

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
		tigSword = (ItemSword) new Sword(6075, TigerEyeTools).setUnlocalizedName("tigSword");
		emSword = (ItemSword) new Sword(6076, EmeraldTools).setUnlocalizedName("emSword");
		
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
		tigHelmet = (ItemArmor) new TigerEyeArmor(6088, TigerEyeArmor, 5, 0).setUnlocalizedName("tigHelmet");
		emHelmet = (ItemArmor) new EmeraldArmor(6089, EmeraldArmor, 5, 0).setUnlocalizedName("emHelmet");
		
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
		tigChest = (ItemArmor) new TigerEyeArmor(6101, TigerEyeArmor, 5, 1).setUnlocalizedName("tigChest");
		emChest = (ItemArmor) new EmeraldArmor(6102, EmeraldArmor, 5, 1).setUnlocalizedName("emChest");
		
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
		tigLeggings = (ItemArmor) new TigerEyeArmor(6114, TigerEyeArmor, 5, 2).setUnlocalizedName("tigLeggings");
		emLeggings = (ItemArmor) new EmeraldArmor(6115, EmeraldArmor, 5, 2).setUnlocalizedName("emLeggings");
		
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
		tigBoots = (ItemArmor) new TigerEyeArmor(6127, TigerEyeArmor, 5, 3).setUnlocalizedName("tigBoots");
		emBoots = (ItemArmor) new EmeraldArmor(6128, EmeraldArmor, 5, 3).setUnlocalizedName("emBoots");
		
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
		tigOre = new Ore(3512, "tigOre").setUnlocalizedName("tigOre").setHardness(7.8F);
		
		
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
		tigBlock = new OBlock(3524, "tigBlock").setUnlocalizedName("tigBlock").setHardness(10.4F);
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
		proxy.registerBlocks();
		
		//world gen
		
		GameRegistry.registerWorldGenerator(new WorldGen());;
	}
	
}
