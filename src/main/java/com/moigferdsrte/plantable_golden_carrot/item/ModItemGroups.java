package com.moigferdsrte.plantable_golden_carrot.item;

import com.moigferdsrte.plantable_golden_carrot.PlantableGoldenCarrot;
import com.moigferdsrte.plantable_golden_carrot.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> CARROT = register("carrot_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of( PlantableGoldenCarrot.MOD_ID, id));
    }

    public static void registerModItemGroups() {
        Registry.register(Registries.ITEM_GROUP, CARROT,
                ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.plantable_golden_carrot.plantable_golden_carrot")).icon(() -> new ItemStack(ModItems.VITALITY_GOLDEN_CARROT))
                        .entries(((displayContext, entries) -> {
                            entries.add(ModItems.VITALITY_GOLDEN_CARROT);
                            entries.add(ModBlocks.GOLDEN_FARMLAND);
                        })).build());
    }
}
