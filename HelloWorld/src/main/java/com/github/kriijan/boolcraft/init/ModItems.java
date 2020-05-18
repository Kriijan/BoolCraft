package com.github.kriijan.boolcraft.init;

import com.github.kriijan.boolcraft.BoolCraft;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
	//Création d'un registre dans lequel enregistrer les items
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BoolCraft.MODID);
	
	//Enregistrement et création de l'item
	public static final RegistryObject<Item> AN_ITEM = ITEMS.register("an_item", () -> new Item(new Item.Properties().maxStackSize(64)));
	
	//Enregistrement et création de l'ItemBlock
	public static final RegistryObject<BlockItem> A_BLOCK = ITEMS.register("a_block", () -> new BlockItem(ModBlocks.A_BLOCK.get(), new Item.Properties().maxStackSize(64)));
}
