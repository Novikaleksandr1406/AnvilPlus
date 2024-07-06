package com.sahsa1_1.anvil_plus.mixin;

import net.minecraft.screen.AnvilScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
//NoExp
@Mixin(AnvilScreenHandler.class)
public abstract class NoExpensiveAnvilMixin {
	@ModifyConstant(method = "updateResult", constant = @Constant(intValue = 40))
	private int injected(int value) {
		return Integer.MAX_VALUE;
	}
}

