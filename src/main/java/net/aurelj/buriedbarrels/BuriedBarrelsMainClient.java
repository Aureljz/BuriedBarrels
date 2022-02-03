package net.aurelj.buriedbarrels;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.item.Items;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;

public class BuriedBarrelsMainClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ItemTooltipCallback.EVENT.register((stack, context, lines) -> {
            if (stack.isOf(Items.FILLED_MAP) && stack.getName() instanceof TranslatableText name
                    && name.getKey().startsWith("filled_map.buriedbarrels:"))
                for (String line : I18n.translate("text.buried_barrel.map.tooltip").split("\n"))
                    lines.addAll(Text.of(line).getWithStyle(Style.EMPTY.withItalic(true)
                            .withColor(Formatting.DARK_PURPLE)));
        });
    }
}
