package com.github.root0616.flysquid;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.plugin.Plugin;

public class AllowSquid implements Listener {
      
  public AllowSquid(Plugin plugin) {
    // ここで登録している
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
  }

@EventHandler

public void squidspawn(EntityShootBowEvent event) {
    LivingEntity shooter = event.getEntity();
    Entity arrow = event.getProjectile();
    Squid projectile = shooter.getWorld().spawn(event.getEntity().getLocation(), Squid.class);
    projectile.setAI(false);
    projectile.setCollidable(false);
    arrow.addPassenger(projectile);
}
}
