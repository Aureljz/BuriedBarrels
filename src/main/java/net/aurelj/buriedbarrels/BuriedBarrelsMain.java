package net.aurelj.buriedbarrels;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.aurelj.buriedbarrels.config.BBConfig;
import net.aurelj.buriedbarrels.init.LootInjector;
import net.aurelj.buriedbarrels.util.BiomePredicateUtil;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BuriedBarrelsMain implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "buriedbarrels";
    public static BBConfig CONFIG;

    @Override
    public void onInitialize() {

        AutoConfig.register(BBConfig.class, JanksonConfigSerializer::new);

        CONFIG = AutoConfig.getConfigHolder(BBConfig.class).getConfig();

        BBStructures.setupAndRegisterStructureFeatures();
        BBConfiguredStructures.registerConfiguredStructures();
        addStructureSpawningToDimensionsAndBiomes();

        LootInjector.init();
    }

    public static void addStructureSpawningToDimensionsAndBiomes() {

        BiomeModifications.addStructure(
                BiomeSelectors.foundInOverworld()
                        .and(BiomeSelectors.categories(
                                Biome.Category.DESERT, Biome.Category.MESA)
                        .and(BiomePredicateUtil.booleanToPredicate(BuriedBarrelsMain.CONFIG.desertPyramidBuriedBarrelGenerates))),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(BBConfiguredStructures.CONFIGURED_DESERT_PYRAMID_BURIED_BARREL))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.foundInOverworld()
                        .and(BiomeSelectors.categories(
                                        Biome.Category.JUNGLE)
                                .and(BiomePredicateUtil.booleanToPredicate(BuriedBarrelsMain.CONFIG.jungleTempleBuriedBarrelGenerates))),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(BBConfiguredStructures.CONFIGURED_JUNGLE_TEMPLE_BURIED_BARREL))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.foundInOverworld()
                        .and(BiomeSelectors.categories(
                                        Biome.Category.PLAINS, Biome.Category.MESA, Biome.Category.SAVANNA, Biome.Category.EXTREME_HILLS)
                                .and(BiomePredicateUtil.booleanToPredicate(BuriedBarrelsMain.CONFIG.abandonedMineshaftBuriedBarrelGenerates))),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(BBConfiguredStructures.CONFIGURED_ABANDONED_MINESHAFT_BURIED_BARREL))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.foundInTheEnd().and(BiomePredicateUtil.booleanToPredicate(BuriedBarrelsMain.CONFIG.endCityBuriedBarrelGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(BBConfiguredStructures.CONFIGURED_END_CITY_BURIED_BARREL))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.foundInOverworld()
                        .and(BiomeSelectors.categories(
                                        Biome.Category.ICY, Biome.Category.TAIGA)
                                .and(BiomePredicateUtil.booleanToPredicate(BuriedBarrelsMain.CONFIG.iglooBuriedBarrelGenerates))),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(BBConfiguredStructures.CONFIGURED_IGLOO_BURIED_BARREL))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.foundInOverworld()
                        .and(BiomeSelectors.categories(
                                        Biome.Category.PLAINS, Biome.Category.SAVANNA, Biome.Category.FOREST, Biome.Category.TAIGA)
                                .and(BiomePredicateUtil.booleanToPredicate(BuriedBarrelsMain.CONFIG.pillagerOutpostBuriedBarrelGenerates))),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(BBConfiguredStructures.CONFIGURED_PILLAGER_OUTPOST_BURIED_BARREL))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.foundInOverworld()
                        .and(BiomeSelectors.categories(
                                        Biome.Category.FOREST)
                                .and(BiomePredicateUtil.booleanToPredicate(BuriedBarrelsMain.CONFIG.woodlandMansionBuriedBarrelGenerates))),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(BBConfiguredStructures.CONFIGURED_WOODLAND_MANSION_BURIED_BARREL))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.foundInOverworld()
                        .and(BiomeSelectors.categories(
                                        Biome.Category.PLAINS, Biome.Category.SAVANNA, Biome.Category.ICY)
                                .and(BiomePredicateUtil.booleanToPredicate(BuriedBarrelsMain.CONFIG.villageBuriedBarrelGenerates))),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(BBConfiguredStructures.CONFIGURED_VILLAGE_BURIED_BARREL))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.foundInOverworld()
                        .and(BiomeSelectors.categories(
                                        Biome.Category.EXTREME_HILLS, Biome.Category.PLAINS, Biome.Category.FOREST)
                                .and(BiomePredicateUtil.booleanToPredicate(BuriedBarrelsMain.CONFIG.strongholdBuriedBarrelGenerates))),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(BBConfiguredStructures.CONFIGURED_STRONGHOLD_BURIED_BARREL))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.foundInOverworld()
                        .and(BiomePredicateUtil.booleanToPredicate(BuriedBarrelsMain.CONFIG.commonHiddenBuriedBarrelGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(BBConfiguredStructures.CONFIGURED_COMMON_HIDDEN_BURIED_BARREL))
        );
    }
}
