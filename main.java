package lobbyplugin;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public final class main extends Plugin {
    @Override
    public void onEnable() {}

    private void loadCommands(){
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new command.Lobby());
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new command.Hub());
    }

    @Override
    public void onDisable() {}
}
