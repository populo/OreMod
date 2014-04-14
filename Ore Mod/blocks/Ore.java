package populo.mod.ores.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import populo.mod.ores.Ores;

public class Ore extends Block {

	public Ore(int ID, String texture) {
		super(ID, Material.rock);
		setCreativeTab(Ores.oreModTab);
		setResistance(10.0F);
		setStepSound(Block.soundStoneFootstep);
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		if (blockID == Ores.rubyOre.blockID) {
			return Ores.rubyOre.blockID;
		} else if (blockID == Ores.sapOre.blockID) {
			return Ores.sapOre.blockID;
		} else if (blockID == Ores.silOre.blockID) {
			return Ores.silOre.blockID;
		} else if (blockID == Ores.copOre.blockID) {
			return Ores.copOre.blockID;
		} else if (blockID == Ores.leadOre.blockID) {
			return Ores.leadOre.blockID;
		} else if (blockID == Ores.tinOre.blockID) {
			return Ores.tinOre.blockID;
		} else if (blockID == Ores.aluOre.blockID) {
			return Ores.aluOre.blockID;
		} else if (blockID == Ores.graOre.blockID) {
			return Ores.graOre.blockID;
		} else if (blockID == Ores.ameOre.blockID) {
			return Ores.ameOre.blockID;
		} else if (blockID == Ores.citOre.blockID) {
			return Ores.citOre.blockID;
		} else if (blockID == Ores.roseOre.blockID) {
			return Ores.roseOre.blockID;
		} else if (blockID == Ores.tigOre.blockID) {
			return Ores.tigOre.blockID;
		} else {
			return 0;
		}
	}
	
	public void registerIcons(IconRegister reg) {
		if (blockID == Ores.rubyOre.blockID) {
			this.blockIcon = reg.registerIcon("oremod:ruby_ore");
		} else if (blockID == Ores.sapOre.blockID) {
			this.blockIcon = reg.registerIcon("oremod:sap_ore");
		} else if (blockID == Ores.silOre.blockID) {
			this.blockIcon = reg.registerIcon("oremod:sil_ore");
		} else if (blockID == Ores.copOre.blockID) {
			this.blockIcon = reg.registerIcon("oremod:cop_ore");
		} else if (blockID == Ores.leadOre.blockID) {
			this.blockIcon = reg.registerIcon("oremod:lead_ore");
		} else if (blockID == Ores.tinOre.blockID) {
			this.blockIcon = reg.registerIcon("oremod:tin_ore");
		} else if (blockID == Ores.aluOre.blockID) {
			this.blockIcon = reg.registerIcon("oremod:alu_ore");
		} else if (blockID == Ores.graOre.blockID) {
			this.blockIcon = reg.registerIcon("oremod:gra_ore");
		} else if (blockID == Ores.ameOre.blockID) {
			this.blockIcon = reg.registerIcon("oremod:ame_ore");
		} else if (blockID == Ores.citOre.blockID) {
			this.blockIcon = reg.registerIcon("oremod:cit_ore");
		} else if (blockID == Ores.roseOre.blockID) {
			this.blockIcon = reg.registerIcon("oremod:rose_ore");
		} else if (blockID == Ores.tigOre.blockID) {
			this.blockIcon = reg.registerIcon("oremod:tig_ore");
		}
	}
}
