package populo.mod.ores.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import populo.mod.ores.Ores;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Pickaxe extends ItemPickaxe {

	public Pickaxe(int ID, EnumToolMaterial material) {
		super(ID, material);
		setCreativeTab(Ores.oreModTab);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		if(itemID == Ores.rubyPick.itemID) {
			this.itemIcon = reg.registerIcon("oremod:ruby_pickaxe");
		} else if (itemID == Ores.sapPick.itemID) {
			this.itemIcon = reg.registerIcon("oremod:sap_pickaxe");
		} else if (itemID == Ores.silPick.itemID) {
			this.itemIcon = reg.registerIcon("oremod:sil_pickaxe");
		} else if (itemID == Ores.copPick.itemID) {
			this.itemIcon = reg.registerIcon("oremod:cop_pickaxe");
		} else if (itemID == Ores.leadPick.itemID) {
			this.itemIcon = reg.registerIcon("oremod:lead_pickaxe");
		} else if (itemID == Ores.tinPick.itemID) { 
			this.itemIcon = reg.registerIcon("oremod:tin_pickaxe");
		} else if (itemID == Ores.aluPick.itemID) {
			this.itemIcon = reg.registerIcon("oremod:alu_pickaxe");
		} else if (itemID == Ores.graPick.itemID) {
			this.itemIcon = reg.registerIcon("oremod:gra_pickaxe");
		} else if (itemID == Ores.amePick.itemID) { 
			this.itemIcon = reg.registerIcon("oremod:ame_pickaxe");
		} else if (itemID == Ores.citPick.itemID) {
			this.itemIcon = reg.registerIcon("oremod:cit_pickaxe");
		} else if (itemID == Ores.rosePick.itemID) {
			this.itemIcon = reg.registerIcon("oremod:rose_pickaxe");
		} else if (itemID == Ores.obsPick.itemID) {
			this.itemIcon = reg.registerIcon("oremod:obs_pickaxe");
		} else if (itemID == Ores.emPick.itemID) {
			this.itemIcon = reg.registerIcon("oremod:em_pickaxe");
		} else if (itemID == Ores.tunPick.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tun_pickaxe");
		}
	}
}
