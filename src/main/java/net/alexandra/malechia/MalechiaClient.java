package net.alexandra.malechia;

import net.alexandra.malechia.block.ModBlocks;
import net.alexandra.malechia.util.MalechiaModelPredicateProvider;
import net.minecraft.client.render.RenderLayer;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

public class MalechiaClient implements ClientModInitializer {

	@Override
	public void onInitializeClient(ModContainer mod) {
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), ModBlocks.INFINITY_STAINED_GLASS);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), ModBlocks.INFINITY_STAINED_GLASS);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.ETHEREAL_BUSH);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.ETHEREAL_LEAVES);
		MalechiaModelPredicateProvider.registerModModels();
	}
}
