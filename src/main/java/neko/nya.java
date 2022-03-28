package neko;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;

public final class nya extends JavaPlugin {
    public static final nya INSTANCE = new nya();

    private nya() {
        super(new JvmPluginDescriptionBuilder("neko", "1.0")
                .name("companyQQBot")
                .author("NekoGarden")
                .build());
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin loaded!");
    }
}