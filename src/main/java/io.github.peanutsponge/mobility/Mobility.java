package io.github.peanutsponge.mobility;

import eu.midnightdust.lib.config.MidnightConfig;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mobility implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Better Mobility");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
		MidnightConfig.init("mobility", MobilityConfig.class);
	}
}
