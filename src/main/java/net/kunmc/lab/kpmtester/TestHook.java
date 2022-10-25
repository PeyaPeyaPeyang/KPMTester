package net.kunmc.lab.kpmtester;

import net.kunmc.lab.kpm.KPMDaemon;
import net.kunmc.lab.kpm.hook.HookListener;
import net.kunmc.lab.kpm.hook.KPMHookRecipient;
import net.kunmc.lab.kpm.hook.hooks.PluginInstalledHook;
import net.kunmc.lab.kpm.hook.hooks.PluginUninstallHook;

public class TestHook extends KPMHookRecipient
{
    protected TestHook(KPMDaemon daemon)
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

}
