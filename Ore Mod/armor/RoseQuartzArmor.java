package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class RoseQuartzArmor extends ItemArmor {

	public RoseQuartzArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.roseHelmet.itemID) {
			this.itemIcon = reg.registerIcon("ores:rose_helmet");
		} else if (itemID == Ores.roseChest.itemID){
			this.itemIcon = reg.registerIcon("ores:rose_chest");
		} else if (itemID == Ores.roseLeggings.itemID) {
			this.itemIcon = reg.registerIcon("ores:rose_leggings");
		} else if (itemID == Ores.roseBoots.itemID) {
			this.itemIcon = reg.registerIcon("ores:rose_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "tungsten:textures/armor/rosearmor_2.png";
		} else {
			return "tungsten:textures/armor/rosearmor_1.png";
		}
	}
}
