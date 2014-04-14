package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class CopperArmor extends ItemArmor {

	public CopperArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.copHelmet.itemID) {
			this.itemIcon = reg.registerIcon("ores:cop_helmet");
		} else if (itemID == Ores.copChest.itemID){
			this.itemIcon = reg.registerIcon("ores:cop_chest");
		} else if (itemID == Ores.copLeggings.itemID) {
			this.itemIcon = reg.registerIcon("ores:cop_leggings");
		} else if (itemID == Ores.copBoots.itemID) {
			this.itemIcon = reg.registerIcon("ores:cop_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "tungsten:textures/armor/copperarmor_2.png";
		} else {
			return "tungsten:textures/armor/copperarmor_1.png";
		}
	}
}
