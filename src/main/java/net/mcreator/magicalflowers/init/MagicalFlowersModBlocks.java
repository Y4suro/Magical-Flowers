
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalflowers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.magicalflowers.block.BlockofpetalsBlock;
import net.mcreator.magicalflowers.MagicalFlowersMod;

public class MagicalFlowersModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MagicalFlowersMod.MODID);
	public static final RegistryObject<Block> BLOCKOFPETALS = REGISTRY.register("blockofpetals", () -> new BlockofpetalsBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
