package de.morgana.morgana;

import de.morgana.morgana.Welcome.Welcome;
import de.morgana.morgana.commands.Info;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Morgana extends JavaPlugin {
    public static FileConfiguration config;
    @Override
    public void onEnable() {
        saveDefaultConfig();
        config = getConfig();
        getCommand("info").setExecutor(new Info());
        getServer().getPluginManager().registerEvents(new Welcome(),this);


        getLogger().info("start");

    }

    @Override
    public void onDisable() {
        getLogger().info("stop");
    }
}
