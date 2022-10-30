package net.kunmc.lab.kpmtester;

import net.kunmc.lab.kpm.KPMDaemon;
import net.kunmc.lab.kpm.hook.HookListener;
import net.kunmc.lab.kpm.hook.KPMHookRecipient;
import net.kunmc.lab.kpm.hook.hooks.PluginInstalledHook;
import net.kunmc.lab.kpm.hook.hooks.PluginUninstallHook;
import net.kunmc.lab.kpm.hook.hooks.RecipesUnregisteringHook;
import org.bukkit.Keyed;

public class TestHook extends KPMHookRecipient
{
    public TestHook(KPMDaemon daemon)
    {
        super(daemon);
    }

    @HookListener
    public void onInstall(PluginInstalledHook hook)
    {
        System.out.println("Install fired!");
        System.out.println("Query: " + hook.getResolveQuery());
        System.out.println("Operator: " + hook.getOperator());
    }

    @HookListener
    public void onUninstallPre(PluginUninstallHook.Pre hook)
    {
        System.out.println("Uninstall.Pre fired!");
        System.out.println("Plugin: " + hook.getPlugin());
    }

    @HookListener
    public void onUninstallPost(PluginUninstallHook.Post hook)
    {
        System.out.println("Uninstall.Post fired!");
        System.out.println("Plugin: " + hook.getPluginDescription());
    }

    @HookListener
    public void onRecipeSearching(RecipesUnregisteringHook.Searching hook)
    {
        System.out.println("Recipe.Searching fired!");
        System.out.println("Targets: " + String.join(",", hook.getTargetNamespaces()));
    }

    @HookListener
    public void onRecipeUnregistering(RecipesUnregisteringHook.Pre hook)
    {
        System.out.println("Recipe.Pre fired!");
        System.out.println("Target: " + ((Keyed) hook.getRecipe()).getKey());
    }

    @HookListener
    public void onRecipeUnregistered(RecipesUnregisteringHook.Post hook)
    {
        System.out.println("Recipe.Post fired!");
        System.out.println("Target: " + ((Keyed) hook.getRecipe()).getKey());
    }
}
