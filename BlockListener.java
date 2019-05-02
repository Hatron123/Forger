package me.Hatron;

import java.util.Random;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BlockListener
  implements Listener
{
  Main plugin;
  
  public BlockListener(Main plugin)
  {
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
  }
  
  @EventHandler
  public void onBreak(BlockBreakEvent e)
  {
    Player player = e.getPlayer();
    
    Items ore = new Items();
    ItemStack HardenedGoldOre = ore.getHardenedGoldOre();
    ItemStack HardenedIronOre = ore.getHardenedIronOre();
    ItemStack HardenedDiamondOre = ore.getHardenedDiamondOre();
    
    Location breaker = new Location(player.getWorld(), e.getBlock().getX(), e.getBlock().getY(), e.getBlock().getZ());
    if ((e.getBlock().getType() == Material.DIAMOND_ORE) || (e.getBlock().getType() == Material.IRON_ORE) || (e.getBlock().getType() == Material.GOLD_ORE))
    {
      FileConfiguration config = Main.instance.getConfig();
      if (!config.contains("players." + e.getPlayer().getUniqueId()))
      {
        config.addDefault("players." + player.getUniqueId() + ".Name", player.getName());
        config.addDefault("players." + player.getUniqueId() + ".Level", Integer.valueOf(1));
        config.addDefault("players." + player.getUniqueId() + ".xp", Integer.valueOf(0));
        Main.instance.saveConfig();
      }
      if (e.getBlock().getType() == Material.DIAMOND_ORE)
      {
        Random ranNum = new Random();
        int chance = 1 + ranNum.nextInt(10);
        e.setCancelled(true);
        breaker.getBlock().setType(Material.AIR);
        if ((chance == 2) || (player.getInventory().getItemInMainHand().equals(ore.ForgedIronPick())) || (player.getInventory().getItemInMainHand().equals(ore.ForgedDiaPick())) || (player.getInventory().getItemInMainHand().equals(ore.ForgedGoldPick())))
        {
          player.getWorld().dropItemNaturally(breaker, HardenedDiamondOre);
        }
        else
        {
          player.getWorld().dropItemNaturally(breaker, new ItemStack(Material.DIAMOND));
          int xp = config.getInt("players." + player.getUniqueId() + ".xp");
          xp++;
          config.set("players." + player.getUniqueId() + ".xp", Integer.valueOf(xp));
          Main.instance.saveConfig();
        }
        if (Main.instance.getConfig().getBoolean("development")) {
          breaker.getBlock().setType(Material.DIAMOND_ORE);
        }
      }
      else if (e.getBlock().getType() == Material.IRON_ORE)
      {
        Random ranNum = new Random();
        int chance = 1 + ranNum.nextInt(10);
        e.setCancelled(true);
        breaker.getBlock().setType(Material.AIR);
        if ((chance == 2) || (player.getInventory().getItemInMainHand().equals(ore.ForgedIronPick())) || (player.getInventory().getItemInMainHand().equals(ore.ForgedDiaPick())) || (player.getInventory().getItemInMainHand().equals(ore.ForgedGoldPick())))
        {
          player.getWorld().dropItemNaturally(breaker, HardenedIronOre);
          
          int xp = config.getInt("players." + player.getUniqueId() + ".xp");
          xp++;
          config.set("players." + player.getUniqueId() + ".xp", Integer.valueOf(xp));
          Main.instance.saveConfig();
        }
        else
        {
          player.getWorld().dropItemNaturally(breaker, new ItemStack(Material.IRON_ORE));
        }
        if (Main.instance.getConfig().getBoolean("development")) {
          breaker.getBlock().setType(Material.IRON_ORE);
        }
      }
      else if (e.getBlock().getType() == Material.GOLD_ORE)
      {
        Random ranNum = new Random();
        int chance = 1 + ranNum.nextInt(10);
        e.setCancelled(true);
        breaker.getBlock().setType(Material.AIR);
        if ((chance == 2) || (player.getInventory().getItemInMainHand().equals(ore.ForgedIronPick())) || (player.getInventory().getItemInMainHand().equals(ore.ForgedDiaPick())) || (player.getInventory().getItemInMainHand().equals(ore.ForgedGoldPick())))
        {
          player.getWorld().dropItemNaturally(breaker, HardenedGoldOre);
          
          int xp = config.getInt("players." + player.getUniqueId() + ".xp");
          xp++;
          config.set("players." + player.getUniqueId() + ".xp", Integer.valueOf(xp));
          Main.instance.saveConfig();
        }
        else
        {
          player.getWorld().dropItemNaturally(breaker, new ItemStack(Material.GOLD_ORE));
        }
        if (Main.instance.getConfig().getBoolean("development")) {
          breaker.getBlock().setType(Material.GOLD_ORE);
        }
      }
    }
  }
}
