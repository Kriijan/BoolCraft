package com.github.kriijan.boolcraft;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.kriijan.boolcraft.init.ModBlocks;
import com.github.kriijan.boolcraft.init.ModItems;

@Mod("boolcraft")
public final class BoolCraft {
	public static final String MODID = "boolcraft";
	private static final Logger LOGGER = LogManager.getLogger();
	public static IEventBus MOD_EVENT_BUS;
	
	public BoolCraft() {
		LOGGER.debug("Hello from BoolCraft !");
		ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		
		MOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();
		
		registerCommonEvents();
		DistExecutor.runWhenOn(Dist.CLIENT, () -> BoolCraft::registerClientOnlyEvents);
	}
	
	public static void registerCommonEvents() {
		MOD_EVENT_BUS.register(com.github.kriijan.boolcraft.blocks.a_block.StartupCommon.class);
	}
	
	public static void registerClientOnlyEvents() {
		MOD_EVENT_BUS.register(com.github.kriijan.boolcraft.blocks.a_block.StartupClientOnly.class);
	}
}
