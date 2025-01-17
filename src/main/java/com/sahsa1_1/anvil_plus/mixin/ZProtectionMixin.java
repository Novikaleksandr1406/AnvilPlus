package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.ProtectionEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ProtectionEnchantment.class)
public class ZProtectionMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
