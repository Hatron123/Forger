package me.Hatron;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
  extends JavaPlugin
{
  public static Plugin instance;

  
  public void onEnable()
  {
    instance = this;
    loadConfiguration();
    new BlockListener(this);
    new BlastFurnace(this);
    new HardenedCrafting(this);
    new Crafter(this);
    
    loadConfiguration();
    getLogger().info("Custom Ores Enabled");
    getLogger().info("\n\nBlock Listener Enabled\nBlast Furnace Enabled\nPriofessions Enabled\nHardened Crafting Enabled\n\n");
  }
  
  public void loadConfiguration()
  {
    getConfig();
    FileConfiguration config = getConfig();
    config.options().copyDefaults(true);
    saveConfig();
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if ((cmd.getName().equalsIgnoreCase("forger")) && ((sender instanceof Player)))
    {
      FileConfiguration config = getConfig();
      Player player = (Player)sender;
      String level = config.getString("players." + player.getUniqueId() + ".Level");
      String xp = config.getString("players." + player.getUniqueId() + ".xp");
      int xpint = config.getInt("players." + player.getUniqueId() + ".xp");
      int levelint = config.getInt("players." + player.getUniqueId() + ".Level");
      
      int count = 0;
      if (xpint > 100)
      {
        while (xpint >= 100)
        {
          xpint -= 100;
          count++;
        }
        config.set("players." + player.getUniqueId() + ".xp", Integer.valueOf(xpint));
        levelint += count;
        config.set("players." + player.getUniqueId() + ".Level", Integer.valueOf(levelint));
        saveConfig();
        
        level = config.getString("players." + player.getUniqueId() + ".Level");
        xp = config.getString("players." + player.getUniqueId() + ".xp");
        xpint = config.getInt("players." + player.getUniqueId() + ".xp");
        levelint = config.getInt("players." + player.getUniqueId() + ".Level");
      }
      if (xpint % 2 != 0) {
        xpint--;
      }
      if (levelint % 2 != 0) {
        xpint--;
      }
      xpint /= 2;
      levelint /= 2;
      
      String xpbar1 = "";
      String xpbar2 = "";
      String levelbar1 = "";
      String levelbar2 = "";
      for (int i = 0; i < xpint; i++) {
        xpbar1 = xpbar1 + "|";
      }
      for (int i = 0; i < 50 - xpint; i++) {
        xpbar2 = xpbar2 + "|";
      }
      for (int i = 0; i < levelint; i++) {
        levelbar1 = levelbar1 + "|";
      }
      for (int i = 0; i < 50 - levelint; i++) {
        levelbar2 = levelbar2 + "|";
      }
      String xpstring = "XP: " + xp + "/100   ";
      String levelstring = "Level: " + level;
      
      String spaces = "";
      while (xpstring.length() != levelstring.length())
      {
        spaces = spaces + " ";
        levelstring = levelstring + " ";
      }
      player.sendMessage(ChatColor.GOLD + player.getName() + "'s Stats" + ChatColor.AQUA + " | Forger");
      player.sendMessage(ChatColor.AQUA + "-----------------------------");
      player.sendMessage(ChatColor.GOLD.toString() + ChatColor.BOLD.toString() + "Level: " + ChatColor.RESET.toString() + ChatColor.GRAY.toString() + level + spaces + ChatColor.GREEN + levelbar1 + ChatColor.GRAY + levelbar2);
      player.sendMessage(ChatColor.GOLD.toString() + ChatColor.BOLD.toString() + "XP: " + ChatColor.RESET.toString() + ChatColor.GRAY.toString() + xp + "/100" + "  " + ChatColor.GREEN + xpbar1 + ChatColor.GRAY + xpbar2);
      
      return true;
    }
    if ((cmd.getName().equalsIgnoreCase("dev")) && ((sender instanceof Player)))
    {
      Player player = (Player)sender;
      if (!getConfig().getBoolean("development"))
      {
        getConfig().set("development", Boolean.valueOf(true));
        saveConfig();
        player.sendMessage("Dev Mod Enabled");
      }
      else if (getConfig().getBoolean("development"))
      {
        getConfig().set("development", Boolean.valueOf(false));
        saveConfig();
        player.sendMessage("Dev Mod Disabled");
      }
      return true;
    }
    return false;
  }
}
