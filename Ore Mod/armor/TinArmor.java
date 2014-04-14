package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class TinArmor extends ItemArmor {

	public TinArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.tinHelmet.itemID) {
			this.itemIcon = reg.registerIcon("ores:tin_helmet");
		} else if (itemID == Ores.tinChest.itemID){
			this.itemIcon = reg.registerIcon("ores:tin_chest");
		} else if (itemID == Ores.tinLeggings.itemID) {
			this.itemIcon = reg.registerIcon("ores:tin_leggings");
		} else if (itemID == Ores.tinBoots.itemID) {
			this.itemIcon = reg.registerIcon("ores:tin_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "tungsten:textures/armor/tinarmor_2.png";
		} else {
			return "tungsten:textures/armor/tinarmor_1.png";
		}
	}
}
