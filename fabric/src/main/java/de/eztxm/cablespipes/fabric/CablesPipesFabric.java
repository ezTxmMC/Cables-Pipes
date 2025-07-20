package de.eztxm.cablespipes.fabric;

import de.eztxm.cablespipes.CablesPipes;
import net.fabricmc.api.ModInitializer;

public final class CablesPipesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        CablesPipes.init();
    }
}
