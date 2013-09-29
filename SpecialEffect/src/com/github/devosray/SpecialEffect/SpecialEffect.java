package com.github.devosray.SpecialEffect;

/**
 *
 * @author Raymond
 */

import org.bukkit.event.EventPriority;
import org.bukkit.plugin.java.JavaPlugin;

public class SpecialEffect extends JavaPlugin {
    
    public final SEListener eventH = new SEListener(this);
    
    @Override
    public void onEnable(){
        //Register EventHandler
        getServer().getPluginManager().registerEvents(eventH,this);
        
        getLogger().info("SpecialEffect has been started...");
    }
    
    @Override
    public void onDisable(){
        //TODO Logic when plugin is stopped
    }
    
}
