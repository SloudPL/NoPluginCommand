package pl.sloudpl.noplugincommand;

import org.bukkit.plugin.java.JavaPlugin;

public final class NoPluginCommand extends JavaPlugin {

    public static NoPluginCommand main;

    @Override
    public void onEnable() {

        main = this;

        getServer().getPluginManager().registerEvents(new Events(this), this);

    }

    public static NoPluginCommand getMain() {

        return main;

    }

}
