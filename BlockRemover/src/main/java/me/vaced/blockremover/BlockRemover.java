package me.vaced.blockremover;

import me.vaced.blockremover.commands.CommandInfo;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import me.vaced.blockremover.listeners.*;

public final class BlockRemover extends JavaPlugin {

    @Override
    public void onEnable() {

        //config.yml
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //Commands
        getCommand("blockremover").setExecutor(new CommandInfo(this));

        //Listeners
        getServer().getPluginManager().registerEvents(new BlockListener(this), this);
    }
}
