package me.amantaruby.sneakplugin.main.Events;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Map;


public class EventsClass implements Listener {

    @EventHandler
    public void onPlayerToggleSneak(PlayerToggleSneakEvent event) {
        Player p = event.getPlayer();
        if (!p.isSneaking()) {
            p.addPotionEffect((new PotionEffect(PotionEffectType.INVISIBILITY, 9999999, 10)));
            p.addPotionEffect((new PotionEffect(PotionEffectType.JUMP, 9999999, 10)));
            p.sendMessage(ChatColor.GOLD + "AmantaRuby" + " /" + ChatColor.RED + "INVIS ENABLED AND JUMB BOOST HAS ENABLED");
        }
        if(p.isSneaking()){
            p.removePotionEffect(PotionEffectType.INVISIBILITY);
            p.removePotionEffect(PotionEffectType.JUMP);

        }

    }
}
