
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.yankeevader.superfluousmod.init;

import net.yankeevader.superfluousmod.block.SuperfluousOreBlock;
import net.yankeevader.superfluousmod.SuperfluousmodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class SuperfluousmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SuperfluousmodMod.MODID);
	public static final RegistryObject<Block> SUPERFLUOUS_ORE = REGISTRY.register("superfluous_ore", () -> new SuperfluousOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
