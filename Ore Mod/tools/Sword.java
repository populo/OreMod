package populo.mod.ores.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import populo.mod.ores.Ores;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Sword extends ItemSword {
	
	public Sword(int ID, EnumToolMaterial material) {
		super(ID, material);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		if(itemID == Ores.rubySword.itemID) {
			this.itemIcon = reg.registerIcon("oremod:ruby_sword");
		} else if (itemID == Ores.sapSword.itemID) {
			this.itemIcon = reg.registerIcon("oremod:sap_sword");
		} else if (itemID == Ores.silSword.itemID) {
			this.itemIcon = reg.registerIcon("oremod:sil_sword");
		} else if (itemID == Ores.copSword.itemID) {
			this.itemIcon = reg.registerIcon("oremod:cop_sword");
		} else if (itemID == Ores.leadSword.itemID) {
			this.itemIcon = reg.registerIcon("oremod:lead_sword");
		} else if (itemID == Ores.tinSword.itemID) { 
			this.itemIcon = reg.registerIcon("oremod:tin_sword");
		} else if (itemID == Ores.aluSword.itemID) {
			this.itemIcon = reg.registerIcon("oremod:alu_sword");
		} else if (itemID == Ores.graSword.itemID) {
			this.itemIcon = reg.registerIcon("oremod:gra_sword");
		} else if (itemID == Ores.ameSword.itemID) { 
			this.itemIcon = reg.registerIcon("oremod:ame_sword");
		} else if (itemID == Ores.citSword.itemID) {
			this.itemIcon = reg.registerIcon("oremod:cit_sword");
		} else if (itemID == Ores.roseSword.itemID) {
			this.itemIcon = reg.registerIcon("oremod:rose_sword");
		} else if (itemID == Ores.tigSword.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tig_sword");
		} else if (itemID == Ores.emSword.itemID) {
			this.itemIcon = reg.registerIcon("oremod:em_sword");
		}
	}
}

