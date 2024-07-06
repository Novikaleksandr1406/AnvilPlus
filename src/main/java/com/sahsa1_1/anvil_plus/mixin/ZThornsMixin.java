package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.ThornsEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ThornsEnchantment.class)
public class ZThornsMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
