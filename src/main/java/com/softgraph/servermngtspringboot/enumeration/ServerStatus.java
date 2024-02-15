package com.softgraph.servermngtspringboot.enumeration;

/**
 * @author NDACH https://github.com/Nouhou47
 * @version 1.0
 * @since 14/02/2024
 */
public enum ServerStatus {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");
    private final String status;

    ServerStatus(String s) {
        this.status = s;
    }

    public String getStatus() {
        return this.status;
    }
}
