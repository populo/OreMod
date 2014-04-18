package populo.mod.ores.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import populo.mod.ores.Ores;

public class OBlock extends Block {

	public OBlock(int ID, String texture) {
		super(ID, Material.rock);
		setCreativeTab(Ores.oreModTab);
		setResistance(19.0F);
		setStepSound(Block.soundStoneFootstep);
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		if (blockID == Ores.rubyBlock.blockID) {
			return Ores.rubyBlock.blockID;
		} else if (blockID == Ores.sapBlock.blockID) {
			return Ores.sapBlock.blockID;
		} else if (blockID == Ores.silBlock.blockID) {
			return Ores.silBlock.blockID;
		} else if (blockID == Ores.copBlock.blockID) {
			return Ores.copBlock.blockID;
		} else if (blockID == Ores.leadBlock.blockID) {
			return Ores.leadBlock.blockID;
		} else if (blockID == Ores.tinBlock.blockID) {
			return Ores.tinBlock.blockID;
		} else if (blockID == Ores.aluBlock.blockID) {
			return Ores.aluBlock.blockID;
		} else if (blockID == Ores.graBlock.blockID) {
			return Ores.graBlock.blockID;
		} else if (blockID == Ores.ameBlock.blockID) {
			return Ores.ameBlock.blockID;
		} else if (blockID == Ores.citBlock.blockID) {
			return Ores.citBlock.blockID;
		} else if (blockID == Ores.roseBlock.blockID) {
			return Ores.roseBlock.blockID;
		} else if (blockID == Ores.tigBlock.blockID) {
			return Ores.tigBlock.blockID;
		} else if (blockID == Ores.tunBlock.blockID) {
			return Ores.tunBlock.blockID;
		} else if (blockID == Ores.tunMoltenBlock.blockID) {
			return Ores.tunMoltenBlock.blockID;
		} else {
			return 0;
		}
	}
	
	public void registerIcons(IconRegister reg) {
		if (blockID == Ores.rubyBlock.blockID) {
			this.blockIcon = reg.registerIcon("oremod:ruby_block");
		} else if (blockID == Ores.sapBlock.blockID) {
			this.blockIcon = reg.registerIcon("oremod:sap_block");
		} else if (blockID == Ores.silBlock.blockID) {
			this.blockIcon = reg.registerIcon("oremod:sil_block");
		} else if (blockID == Ores.copBlock.blockID) {
			this.blockIcon = reg.registerIcon("oremod:cop_block");
		} else if (blockID == Ores.leadBlock.blockID) {
			this.blockIcon = reg.registerIcon("oremod:lead_block");
		} else if (blockID == Ores.tinBlock.blockID) {
			this.blockIcon = reg.registerIcon("oremod:tin_block");
		} else if (blockID == Ores.aluBlock.blockID) {
			this.blockIcon = reg.registerIcon("oremod:alu_block");
		} else if (blockID == Ores.graBlock.blockID) {
			this.blockIcon = reg.registerIcon("oremod:gra_block");
		} else if (blockID == Ores.ameBlock.blockID) {
			this.blockIcon = reg.registerIcon("oremod:ame_block");
		} else if (blockID == Ores.citBlock.blockID) {
			this.blockIcon = reg.registerIcon("oremod:cit_block");
		} else if (blockID == Ores.roseBlock.blockID) {
			this.blockIcon = reg.registerIcon("oremod:rose_block");
		} else if (blockID == Ores.tigBlock.blockID) {
			this.blockIcon = reg.registerIcon("oremod:tig_block");
		} else if (blockID == Ores.tunBlock.blockID) {
			this.blockIcon = reg.registerIcon("oremod:tun_block");
		} else if (blockID == Ores.tunMoltenBlock.blockID) {
			this.blockIcon = reg.registerIcon("oremod:tun_mblock");
		}
	}
}
