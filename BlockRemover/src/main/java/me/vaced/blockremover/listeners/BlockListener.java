package me.vaced.blockremover.listeners;

import me.vaced.blockremover.BlockRemover;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener {
    private final BlockRemover plugin;
    public BlockListener(BlockRemover plugin) {this.plugin = plugin;}

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){
        Player p = e.getPlayer();

        if(!p.hasPermission("BlockRemover.permission.BlockBreak.Break")){
            e.setCancelled(true);
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("BlockBreakCancelled")));
        }
    }
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e){
        Player p = e.getPlayer();

        if(!p.hasPermission("BlockRemover.permission.BlockPlace.Place")){
            e.setCancelled(true);
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("BlockPlaceCancelled")));
        }
    }
    @EventHandler
    public void onBlockBurn(BlockBurnEvent e){
        e.setCancelled(true);
    }
}
