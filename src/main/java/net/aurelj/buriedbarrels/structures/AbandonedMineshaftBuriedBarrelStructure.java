package net.aurelj.buriedbarrels.structures;

import com.mojang.serialization.Codec;
import net.aurelj.buriedbarrels.BuriedBarrelsMain;
import net.minecraft.block.BlockState;
import net.minecraft.structure.PoolStructurePiece;
import net.minecraft.structure.PostPlacementProcessor;
import net.minecraft.structure.StructureGeneratorFactory;
import net.minecraft.structure.StructurePiecesGenerator;
import net.minecraft.structure.pool.StructurePoolBasedGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.chunk.VerticalBlockSample;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;

import java.util.Optional;

public class AbandonedMineshaftBuriedBarrelStructure extends StructureFeature<StructurePoolFeatureConfig> {

    public AbandonedMineshaftBuriedBarrelStructure(Codec<StructurePoolFeatureConfig> codec) {
        super(codec, (context) -> {
            if (!AbandonedMineshaftBuriedBarrelStructure.canGenerate(context)) {
                return Optional.empty();
            }
            else {
                return AbandonedMineshaftBuriedBarrelStructure.createPiecesGenerator(context);
            }
        },
        PostPlacementProcessor.EMPTY);
    }

    private static boolean canGenerate(StructureGeneratorFactory.Context<StructurePoolFeatureConfig> context) {
        BlockPos spawnXZPosition = new BlockPos(context.chunkPos().getCenterX()-8, -3, context.chunkPos().getCenterZ()-8);

        int landHeight = context.chunkGenerator().getHeightInGround(spawnXZPosition.getX(), spawnXZPosition.getZ(), Heightmap.Type.WORLD_SURFACE_WG, context.world());

        VerticalBlockSample columnOfBlocks = context.chunkGenerator().getColumnSample(spawnXZPosition.getX(), spawnXZPosition.getZ(), context.world());

        BlockState topBlock = columnOfBlocks.getState(landHeight);

        return topBlock.getFluidState().isEmpty(); //landHeight > 100;
    }

    public static Optional<StructurePiecesGenerator<StructurePoolFeatureConfig>> createPiecesGenerator(StructureGeneratorFactory.Context<StructurePoolFeatureConfig> context) {

        BlockPos blockpos = new BlockPos(context.chunkPos().getCenterX()-8, -3, context.chunkPos().getCenterZ()-8);

        StructurePoolFeatureConfig newConfig = new StructurePoolFeatureConfig(
                () -> context.registryManager().get(Registry.STRUCTURE_POOL_KEY)
                        .get(new Identifier(BuriedBarrelsMain.MODID, "abandoned_mineshaft_buried_barrel_start")),
                10
        );

        StructureGeneratorFactory.Context<StructurePoolFeatureConfig> newContext = new StructureGeneratorFactory.Context<>(
                context.chunkGenerator(),
                context.biomeSource(),
                context.seed(),
                context.chunkPos(),
                newConfig,
                context.world(),
                context.validBiome(),
                context.structureManager(),
                context.registryManager()
        );

        Optional<StructurePiecesGenerator<StructurePoolFeatureConfig>> structurePiecesGenerator =
            StructurePoolBasedGenerator.generate(
                newContext,
                    PoolStructurePiece::new,
                    blockpos,
                    false,
                    true);

        return structurePiecesGenerator;
    }
}