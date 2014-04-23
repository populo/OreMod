package populo.mod.ores.world;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import populo.mod.ores.Ores;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Plant extends BlockCrops {

	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;
	
	public Plant(int par1) {
		super(par1);
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) {
		if (metadata < 7) {
			if (metadata == 6) {
				metadata = 5;
			}
			return iconArray[metadata >> 1];
		}
		
		return iconArray[3];
	}
	
	public int getSeedItem() {
		return Ores.tunNugget.itemID;
	}
	
	public int getCropItem() {
		return Ores.tunNugget.itemID;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.iconArray = new Icon[4];
		
		for(int i = 0; i < this.iconArray.length; i++) {
			this.iconArray[i] = reg.registerIcon("oremod:tun_plant_" + (i+1));
		}
	}
}
