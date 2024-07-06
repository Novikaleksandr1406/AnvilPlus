package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.SoulSpeedEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SoulSpeedEnchantment.class)
public class ZSoulSpeedMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }

    @Overwrite
    public boolean isTreasure() {
        return false;
    }

    @Overwrite
    public boolean isAvailableForEnchantedBookOffer() {
        return true;
    }

    @Overwrite
    public boolean isAvailableForRandomSelection() {
        return true;
    }
}
