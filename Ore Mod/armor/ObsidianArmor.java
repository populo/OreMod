package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class ObsidianArmor extends ItemArmor {

	public ObsidianArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
		setCreativeTab(Ores.oreModTab);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.obsHelmet.itemID) {
			this.itemIcon = reg.registerIcon("oremod:obs_helmet");
		} else if (itemID == Ores.obsChest.itemID){
			this.itemIcon = reg.registerIcon("oremod:obs_chestplate");
		} else if (itemID == Ores.obsLeggings.itemID) {
			this.itemIcon = reg.registerIcon("oremod:obs_leggings");
		} else if (itemID == Ores.obsBoots.itemID) {
			this.itemIcon = reg.registerIcon("oremod:obs_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "oremod:textures/armor/obsidianarmor_2.png";
		} else {
			return "oremod:textures/armor/obsidianarmor_1.png";
		}
	}
}
