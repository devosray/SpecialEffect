
package com.github.devosray.SpecialEffect;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

/**
 *
 * @author Raymond
 */
public class SEListener implements Listener {
    
    private SpecialEffect specialE;
    
    public SEListener(SpecialEffect se){
        this.specialE = se;
    }

    @EventHandler
    public void onEntityDamageByEntityEvent(EntityDamageByEntityEvent evt){
        
        //Check to see if both are players
        if (evt.getDamager() instanceof Player && evt.getEntity() instanceof Player){
            Player damger = (Player) evt.getDamager();
        }
                
    }
    
}
