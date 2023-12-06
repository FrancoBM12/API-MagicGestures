package com.francobm.magicgestures;

import com.francobm.magicgestures.cache.PlayerDataLoader;
import com.francobm.magicgestures.utils.MGNotInstalledException;
import org.bukkit.plugin.java.JavaPlugin;

public class MagicGestures extends JavaPlugin {

    public PlayerDataLoader getPlayerDataLoader() {
        throw new MGNotInstalledException();
    }
    public static MagicGestures getInstance() {
        throw new MGNotInstalledException();
    }
}
