package populo.mod.ores.materials;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Ingot extends Item {
	public Ingot(int ID, int maxStackSize, CreativeTabs tab) {
		super(ID);
        setMaxStackSize(maxStackSize);
        setCreativeTab(tab);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.rubyIngot.itemID){
			this.itemIcon = reg.registerIcon("oremod:ruby_ingot");
		} else if (itemID == Ores.sapIngot.itemID) {
			this.itemIcon = reg.registerIcon("oremod:sap_ingot");
		} else if (itemID == Ores.silIngot.itemID) {
			this.itemIcon = reg.registerIcon("oremod:sil_ingot");
		} else if (itemID == Ores.copIngot.itemID) {
			this.itemIcon = reg.registerIcon("oremod:cop_ingot");
		} else if (itemID == Ores.leadIngot.itemID) {
			this.itemIcon = reg.registerIcon("oremod:lead_ingot");
		} else if (itemID == Ores.tinIngot.itemID) { 
			this.itemIcon = reg.registerIcon("oremod:tin_ingot");
		} else if (itemID == Ores.aluIngot.itemID) {
			this.itemIcon = reg.registerIcon("oremod:alu_ingot");
		} else if (itemID == Ores.graIngot.itemID) {
			this.itemIcon = reg.registerIcon("oremod:gra_ingot");
		} else if (itemID == Ores.ameIngot.itemID) { 
			this.itemIcon = reg.registerIcon("oremod:ame_ingot");
		} else if (itemID == Ores.citIngot.itemID) {
			this.itemIcon = reg.registerIcon("oremod:cit_ingot");
		} else if (itemID == Ores.roseIngot.itemID) {
			this.itemIcon = reg.registerIcon("oremod:rose_ingot");
		} else if (itemID == Ores.tigIngot.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tig_ingot");
		} else if (itemID == Ores.tunIngot.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tun_ingot");
		} else if (itemID == Ores.tunMolten.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tun_molten");
		}
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack item) {
			return EnumRarity.uncommon;
	}
}
