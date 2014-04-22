package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class LeadArmor extends ItemArmor {

	public LeadArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
		setCreativeTab(Ores.oreModTab);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.leadHelmet.itemID) {
			this.itemIcon = reg.registerIcon("oremod:lead_helmet");
		} else if (itemID == Ores.leadChest.itemID){
			this.itemIcon = reg.registerIcon("oremod:lead_chestplate");
		} else if (itemID == Ores.leadLeggings.itemID) {
			this.itemIcon = reg.registerIcon("oremod:lead_leggings");
		} else if (itemID == Ores.leadBoots.itemID) {
			this.itemIcon = reg.registerIcon("oremod:lead_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "oremod:textures/armor/leadarmor_2.png";
		} else {
			return "oremod:textures/armor/leadarmor_1.png";
		}
	}
}
