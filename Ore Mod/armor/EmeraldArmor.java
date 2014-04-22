package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class EmeraldArmor extends ItemArmor {

	public EmeraldArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
		setCreativeTab(Ores.oreModTab);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.emHelmet.itemID) {
			this.itemIcon = reg.registerIcon("oremod:em_helmet");
		} else if (itemID == Ores.emChest.itemID){
			this.itemIcon = reg.registerIcon("oremod:em_chestplate");
		} else if (itemID == Ores.emLeggings.itemID) {
			this.itemIcon = reg.registerIcon("oremod:em_leggings");
		} else if (itemID == Ores.emBoots.itemID) {
			this.itemIcon = reg.registerIcon("oremod:em_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "oremod:textures/armor/emeraldarmor_2.png";
		} else {
			return "oremod:textures/armor/emeraldarmor_1.png";
		}
	}
}
