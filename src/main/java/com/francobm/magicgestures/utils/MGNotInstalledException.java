package com.francobm.magicgestures.utils;

public class MGNotInstalledException extends UnsupportedOperationException{
    public MGNotInstalledException() {
        super("Error: MagicGestures is not installed, please install it to use this API.");
    }
}
