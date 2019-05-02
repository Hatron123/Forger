package me.Hatron;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Dispenser;
import org.bukkit.material.MaterialData;

@SuppressWarnings("deprecation")
public class BlastFurnace
  implements Listener
{
  Main plugin;
  
  public BlastFurnace(Main plugin)
  {
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
    plugin.getLogger().info("fURNACE");
  }
  
  @EventHandler
  public void onInteract(InventoryOpenEvent e){
	  Player player = (Player)e.getPlayer();
	  Inventory inv = e.getInventory();
	  if(inv.getName().toLowerCase().equals("dispenser")) {
		  e.setCancelled(true);
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
      
      MaterialData d = furnaceLoc.getBlock().getState().getData();
      Dispenser disp = (Dispenser)d;
      BlockFace face = disp.getFacing();
      String facing = face.toString();

      if (facing.equals("NORTH"))
      {
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
             smelter(player, e);
            }
          }
        }
      }
      else if (facing.equals("SOUTH"))
      {
    	 
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
            smelter(player, e);
            }
          }
        }
      }
      else if (facing.equals("WEST"))
      {
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
             smelter(player, e);
            }
          }
        }
      }
      else if ((facing.equals("EAST")) && 
        (dlZ1.getBlock().getType() == Material.STONE_BRICKS) && (dlZ_1.getBlock().getType() == Material.STONE_BRICKS) && 
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
            smelter(player, e);
          }
        }

      }
	  }
  }
    
  
  
  public void smelter(final Player player, final InventoryOpenEvent e)
  {
	  
    e.setCancelled(true);
    if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null)
    {
      final Items ore = new Items();
      final ItemStack HardenedGoldOre = ore.getHardenedGoldOre();
      final ItemStack HardenedIronOre = ore.getHardenedIronOre();
      final ItemStack HardenedDiamondOre = ore.getHardenedDiamondOre();
      final ItemStack HardenedIron = ore.getHardenedIron();
      final ItemStack HardenedDiamond = ore.getHardenedDiamond();
      final ItemStack inHand = player.getInventory().getItemInMainHand();
      
      Location loc = e.getInventory().getLocation();
      Location furnaceLoc = new Location(player.getWorld(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());
      final Location fLY1Z1 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() + 1.0D);
      final Location fLY1Z_1 = new Location(player.getWorld(), furnaceLoc.getX(), furnaceLoc.getY() + 1.0D, furnaceLoc.getZ() - 1.0D);
      final Location dlY1X1 = new Location(player.getWorld(), loc.getBlockX() + 1, loc.getBlockY() + 1, loc.getBlockZ());
      final Location dlY1X_1 = new Location(player.getWorld(), loc.getBlockX() - 1, loc.getBlockY() + 1, loc.getBlockZ());
      
      MaterialData d = furnaceLoc.getBlock().getState().getData();
      Dispenser disp = (Dispenser)d;
      BlockFace face = disp.getFacing();
      final String facing = face.toString();
      
      ItemStack item = player.getInventory().getItemInMainHand();
      int num = player.getInventory().getItemInMainHand().getAmount();
      
      player.getInventory().getItemInMainHand().setAmount(1);
      if ((item.equals(HardenedDiamondOre)) || (item.equals(HardenedGoldOre)) || (item.equals(HardenedIronOre)))
      {
        e.setCancelled(true);
        
        player.getInventory().getItemInMainHand().setAmount(num - 1);
        if (facing.equals("NORTH")) {
          fLY1Z1.getBlock().setType(Material.LAVA);
        } else if (facing.equals("SOUTH")) {
          fLY1Z_1.getBlock().setType(Material.LAVA);
        } else if (facing.equals("WEST")) {
          dlY1X1.getBlock().setType(Material.LAVA);
        } else if (facing.equals("EAST")) {
          dlY1X_1.getBlock().setType(Material.LAVA);
        }
        Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
        {
          public void run()
          {
            if (inHand.getItemMeta().getDisplayName().equals(HardenedDiamondOre.getItemMeta().getDisplayName()))
            {
              e.getInventory().addItem(new ItemStack[] { HardenedDiamond });
              FileConfiguration config = Main.instance.getConfig();
              int xp = config.getInt("players." + player.getUniqueId() + ".xp");
              xp++;
              config.set("players." + player.getUniqueId() + ".xp", Integer.valueOf(xp));
              Main.instance.saveConfig();
            }
            else if (inHand.getItemMeta().getDisplayName().equals(HardenedIronOre.getItemMeta().getDisplayName()))
            {
              e.getInventory().addItem(new ItemStack[] { HardenedIron });
              FileConfiguration config = Main.instance.getConfig();
              int xp = config.getInt("players." + player.getUniqueId() + ".xp");
              xp++;
              config.set("players." + player.getUniqueId() + ".xp", Integer.valueOf(xp));
              Main.instance.saveConfig();
            }
            else if (inHand.getItemMeta().getDisplayName().equals(HardenedGoldOre.getItemMeta().getDisplayName()))
            {
              e.getInventory().addItem(new ItemStack[] { ore.getHardenedGold() });
              FileConfiguration config = Main.instance.getConfig();
              int xp = config.getInt("players." + player.getUniqueId() + ".xp");
              xp++;
              config.set("players." + player.getUniqueId() + ".xp", Integer.valueOf(xp));
              Main.instance.saveConfig();
            }
            if (facing.equals("NORTH")) {
              fLY1Z1.getBlock().setType(Material.AIR);
            } else if (facing.equals("SOUTH")) {
              fLY1Z_1.getBlock().setType(Material.AIR);
            } else if (facing.equals("WEST")) {
              dlY1X1.getBlock().setType(Material.AIR);
            } else if (facing.equals("EAST")) {
              dlY1X_1.getBlock().setType(Material.AIR);
            }
          }
        }, 60L);
      }
      else
      {
        player.getInventory().getItemInMainHand().setAmount(num);
      }
    }
    else
    {
     // e.setCancelled(false);
    }
  }
}
