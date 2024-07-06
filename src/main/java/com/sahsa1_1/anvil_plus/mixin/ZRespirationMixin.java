package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.RespirationEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(RespirationEnchantment.class)
public class ZRespirationMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
