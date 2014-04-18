package populo.mod.ores.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import populo.mod.ores.Ores;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Hoe extends ItemHoe {

	public Hoe(int ID, EnumToolMaterial material) {
		super(ID, material);
		setCreativeTab(Ores.oreModTab);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		if(itemID == Ores.rubyHoe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:ruby_hoe");
		} else if (itemID == Ores.sapHoe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:sap_hoe");
		} else if (itemID == Ores.silHoe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:sil_hoe");
		} else if (itemID == Ores.copHoe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:cop_hoe");
		} else if (itemID == Ores.leadHoe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:lead_hoe");
		} else if (itemID == Ores.tinHoe.itemID) { 
			this.itemIcon = reg.registerIcon("oremod:tin_hoe");
		} else if (itemID == Ores.aluHoe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:alu_hoe");
		} else if (itemID == Ores.graHoe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:gra_hoe");
		} else if (itemID == Ores.ameHoe.itemID) { 
			this.itemIcon = reg.registerIcon("oremod:ame_hoe");
		} else if (itemID == Ores.citHoe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:cit_hoe");
		} else if (itemID == Ores.roseHoe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:rose_hoe");
		} else if (itemID == Ores.tigHoe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tig_hoe");
		} else if (itemID == Ores.emHoe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:em_hoe");
		} else if (itemID == Ores.tunHoe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tun_hoe");
		}
	}
}
