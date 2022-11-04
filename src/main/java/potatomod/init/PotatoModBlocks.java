
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package potatomod.init;

import potatomod.block.PotatoblockBlock;

import potatomod.PotatoMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class PotatoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PotatoMod.MODID);
	public static final RegistryObject<Block> POTATOBLOCK = REGISTRY.register("potatoblock", () -> new PotatoblockBlock());
}
