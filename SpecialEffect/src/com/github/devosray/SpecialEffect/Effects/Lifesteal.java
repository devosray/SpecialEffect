package com.github.devosray.SpecialEffect.Effects;

import com.github.devosray.SpecialEffect.SpecialEffect;
import java.util.Random;
import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
/**
 *
 * @author Raymond
 */
public class Lifesteal implements Listener{
    
    private SpecialEffect se;
    private Random rand;
    
    public Lifesteal(SpecialEffect se){
        this.se = se;
        this.rand = new Random();
    }
    
    @EventHandler
    public void onEntityDamageByEntityEvent(EntityDamageByEntityEvent evt){
        if (evt.getDamager() instanceof Player){
            Player damager = (Player) evt.getDamager();
            
            if (rand.nextInt(101) <= se.getConfig().getInt("Lifesteal_probability")){
                double health = damager.getHealth() + (evt.getDamage() / (100 / se.getConfig().getDouble("Lifesteal_health_prob")));
                
                if (health > damager.getMaxHealth()){
                    health = damager.getMaxHealth();
                } 
                
                damager.setHealth(health);
                
                damager.getWorld().playEffect(evt.getEntity().getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
            }
        }
    }
    
}
