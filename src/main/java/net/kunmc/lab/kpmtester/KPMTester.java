package net.kunmc.lab.kpmtester;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class KPMTester extends JavaPlugin
{

    @Override
    @SuppressWarnings("deprecation")
    public void onEnable()
    {
        getLogger().info("KPMTester is now enabled!");

        getServer().addRecipe(new ShapedRecipe(new NamespacedKey(this, "dummy1"),
                new ItemStack(Material.ACACIA_BOAT)));

        getServer().addRecipe(new ShapedRecipe(new NamespacedKey("kpmtest_withkey", "dummy2"),
                new ItemStack(Material.ACACIA_BOAT)));

        getServer().addRecipe(new ShapedRecipe(new NamespacedKey("kpmtest_nokey", "kpmtest_dummy3"),
                new ItemStack(Material.ACACIA_BOAT)));

        getServer().addRecipe(new ShapedRecipe(new NamespacedKey("kpmtest_fullkey", "dummy4"),
                new ItemStack(Material.ACACIA_BOAT)));
    }

    @Override
    public void onDisable()
    {
        getLogger().info("KPMTester is now disabled!");
    }
}
