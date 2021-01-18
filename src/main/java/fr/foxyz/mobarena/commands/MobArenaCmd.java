package fr.foxyz.mobarena.commands;

import fr.foxyz.mobarena.MobArena;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MobArenaCmd implements CommandExecutor {

    private final MobArena plugin;

    public MobArenaCmd(MobArena mobArena) {
        this.plugin = mobArena;
    }

    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        return false;
    }
}
