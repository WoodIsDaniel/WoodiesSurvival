package com.woodisdaniel.woodiessurvival.item;

import com.woodisdaniel.woodiessurvival.WoodiesSurvival;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WoodiesSurvival.MOD_ID);

    public static final RegistryObject<Item> WILDCARROTS = ITEMS.register("wildcarrots",
            () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_MISC)
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .build())
            ));

    public static final RegistryObject<Item> CABBAGELEAF = ITEMS.register("cabbageleaf",
            () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_MISC)
                    .food(new FoodProperties.Builder()
                            .nutrition(1)
                            .build())
            ));

    public static final RegistryObject<Item> OATS = ITEMS.register("oats",
            () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_MISC)
                    .food(new FoodProperties.Builder()
                            .nutrition(1)
                            .build())
            ));

    public static final RegistryObject<Item> OATPORRIDGE = ITEMS.register("oatporridge",
            () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_MISC)
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationMod(2)
                            .build())
                    .stacksTo(1)
            ));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> DIAMOND_POWDER = ITEMS.register("diamond_powder",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RUBY_POWDER = ITEMS.register("ruby_powder",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SAPPHIRE_POWDER = ITEMS.register("sapphire_powder",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> EMERALD_POWDER = ITEMS.register("emerald_powder",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> AMETHYST_POWDER = ITEMS.register("amethyst_powder",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> TOPAZ_POWDER = ITEMS.register("topaz_powder",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> QUARTZ_POWDER = ITEMS.register("quartz_powder",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> LAPIS_LAZULI_POWDER = ITEMS.register("lapis_lazuli_powder",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}