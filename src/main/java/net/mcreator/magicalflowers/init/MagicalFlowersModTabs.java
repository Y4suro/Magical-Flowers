
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalflowers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.magicalflowers.MagicalFlowersMod;

public class MagicalFlowersModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagicalFlowersMod.MODID);
	public static final RegistryObject<CreativeModeTab> MAGICALFLOWERSTAB = REGISTRY.register("magicalflowerstab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.magical_flowers.magicalflowerstab")).icon(() -> new ItemStack(MagicalFlowersModItems.ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MagicalFlowersModBlocks.BLOCKOFPETALS.get().asItem());
				tabData.accept(MagicalFlowersModBlocks.WHITEROSE.get().asItem());
				tabData.accept(MagicalFlowersModItems.WHITEROSEPETAL.get());
				tabData.accept(MagicalFlowersModBlocks.PINKLILLYFLOWER.get().asItem());
				tabData.accept(MagicalFlowersModItems.PINKLILLYPETAL.get());
				tabData.accept(MagicalFlowersModBlocks.ORANGEGERBERA.get().asItem());
				tabData.accept(MagicalFlowersModItems.ORANGEGERBERAPETAL.get());
				tabData.accept(MagicalFlowersModBlocks.ANTHURIUM.get().asItem());
				tabData.accept(MagicalFlowersModItems.ANTHURIUMPETAL.get());
				tabData.accept(MagicalFlowersModBlocks.YELLOWHIBISCUS.get().asItem());
				tabData.accept(MagicalFlowersModItems.YELLOWHIBISCUSPETAL.get());
				tabData.accept(MagicalFlowersModBlocks.PURPLECANTERBURYBELLS.get().asItem());
				tabData.accept(MagicalFlowersModItems.PURPLECANTERBURYBELLSPETAL.get());
			})

					.build());
}
