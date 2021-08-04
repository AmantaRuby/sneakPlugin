package me.amantaruby.sneakplugin.main;

import me.amantaruby.sneakplugin.main.Events.EventsClass;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "PLUGIN SNEAKING HAS ENABLED");
        getServer().getPluginManager().registerEvents(new EventsClass(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
