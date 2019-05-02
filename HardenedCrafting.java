package me.Hatron;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HardenedCrafting
  implements Listener
{
  Main plugin;
  
  public HardenedCrafting(Main plugin)
  {
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
    plugin.getLogger().info("Crafting");
  }
  
  FileConfiguration config = Main.instance.getConfig();
  
  @EventHandler
  public void onAnvil(InventoryOpenEvent e)
  {
    Player player = (Player)e.getPlayer();
    if ((e.getInventory() instanceof AnvilInventory))
    {
      Location loc = e.getInventory().getLocation();
      e.setCancelled(true);
      
      Location furnaceLoc = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());
      Location fLY1 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 1.0D, furnaceLoc.getZ());
      Location fLY2 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 2.0D, furnaceLoc.getZ());
      Location flX1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY(), furnaceLoc.getZ());
      Location flX_1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY(), furnaceLoc.getZ());
      Location flX1Y1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ());
      Location flX_1Y1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ());
      Location flX_1Y2 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ());
      Location flX1Y2 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ());
      
      Location furnaceLoc2 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ() + 1);
      Location fLY2Z1 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() + 1.0D);
      Location flX1Z1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() + 1.0D);
      Location flX_1Z1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() + 1.0D);
      Location flX1Y1Z1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() + 1.0D);
      Location flX_1Y1Z1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() + 1.0D);
      Location flX_1Y2Z1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() + 1.0D);
      Location flX1Y2Z1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() + 1.0D);
      
      Location furnaceLoc3 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ() + 2);
      Location fLY1Z2 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() + 2.0D);
      Location fLY2Z2 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() + 2.0D);
      Location flX1Z2 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() + 2.0D);
      Location flX_1Z2 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() + 2.0D);
      Location flX1Y1Z2 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() + 2.0D);
      Location flX_1Y1Z2 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() + 2.0D);
      Location flX_1Y2Z2 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() + 2.0D);
      Location flX1Y2Z2 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() + 2.0D);
      
      Location furnaceLoc_2 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ() - 1);
      Location fLY2Z_1 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() - 1.0D);
      Location flX1Z_1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() - 1.0D);
      Location flX_1Z_1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() - 1.0D);
      Location flX1Y1Z_1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() - 1.0D);
      Location flX_1Y1Z_1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() - 1.0D);
      Location flX_1Y2Z_1 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() - 1.0D);
      Location flX1Y2Z_1 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() - 1.0D);
      
      Location furnaceLoc_3 = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ() - 2);
      Location fLY1Z_2 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() - 2.0D);
      Location fLY2Z_2 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() - 2.0D);
      Location flX1Z_2 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() - 2.0D);
      Location flX_1Z_2 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY(), furnaceLoc.getZ() - 2.0D);
      Location flX1Y1Z_2 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() - 2.0D);
      Location flX_1Y1Z_2 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() - 2.0D);
      Location flX_1Y2Z_2 = new Location(player.getWorld(), furnaceLoc.getX() - 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() - 2.0D);
      Location flX1Y2Z_2 = new Location(player.getWorld(), furnaceLoc.getX() + 1.0D, furnaceLoc.getY() + 2.0D, furnaceLoc.getZ() - 2.0D);
      
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
      if ((fLY1.getBlock().getType() == Material.GLASS) && (fLY2.getBlock().getType() == Material.STONE_BRICK_STAIRS) && 
        (flX1.getBlock().getType() == Material.STONE_BRICKS) && (flX_1.getBlock().getType() == Material.STONE_BRICKS) && 
        (flX1Y1.getBlock().getType() == Material.COBBLESTONE_WALL) && (flX_1Y1.getBlock().getType() == Material.COBBLESTONE_WALL) && 
        (flX1Y2.getBlock().getType() == Material.STONE_SLAB) && (flX_1Y2.getBlock().getType() == Material.STONE_SLAB)) {
        if ((fLY2Z1.getBlock().getType() == Material.STONE_SLAB) && 
          (flX1Z1.getBlock().getType() == Material.STONE_BRICKS) && (flX_1Z1.getBlock().getType() == Material.STONE_BRICKS) && 
          (flX1Y1Z1.getBlock().getType() == Material.GLASS) && (flX_1Y1Z1.getBlock().getType() == Material.GLASS) && 
          (flX_1Y2Z1.getBlock().getType() == Material.STONE_BRICK_STAIRS) && (flX1Y2Z1.getBlock().getType() == Material.STONE_BRICK_STAIRS) && 
          (furnaceLoc2.getBlock().getType() == Material.STONE_BRICKS)) {
          if ((fLY1Z2.getBlock().getType() == Material.GLASS) && (fLY2Z2.getBlock().getType() == Material.STONE_BRICK_STAIRS) && 
            (flX1Z2.getBlock().getType() == Material.STONE_BRICKS) && (flX_1Z2.getBlock().getType() == Material.STONE_BRICKS) && 
            (flX1Y1Z2.getBlock().getType() == Material.COBBLESTONE_WALL) && (flX_1Y1Z2.getBlock().getType() == Material.COBBLESTONE_WALL) && 
            (flX1Y2Z2.getBlock().getType() == Material.STONE_SLAB) && (flX_1Y2Z2.getBlock().getType() == Material.STONE_SLAB) && (furnaceLoc3.getBlock().getType() == Material.STONE_BRICKS)) {
            forger(player, e);
          }
        }
      }
      if ((fLY1.getBlock().getType() == Material.GLASS) && (fLY2.getBlock().getType() == Material.STONE_BRICK_STAIRS) && 
        (flX1.getBlock().getType() == Material.STONE_BRICKS) && (flX_1.getBlock().getType() == Material.STONE_BRICKS) && 
        (flX1Y1.getBlock().getType() == Material.COBBLESTONE_WALL) && (flX_1Y1.getBlock().getType() == Material.COBBLESTONE_WALL) && 
        (flX1Y2.getBlock().getType() == Material.STONE_SLAB) && (flX_1Y2.getBlock().getType() == Material.STONE_SLAB)) {
        if ((fLY2Z_1.getBlock().getType() == Material.STONE_SLAB) && 
          (flX1Z_1.getBlock().getType() == Material.STONE_BRICKS) && (flX_1Z_1.getBlock().getType() == Material.STONE_BRICKS) && 
          (flX1Y1Z_1.getBlock().getType() == Material.GLASS) && (flX_1Y1Z_1.getBlock().getType() == Material.GLASS) && 
          (flX_1Y2Z_1.getBlock().getType() == Material.STONE_BRICK_STAIRS) && (flX1Y2Z_1.getBlock().getType() == Material.STONE_BRICK_STAIRS) && 
          (furnaceLoc_2.getBlock().getType() == Material.STONE_BRICKS)) {
          if ((fLY1Z_2.getBlock().getType() == Material.GLASS) && (fLY2Z_2.getBlock().getType() == Material.STONE_BRICK_STAIRS) && 
            (flX1Z_2.getBlock().getType() == Material.STONE_BRICKS) && (flX_1Z_2.getBlock().getType() == Material.STONE_BRICKS) && 
            (flX1Y1Z_2.getBlock().getType() == Material.COBBLESTONE_WALL) && (flX_1Y1Z_2.getBlock().getType() == Material.COBBLESTONE_WALL) && 
            (flX1Y2Z_2.getBlock().getType() == Material.STONE_SLAB) && (flX_1Y2Z_2.getBlock().getType() == Material.STONE_SLAB) && (furnaceLoc_3.getBlock().getType() == Material.STONE_BRICKS)) {
            forger(player, e);
          }
        }
      }
      if ((dlZ1.getBlock().getType() == Material.STONE_BRICKS) && (dlZ_1.getBlock().getType() == Material.STONE_BRICKS) && 
        (dlY1.getBlock().getType() == Material.GLASS) && (dlZ1Y1.getBlock().getType() == Material.COBBLESTONE_WALL) && 
        (dlZ_1Y1.getBlock().getType() == Material.COBBLESTONE_WALL) && (dlZ1Y2.getBlock().getType() == Material.STONE_SLAB) && 
        (dlZ_1Y2.getBlock().getType() == Material.STONE_SLAB) && (dlY2.getBlock().getType() == Material.STONE_BRICK_STAIRS)) {
        if ((dispenserLoc2.getBlock().getType() == Material.STONE_BRICKS) && (dlZ1X1.getBlock().getType() == Material.STONE_BRICKS) && 
          (dlZ_1X1.getBlock().getType() == Material.STONE_BRICKS) && (dlZ1Y1X1.getBlock().getType() == Material.GLASS) && 
          (dlZ_1Y1X1.getBlock().getType() == Material.GLASS) && 
          (dlZ1Y2X1.getBlock().getType() == Material.STONE_BRICK_STAIRS) && (dlY2X1.getBlock().getType() == Material.STONE_SLAB) && 
          (dlZ_1Y2X1.getBlock().getType() == Material.STONE_BRICK_STAIRS)) {
          if ((dlZ1X2.getBlock().getType() == Material.STONE_BRICKS) && (dlZ_1X2.getBlock().getType() == Material.STONE_BRICKS) && 
            (dlY1X2.getBlock().getType() == Material.GLASS) && (dlZ1Y1X2.getBlock().getType() == Material.COBBLESTONE_WALL) && 
            (dlZ_1Y1X2.getBlock().getType() == Material.COBBLESTONE_WALL) && (dlZ1Y2X2.getBlock().getType() == Material.STONE_SLAB) && 
            (dlZ_1Y2X2.getBlock().getType() == Material.STONE_SLAB) && (dlY2X2.getBlock().getType() == Material.STONE_BRICK_STAIRS) && 
            (dispenserLoc3.getBlock().getType() == Material.STONE_BRICKS)) {
            forger(player, e);
          }
        }
      }
      if ((dlZ1.getBlock().getType() == Material.STONE_BRICKS) && (dlZ_1.getBlock().getType() == Material.STONE_BRICKS) && 
        (dlY1.getBlock().getType() == Material.GLASS) && (dlZ1Y1.getBlock().getType() == Material.COBBLESTONE_WALL) && 
        (dlZ_1Y1.getBlock().getType() == Material.COBBLESTONE_WALL) && (dlZ1Y2.getBlock().getType() == Material.STONE_SLAB) && 
        (dlZ_1Y2.getBlock().getType() == Material.STONE_SLAB) && (dlY2.getBlock().getType() == Material.STONE_BRICK_STAIRS)) {
        if ((dispenserLoc_2.getBlock().getType() == Material.STONE_BRICKS) && (dlZ1X_1.getBlock().getType() == Material.STONE_BRICKS) && 
          (dlZ_1X_1.getBlock().getType() == Material.STONE_BRICKS) && (dlZ1Y1X_1.getBlock().getType() == Material.GLASS) && 
          (dlZ_1Y1X_1.getBlock().getType() == Material.GLASS) && 
          (dlZ1Y2X_1.getBlock().getType() == Material.STONE_BRICK_STAIRS) && (dlY2X_1.getBlock().getType() == Material.STONE_SLAB) && 
          (dlZ_1Y2X_1.getBlock().getType() == Material.STONE_BRICK_STAIRS)) {
          if ((dlZ1X_2.getBlock().getType() == Material.STONE_BRICKS) && (dlZ_1X_2.getBlock().getType() == Material.STONE_BRICKS) && 
            (dlY1X_2.getBlock().getType() == Material.GLASS) && (dlZ1Y1X_2.getBlock().getType() == Material.COBBLESTONE_WALL) && 
            (dlZ_1Y1X_2.getBlock().getType() == Material.COBBLESTONE_WALL) && (dlZ1Y2X_2.getBlock().getType() == Material.STONE_SLAB) && 
            (dlZ_1Y2X_2.getBlock().getType() == Material.STONE_SLAB) && (dlY2X_2.getBlock().getType() == Material.STONE_BRICK_STAIRS) && 
            (dispenserLoc_3.getBlock().getType() == Material.STONE_BRICKS)) {
            forger(player, e);
          }
        }
      }
    }
    else
    {
      e.setCancelled(false);
    }
  }
  
  private Inventory getInv()
  {
    Inventory inv = Bukkit.createInventory(null, 9, ChatColor.BLUE + "Forger");
    
    ItemStack pane = new ItemStack(Material.RED_STAINED_GLASS_PANE);
    ItemMeta paneMeta = pane.getItemMeta();
    paneMeta.setDisplayName(" ");
    
    ItemStack forge = new ItemStack(Material.LAVA_BUCKET);
    ItemMeta forgeMeta = forge.getItemMeta();
    ArrayList<String> forgeLore = new ArrayList<String>();
    forgeLore.add("Craft 2 Hardened Ingots To Make A Blade");
    forgeLore.add("Craft 2 Blades  To Make A Pickaxe Head");
    forgeMeta.setLore(forgeLore);
    forgeMeta.setDisplayName(ChatColor.RESET + "Forge");
    forge.setItemMeta(forgeMeta);
    pane.setItemMeta(paneMeta);
    inv.setItem(0, pane);
    inv.setItem(1, pane);
    inv.setItem(2, pane);
    
    inv.setItem(4, forge);
    
    inv.setItem(6, pane);
    inv.setItem(7, pane);
    inv.setItem(8, pane);
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
      }
      else if (e.getCurrentItem().getType().equals(Material.LAVA_BUCKET))
      {
        e.setCancelled(true);
        
        ItemStack item1 = e.getInventory().getItem(3);
        ItemStack item2 = e.getInventory().getItem(5);
        Player player = (Player)e.getWhoClicked();
        if ((item1 != null) && (item2 != null) && 
          (item2.getType() != Material.AIR) && (item1.getType() != Material.AIR)) {
          craft(item1, item2, player, e);
        }
      }
    }
  }
  
  private void craft(ItemStack item1, ItemStack item2, Player player, InventoryClickEvent e)
  {
    Items ore = new Items();
    ItemStack HardenedIron = ore.getHardenedIron();
    ItemStack HardenedDiamond = ore.getHardenedDiamond();
    ItemStack IronBlade = ore.ForgedIronBlade();
    int am1 = item1.getAmount();
    int am2 = item2.getAmount();
    if ((item1.equals(HardenedDiamond)) && (am1 == 1) && (item2.equals(HardenedDiamond)) && (am2 == 1))
    {
      e.getInventory().setItem(3, new ItemStack(Material.AIR));
      e.getInventory().setItem(5, new ItemStack(Material.AIR));
      player.getInventory().addItem(new ItemStack[] { ore.ForgedDiaBlade() });
    }
    if ((item1.equals(HardenedIron)) && (am1 == 1) && (item2.equals(HardenedIron)) && (am2 == 1))
    {
      e.getInventory().setItem(3, new ItemStack(Material.AIR));
      e.getInventory().setItem(5, new ItemStack(Material.AIR));
      player.getInventory().addItem(new ItemStack[] { IronBlade });
    }
    if ((item1.equals(ore.getHardenedGold())) && (am1 == 1) && (item2.equals(ore.getHardenedGold())) && (am2 == 1))
    {
      e.getInventory().setItem(3, new ItemStack(Material.AIR));
      e.getInventory().setItem(5, new ItemStack(Material.AIR));
      player.getInventory().addItem(new ItemStack[] { ore.ForgedGoldBlade() });
    }
    if ((item1.equals(ore.ForgedIronBlade())) && (am1 == 1) && (item2.equals(ore.ForgedIronBlade())) && (am2 == 1))
    {
      e.getInventory().setItem(3, new ItemStack(Material.AIR));
      e.getInventory().setItem(5, new ItemStack(Material.AIR));
      player.getInventory().addItem(new ItemStack[] { ore.ForgedIronHead() });
    }
    if ((item1.equals(ore.ForgedDiaBlade())) && (am1 == 1) && (item2.equals(ore.ForgedDiaBlade())) && (am2 == 1))
    {
      e.getInventory().setItem(3, new ItemStack(Material.AIR));
      e.getInventory().setItem(5, new ItemStack(Material.AIR));
      player.getInventory().addItem(new ItemStack[] { ore.ForgedDiaHead() });
    }
    if ((item1.equals(ore.ForgedGoldBlade())) && (am1 == 1) && (item2.equals(ore.ForgedGoldBlade())) && (am2 == 1))
    {
      e.getInventory().setItem(3, new ItemStack(Material.AIR));
      e.getInventory().setItem(5, new ItemStack(Material.AIR));
      player.getInventory().addItem(new ItemStack[] { ore.ForgedGoldHead() });
    }
  }
  
  public void forger(Player player, InventoryOpenEvent e)
  {
    if (!this.config.contains("players." + player.getUniqueId()))
    {
      this.config.addDefault("players." + player.getUniqueId(), "");
      this.config.addDefault("players." + player.getUniqueId() + ".HardPick", Boolean.valueOf(false));
      this.config.addDefault("players." + player.getUniqueId() + ".HardSword", Boolean.valueOf(false));
      this.config.addDefault("players." + player.getUniqueId() + ".Level", Integer.valueOf(1));
      this.config.addDefault("players." + player.getUniqueId() + ".xp", Integer.valueOf(0));
      Main.instance.saveConfig();
    }
    player.openInventory(getInv());
  }
}
