package io.github.sefiraat.danktech2.slimefun;

import io.github.sefiraat.danktech2.DankTech2;
import io.github.sefiraat.danktech2.slimefun.machines.DankCrafter;
import io.github.sefiraat.danktech2.slimefun.machines.DankUnloader;
import io.github.sefiraat.danktech2.theme.ThemeType;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class Machines {

    @Getter
    private static DankCrafter dankCrafter;
    @Getter
    private static DankUnloader dankUnloader;

    public static void setup() {
        final DankTech2 plugin = DankTech2.getInstance();

        final ItemStack cell4 = Materials.getDankCell4().getItem();

        // Crafter
        dankCrafter = new DankCrafter(
            ItemGroups.MACHINES,
            ThemeType.themedSlimefunItemStack(
                "DK2_CRAFTER_1",
                new ItemStack(Material.JUKEBOX),
                ThemeType.MACHINE,
                "Dank Crafter",
                "Crafts and upgrades Dank Packs."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SlimefunItems.REINFORCED_PLATE.asOne(), SlimefunItems.REINFORCED_PLATE.asOne(), SlimefunItems.REINFORCED_PLATE.asOne(),
                SlimefunItems.REINFORCED_PLATE.asOne(), SlimefunItems.RAINBOW_RUNE.asOne(), SlimefunItems.REINFORCED_PLATE.asOne(),
                SlimefunItems.REINFORCED_PLATE.asOne(), SlimefunItems.REINFORCED_PLATE.asOne(), SlimefunItems.REINFORCED_PLATE.asOne(),
            }
        );

        // Unloader
        dankUnloader = new DankUnloader(
            ItemGroups.MACHINES,
            ThemeType.themedSlimefunItemStack(
                "DK2_UNLOADER_1",
                new ItemStack(Material.GLASS),
                ThemeType.MACHINE,
                "Dank Unloader",
                "Pulls out items from your Dank Packs"
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell4, cell4, cell4,
                cell4, new ItemStack(Material.HOPPER), cell4,
                cell4, cell4, cell4
            }
        );

        // Slimefun Registry
        dankCrafter.register(plugin);
        dankUnloader.register(plugin);
    }
}
