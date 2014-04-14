package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class AluminumArmor extends ItemArmor {

	public AluminumArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.aluHelmet.itemID) {
			this.itemIcon = reg.registerIcon("ores:alu_helmet");
		} else if (itemID == Ores.aluChest.itemID){
			this.itemIcon = reg.registerIcon("ores:alu_chest");
		} else if (itemID == Ores.aluLeggings.itemID) {
			this.itemIcon = reg.registerIcon("ores:alu_leggings");
		} else if (itemID == Ores.aluBoots.itemID) {
			this.itemIcon = reg.registerIcon("ores:alu_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "tungsten:textures/armor/aluminumarmor_2.png";
		} else {
			return "tungsten:textures/armor/aluminumarmor_1.png";
		}
	}
}
