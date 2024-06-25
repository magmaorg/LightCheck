package ru.kainlight.lightcheck.COMMON.lightlibrary.UTILS;

import org.bukkit.plugin.Plugin;

import ru.kainlight.lightcheck.COMMON.lightlibrary.LightLib;

@SuppressWarnings("deprecation")
public final class Initiators {
    public static void startPluginMessage(Plugin plugin) {
        LightLib.get()
                .logger("")
                .logger("&c » &7" + plugin.getDescription().getName() + " enabled")
                .logger("&c » &7Version: " + plugin.getDescription().getVersion());
        LightLib.get().logger("");
    }
}
