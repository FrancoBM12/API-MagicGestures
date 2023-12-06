package com.francobm.magicgestures.events;

import com.francobm.magicgestures.api.data.Gesture;
import com.francobm.magicgestures.api.data.PlayerData;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GestureStopAnimationEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final PlayerData playerData;
    private final Gesture gesture;

    public GestureStopAnimationEvent(PlayerData playerData, Gesture gesture){
        super(true);
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

}
