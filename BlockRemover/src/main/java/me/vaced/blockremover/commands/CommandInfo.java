package me.vaced.blockremover.commands;

import me.vaced.blockremover.BlockRemover;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandInfo implements CommandExecutor {
    private final BlockRemover plugin;
    public CommandInfo(BlockRemover plugin) {this.plugin = plugin;}


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            if (player.hasPermission("BlockRemover.command.info")){
                player.sendMessage("§7Running §cBlockRemover §7by Vaced_");
            }
        }
        return false;
    }
}
