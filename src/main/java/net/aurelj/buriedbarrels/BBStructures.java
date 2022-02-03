package net.aurelj.buriedbarrels;

import net.aurelj.buriedbarrels.config.BBConfig;
import net.aurelj.buriedbarrels.structures.*;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.chunk.StructureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;

public class BBStructures {
    
    public static StructureFeature<StructurePoolFeatureConfig> DESERT_PYRAMID_BURIED_BARREL = new DesertPyramidBuriedBarrelStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> JUNGLE_TEMPLE_BURIED_BARREL = new JungleTempleBuriedBarrelStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> ABANDONED_MINESHAFT_BURIED_BARREL = new AbandonedMineshaftBuriedBarrelStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> END_CITY_BURIED_BARREL = new EndCityBuriedBarrelStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> IGLOO_BURIED_BARREL = new IglooBuriedBarrelStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> PILLAGER_OUTPOST_BURIED_BARREL = new PillagerOutpostBuriedBarrelStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> WOODLAND_MANSION_BURIED_BARREL = new WoodlandMansionBuriedBarrelStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> VILLAGE_BURIED_BARREL = new VillageBuriedBarrelStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> STRONGHOLD_BURIED_BARREL = new StrongholdBuriedBarrelStructure(StructurePoolFeatureConfig.CODEC);

    public static void setupAndRegisterStructureFeatures() {

       
        FabricStructureBuilder.create(new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "desert_pyramid_buried_barrel"), DESERT_PYRAMID_BURIED_BARREL)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        5 + BuriedBarrelsMain.CONFIG.desertPyramidBuriedBarrelSpacing,
                        BuriedBarrelsMain.CONFIG.desertPyramidBuriedBarrelSpacing,
                        876341414))
                .register();

        FabricStructureBuilder.create(new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "jungle_temple_buried_barrel"), JUNGLE_TEMPLE_BURIED_BARREL)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        5 + BuriedBarrelsMain.CONFIG.jungleTempleBuriedBarrelSpacing,
                        BuriedBarrelsMain.CONFIG.jungleTempleBuriedBarrelSpacing,
                        462617235))
                .register();

        FabricStructureBuilder.create(new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "abandoned_mineshaft_buried_barrel"), ABANDONED_MINESHAFT_BURIED_BARREL)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        5 + BuriedBarrelsMain.CONFIG.abandonedMineshaftBuriedBarrelSpacing,
                        BuriedBarrelsMain.CONFIG.abandonedMineshaftBuriedBarrelSpacing,
                        482741111))
                .register();

        FabricStructureBuilder.create(new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "end_city_buried_barrel"), END_CITY_BURIED_BARREL)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        5 + BuriedBarrelsMain.CONFIG.endCityBuriedBarrelSpacing,
                        BuriedBarrelsMain.CONFIG.endCityBuriedBarrelSpacing,
                        844822614))
                .register();

        FabricStructureBuilder.create(new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "igloo_buried_barrel"), IGLOO_BURIED_BARREL)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        5 + BuriedBarrelsMain.CONFIG.iglooBuriedBarrelSpacing,
                        BuriedBarrelsMain.CONFIG.iglooBuriedBarrelSpacing,
                        11826151))
                .register();

        FabricStructureBuilder.create(new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "pillager_outpost_buried_barrel"), PILLAGER_OUTPOST_BURIED_BARREL)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        5 + BuriedBarrelsMain.CONFIG.pillagerOutpostBuriedBarrelSpacing,
                        BuriedBarrelsMain.CONFIG.pillagerOutpostBuriedBarrelSpacing,
                        287361511))
                .register();

        FabricStructureBuilder.create(new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "woodland_mansion_buried_barrel"), WOODLAND_MANSION_BURIED_BARREL)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        5 + BuriedBarrelsMain.CONFIG.woodlandMansionBuriedBarrelSpacing,
                        BuriedBarrelsMain.CONFIG.woodlandMansionBuriedBarrelSpacing,
                        992817113))
                .register();

        FabricStructureBuilder.create(new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "village_buried_barrel"), VILLAGE_BURIED_BARREL)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        5 + BuriedBarrelsMain.CONFIG.villageBuriedBarrelSpacing,
                        BuriedBarrelsMain.CONFIG.villageBuriedBarrelSpacing,
                        453557128))
                .register();

        FabricStructureBuilder.create(new Identifier(net.aurelj.buriedbarrels.BuriedBarrelsMain.MODID, "stronghold_buried_barrel"), STRONGHOLD_BURIED_BARREL)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        5 + BuriedBarrelsMain.CONFIG.strongholdBuriedBarrelSpacing,
                        BuriedBarrelsMain.CONFIG.strongholdBuriedBarrelSpacing,
                        453557128))
                .register();

    }
}
