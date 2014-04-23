package populo.mod.ores.world;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.common.IPlantable;
import populo.mod.ores.Ores;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TunSeed extends ItemSeeds implements IPlantable {

	public TunSeed (int ID, int blockType, int soilBlockID) {
		super(ID, blockType, soilBlockID);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		if (itemID == Ores.tunNugget.itemID) {
			this.itemIcon = reg.registerIcon("oremod:tun_nugget");
		}
	}
}
