package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class SapphireArmor extends ItemArmor {

	public SapphireArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
		setCreativeTab(Ores.oreModTab);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.sapHelmet.itemID) {
			this.itemIcon = reg.registerIcon("ores:sap_helmet");
		} else if (itemID == Ores.sapChest.itemID){
			this.itemIcon = reg.registerIcon("ores:sap_chest");
		} else if (itemID == Ores.sapLeggings.itemID) {
			this.itemIcon = reg.registerIcon("ores:sap_leggings");
		} else if (itemID == Ores.sapBoots.itemID) {
			this.itemIcon = reg.registerIcon("ores:sap_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "tungsten:textures/armor/sapphirearmor_2.png";
		} else {
			return "tungsten:textures/armor/sapphirearmor_1.png";
		}
	}
}
