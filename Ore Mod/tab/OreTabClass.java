package populo.mod.ores.tab;

import net.minecraft.creativetab.CreativeTabs;
import populo.mod.ores.Ores;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OreTabClass extends CreativeTabs {
	
	public OreTabClass(int par1, String par2Str) {
		super(par1, par2Str);
	}
//sets the image for the creative tab
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		//there is a difference between items and blocks. will give an example of both
		return Ores.rubyIngot.itemID;
	}
		//sets the title/name for the creative tab
	public String getTranslatedTabLabel() {
		return "Ores Mod Tab";
	}
}
