package com.github.kriijan.boolcraft.init;

import java.util.function.Supplier;

import com.github.kriijan.boolcraft.BoolCraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {
	//Création de l'ItemGroup et affectation de l'icône de l'item "An item"
	public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(BoolCraft.MODID, () -> new ItemStack(ModItems.AN_ITEM.get()));
	
	//Permet de récupérer l'icône d'un item (vanilla ou du mod)
	public static class ModItemGroup extends ItemGroup {
		
		private final Supplier<ItemStack> iconSupplier;
		
		public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
			super(name);
			this.iconSupplier = iconSupplier;
		}
		
		@Override
		public ItemStack createIcon() {
			return iconSupplier.get();
		}
	}
	
}
