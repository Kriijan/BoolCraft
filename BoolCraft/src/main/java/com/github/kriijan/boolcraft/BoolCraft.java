package com.github.kriijan.boolcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.kriijan.boolcraft.init.ModItems;

@Mod("boolcraft")
public final class BoolCraft {
	public static final String MODID = "boolcraft";
	private static final Logger LOGGER = LogManager.getLogger();
	
	public BoolCraft() {
		LOGGER.debug("Hello from BoolCraft !");
		ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
