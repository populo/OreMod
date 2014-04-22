package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class GrapheneArmor extends ItemArmor {

	public GrapheneArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
		setCreativeTab(Ores.oreModTab);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.graHelmet.itemID) {
			this.itemIcon = reg.registerIcon("oremod:gra_helmet");
		} else if (itemID == Ores.graChest.itemID){
			this.itemIcon = reg.registerIcon("oremod:gra_chestplate");
		} else if (itemID == Ores.graLeggings.itemID) {
			this.itemIcon = reg.registerIcon("oremod:gra_leggings");
		} else if (itemID == Ores.graBoots.itemID) {
			this.itemIcon = reg.registerIcon("oremod:gra_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "oremod:textures/armor/graphenearmor_2.png";
		} else {
			return "oremod:textures/armor/graphenearmor_1.png";
		}
	}
}
