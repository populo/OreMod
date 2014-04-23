package populo.mod.ores.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import populo.mod.ores.Ores;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, random, chunkX*16,chunkZ*16);
		case 0 :
			generateSurface(world, random, chunkX*16,chunkZ*16);
		case 1:
			generateEnd(world, random, chunkX*16,chunkZ*16);
		}
	}
	
	private void generateNether(World world, Random random, int x, int y) {
		
	}
	
	private void generateSurface(World world, Random random, int x, int y) {
		this.addOreSpawn(Ores.rubyOre, world, random, x, y, 16, 16, 3+random.nextInt(3), 7, 0, 50);
		this.addOreSpawn(Ores.sapOre, world, random, x, y, 16, 16, 3+random.nextInt(7), 9, 0, 63);
		this.addOreSpawn(Ores.silOre, world, random, x, y, 16, 16, 5+random.nextInt(4), 10, 34, 100);
		this.addOreSpawn(Ores.graOre, world, random, x, y, 16, 16, 2+random.nextInt(3), 2, 0, 20);
		this.addOreSpawn(Ores.aluOre, world, random, x, y, 16, 16, 7+random.nextInt(3), 10, 30, 100);
		this.addOreSpawn(Ores.copOre, world, random, x, y, 16, 16, 4+random.nextInt(5), 8, 40, 72);
		this.addOreSpawn(Ores.leadOre, world, random, x, y, 16, 16, 3+random.nextInt(4), 6, 0, 31);
		this.addOreSpawn(Ores.tinOre, world, random, x, y, 16, 16, 4+random.nextInt(5), 10, 50, 100);
		this.addOreSpawn(Ores.ameOre, world, random, x, y, 16, 16, 3+random.nextInt(6), 9, 0, 34);
		this.addOreSpawn(Ores.citOre, world, random, x, y, 16, 16, 6+random.nextInt(4), 7, 0, 50);
		this.addOreSpawn(Ores.roseOre, world, random, x, y, 16, 16, 5+random.nextInt(4), 10, 0, 100);
		this.addOreSpawn(Ores.tunOre, world, random, x, y, 16, 16, 4+random.nextInt(3), 7, 0, 42);
	}
	
	private void generateEnd(World world, Random random, int x, int y) {
		
	}

	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
		for(int i = 0; i < chancesToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
}

