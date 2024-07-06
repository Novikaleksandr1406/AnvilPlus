package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.FrostWalkerEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(FrostWalkerEnchantment.class)
public class ZFrostWalkerMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }

    @Overwrite
    public boolean isTreasure() {
        return false;
    }
}
