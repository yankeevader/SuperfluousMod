
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.yankeevader.superfluousmod.init;

import net.yankeevader.superfluousmod.item.SuperfluousIngotItem;
import net.yankeevader.superfluousmod.item.RawSuperfluousItem;
import net.yankeevader.superfluousmod.SuperfluousmodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class SuperfluousmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SuperfluousmodMod.MODID);
	public static final RegistryObject<Item> SUPERFLUOUS_INGOT = REGISTRY.register("superfluous_ingot", () -> new SuperfluousIngotItem());
	public static final RegistryObject<Item> SUPERFLUOUS_ORE = block(SuperfluousmodModBlocks.SUPERFLUOUS_ORE);
	public static final RegistryObject<Item> RAW_SUPERFLUOUS = REGISTRY.register("raw_superfluous", () -> new RawSuperfluousItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
