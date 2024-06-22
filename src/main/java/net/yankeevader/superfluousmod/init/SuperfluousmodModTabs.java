
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.yankeevader.superfluousmod.init;

import net.yankeevader.superfluousmod.SuperfluousmodMod;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SuperfluousmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SuperfluousmodMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SuperfluousmodModItems.SUPERFLUOUS_INGOT.get());
			tabData.accept(SuperfluousmodModItems.RAW_SUPERFLUOUS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(SuperfluousmodModBlocks.SUPERFLUOUS_ORE.get().asItem());
		}
	}
}
