package net.stinky.firstmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.stinky.firstmod.FirstMod;

import java.awt.*;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FIRST_MOD = CREATIVE_MODE_TABS.register("first_mod",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.goonmetolife.get()))
                    .title(Component.translatable("creativetab.first_mod"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.goonmetolife.get());
                        pOutput.accept(ModItems.tripletihavebecome.get());
                    })
                    .build());


    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
