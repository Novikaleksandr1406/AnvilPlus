package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.LuckEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(LuckEnchantment.class)
public class ZLootingMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
