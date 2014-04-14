package populo.mod.ores.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;

public class CitrineArmor extends ItemArmor {

	public CitrineArmor(int ID, EnumArmorMaterial material, int par3, int par4) {
		super(ID, material, par4, par4);
		setCreativeTab(Ores.oreModTab);
	}
	
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.citHelmet.itemID) {
			this.itemIcon = reg.registerIcon("ores:cit_helmet");
		} else if (itemID == Ores.citChest.itemID){
			this.itemIcon = reg.registerIcon("ores:cit_chest");
		} else if (itemID == Ores.citLeggings.itemID) {
			this.itemIcon = reg.registerIcon("ores:cit_leggings");
		} else if (itemID == Ores.citBoots.itemID) {
			this.itemIcon = reg.registerIcon("ores:cit_boots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (slot == 2) {
			return "tungsten:textures/armor/citrinearmor_2.png";
		} else {
			return "tungsten:textures/armor/citrinearmor_1.png";
		}
	}
}
