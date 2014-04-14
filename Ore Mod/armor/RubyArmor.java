package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class RubyArmor extends ItemArmor {

	public RubyArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.rubyHelmet.itemID) {
			this.itemIcon = reg.registerIcon("ores:ruby_helmet");
		} else if (itemID == Ores.rubyChest.itemID){
			this.itemIcon = reg.registerIcon("ores:ruby_chest");
		} else if (itemID == Ores.rubyLeggings.itemID) {
			this.itemIcon = reg.registerIcon("ores:ruby_leggings");
		} else if (itemID == Ores.rubyBoots.itemID) {
			this.itemIcon = reg.registerIcon("ores:ruby_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "tungsten:textures/armor/rubyarmor_2.png";
		} else {
			return "tungsten:textures/armor/rubyarmor_1.png";
		}
	}
}
