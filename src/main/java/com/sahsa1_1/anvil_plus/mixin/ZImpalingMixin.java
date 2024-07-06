package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.ImpalingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ImpalingEnchantment.class)
public class ZImpalingMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
