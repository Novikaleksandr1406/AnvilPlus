package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.UnbreakingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(UnbreakingEnchantment.class)
public class ZUnbreakingMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
