package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class AmethystArmor extends ItemArmor {

	public AmethystArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
		setCreativeTab(Ores.oreModTab);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.ameHelmet.itemID) {
			this.itemIcon = reg.registerIcon("ores:ame_helmet");
		} else if (itemID == Ores.ameChest.itemID){
			this.itemIcon = reg.registerIcon("ores:ame_chest");
		} else if (itemID == Ores.ameLeggings.itemID) {
			this.itemIcon = reg.registerIcon("ores:ame_leggings");
		} else if (itemID == Ores.ameBoots.itemID) {
			this.itemIcon = reg.registerIcon("ores:ame_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "tungsten:textures/armor/amethystarmor_2.png";
		} else {
			return "tungsten:textures/armor/amethystarmor_1.png";
		}
	}
}
