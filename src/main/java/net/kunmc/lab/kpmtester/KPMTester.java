package net.kunmc.lab.kpmtester;

import org.bukkit.plugin.java.JavaPlugin;

public final class KPMTester extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        getLogger().info("KPMTester is now enabled!");
    }

    @Override
    public void onDisable()
    {
        getLogger().info("KPMTester is now disabled!");
    }
}
