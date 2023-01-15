package net.kunmc.lab.kpmtester;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Server;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class KPMTester extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getLogger().info("KPMTester is now enabled!");

        registerRecipes(this, Bukkit.getServer());
    }

    @SuppressWarnings("deprecation")
    private static void registerRecipes(Plugin plugin, Server server)
    {
        server.addRecipe(new FurnaceRecipe(new NamespacedKey(plugin, "dummy1"),
                new ItemStack(Material.ACACIA_BOAT), Material.BOOK, 0, 5));

        server.addRecipe(new FurnaceRecipe(new NamespacedKey("kpmtest_withkey", "dummy2"),
                new ItemStack(Material.ACACIA_BOAT), Material.BOOK, 0, 5));

        server.addRecipe(new FurnaceRecipe(new NamespacedKey("kpmtest_nokey", "kpmtest_dummy3"),
                new ItemStack(Material.ACACIA_BOAT), Material.BOOK, 0, 5));

        server.addRecipe(new FurnaceRecipe(new NamespacedKey("kpmtest_fullkey", "dummy4"),
                new ItemStack(Material.ACACIA_BOAT), Material.BOOK, 0, 5));
    }

    @Override
    public void onDisable()
    {
        getLogger().info("KPMTester is now disabled!");
    }
}
