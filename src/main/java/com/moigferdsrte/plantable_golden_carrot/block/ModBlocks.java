package com.moigferdsrte.plantable_golden_carrot.block;

import com.moigferdsrte.plantable_golden_carrot.PlantableGoldenCarrot;
import com.moigferdsrte.plantable_golden_carrot.block.custom.GoldenCarrotsBlock;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block GOLDEN_FARMLAND = register(
            "golden_farmland",
            new FarmlandBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .ticksRandomly()
                            .strength(0.6F)
                            .sounds(BlockSoundGroup.GRAVEL)
                            .blockVision(Blocks::always)
                            .suffocates(Blocks::always)
            )
    );

    public static final Block GOLDEN_CARROTS = Registry.register(
            Registries.BLOCK,Identifier.of(PlantableGoldenCarrot.MOD_ID,"golden_carrots"),
            new GoldenCarrotsBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.WART_BLOCK)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );



    public static Item registerBlockItems(String id, Block block){
        Item item=Registry.register(Registries.ITEM, Identifier.of(PlantableGoldenCarrot.MOD_ID, id), new BlockItem(block , new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return item;
    }

    public static Block register(String id,Block block){
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PlantableGoldenCarrot.MOD_ID, id), block);
    }
    public static void registerModBlocks(){
        PlantableGoldenCarrot.LOGGER.info("Registering Blocks");
    }
}
