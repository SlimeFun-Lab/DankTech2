package io.github.sefiraat.danktech2.theme;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class GuiElements {

    public static final ItemStack MENU_BACKGROUND = CustomItemStack.create(
        Material.BLACK_STAINED_GLASS_PANE,
        " "
    );

    public static final ItemStack MENU_BACKGROUND_INPUT = CustomItemStack.create(
        Material.LIGHT_BLUE_STAINED_GLASS_PANE,
        ChatColor.BLUE + "Input"
    );
}
