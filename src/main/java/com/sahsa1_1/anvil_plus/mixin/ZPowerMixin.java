package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.PowerEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(PowerEnchantment.class)
public class ZPowerMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
