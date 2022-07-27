package lobbyplugin;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

//Команда Лобби
public class Lobby extends Command {
    public Lobby() {
        super("Lobby");
    }
    // Создает функцию, которая проверяет наличие прав на команду и если они есть то отправляет игрока в лобби.
    public void execute(CommandSender sender, String[] args) {
        if ((sender instanceof ProxiedPlayer)) {
            String permission = "lobby.perm";
            ProxiedPlayer p = (ProxiedPlayer) sender;
            if (sender.hasPermission(permission)) {
                p.connect(ProxyServer.getInstance().getServerInfo("lobby"));
            } else {
                p.sendMessage(new ComponentBuilder("У вас недостаточно прав!").color(ChatColor.RED).create());
            }
        }
    }
}

