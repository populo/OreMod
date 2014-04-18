package populo.mod.ores.world;

import net.minecraft.item.ItemStack;
import populo.mod.ores.Ores;
import cpw.mods.fml.common.IFuelHandler;

public class TungstenFuel implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == Ores.tunMoltenBlock.blockID)
			return 250000;
		else if (fuel.itemID == Ores.tunMolten.itemID)
			return 75000;
		else
			return 0;
	}

}
