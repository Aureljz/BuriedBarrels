package net.aurelj.buriedbarrels;

import net.minecraft.structure.PlainsVillageData;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredStructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;

public class BBConfiguredStructures {

    public static ConfiguredStructureFeature<?, ?> CONFIGURED_DESERT_PYRAMID_BURIED_BARREL = BBStructures.DESERT_PYRAMID_BURIED_BARREL
            .configure(new StructurePoolFeatureConfig(() -> PlainsVillageData.STRUCTURE_POOLS, 0));
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_JUNGLE_TEMPLE_BURIED_BARREL = BBStructures.JUNGLE_TEMPLE_BURIED_BARREL
            .configure(new StructurePoolFeatureConfig(() -> PlainsVillageData.STRUCTURE_POOLS, 0));
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_ABANDONED_MINESHAFT_BURIED_BARREL = BBStructures.ABANDONED_MINESHAFT_BURIED_BARREL
            .configure(new StructurePoolFeatureConfig(() -> PlainsVillageData.STRUCTURE_POOLS, 0));
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_END_CITY_BURIED_BARREL = BBStructures.END_CITY_BURIED_BARREL
            .configure(new StructurePoolFeatureConfig(() -> PlainsVillageData.STRUCTURE_POOLS, 0));
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_IGLOO_BURIED_BARREL = BBStructures.IGLOO_BURIED_BARREL
            .configure(new StructurePoolFeatureConfig(() -> PlainsVillageData.STRUCTURE_POOLS, 0));
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_PILLAGER_OUTPOST_BURIED_BARREL = BBStructures.PILLAGER_OUTPOST_BURIED_BARREL
            .configure(new StructurePoolFeatureConfig(() -> PlainsVillageData.STRUCTURE_POOLS, 0));
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_WOODLAND_MANSION_BURIED_BARREL = BBStructures.WOODLAND_MANSION_BURIED_BARREL
            .configure(new StructurePoolFeatureConfig(() -> PlainsVillageData.STRUCTURE_POOLS, 0));
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_VILLAGE_BURIED_BARREL = BBStructures.VILLAGE_BURIED_BARREL
            .configure(new StructurePoolFeatureConfig(() -> PlainsVillageData.STRUCTURE_POOLS, 0));
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_STRONGHOLD_BURIED_BARREL = BBStructures.STRONGHOLD_BURIED_BARREL
            .configure(new StructurePoolFeatureConfig(() -> PlainsVillageData.STRUCTURE_POOLS, 0));
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_COMMON_HIDDEN_BURIED_BARREL = BBStructures.COMMON_HIDDEN_BURIED_BARREL
            .configure(new StructurePoolFeatureConfig(() -> PlainsVillageData.STRUCTURE_POOLS, 0));



    public static void registerConfiguredStructures() {
        Registry<ConfiguredStructureFeature<?, ?>> registry = BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE;
        Registry.register(registry, new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "configured_desert_pyramid_buried_barrel"), CONFIGURED_DESERT_PYRAMID_BURIED_BARREL);
        Registry.register(registry, new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "configured_jungle_temple_buried_barrel"), CONFIGURED_JUNGLE_TEMPLE_BURIED_BARREL);
        Registry.register(registry, new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "configured_abandoned_mineshaft_buried_barrel"), CONFIGURED_ABANDONED_MINESHAFT_BURIED_BARREL);
        Registry.register(registry, new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "configured_end_city_buried_barrel"), CONFIGURED_END_CITY_BURIED_BARREL);
        Registry.register(registry, new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "configured_igloo_buried_barrel"), CONFIGURED_IGLOO_BURIED_BARREL);
        Registry.register(registry, new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "configured_pillager_outpost_buried_barrel"), CONFIGURED_PILLAGER_OUTPOST_BURIED_BARREL);
        Registry.register(registry, new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "configured_stronghold_buried_barrel"), CONFIGURED_STRONGHOLD_BURIED_BARREL);
        Registry.register(registry, new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "configured_village_buried_barrel"), CONFIGURED_VILLAGE_BURIED_BARREL);
        Registry.register(registry, new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "configured_woodland_mansion_buried_barrel"), CONFIGURED_WOODLAND_MANSION_BURIED_BARREL);
        Registry.register(registry, new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "configured_common_hidden_buried_barrel"), CONFIGURED_COMMON_HIDDEN_BURIED_BARREL);

    }
}
