package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.SweepingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SweepingEnchantment.class)
public class ZSweepingEdgeMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
