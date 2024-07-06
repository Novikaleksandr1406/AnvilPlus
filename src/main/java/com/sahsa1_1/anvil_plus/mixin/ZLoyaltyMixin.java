package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.LoyaltyEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(LoyaltyEnchantment.class)
public class ZLoyaltyMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
