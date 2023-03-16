package com.ddwhm.jesen.imblocker.mixin;

import com.ddwhm.jesen.imblocker.ImBlocker;
import com.ddwhm.jesen.imblocker.util.WidgetManager;
import net.minecraft.client.gui.screen.ingame.SignEditScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SignEditScreen.class)
public class MixinSignEditScreenLegacy {

    @Inject(at = @At("RETURN"), method = "<init>", remap = false)
    private void postInit(CallbackInfo info) {
        ImBlocker.LOGGER.debug("SignEditScreen.<init>");
        WidgetManager.updateWidgetStatus(this, true);
    }

}

