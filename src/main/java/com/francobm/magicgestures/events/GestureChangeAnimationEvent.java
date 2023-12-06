package com.francobm.magicgestures.events;

import com.francobm.magicgestures.api.data.Gesture;
import com.francobm.magicgestures.api.data.PlayerData;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GestureChangeAnimationEvent extends Event implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private boolean isCancelled;
    private final PlayerData playerData;
    private final Gesture gesture;

    public GestureChangeAnimationEvent(PlayerData playerData, Gesture gesture){
        super(false);
        this.playerData = playerData;
        this.gesture = gesture;
    }

    public PlayerData getPlayerData() {
        return playerData;
    }

    public Gesture getGesture() {
        return gesture;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }


    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        isCancelled = cancel;
    }
}
