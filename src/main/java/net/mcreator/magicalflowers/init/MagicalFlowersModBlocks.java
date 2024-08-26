
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalflowers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.magicalflowers.block.YellowhibiscusBlock;
import net.mcreator.magicalflowers.block.WhiteroseBlock;
import net.mcreator.magicalflowers.block.PurplecanterburybellsBlock;
import net.mcreator.magicalflowers.block.PinklillyflowerBlock;
import net.mcreator.magicalflowers.block.OrangegerberaBlock;
import net.mcreator.magicalflowers.block.BlockofpetalsBlock;
import net.mcreator.magicalflowers.block.AnthuriumBlock;
import net.mcreator.magicalflowers.MagicalFlowersMod;

public class MagicalFlowersModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MagicalFlowersMod.MODID);
	public static final RegistryObject<Block> BLOCKOFPETALS = REGISTRY.register("blockofpetals", () -> new BlockofpetalsBlock());
	public static final RegistryObject<Block> WHITEROSE = REGISTRY.register("whiterose", () -> new WhiteroseBlock());
	public static final RegistryObject<Block> PINKLILLYFLOWER = REGISTRY.register("pinklillyflower", () -> new PinklillyflowerBlock());
	public static final RegistryObject<Block> ORANGEGERBERA = REGISTRY.register("orangegerbera", () -> new OrangegerberaBlock());
	public static final RegistryObject<Block> ANTHURIUM = REGISTRY.register("anthurium", () -> new AnthuriumBlock());
	public static final RegistryObject<Block> YELLOWHIBISCUS = REGISTRY.register("yellowhibiscus", () -> new YellowhibiscusBlock());
	public static final RegistryObject<Block> PURPLECANTERBURYBELLS = REGISTRY.register("purplecanterburybells", () -> new PurplecanterburybellsBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
