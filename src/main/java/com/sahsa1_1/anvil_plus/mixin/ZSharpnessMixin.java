package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.DamageEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(DamageEnchantment.class)
public class ZSharpnessMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
