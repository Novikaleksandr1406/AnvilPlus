package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.enchantment.RiptideEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(RiptideEnchantment.class)
public class ZRiptideMixin {

    @Overwrite
    public int getMaxLevel() {
        return 100;
    }
}
