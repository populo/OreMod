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
		setCreativeTab(Ores.oreModTab);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.tinHelmet.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tin_helmet");
		} else if (itemID == Ores.tinChest.itemID){
			this.itemIcon = reg.registerIcon("oremod:tin_chestplate");
		} else if (itemID == Ores.tinLeggings.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tin_leggings");
		} else if (itemID == Ores.tinBoots.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tin_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "oremod:textures/armor/tinarmor_2.png";
		} else {
			return "oremod:textures/armor/tinarmor_1.png";
		}
	}
}
