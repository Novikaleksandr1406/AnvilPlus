package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.KnockbackEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(KnockbackEnchantment.class)
public class ZKnockbackMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
