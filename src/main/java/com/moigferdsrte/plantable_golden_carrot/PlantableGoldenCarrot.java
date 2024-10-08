package com.moigferdsrte.plantable_golden_carrot;

import com.moigferdsrte.plantable_golden_carrot.block.ModBlocks;
import com.moigferdsrte.plantable_golden_carrot.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;
import com.moigferdsrte.plantable_golden_carrot.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlantableGoldenCarrot implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static String MOD_ID="plantable_golden_carrot";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerModItemGroups();


		LOGGER.info("Hello Fabric world!");
	}
}