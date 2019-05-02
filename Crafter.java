package me.Hatron;

import java.util.ArrayList;
import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import org.bukkit.Location;
import org.bukkit.Material;

import org.bukkit.Sound;

import org.bukkit.configuration.file.FileConfiguration;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.PistonBaseMaterial;

public class Crafter
  implements Listener
{
  Main plugin;
  String face;
  Location hopper;
  int Tier;
  
  public Crafter(Main plugin)
  {
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
  }
  
  @SuppressWarnings("unused")
@EventHandler
  public void onInteract(InventoryOpenEvent e)
  {
    Player player = (Player)e.getPlayer();
    String containerName = e.getInventory().getName().toLowerCase();
    player.sendMessage(containerName);
    if (containerName.toLowerCase().equals("dropper"))
    {
      Location loc = e.getInventory().getLocation();
      
      Location furnaceLoc = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());
      Location fLY1 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 1.0D, furnaceLoc.getZ());
      Location fLY2 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 2.0D, furnaceLoc.getZ());
      Location flX1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY(), furnaceLoc.getZ());
      Location flX_1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY(), furnaceLoc.getZ());
      Location flX1Y1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ());
      Location flX_1Y1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ());
      Location flX_1Y2 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ());
      Location flX1Y2 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ());
      Location flY3 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY() + 3, loc.getBlockZ());
      Location flX1Y3 = new Location(player.getWorld(), loc.getBlockX() + 1, loc.getBlockY() + 3, loc.getBlockZ());
      Location flX_1Y3 = new Location(player.getWorld(), loc.getBlockX() - 1, loc.getBlockY() + 3, loc.getBlockZ());
      
      Location furnaceLoc2 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ() + 1);
      Location fLY2Z1 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() + 1.0D);
      Location flX1Z1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() + 1.0D);
      Location flX_1Z1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() + 1.0D);
      Location flX1Y1Z1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() + 1.0D);
      Location flX_1Y1Z1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() + 1.0D);
      Location flX_1Y2Z1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() + 1.0D);
      Location flX1Y2Z1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() + 1.0D);
      Location flY3Z1 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY() + 3, loc.getBlockZ() + 1);
      Location flX1Y3Z1 = new Location(player.getWorld(), loc.getBlockX() + 1, loc.getBlockY() + 3, loc.getBlockZ() + 1);
      Location flX_1Y3Z1 = new Location(player.getWorld(), loc.getBlockX() - 1, loc.getBlockY() + 3, loc.getBlockZ() + 1);
      
      Location furnaceLoc3 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ() + 2);
      Location fLY1Z2 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() + 2.0D);
      Location fLY2Z2 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() + 2.0D);
      Location flX1Z2 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() + 2.0D);
      Location flX_1Z2 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() + 2.0D);
      Location flX1Y1Z2 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() + 2.0D);
      Location flX_1Y1Z2 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() + 2.0D);
      Location flX_1Y2Z2 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() + 2.0D);
      Location flX1Y2Z2 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() + 2.0D);
      Location flY3Z2 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY() + 3, loc.getBlockZ() + 2);
      Location flX1Y3Z2 = new Location(player.getWorld(), loc.getBlockX() + 1, loc.getBlockY() + 3, loc.getBlockZ() + 2);
      Location flX_1Y3Z2 = new Location(player.getWorld(), loc.getBlockX() - 1, loc.getBlockY() + 3, loc.getBlockZ() + 2);
      
      Location furnaceLoc_2 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ() - 1);
      Location fLY2Z_1 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() - 1.0D);
      Location flX1Z_1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() - 1.0D);
      Location flX_1Z_1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() - 1.0D);
      Location flX1Y1Z_1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() - 1.0D);
      Location flX_1Y1Z_1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() - 1.0D);
      Location flX_1Y2Z_1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() - 1.0D);
      Location flX1Y2Z_1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() - 1.0D);
      Location flY3Z_1 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY() + 3, loc.getBlockZ() - 1);
      Location flX1Y3Z_1 = new Location(player.getWorld(), loc.getBlockX() + 1, loc.getBlockY() + 3, loc.getBlockZ() - 1);
      Location flX_1Y3Z_1 = new Location(player.getWorld(), loc.getBlockX() - 1, loc.getBlockY() + 3, loc.getBlockZ() - 1);
      
      Location furnaceLoc_3 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ() - 2);
      Location fLY1Z_2 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() - 2.0D);
      Location fLY2Z_2 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() - 2.0D);
      Location flX1Z_2 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() - 2.0D);
      Location flX_1Z_2 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() - 2.0D);
      Location flX1Y1Z_2 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() - 2.0D);
      Location flX_1Y1Z_2 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() - 2.0D);
      Location flX_1Y2Z_2 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() - 2.0D);
      Location flX1Y2Z_2 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() - 2.0D);
      Location flY3Z_2 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY() + 3, loc.getBlockZ() - 2);
      Location flX1Y3Z_2 = new Location(player.getWorld(), loc.getBlockX() + 1, loc.getBlockY() + 3, loc.getBlockZ() - 2);
      Location flX_1Y3Z_2 = new Location(player.getWorld(), loc.getBlockX() - 1, loc.getBlockY() + 3, loc.getBlockZ() - 2);
      
      Location dlZ_1 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ() - 1);
      Location dlZ1 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ() + 1);
      Location dlY1 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY() + 1, loc.getBlockZ());
      Location dlZ_1Y1 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY() + 1, loc.getBlockZ() - 1);
      Location dlZ1Y1 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY() + 1, loc.getBlockZ() + 1);
      Location dlZ_1Y2 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY() + 2, loc.getBlockZ() - 1);
      Location dlZ1Y2 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY() + 2, loc.getBlockZ() + 1);
      Location dlY2 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY() + 2, loc.getBlockZ());
      
      Location dispenserLoc2 = new Location(player.getWorld(), loc.getBlockX() + 1, loc.getBlockY(), loc.getBlockZ());
      Location dlZ_1X1 = new Location(player.getWorld(), loc.getBlockX() + 1, loc.getBlockY(), loc.getBlockZ() - 1);
      Location dlZ1X1 = new Location(player.getWorld(), loc.getBlockX() + 1, loc.getBlockY(), loc.getBlockZ() + 1);
      Location dlZ_1Y1X1 = new Location(player.getWorld(), loc.getBlockX() + 1, loc.getBlockY() + 1, loc.getBlockZ() - 1);
      Location dlZ1Y1X1 = new Location(player.getWorld(), loc.getBlockX() + 1, loc.getBlockY() + 1, loc.getBlockZ() + 1);
      Location dlZ_1Y2X1 = new Location(player.getWorld(), loc.getBlockX() + 1, loc.getBlockY() + 2, loc.getBlockZ() - 1);
      Location dlZ1Y2X1 = new Location(player.getWorld(), loc.getBlockX() + 1, loc.getBlockY() + 2, loc.getBlockZ() + 1);
      Location dlY2X1 = new Location(player.getWorld(), loc.getBlockX() + 1, loc.getBlockY() + 2, loc.getBlockZ());
      
      Location dispenserLoc3 = new Location(player.getWorld(), loc.getBlockX() + 2, loc.getBlockY(), loc.getBlockZ());
      Location dlZ_1X2 = new Location(player.getWorld(), loc.getBlockX() + 2, loc.getBlockY(), loc.getBlockZ() - 1);
      Location dlZ1X2 = new Location(player.getWorld(), loc.getBlockX() + 2, loc.getBlockY(), loc.getBlockZ() + 1);
      Location dlY1X2 = new Location(player.getWorld(), loc.getBlockX() + 2, loc.getBlockY() + 1, loc.getBlockZ());
      Location dlZ_1Y1X2 = new Location(player.getWorld(), loc.getBlockX() + 2, loc.getBlockY() + 1, loc.getBlockZ() - 1);
      Location dlZ1Y1X2 = new Location(player.getWorld(), loc.getBlockX() + 2, loc.getBlockY() + 1, loc.getBlockZ() + 1);
      Location dlZ_1Y2X2 = new Location(player.getWorld(), loc.getBlockX() + 2, loc.getBlockY() + 2, loc.getBlockZ() - 1);
      Location dlZ1Y2X2 = new Location(player.getWorld(), loc.getBlockX() + 2, loc.getBlockY() + 2, loc.getBlockZ() + 1);
      Location dlY2X2 = new Location(player.getWorld(), loc.getBlockX() + 2, loc.getBlockY() + 2, loc.getBlockZ());
      
      Location dispenserLoc_2 = new Location(player.getWorld(), loc.getBlockX() - 1, loc.getBlockY(), loc.getBlockZ());
      Location dlZ_1X_1 = new Location(player.getWorld(), loc.getBlockX() - 1, loc.getBlockY(), loc.getBlockZ() - 1);
      Location dlZ1X_1 = new Location(player.getWorld(), loc.getBlockX() - 1, loc.getBlockY(), loc.getBlockZ() + 1);
      Location dlZ_1Y1X_1 = new Location(player.getWorld(), loc.getBlockX() - 1, loc.getBlockY() + 1, loc.getBlockZ() - 1);
      Location dlZ1Y1X_1 = new Location(player.getWorld(), loc.getBlockX() - 1, loc.getBlockY() + 1, loc.getBlockZ() + 1);
      Location dlZ_1Y2X_1 = new Location(player.getWorld(), loc.getBlockX() - 1, loc.getBlockY() + 2, loc.getBlockZ() - 1);
      Location dlZ1Y2X_1 = new Location(player.getWorld(), loc.getBlockX() - 1, loc.getBlockY() + 2, loc.getBlockZ() + 1);
      Location dlY2X_1 = new Location(player.getWorld(), loc.getBlockX() - 1, loc.getBlockY() + 2, loc.getBlockZ());
      
      Location dispenserLoc_3 = new Location(player.getWorld(), loc.getBlockX() - 2, loc.getBlockY(), loc.getBlockZ());
      Location dlZ_1X_2 = new Location(player.getWorld(), loc.getBlockX() - 2, loc.getBlockY(), loc.getBlockZ() - 1);
      Location dlZ1X_2 = new Location(player.getWorld(), loc.getBlockX() - 2, loc.getBlockY(), loc.getBlockZ() + 1);
      Location dlY1X_2 = new Location(player.getWorld(), loc.getBlockX() - 2, loc.getBlockY() + 1, loc.getBlockZ());
      Location dlZ_1Y1X_2 = new Location(player.getWorld(), loc.getBlockX() - 2, loc.getBlockY() + 1, loc.getBlockZ() - 1);
      Location dlZ1Y1X_2 = new Location(player.getWorld(), loc.getBlockX() - 2, loc.getBlockY() + 1, loc.getBlockZ() + 1);
      Location dlZ_1Y2X_2 = new Location(player.getWorld(), loc.getBlockX() - 2, loc.getBlockY() + 2, loc.getBlockZ() - 1);
      Location dlZ1Y2X_2 = new Location(player.getWorld(), loc.getBlockX() - 2, loc.getBlockY() + 2, loc.getBlockZ() + 1);
      Location dlY2X_2 = new Location(player.getWorld(), loc.getBlockX() - 2, loc.getBlockY() + 2, loc.getBlockZ());
      if ((fLY2.getBlock().getType() == Material.COBBLESTONE_WALL) && 
        (flX1.getBlock().getType() == Material.STONE_BRICKS) && (flX_1.getBlock().getType() == Material.STONE_BRICKS) && 
        (flX1Y1.getBlock().getType() == Material.COBBLESTONE_WALL) && (flX_1Y1.getBlock().getType() == Material.COBBLESTONE_WALL) && 
        (flX1Y2.getBlock().getType() == Material.COBBLESTONE_WALL) && (flX_1Y2.getBlock().getType() == Material.COBBLESTONE_WALL) && 
        (flY3.getBlock().getType() == Material.STONE_BRICK_STAIRS) && (flX1Y3.getBlock().getType() == Material.STONE_SLAB) && 
        (flX_1Y3.getBlock().getType() == Material.STONE_SLAB)) {
        if ((fLY2Z1.getBlock().getType() == Material.PISTON) && 
          (flX1Z1.getBlock().getType() == Material.STONE_BRICKS) && (flX_1Z1.getBlock().getType() == Material.STONE_BRICKS) && 
          (flX_1Y2Z1.getBlock().getType() == Material.COBBLESTONE_WALL) && (flX1Y2Z1.getBlock().getType() == Material.COBBLESTONE_WALL) && 
          (flY3Z1.getBlock().getType() == Material.STONE_SLAB) && (flX1Y3Z1.getBlock().getType() == Material.STONE_BRICK_STAIRS)) {
          if ((((flX_1Y3Z1.getBlock().getType() == Material.STONE_BRICK_STAIRS ? 1 : 0) & (fLY2Z2.getBlock().getType() == Material.COBBLESTONE_WALL ? 1 : 0)) != 0) && 
            (flX1Z2.getBlock().getType() == Material.STONE_BRICKS) && (flX_1Z2.getBlock().getType() == Material.STONE_BRICKS) && 
            (flX1Y1Z2.getBlock().getType() == Material.COBBLESTONE_WALL) && (flX_1Y1Z2.getBlock().getType() == Material.COBBLESTONE_WALL) && 
            (flX1Y2Z2.getBlock().getType() == Material.COBBLESTONE_WALL) && (flX_1Y2Z2.getBlock().getType() == Material.COBBLESTONE_WALL) && 
            (flY3Z2.getBlock().getType() == Material.STONE_BRICK_STAIRS) && (flX1Y3.getBlock().getType() == Material.STONE_SLAB) && 
            (flX_1Y3Z2.getBlock().getType() == Material.STONE_SLAB) && (furnaceLoc3.getBlock().getType() == Material.STONE_BRICKS))
          {
            e.setCancelled(true);
            this.face = "north";
            this.hopper = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());
            if (furnaceLoc2.getBlock().getType() == Material.IRON_BLOCK)
            {
              this.Tier = 1;
              player.openInventory(getInv());
              
              return;
            }
            if (furnaceLoc2.getBlock().getType() == Material.DIAMOND_BLOCK)
            {
              this.Tier = 3;
              player.openInventory(getInv());
              return;
            }
            if (furnaceLoc2.getBlock().getType() == Material.GOLD_BLOCK)
            {
              this.Tier = 2;
              player.openInventory(getInv());
              return;
            }
            if (furnaceLoc2.getBlock().getType() != Material.EMERALD_BLOCK) {
              return;
            }
            this.Tier = 4;
            player.openInventory(getInv());
            
            return;
          }
        }
      }
      if (furnaceLoc_2.getBlock().getType() == Material.STONE_BRICKS)
      {
        e.setCancelled(true);
        this.face = "south";
        this.hopper = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());
        if (furnaceLoc2.getBlock().getType() == Material.IRON_BLOCK)
        {
          this.Tier = 1;
          player.openInventory(getInv());
        }
        else if (furnaceLoc2.getBlock().getType() == Material.DIAMOND_BLOCK)
        {
          this.Tier = 3;
          player.openInventory(getInv());
        }
        else if (furnaceLoc2.getBlock().getType() == Material.GOLD_BLOCK)
        {
          this.Tier = 2;
          player.openInventory(getInv());
        }
        else if (furnaceLoc2.getBlock().getType() == Material.EMERALD_BLOCK)
        {
          this.Tier = 4;
          player.openInventory(getInv());
        }
      }
    }
  }
  
  private Inventory getInv()
  {
    Inventory inv = Bukkit.createInventory(null, 54, ChatColor.BLUE + "Tier " + String.valueOf(this.Tier) + " Crafter");
    
    ItemStack pane = new ItemStack(Material.RED_STAINED_GLASS_PANE);
    ItemMeta paneMeta = pane.getItemMeta();
    paneMeta.setDisplayName(" ");
    pane.setItemMeta(paneMeta);
    for (int a = 0; a < 54; a++) {
      inv.setItem(a, pane);
    }
    ArrayList<Integer> air = new ArrayList<Integer>();
    air.add(Integer.valueOf(12));
    air.add(Integer.valueOf(13));
    air.add(Integer.valueOf(14));
    
    air.add(Integer.valueOf(21));
    air.add(Integer.valueOf(22));
    air.add(Integer.valueOf(23));
    
    air.add(Integer.valueOf(30));
    air.add(Integer.valueOf(31));
    air.add(Integer.valueOf(32));
    for (Iterator<Integer> localIterator = air.iterator(); localIterator.hasNext();)
    {
      int blank = ((Integer)localIterator.next()).intValue();
      inv.setItem(blank, new ItemStack(Material.AIR));
    }
    ItemStack anvil = new ItemStack(Material.ANVIL);
    ItemMeta anvilMeta = anvil.getItemMeta();
    anvilMeta.setDisplayName(ChatColor.RESET + "Craft");
    anvil.setItemMeta(anvilMeta);
    
    inv.setItem(49, anvil);
    
    return inv;
  }
  
  @EventHandler
  public void onClick(InventoryClickEvent e)
  {
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getType() != Material.AIR) && 
      (e.getInventory().getTitle().equals(getInv().getTitle()))) {
      if (e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE))
      {
        e.setCancelled(true);
        Player player = (Player) e.getWhoClicked();
        player.sendMessage("NOPE");
      }
      else if (e.getCurrentItem().getType().equals(Material.ANVIL))
      {
        final FileConfiguration config = Main.instance.getConfig();
        if ((config.getInt("players." + e.getWhoClicked().getUniqueId() + ".Level") > 60) && (this.Tier == 3))
        {
        }
        else
        {

          if ((config.getInt("players." + e.getWhoClicked().getUniqueId() + ".Level") > 30) && (this.Tier == 2))
          {
          }
          else
          {

            if ((config.getInt("players." + e.getWhoClicked().getUniqueId() + ".Level") > 0) && (this.Tier == 1))
            {
            }
            else

              if ((config.getInt("players." + e.getWhoClicked().getUniqueId() + ".Level") > 90) && (this.Tier == 4))
              {
              }
              else
              {
                e.getWhoClicked().sendMessage(ChatColor.RED + "Not a High Enough Level");
                e.setCancelled(true);
              }
            }
          }
        }
        e.setCancelled(false);
        
        ItemStack a = e.getInventory().getItem(12);
        ItemStack b = e.getInventory().getItem(13);
        ItemStack c = e.getInventory().getItem(14);
        
        ItemStack E = e.getInventory().getItem(22);
        
        ItemStack h = e.getInventory().getItem(31);
        
        final Items ore = new Items();
        ItemStack normStick = new ItemStack(Material.STICK);
        ItemStack IronBlade = ore.ForgedIronBlade();
        ItemStack DiaPickHead = ore.ForgedDiaHead();
        
        final Player player = (Player)e.getWhoClicked();
        if ((b != null) && (E != null) && (h != null) && 
          (b.getType() != Material.AIR) && (E.getType() != Material.AIR) && (h.getType() != Material.AIR)) {
          if ((b.equals(IronBlade)) && (E.equals(IronBlade)) && (h.equals(normStick)))
          {
            player.teleport(player.getLocation());
            if (this.face.equals("north"))
            {
             Location pistonLoc = new Location(player.getWorld(), this.hopper.getBlockX(), this.hopper.getBlockY() + 2, this.hopper.getBlockZ() + 1);
             @SuppressWarnings("unused")
			Location itemLoc = new Location(player.getWorld(), this.hopper.getBlockX(), this.hopper.getBlockY() + 1, this.hopper.getBlockZ() + 1);
            PistonBaseMaterial piston = (PistonBaseMaterial) player.getWorld().getBlockAt(pistonLoc).getState().getData();
            piston.setPowered(true);
            }
            else if (this.face.equals("south"))
            {
              final Location pistonLoc = new Location(player.getWorld(), this.hopper.getBlockX(), this.hopper.getBlockY() + 2, this.hopper.getBlockZ() + 2);
              final Location itemLoc = new Location(player.getWorld(), this.hopper.getBlockX(), this.hopper.getBlockY() + 1, this.hopper.getBlockZ() + 2);
              
              Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
              {
                public void run()
                {
                  player.teleport(player.getLocation());
                  PistonBaseMaterial piston = (PistonBaseMaterial) player.getWorld().getBlockAt(pistonLoc).getState().getData();
                  piston.setPowered(false);
                }
              }, 40L);
              
              Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
              {
                public void run()
                {
                  player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0F, 1.0F);
                  if (Crafter.this.Tier == 1) {
                    player.getWorld().dropItem(itemLoc, ore.ForgedIronSword());
                  } else if (Crafter.this.Tier == 2) {
                    player.getWorld().dropItem(itemLoc, ore.NoviceIronSword());
                  } else if (Crafter.this.Tier == 3) {
                    player.getWorld().dropItem(itemLoc, ore.MasterIronSword());
                  } else if (Crafter.this.Tier == 4) {
                    player.getWorld().dropItem(itemLoc, ore.GodIronSword());
                  }
                  
                  //int xp = config.getInt("players." + player.getUniqueId() + ".xp");
                 // xp += 5;
                 // config.set("players." + player.getUniqueId() + ".xp", Integer.valueOf(xp));
                 // Main.instance.saveConfig();
                  //Crafter.this.face = "";
                 // Crafter.this.Tier = 0;
                }
              }, 45L);
            }
          }
          else if ((b.equals(ore.ForgedDiaBlade())) && (E.equals(ore.ForgedDiaBlade())) && (h.equals(normStick)))
          {
            player.teleport(player.getLocation());
            if (this.face.equals("north"))
            {
              final Location pistonLoc = new Location(player.getWorld(), this.hopper.getBlockX(), this.hopper.getBlockY() + 3, this.hopper.getBlockZ() + 1);
              final Location itemLoc = new Location(player.getWorld(), this.hopper.getBlockX(), this.hopper.getBlockY() + 1, this.hopper.getBlockZ() + 1);
              Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
              {
                public void run()
                {
                  player.teleport(player.getLocation());
                  PistonBaseMaterial piston = (PistonBaseMaterial) player.getWorld().getBlockAt(pistonLoc).getState().getData();
                  piston.setPowered(false);
                  
                }
              }, 40L);
              
              Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
              {
                public void run()
                {
                  player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0F, 1.0F);
                  if (Crafter.this.Tier == 1) {
                    player.getWorld().dropItem(itemLoc, ore.ForgedDiaSword());
                  } else if (Crafter.this.Tier == 2) {
                    player.getWorld().dropItem(itemLoc, ore.NoviceDiaSword());
                  } else if (Crafter.this.Tier == 3) {
                    player.getWorld().dropItem(itemLoc, ore.MasterDiaSword());
                  } else if (Crafter.this.Tier == 4) {
                    player.getWorld().dropItem(itemLoc, ore.GodDiaSword());
                  }
                  Crafter.this.face = "";
                  Crafter.this.Tier = 0;
                  //int xp = config.getInt("players." + player.getUniqueId() + ".xp");
                 // xp += 5;
                //  config.set("players." + player.getUniqueId() + ".xp", Integer.valueOf(xp));
                  //Main.instance.saveConfig();
                }
              }, 45L);
            }
          }
          else if ((b.equals(ore.ForgedGoldBlade())) && (E.equals(ore.ForgedGoldBlade())) && (h.equals(normStick)))
          {
            player.teleport(player.getLocation());
            if (this.face.equals("north"))
            {
              final Location pistonLoc = new Location(player.getWorld(), this.hopper.getBlockX(), this.hopper.getBlockY() + 3, this.hopper.getBlockZ() + 1);
              final Location itemLoc = new Location(player.getWorld(), this.hopper.getBlockX(), this.hopper.getBlockY() + 1, this.hopper.getBlockZ() + 1);
              Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
              {
                public void run()
                {
                  player.teleport(player.getLocation());
                  PistonBaseMaterial piston = (PistonBaseMaterial) player.getWorld().getBlockAt(pistonLoc).getState().getData();
                  piston.setPowered(false);
                }
              }, 40L);
              
              Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
              {
                public void run()
                {
                  player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0F, 1.0F);
                  if (Crafter.this.Tier == 1) {
                    player.getWorld().dropItem(itemLoc, ore.ForgedGoldSword());
                  } else if (Crafter.this.Tier == 2) {
                    player.getWorld().dropItem(itemLoc, ore.NoviceGoldSword());
                  } else if (Crafter.this.Tier == 3) {
                    player.getWorld().dropItem(itemLoc, ore.MasterGoldSword());
                  } else if (Crafter.this.Tier == 4) {
                    player.getWorld().dropItem(itemLoc, ore.GodGoldSword());
                  }
               //   int xp = config.getInt("players." + player.getUniqueId() + ".xp");
               //   xp += 5;
                //  config.set("players." + player.getUniqueId() + ".xp", Integer.valueOf(xp));
                //  Main.instance.saveConfig();
                 // Crafter.this.face = "";
                 // Crafter.this.Tier = 0;
                }
              }, 45L);
            
          }
        }
        if ((a != null) && (b != null) && (c != null) && (E != null) && (h != null) && 
          (b.getType() != Material.AIR) && (E.getType() != Material.AIR) && (h.getType() != Material.AIR) && (a.getType() != Material.AIR) && (c.getType() != Material.AIR)) {
          if ((a.equals(DiaPickHead)) && (b.equals(DiaPickHead)) && (c.equals(DiaPickHead)) && (E.equals(normStick)) && (h.equals(normStick)))
          {
            player.teleport(player.getLocation());
            if (this.face.equals("north"))
            {
              final Location pistonLoc = new Location(player.getWorld(), this.hopper.getBlockX(), this.hopper.getBlockY() + 3, this.hopper.getBlockZ() + 1);
              final Location itemLoc = new Location(player.getWorld(), this.hopper.getBlockX(), this.hopper.getBlockY() + 1, this.hopper.getBlockZ() + 1);
              Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
              {
                public void run()
                {
                  player.teleport(player.getLocation());
                  PistonBaseMaterial piston = (PistonBaseMaterial) player.getWorld().getBlockAt(pistonLoc).getState().getData();
                  piston.setPowered(false);
                }
              }, 40L);
              
              Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
              {
                public void run()
                {
                  player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0F, 1.0F);
                  if (Crafter.this.Tier == 1) {
                    player.getWorld().dropItem(itemLoc, ore.ForgedDiaPick());
                  } else if (Crafter.this.Tier == 2) {
                    player.getWorld().dropItem(itemLoc, ore.NoviceDiaPick());
                  } else if (Crafter.this.Tier == 3) {
                    player.getWorld().dropItem(itemLoc, ore.MasterDiaPick());
                  } else if (Crafter.this.Tier == 4) {
                    player.getWorld().dropItem(itemLoc, ore.GodDiaPick());
                  }
                  Crafter.this.face = "";
                  Crafter.this.Tier = 0;
                  
                //  int xp = config.getInt("players." + player.getUniqueId() + ".xp");
                 // xp += 5;
                 // config.set("players." + player.getUniqueId() + ".xp", Integer.valueOf(xp));
                 // Main.instance.saveConfig();
                }
              }, 45L);
            }
          }
          else if ((a.equals(ore.ForgedIronHead())) && (b.equals(ore.ForgedIronHead())) && (c.equals(ore.ForgedIronHead())) && (E.equals(normStick)) && (h.equals(normStick)))
          {
            player.teleport(player.getLocation());
            if (this.face.equals("north"))
            {
              final Location pistonLoc = new Location(player.getWorld(), this.hopper.getBlockX(), this.hopper.getBlockY() + 2, this.hopper.getBlockZ() + 1);
              final Location itemLoc = new Location(player.getWorld(), this.hopper.getBlockX(), this.hopper.getBlockY() + 1, this.hopper.getBlockZ() + 1);
              player.teleport(player.getLocation());
              PistonBaseMaterial piston = (PistonBaseMaterial) player.getWorld().getBlockAt(pistonLoc).getState().getData();
              piston.setPowered(true);

              
              Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
              {
                public void run()
                {
                	
                  PistonBaseMaterial piston = (PistonBaseMaterial) player.getWorld().getBlockAt(pistonLoc).getState().getData();
                  piston.setPowered(true);	
                  player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0F, 1.0F);
                  if (Crafter.this.Tier == 1) {
                    player.getWorld().dropItem(itemLoc, ore.ForgedIronPick());
                  } else if (Crafter.this.Tier == 2) {
                    player.getWorld().dropItem(itemLoc, ore.NoviceIronPick());
                  } else if (Crafter.this.Tier == 3) {
                    player.getWorld().dropItem(itemLoc, ore.MasterIronPick());
                  } else if (Crafter.this.Tier == 4) {
                    player.getWorld().dropItem(itemLoc, ore.GodIronPick());
                  }
                 // int xp = config.getInt("players." + player.getUniqueId() + ".xp");
               //   xp += 5;
               //   config.set("players." + player.getUniqueId() + ".xp", Integer.valueOf(xp));
                //  Main.instance.saveConfig();
                //  Crafter.this.face = "";
                //  Crafter.this.Tier = 0;
                }
              }, 45L);
            }
          }
          else if ((a.equals(ore.ForgedGoldHead())) && (b.equals(ore.ForgedGoldHead())) && (c.equals(ore.ForgedGoldHead())) && (E.equals(normStick)) && (h.equals(normStick)))
          {
            player.teleport(player.getLocation());
            if (this.face.equals("north"))
            {
              final Location pistonLoc = new Location(player.getWorld(), this.hopper.getBlockX(), this.hopper.getBlockY() + 3, this.hopper.getBlockZ() + 1);
              final Location itemLoc = new Location(player.getWorld(), this.hopper.getBlockX(), this.hopper.getBlockY() + 1, this.hopper.getBlockZ() + 1);
              Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
              {
				public void run()
                {
                  player.teleport(player.getLocation());
                  pistonLoc.getBlock().setType(Material.STONE_SLAB);
                }
              }, 40L);
              
              Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
              {
                public void run()
                {
                  player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0F, 1.0F);
                  if (Crafter.this.Tier == 1) {
                    player.getWorld().dropItem(itemLoc, ore.ForgedGoldPick());
                  } else if (Crafter.this.Tier == 2) {
                    player.getWorld().dropItem(itemLoc, ore.NoviceGoldPick());
                  } else if (Crafter.this.Tier == 3) {
                    player.getWorld().dropItem(itemLoc, ore.MasterGoldPick());
                  } else if (Crafter.this.Tier == 4) {
                    player.getWorld().dropItem(itemLoc, ore.GodGoldPick());
                  }
                 // int xp = config.getInt("players." + player.getUniqueId() + ".xp");
                //  xp += 5;
                 // config.set("players." + player.getUniqueId() + ".xp", Integer.valueOf(xp));
                 // Main.instance.saveConfig();
                 // Crafter.this.face = "";
                 // Crafter.this.Tier = 0;
                }
              }, 45L);
            }
          }
        }

      }
    }
  }
}
