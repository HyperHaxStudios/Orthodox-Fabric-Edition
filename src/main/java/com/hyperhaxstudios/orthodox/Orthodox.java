package com.hyperhaxstudios.orthodox;

import com.hyperhaxstudios.orthodox.block.ModBlocks;
import com.hyperhaxstudios.orthodox.item.ModItemGroup;
import com.hyperhaxstudios.orthodox.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Orthodox implements ModInitializer {
	public static final String MOD_ID= "orthodox";
    public static final Logger LOGGER = LoggerFactory.getLogger("orthodox");

	@Override
	public void onInitialize() {
		LOGGER.info("Welcome to Orthodox Fabric Edition!");
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}