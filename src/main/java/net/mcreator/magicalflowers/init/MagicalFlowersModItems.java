
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalflowers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.magicalflowers.item.YellowhibiscuspetalItem;
import net.mcreator.magicalflowers.item.WhiterosepetalItem;
import net.mcreator.magicalflowers.item.PurplecanterburybellspetalItem;
import net.mcreator.magicalflowers.item.PinklillypetalItem;
import net.mcreator.magicalflowers.item.OrangegerberapetalItem;
import net.mcreator.magicalflowers.item.IconItem;
import net.mcreator.magicalflowers.item.AnthuriumpetalItem;
import net.mcreator.magicalflowers.MagicalFlowersMod;

public class MagicalFlowersModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MagicalFlowersMod.MODID);
	public static final RegistryObject<Item> BLOCKOFPETALS = block(MagicalFlowersModBlocks.BLOCKOFPETALS);
	public static final RegistryObject<Item> WHITEROSE = block(MagicalFlowersModBlocks.WHITEROSE);
	public static final RegistryObject<Item> WHITEROSEPETAL = REGISTRY.register("whiterosepetal", () -> new WhiterosepetalItem());
	public static final RegistryObject<Item> PINKLILLYFLOWER = block(MagicalFlowersModBlocks.PINKLILLYFLOWER);
	public static final RegistryObject<Item> ICON = REGISTRY.register("icon", () -> new IconItem());
	public static final RegistryObject<Item> PINKLILLYPETAL = REGISTRY.register("pinklillypetal", () -> new PinklillypetalItem());
	public static final RegistryObject<Item> ORANGEGERBERA = block(MagicalFlowersModBlocks.ORANGEGERBERA);
	public static final RegistryObject<Item> ORANGEGERBERAPETAL = REGISTRY.register("orangegerberapetal", () -> new OrangegerberapetalItem());
	public static final RegistryObject<Item> ANTHURIUM = doubleBlock(MagicalFlowersModBlocks.ANTHURIUM);
	public static final RegistryObject<Item> ANTHURIUMPETAL = REGISTRY.register("anthuriumpetal", () -> new AnthuriumpetalItem());
	public static final RegistryObject<Item> YELLOWHIBISCUS = block(MagicalFlowersModBlocks.YELLOWHIBISCUS);
	public static final RegistryObject<Item> YELLOWHIBISCUSPETAL = REGISTRY.register("yellowhibiscuspetal", () -> new YellowhibiscuspetalItem());
	public static final RegistryObject<Item> PURPLECANTERBURYBELLS = block(MagicalFlowersModBlocks.PURPLECANTERBURYBELLS);
	public static final RegistryObject<Item> PURPLECANTERBURYBELLSPETAL = REGISTRY.register("purplecanterburybellspetal", () -> new PurplecanterburybellspetalItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
