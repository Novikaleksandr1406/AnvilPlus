package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.EfficiencyEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(EfficiencyEnchantment.class)
public class ZEfficiencyMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
