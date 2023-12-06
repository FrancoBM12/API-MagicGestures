package com.francobm.magicgestures.api;

import com.francobm.magicgestures.api.data.Gesture;
import com.francobm.magicgestures.utils.MGNotInstalledException;
import org.bukkit.entity.Entity;

public class MagicGesturesAPI {

    public static boolean hasGesture(Entity entity){
        throw new MGNotInstalledException();
    }

    public static void playGesture(Entity entity, Gesture gesture){
        throw new MGNotInstalledException();
    }

    public static void playGesture(Entity entity, Gesture gesture, String skinBase64){
        throw new MGNotInstalledException();
    }
}
