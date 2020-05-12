package com.github.kriijan.boolcraft;

import net.minecraftforge.fml.common.Mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("boolcraft")
public final class BoolCraft {
	public static final String MODID = "boolcraft";
	private static final Logger LOGGER = LogManager.getLogger();
	
	public BoolCraft() {
		LOGGER.debug("Hello from BoolCraft !");
	}
}
