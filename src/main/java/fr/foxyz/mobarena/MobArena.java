package fr.foxyz.mobarena;

import fr.foxyz.mobarena.commands.MobArenaCmd;
import fr.foxyz.mobarena.core.listeners.ArenaListeners;
import fr.foxyz.mobarena.core.listeners.MobListeners;
import fr.foxyz.mobarena.core.listeners.PlayerListeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MobArena extends JavaPlugin {

    public static final String PREFIX = "§9MobArena > §7";
    public static final String ERROR = "§cMobArena > §7";

    @Override
    public void onEnable() {
        // register listeners
        Bukkit.getPluginManager().registerEvents(new PlayerListeners(this), this);
        Bukkit.getPluginManager().registerEvents(new ArenaListeners(this), this);
        Bukkit.getPluginManager().registerEvents(new MobListeners(this), this);

        // register main command
        getCommand("mobarena").setExecutor(new MobArenaCmd(this));
    }

    @Override
    public void onDisable() {

    }
}
