package com.fazziclay.javaneoutil.bukkit;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("JavaNeoUtil loaded as bukkit-plugin.");
    }
}
