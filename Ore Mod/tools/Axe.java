package populo.mod.ores.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import populo.mod.ores.Ores;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Axe extends ItemAxe {
	
	public Axe(int ID, EnumToolMaterial material) {
		super(ID, material);
		setCreativeTab(Ores.oreModTab);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		if(itemID == Ores.rubyAxe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:ruby_axe");
		} else if (itemID == Ores.sapAxe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:sap_axe");
		} else if (itemID == Ores.silAxe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:sil_axe");
		} else if (itemID == Ores.copAxe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:cop_axe");
		} else if (itemID == Ores.leadAxe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:lead_axe");
		} else if (itemID == Ores.tinAxe.itemID) { 
			this.itemIcon = reg.registerIcon("oremod:tin_axe");
		} else if (itemID == Ores.aluAxe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:alu_axe");
		} else if (itemID == Ores.graAxe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:gra_axe");
		} else if (itemID == Ores.ameAxe.itemID) { 
			this.itemIcon = reg.registerIcon("oremod:ame_axe");
		} else if (itemID == Ores.citAxe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:cit_axe");
		} else if (itemID == Ores.roseAxe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:rose_axe");
		} else if (itemID == Ores.obsAxe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:obs_axe");
		} else if (itemID == Ores.emAxe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:em_axe");
		} else if (itemID == Ores.tunAxe.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tun_axe");
		}
	}
}
