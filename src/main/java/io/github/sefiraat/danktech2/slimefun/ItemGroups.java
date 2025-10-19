package io.github.sefiraat.danktech2.slimefun;

import io.github.sefiraat.danktech2.DankTech2;
import io.github.sefiraat.danktech2.slimefun.itemgroups.DummyItemGroup;
import io.github.sefiraat.danktech2.theme.ThemeType;
import io.github.sefiraat.danktech2.utils.Keys;
import io.github.sefiraat.danktech2.utils.Skulls;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class ItemGroups {

    public static final NestedItemGroup MAIN = new NestedItemGroup(
        Keys.newKey("main"),
        CustomItemStack.create(
            Skulls.MAIN_HEAD.getPlayerHead(),
            ThemeType.MAIN.getColor() + "DankTech2"
        )
    );

    public static final SubItemGroup MATERIALS = new SubItemGroup(
        Keys.newKey("materials"),
        MAIN,
        CustomItemStack.create(
            Skulls.CELL_9.getPlayerHead(),
            ThemeType.MAIN.getColor() + "Materials"
        )
    );

    public static final SubItemGroup PACKS = new SubItemGroup(
        Keys.newKey("packs"),
        MAIN,
        CustomItemStack.create(
            Skulls.PACK_9.getPlayerHead(),
            ThemeType.MAIN.getColor() + "Dank and Trash Packs"
        )
    );

    public static final SubItemGroup MACHINES = new SubItemGroup(
        Keys.newKey("machines"),
        MAIN,
        CustomItemStack.create(
            new ItemStack(Material.CRAFTING_TABLE),
            ThemeType.MAIN.getColor() + "Dank Machinery"
        )
    );

    public static void setup() {
        final DankTech2 plugin = DankTech2.getInstance();

        // Slimefun Registry
        ItemGroups.MAIN.register(plugin);

    }
}
