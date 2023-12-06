package com.francobm.magicgestures.cache;

import com.francobm.magicgestures.api.data.PlayerData;
import com.francobm.magicgestures.utils.MGNotInstalledException;
import org.bukkit.entity.Player;

public class PlayerDataLoader {

    public boolean hasPlayerData(Player player){
        throw new MGNotInstalledException();
    }
    public PlayerData getPlayerData(Player player) {
        throw new MGNotInstalledException();
    }
}
