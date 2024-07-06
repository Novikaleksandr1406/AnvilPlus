package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.PunchEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(PunchEnchantment.class)
public class ZPunchMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
