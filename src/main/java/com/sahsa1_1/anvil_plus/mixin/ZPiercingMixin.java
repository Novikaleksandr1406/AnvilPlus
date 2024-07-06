package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.PiercingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(PiercingEnchantment.class)
public class ZPiercingMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
