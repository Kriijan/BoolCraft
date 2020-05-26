package com.github.kriijan.boolcraft.init;

import com.github.kriijan.boolcraft.BoolCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModBlocks {

	//Création d'un registre dans lequel enregistrer les blocks
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, BoolCraft.MODID);

    //Enregistrement et création du block
    public static final RegistryObject<Block> A_BLOCK = BLOCKS.register("a_block", () -> new Block(Block.Properties.create(Material.ROCK)));
    
}