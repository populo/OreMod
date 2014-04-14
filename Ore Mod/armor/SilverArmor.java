package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class SilverArmor extends ItemArmor {

	public SilverArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.silHelmet.itemID) {
			this.itemIcon = reg.registerIcon("ores:sil_helmet");
		} else if (itemID == Ores.silChest.itemID){
			this.itemIcon = reg.registerIcon("ores:sil_chest");
		} else if (itemID == Ores.silLeggings.itemID) {
			this.itemIcon = reg.registerIcon("ores:sil_leggings");
		} else if (itemID == Ores.silBoots.itemID) {
			this.itemIcon = reg.registerIcon("ores:sil_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "tungsten:textures/armor/silverarmor_2.png";
		} else {
			return "tungsten:textures/armor/silverarmor_1.png";
		}
	}
}
