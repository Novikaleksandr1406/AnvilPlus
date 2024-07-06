package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.LureEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(LureEnchantment.class)
public class ZLureMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
