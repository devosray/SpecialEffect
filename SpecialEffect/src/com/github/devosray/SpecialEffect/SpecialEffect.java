package com.github.devosray.SpecialEffect;

/**
 *
 * @author Raymond
 */

import com.github.devosray.SpecialEffect.Effects.Lifesteal;
import org.bukkit.plugin.java.JavaPlugin;

public class SpecialEffect extends JavaPlugin {
    
    public final SEListener eventH = new SEListener(this);
    public final Lifesteal lifesteal = new Lifesteal(this);
    
    @Override
    public void onEnable(){
        //Register EventHandler
        getServer().getPluginManager().registerEvents(eventH,this); 
        getServer().getPluginManager().registerEvents(lifesteal, this);
        
        getLogger().info("SpecialEffect has been started...");
        
        //Save default config files
        this.saveDefaultConfig();

    }
    
    @Override
    public void onDisable(){
        //TODO Logic when plugin is stopped
    }
    
}
