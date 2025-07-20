package de.eztxm.cablespipes;

import de.eztxm.cablespipes.block.BasicEnergyCableBlock;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.level.block.Block;

public final class CablesPipes {
    public static final String MOD_ID = "cables_and_pipes";

    public static final Block BASIC_ENERGY_CABLE_BLOCK = new BasicEnergyCableBlock();

    public static void init() {
        // Write common init code here.
    }

    @ExpectPlatform
    public static void registerBlocks() {
        throw new AssertionError();
    }
}
