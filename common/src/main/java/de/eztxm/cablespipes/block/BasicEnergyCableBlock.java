package de.eztxm.cablespipes.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

public class BasicEnergyCableBlock extends Block {
    private final double flowRate = 200;

    public BasicEnergyCableBlock() {
        super(Properties.of().strength(0.5F).requiresCorrectToolForDrops().mapColor(MapColor.METAL));
    }
}
