package pl.sloudpl.noplugincommand;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Events implements Listener {

    NoPluginCommand plugin;

    public Events(NoPluginCommand m){

        plugin = m;

    }

    @EventHandler
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent e) {
        Player p = e.getPlayer();
        String cmd = e.getMessage();
        if(!p.isOp() && !p.hasPermission("sloudpl.plugins")) {
            if (cmd.contains("/pl")
                    || cmd.contains("/plugins")
                    || cmd.contains("/bukkit:pl")
                    || cmd.contains("/bukkit:plugins")
                    || cmd.contains("/ver")
                    || cmd.contains("/bukkit:ver")
                    || cmd.contains("/minecraft:me")
                    || cmd.contains("/me")
                    || cmd.contains("/?")
                    || cmd.contains("/bukkit:?")
                    || cmd.contains("/help")
                    || cmd.contains("/bukkit:help")) {
                e.setCancelled(true);
                p.sendMessage("§cYou are not allowed to use this command!");
                return;
            }
        }
    }
}
