package populo.mod.ores.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;
import populo.mod.ores.Ores;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Shovel extends ItemSpade {
	
	public Shovel(int ID, EnumToolMaterial material) {
		super(ID, material);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		if(itemID == Ores.rubyShovel.itemID) {
			this.itemIcon = reg.registerIcon("oremod:ruby_shovel");
		} else if (itemID == Ores.sapShovel.itemID) {
			this.itemIcon = reg.registerIcon("oremod:sap_shovel");
		} else if (itemID == Ores.silShovel.itemID) {
			this.itemIcon = reg.registerIcon("oremod:sil_shovel");
		} else if (itemID == Ores.copShovel.itemID) {
			this.itemIcon = reg.registerIcon("oremod:cop_shovel");
		} else if (itemID == Ores.leadShovel.itemID) {
			this.itemIcon = reg.registerIcon("oremod:lead_shovel");
		} else if (itemID == Ores.tinShovel.itemID) { 
			this.itemIcon = reg.registerIcon("oremod:tin_shovel");
		} else if (itemID == Ores.aluShovel.itemID) {
			this.itemIcon = reg.registerIcon("oremod:alu_shovel");
		} else if (itemID == Ores.graShovel.itemID) {
			this.itemIcon = reg.registerIcon("oremod:gra_shovel");
		} else if (itemID == Ores.ameShovel.itemID) { 
			this.itemIcon = reg.registerIcon("oremod:ame_shovel");
		} else if (itemID == Ores.citShovel.itemID) {
			this.itemIcon = reg.registerIcon("oremod:cit_shovel");
		} else if (itemID == Ores.roseShovel.itemID) {
			this.itemIcon = reg.registerIcon("oremod:rose_shovel");
		} else if (itemID == Ores.tigShovel.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tig_shovel");
		} else if (itemID == Ores.emShovel.itemID) {
			this.itemIcon = reg.registerIcon("oremod:em_shovel");
		}
	}
}
