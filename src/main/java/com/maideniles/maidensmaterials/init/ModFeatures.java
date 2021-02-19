package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.world.feature.tree.MaidensTreeFeature;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraftforge.registries.IForgeRegistry;

public class ModFeatures {
    public static final Feature<TreeFeatureConfig> MAIDENS_TREE = new MaidensTreeFeature();

    public static void registerFeatures(IForgeRegistry<Feature<?>> features) {
        features.register(MAIDENS_TREE.setRegistryName("maidens_tree"));
    }
}
