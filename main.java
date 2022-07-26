package lobbyplugin;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public final class main extends Plugin {
    @Override
    public void onEnable() { // Прокси сервер регистрирует команду lobby и hub из классов одноименных.
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new Lobby());
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new Hub());
    }

    @Override
    public void onDisable() {
    }
}
