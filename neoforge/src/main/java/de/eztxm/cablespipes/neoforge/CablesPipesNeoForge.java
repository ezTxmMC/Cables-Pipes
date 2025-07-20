package de.eztxm.cablespipes.neoforge;

import de.eztxm.cablespipes.CablesPipes;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(CablesPipes.MOD_ID)
public final class CablesPipesNeoForge {
    public CablesPipesNeoForge(IEventBus eventBus) {
        // Run our common setup.
        CablesPipes.init();
        CablesPipes.registerBlocks();
        registerBlocks(eventBus);
    }

    public static void registerBlocks(IEventBus eventBus) {
        DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(CablesPipes.MOD_ID);
        BLOCKS.register("basic_energy_cable", () -> CablesPipes.BASIC_ENERGY_CABLE_BLOCK);
        BLOCKS.register(eventBus);
    }
}
