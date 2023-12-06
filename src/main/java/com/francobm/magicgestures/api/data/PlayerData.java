package com.francobm.magicgestures.api.data;

import com.francobm.magicgestures.utils.MGNotInstalledException;

import java.util.Map;

public class PlayerData {

    public Map<Integer, Gesture> getFavoriteGestures() {
        throw new MGNotInstalledException();
    }

    public void joinInWardrobe(Wardrobe wardrobe) {
        throw new MGNotInstalledException();
    }

    public void leaveOutWardrobe() {
        throw new MGNotInstalledException();
    }

    public void leaveOutWardrobeFast() {
        throw new MGNotInstalledException();
    }

    public Wardrobe getWardrobe() {
        throw new MGNotInstalledException();
    }

    public boolean isInWardrobe() {
        throw new MGNotInstalledException();
    }

}
