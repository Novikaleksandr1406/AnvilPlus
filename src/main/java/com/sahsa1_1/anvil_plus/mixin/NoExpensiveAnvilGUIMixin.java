package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.client.gui.screen.ingame.AnvilScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(AnvilScreen.class)
    public abstract class NoExpensiveAnvilGUIMixin {

    @ModifyConstant(method = "drawForeground", constant = @Constant(intValue = 40))
    private int injected(int value) {
        return Integer.MAX_VALUE;
    }

}

