package com.github.kriijan.boolcraft.blocks.a_block;

import com.github.kriijan.boolcraft.init.ModItemGroups;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class StartupCommon {
	public static ABlock aBlock;
	public static BlockItem itemABlock;
	
	@SubscribeEvent
	public static void onBlocksRegistration(final RegistryEvent.Register<Block> blockRegisterEvent) {
		aBlock = (ABlock)(new ABlock().setRegistryName("boolcraft","a_block"));
		blockRegisterEvent.getRegistry().register(aBlock);
	}
	
	@SubscribeEvent
	public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {
		final int MAXIMUM_STACK_SIZE = 64;
		
		Item.Properties itemProperties= new Item.Properties()
				.maxStackSize(MAXIMUM_STACK_SIZE)
				.group(ModItemGroups.MOD_ITEM_GROUP);
		
		itemABlock = new BlockItem(aBlock, itemProperties);
		itemABlock.setRegistryName(aBlock.getRegistryName());
		itemRegisterEvent.getRegistry().register(itemABlock);
	}
	
	@SubscribeEvent
	public static void onCommonSetupEvent(FMLCommonSetupEvent event) {
		
	}
}
