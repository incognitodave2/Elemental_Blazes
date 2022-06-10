package net.incognitodave2.elementalblazes.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup TUTORIAL_GROUP = new ItemGroup("elementalBlazesTab")
    {
        @Override
        public ItemStack createIcon ()
        {
            return new ItemStack(ModItems.REDSTONE_BLAZE_SPAWN_EGG.get());
        }
    };
}