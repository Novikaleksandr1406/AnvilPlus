package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.FireAspectEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(FireAspectEnchantment.class)
public class ZFireAspectMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
