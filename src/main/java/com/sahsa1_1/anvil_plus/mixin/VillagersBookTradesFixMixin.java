package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.village.TradeOffers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;


@Mixin(TradeOffers.EnchantBookFactory.class)
    public class VillagersBookTradesFixMixin {

    //USE THIS IN THE FUTURE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    @ModifyArg(index = 0, method = "create", at = @At(value = "INVOKE", target = "Ljava/lang/Math;min(II)I"))
    private int capEnchantedBooksAtLevelFour(int original) {
        return 4;
    }
}