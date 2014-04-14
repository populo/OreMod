package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class TigerEyeArmor extends ItemArmor {

	public TigerEyeArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
		setCreativeTab(Ores.oreModTab);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.tigHelmet.itemID) {
			this.itemIcon = reg.registerIcon("ores:tig_helmet");
		} else if (itemID == Ores.tigChest.itemID){
			this.itemIcon = reg.registerIcon("ores:tig_chest");
		} else if (itemID == Ores.tigLeggings.itemID) {
			this.itemIcon = reg.registerIcon("ores:tig_leggings");
		} else if (itemID == Ores.tigBoots.itemID) {
			this.itemIcon = reg.registerIcon("ores:tig_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "tungsten:textures/armor/tigerarmor_2.png";
		} else {
			return "tungsten:textures/armor/tigerarmor_1.png";
		}
	}
}
