package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class TungstenArmor extends ItemArmor {

	public TungstenArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.tunHelmet.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tun_helmet");
		} else if (itemID == Ores.tunChest.itemID){
			this.itemIcon = reg.registerIcon("oremod:tun_chestplate");
		} else if (itemID == Ores.tunLeggings.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tun_leggings");
		} else if (itemID == Ores.tunBoots.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tun_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "oremod:textures/armor/armor_2.png";
		} else {
			return "oremod:textures/armor/armor_1.png";
		}
	}

}
