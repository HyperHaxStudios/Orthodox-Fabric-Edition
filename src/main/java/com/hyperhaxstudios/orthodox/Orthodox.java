package com.hyperhaxstudios.orthodox;

import com.hyperhaxstudios.orthodox.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Orthodox implements ModInitializer {
	public static final String MOD_ID = "orthodox";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Welcome to Orthodox Fabric Edition!");
		ModItems.registerModItems();
	}
}