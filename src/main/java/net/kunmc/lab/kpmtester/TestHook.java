package net.kunmc.lab.kpmtester;

import net.kunmc.lab.kpm.KPMDaemon;
import net.kunmc.lab.kpm.hook.HookListener;
import net.kunmc.lab.kpm.hook.KPMHookRecipient;
import net.kunmc.lab.kpm.hook.hooks.PluginInstallHook;

public class TestHook extends KPMHookRecipient
{
    protected TestHook(KPMDaemon daemon)
    {
        super(daemon);
    }

    @HookListener
    public void onInstall(PluginInstallHook hook)
    {
        System.out.println("Install fired!");
        System.out.println("Query: " + hook.getResolveQuery());
        System.out.println("Operator: " + hook.getOperator());
    }
}
