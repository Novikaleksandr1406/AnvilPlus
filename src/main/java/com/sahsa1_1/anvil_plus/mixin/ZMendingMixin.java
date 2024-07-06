package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.MendingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MendingEnchantment.class)
public class ZMendingMixin {

    @Overwrite
    public boolean isTreasure() {
        return false;
    }
}
