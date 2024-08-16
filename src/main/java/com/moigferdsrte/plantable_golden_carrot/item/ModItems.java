package com.moigferdsrte.plantable_golden_carrot.item;

import com.moigferdsrte.plantable_golden_carrot.PlantableGoldenCarrot;
import com.moigferdsrte.plantable_golden_carrot.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    private static Item registerItems(String id,Item item){
        return Registry.register(Registries.ITEM, Identifier.of(PlantableGoldenCarrot.MOD_ID,id), item);
    }


    public static final Item VITALITY_GOLDEN_CARROT = registerItems("vitality_golden_carrot", new AliasedBlockItem(ModBlocks.GOLDEN_CARROTS, new Item.Settings().rarity(Rarity.RARE)));



    public static void registerModItems(){
        PlantableGoldenCarrot.LOGGER.info("Registering Items");
    }
}
