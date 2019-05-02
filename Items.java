package me.Hatron;

import java.util.ArrayList;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Items
{
  public ItemStack ForgedIronBlade()
  {
    ItemStack HardenedIron = new ItemStack(Material.IRON_INGOT);
    ItemMeta HardenedIronMeta = HardenedIron.getItemMeta();
    ArrayList<String> HardenedIronLore = new ArrayList<String>();
    HardenedIronLore.add("A Strong Starter Blade");
    HardenedIronMeta.setLore(HardenedIronLore);
    HardenedIronMeta.setDisplayName(ChatColor.RESET + "Iron Blade");
    HardenedIron.setItemMeta(HardenedIronMeta);
    return HardenedIron;
  }
  
  public ItemStack ForgedDiaBlade()
  {
    ItemStack HardenedIron = new ItemStack(Material.DIAMOND);
    ItemMeta HardenedIronMeta = HardenedIron.getItemMeta();
    ArrayList<String> HardenedIronLore = new ArrayList<String>();
    HardenedIronLore.add("A Strong Starter Blade");
    HardenedIronMeta.setLore(HardenedIronLore);
    HardenedIronMeta.setDisplayName(ChatColor.RESET + "Diamond Blade");
    HardenedIron.setItemMeta(HardenedIronMeta);
    return HardenedIron;
  }
  
  public ItemStack ForgedGoldBlade()
  {
    ItemStack HardenedIron = new ItemStack(Material.GOLD_INGOT);
    ItemMeta HardenedIronMeta = HardenedIron.getItemMeta();
    ArrayList<String> HardenedIronLore = new ArrayList<String>();
    HardenedIronLore.add("A Strong Starter Blade");
    HardenedIronMeta.setLore(HardenedIronLore);
    HardenedIronMeta.setDisplayName(ChatColor.RESET + "Gold Blade");
    HardenedIron.setItemMeta(HardenedIronMeta);
    return HardenedIron;
  }
  
  public ItemStack getHardenedGold()
  {
    ItemStack HardenedGold = new ItemStack(Material.GOLD_INGOT);
    ItemMeta HardenedGoldMeta = HardenedGold.getItemMeta();
    ArrayList<String> HardenedGoldLore = new ArrayList<String>();
    HardenedGoldLore.add("One Of The Most");
    HardenedGoldLore.add("Valuable Ingots");
    HardenedGoldMeta.setLore(HardenedGoldLore);
    HardenedGoldMeta.setDisplayName(ChatColor.RESET + "Hardened Gold");
    HardenedGold.setItemMeta(HardenedGoldMeta);
    return HardenedGold;
  }
  
  public ItemStack getHardenedDiamond()
  {
    ItemStack HardenedDiamond = new ItemStack(Material.DIAMOND);
    ItemMeta HardenedDiamondMeta = HardenedDiamond.getItemMeta();
    ArrayList<String> HardenedDiamondLore = new ArrayList<String>();
    HardenedDiamondLore.add("One Of The Most");
    HardenedDiamondLore.add("Valuable Gemstones");
    HardenedDiamondMeta.setLore(HardenedDiamondLore);
    HardenedDiamondMeta.setDisplayName(ChatColor.RESET + "Hardened Diamond");
    HardenedDiamond.setItemMeta(HardenedDiamondMeta);
    return HardenedDiamond;
  }
  
  public ItemStack getHardenedIron()
  {
    ItemStack HardenedIron = new ItemStack(Material.IRON_INGOT);
    ItemMeta HardenedIronMeta = HardenedIron.getItemMeta();
    ArrayList<String> HardenedIronLore = new ArrayList<String>();
    HardenedIronLore.add("One Of The Most");
    HardenedIronLore.add("Valuable Ingots");
    HardenedIronMeta.setLore(HardenedIronLore);
    HardenedIronMeta.setDisplayName(ChatColor.RESET + "Hardened Iron");
    HardenedIron.setItemMeta(HardenedIronMeta);
    return HardenedIron;
  }
  
  public ItemStack getHardenedDiamondOre()
  {
    ItemStack HardenedDiamondOre = new ItemStack(Material.DIAMOND_ORE);
    ItemMeta HardenedDiamondOreMeta = HardenedDiamondOre.getItemMeta();
    ArrayList<String> lore = new ArrayList<String>();
    lore.add("Slowly hardened from the weight and pressure");
    lore.add("of the earth. All the while absorbing Chi");
    HardenedDiamondOreMeta.setLore(lore);
    HardenedDiamondOreMeta.setDisplayName(ChatColor.RESET + "Hardened Diamond Ore");
    HardenedDiamondOre.setItemMeta(HardenedDiamondOreMeta);
    return HardenedDiamondOre;
  }
  
  public ItemStack getHardenedIronOre()
  {
    ItemStack HardenedIronOre = new ItemStack(Material.IRON_ORE);
    ItemMeta HardenedIronOreMeta = HardenedIronOre.getItemMeta();
    ArrayList<String> lore = new ArrayList<String>();
    lore.add("Slowly hardened from the weight and pressure");
    lore.add("of the earth. All the while absorbing Chi");
    HardenedIronOreMeta.setLore(lore);
    HardenedIronOreMeta.setDisplayName(ChatColor.RESET + "Hardened Iron Ore");
    HardenedIronOre.setItemMeta(HardenedIronOreMeta);
    return HardenedIronOre;
  }
  
  public ItemStack getHardenedGoldOre()
  {
    ItemStack HardenedGoldOre = new ItemStack(Material.GOLD_ORE);
    ItemMeta HardenedGoldOreMeta = HardenedGoldOre.getItemMeta();
    ArrayList<String> lore = new ArrayList<String>();
    lore.add("Slowly hardened from the weight and pressure");
    lore.add("of the earth. All the while absorbing Chi");
    HardenedGoldOreMeta.setLore(lore);
    HardenedGoldOreMeta.setDisplayName(ChatColor.RESET + "Hardened Gold Ore");
    HardenedGoldOre.setItemMeta(HardenedGoldOreMeta);
    return HardenedGoldOre;
  }
  
  public ItemStack ForgedDiaHead()
  {
    ItemStack HardenedIron = new ItemStack(Material.DIAMOND);
    ItemMeta HardenedIronMeta = HardenedIron.getItemMeta();
    ArrayList<String> HardenedIronLore = new ArrayList<String>();
    HardenedIronLore.add("A Strong Starter Pickaxe Head");
    HardenedIronMeta.setLore(HardenedIronLore);
    HardenedIronMeta.setDisplayName(ChatColor.RESET + "Diamond Pickaxe Head");
    HardenedIron.setItemMeta(HardenedIronMeta);
    return HardenedIron;
  }
  
  public ItemStack ForgedIronHead()
  {
    ItemStack HardenedIron = new ItemStack(Material.IRON_INGOT);
    ItemMeta HardenedIronMeta = HardenedIron.getItemMeta();
    ArrayList<String> HardenedIronLore = new ArrayList<String>();
    HardenedIronLore.add("A Strong Starter Pickaxe Head");
    HardenedIronMeta.setLore(HardenedIronLore);
    HardenedIronMeta.setDisplayName(ChatColor.RESET + "Iron Pickaxe Head");
    HardenedIron.setItemMeta(HardenedIronMeta);
    return HardenedIron;
  }
  
  public ItemStack ForgedGoldHead()
  {
    ItemStack HardenedIron = new ItemStack(Material.GOLD_INGOT);
    ItemMeta HardenedIronMeta = HardenedIron.getItemMeta();
    ArrayList<String> HardenedIronLore = new ArrayList<String>();
    HardenedIronLore.add("A Strong Starter Pickaxe Head");
    HardenedIronMeta.setLore(HardenedIronLore);
    HardenedIronMeta.setDisplayName(ChatColor.RESET + "Gold Pickaxe Head");
    HardenedIron.setItemMeta(HardenedIronMeta);
    return HardenedIron;
  }
  
  public ItemStack ForgedDiaPick()
  {
    ItemStack HardPick = new ItemStack(Material.DIAMOND_PICKAXE);
    ItemMeta HardPickMeta = HardPick.getItemMeta();
    ArrayList<String> HardPickLore = new ArrayList<String>();
    HardPickLore.add("One of the most precious");
    HardPickLore.add("Tools Around");
    HardPickMeta.setLore(HardPickLore);
    HardPickMeta.setDisplayName(ChatColor.DARK_AQUA + "Forged Diamond Pick");
    HardPick.setItemMeta(HardPickMeta);
    HardPick.addEnchantment(Enchantment.DIG_SPEED, 2);
    HardPick.addEnchantment(Enchantment.DURABILITY, 2);
    return HardPick;
  }
  
  public ItemStack NoviceDiaPick()
  {
    ItemStack HardPick = new ItemStack(Material.DIAMOND_PICKAXE);
    ItemMeta HardPickMeta = HardPick.getItemMeta();
    ArrayList<String> HardPickLore = new ArrayList<String>();
    HardPickLore.add("One of the most precious");
    HardPickLore.add("Tools Around");
    HardPickMeta.setLore(HardPickLore);
    HardPickMeta.setDisplayName(ChatColor.DARK_AQUA + "Novice Diamond Pick");
    HardPick.setItemMeta(HardPickMeta);
    HardPick.addEnchantment(Enchantment.DIG_SPEED, 3);
    HardPick.addEnchantment(Enchantment.DURABILITY, 3);
    return HardPick;
  }
  
  public ItemStack MasterDiaPick()
  {
    ItemStack HardPick = new ItemStack(Material.DIAMOND_PICKAXE);
    ItemMeta HardPickMeta = HardPick.getItemMeta();
    ArrayList<String> HardPickLore = new ArrayList<String>();
    HardPickLore.add("One of the most precious");
    HardPickLore.add("Tools Around");
    HardPickMeta.setLore(HardPickLore);
    HardPickMeta.setDisplayName(ChatColor.DARK_AQUA + "Master Diamond Pick");
    HardPick.setItemMeta(HardPickMeta);
    HardPick.addEnchantment(Enchantment.DIG_SPEED, 5);
    HardPick.addEnchantment(Enchantment.DURABILITY, 3);
    return HardPick;
  }
  
  public ItemStack GodDiaPick()
  {
    ItemStack HardPick = new ItemStack(Material.DIAMOND_PICKAXE);
    ItemMeta HardPickMeta = HardPick.getItemMeta();
    ArrayList<String> HardPickLore = new ArrayList<String>();
    HardPickLore.add("One of the most precious");
    HardPickLore.add("Tools Around");
    HardPickMeta.setLore(HardPickLore);
    HardPickMeta.setDisplayName(ChatColor.DARK_AQUA + "God Diamond Pick");
    HardPick.setItemMeta(HardPickMeta);
    HardPick.addEnchantment(Enchantment.DIG_SPEED, 5);
    HardPick.addEnchantment(Enchantment.DURABILITY, 3);
    HardPick.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
    return HardPick;
  }
  
  public ItemStack ForgedIronPick()
  {
    ItemStack HardPick = new ItemStack(Material.IRON_PICKAXE);
    ItemMeta HardPickMeta = HardPick.getItemMeta();
    ArrayList<String> HardPickLore = new ArrayList<String>();
    HardPickLore.add("One of the most precious");
    HardPickLore.add("Tools Around");
    HardPickMeta.setLore(HardPickLore);
    HardPickMeta.setDisplayName(ChatColor.DARK_AQUA + "Forged Iron Pick");
    HardPick.setItemMeta(HardPickMeta);
    HardPick.addEnchantment(Enchantment.DIG_SPEED, 2);
    HardPick.addEnchantment(Enchantment.DURABILITY, 2);
    return HardPick;
  }
  
  public ItemStack NoviceIronPick()
  {
    ItemStack HardPick = new ItemStack(Material.IRON_PICKAXE);
    ItemMeta HardPickMeta = HardPick.getItemMeta();
    ArrayList<String> HardPickLore = new ArrayList<String>();
    HardPickLore.add("One of the most precious");
    HardPickLore.add("Tools Around");
    HardPickMeta.setLore(HardPickLore);
    HardPickMeta.setDisplayName(ChatColor.DARK_AQUA + "Novice Iron Pick");
    HardPick.setItemMeta(HardPickMeta);
    HardPick.addEnchantment(Enchantment.DIG_SPEED, 3);
    HardPick.addEnchantment(Enchantment.DURABILITY, 3);
    return HardPick;
  }
  
  public ItemStack MasterIronPick()
  {
    ItemStack HardPick = new ItemStack(Material.IRON_PICKAXE);
    ItemMeta HardPickMeta = HardPick.getItemMeta();
    ArrayList<String> HardPickLore = new ArrayList<String>();
    HardPickLore.add("One of the most precious");
    HardPickLore.add("Tools Around");
    HardPickMeta.setLore(HardPickLore);
    HardPickMeta.setDisplayName(ChatColor.DARK_AQUA + "Master Iron Pick");
    HardPick.setItemMeta(HardPickMeta);
    HardPick.addEnchantment(Enchantment.DIG_SPEED, 5);
    HardPick.addEnchantment(Enchantment.DURABILITY, 3);
    return HardPick;
  }
  
  public ItemStack GodIronPick()
  {
    ItemStack HardPick = new ItemStack(Material.IRON_PICKAXE);
    ItemMeta HardPickMeta = HardPick.getItemMeta();
    ArrayList<String> HardPickLore = new ArrayList<String>();
    HardPickLore.add("One of the most precious");
    HardPickLore.add("Tools Around");
    HardPickMeta.setLore(HardPickLore);
    HardPickMeta.setDisplayName(ChatColor.DARK_AQUA + "God Iron Pick");
    HardPick.setItemMeta(HardPickMeta);
    HardPick.addEnchantment(Enchantment.DIG_SPEED, 5);
    HardPick.addEnchantment(Enchantment.DURABILITY, 3);
    HardPick.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
    return HardPick;
  }
  
  public ItemStack ForgedIronSword()
  {
    ItemStack HardSword = new ItemStack(Material.IRON_SWORD);
    ItemMeta HardSwordMeta = HardSword.getItemMeta();
    ArrayList<String> HardSwordLore = new ArrayList<String>();
    HardSwordLore.add("One of the most precious");
    HardSwordLore.add("Tools Around");
    HardSwordMeta.setLore(HardSwordLore);
    HardSwordMeta.setDisplayName(ChatColor.DARK_AQUA + "Forged Iron Sword");
    HardSword.setItemMeta(HardSwordMeta);
    HardSword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
    HardSword.addEnchantment(Enchantment.DURABILITY, 2);
    return HardSword;
  }
  
  public ItemStack NoviceIronSword()
  {
    ItemStack HardSword = new ItemStack(Material.IRON_SWORD);
    ItemMeta HardSwordMeta = HardSword.getItemMeta();
    ArrayList<String> HardSwordLore = new ArrayList<String>();
    HardSwordLore.add("One of the most precious");
    HardSwordLore.add("Tools Around");
    HardSwordMeta.setLore(HardSwordLore);
    HardSwordMeta.setDisplayName(ChatColor.DARK_AQUA + "Novice Iron Sword");
    HardSword.setItemMeta(HardSwordMeta);
    HardSword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
    HardSword.addEnchantment(Enchantment.DURABILITY, 3);
    return HardSword;
  }
  
  public ItemStack MasterIronSword()
  {
    ItemStack HardSword = new ItemStack(Material.IRON_SWORD);
    ItemMeta HardSwordMeta = HardSword.getItemMeta();
    ArrayList<String> HardSwordLore = new ArrayList<String>();
    HardSwordLore.add("One of the most precious");
    HardSwordLore.add("Tools Around");
    HardSwordMeta.setLore(HardSwordLore);
    HardSwordMeta.setDisplayName(ChatColor.DARK_AQUA + "Master Iron Sword");
    HardSword.setItemMeta(HardSwordMeta);
    HardSword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
    HardSword.addEnchantment(Enchantment.DURABILITY, 3);
    return HardSword;
  }
  
  public ItemStack GodIronSword()
  {
    ItemStack HardSword = new ItemStack(Material.IRON_SWORD);
    ItemMeta HardSwordMeta = HardSword.getItemMeta();
    ArrayList<String> HardSwordLore = new ArrayList<String>();
    HardSwordLore.add("One of the most precious");
    HardSwordLore.add("Tools Around");
    HardSwordMeta.setLore(HardSwordLore);
    HardSwordMeta.setDisplayName(ChatColor.DARK_AQUA + "God Iron Sword");
    HardSword.setItemMeta(HardSwordMeta);
    HardSword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
    HardSword.addEnchantment(Enchantment.DURABILITY, 3);
    HardSword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
    return HardSword;
  }
  
  public ItemStack ForgedGoldSword()
  {
    ItemStack HardSword = new ItemStack(Material.GOLDEN_SWORD);
    ItemMeta HardSwordMeta = HardSword.getItemMeta();
    ArrayList<String> HardSwordLore = new ArrayList<String>();
    HardSwordLore.add("One of the most precious");
    HardSwordLore.add("Tools Around");
    HardSwordMeta.setLore(HardSwordLore);
    HardSwordMeta.setDisplayName(ChatColor.DARK_AQUA + "Forged Gold Sword");
    HardSword.setItemMeta(HardSwordMeta);
    HardSword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
    HardSword.addEnchantment(Enchantment.DURABILITY, 2);
    return HardSword;
  }
  
  public ItemStack NoviceGoldSword()
  {
    ItemStack HardSword = new ItemStack(Material.GOLDEN_SWORD);
    ItemMeta HardSwordMeta = HardSword.getItemMeta();
    ArrayList<String> HardSwordLore = new ArrayList<String>();
    HardSwordLore.add("One of the most precious");
    HardSwordLore.add("Tools Around");
    HardSwordMeta.setLore(HardSwordLore);
    HardSwordMeta.setDisplayName(ChatColor.DARK_AQUA + "Novice Gold Sword");
    HardSword.setItemMeta(HardSwordMeta);
    HardSword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
    HardSword.addEnchantment(Enchantment.DURABILITY, 3);
    return HardSword;
  }
  
  public ItemStack MasterGoldSword()
  {
    ItemStack HardSword = new ItemStack(Material.GOLDEN_SWORD);
    ItemMeta HardSwordMeta = HardSword.getItemMeta();
    ArrayList<String> HardSwordLore = new ArrayList<String>();
    HardSwordLore.add("One of the most precious");
    HardSwordLore.add("Tools Around");
    HardSwordMeta.setLore(HardSwordLore);
    HardSwordMeta.setDisplayName(ChatColor.DARK_AQUA + "Master Gold Sword");
    HardSword.setItemMeta(HardSwordMeta);
    HardSword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
    HardSword.addEnchantment(Enchantment.DURABILITY, 3);
    return HardSword;
  }
  
  public ItemStack GodGoldSword()
  {
    ItemStack HardSword = new ItemStack(Material.GOLDEN_SWORD);
    ItemMeta HardSwordMeta = HardSword.getItemMeta();
    ArrayList<String> HardSwordLore = new ArrayList<String>();
    HardSwordLore.add("One of the most precious");
    HardSwordLore.add("Tools Around");
    HardSwordMeta.setLore(HardSwordLore);
    HardSwordMeta.setDisplayName(ChatColor.DARK_AQUA + "God Gold Sword");
    HardSword.setItemMeta(HardSwordMeta);
    HardSword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
    HardSword.addEnchantment(Enchantment.DURABILITY, 3);
    HardSword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
    return HardSword;
  }
  
  public ItemStack ForgedDiaSword()
  {
    ItemStack HardSword = new ItemStack(Material.DIAMOND_SWORD);
    ItemMeta HardSwordMeta = HardSword.getItemMeta();
    ArrayList<String> HardSwordLore = new ArrayList<String>();
    HardSwordLore.add("One of the most precious");
    HardSwordLore.add("Tools Around");
    HardSwordMeta.setLore(HardSwordLore);
    HardSwordMeta.setDisplayName(ChatColor.DARK_AQUA + "Forged Diamond Sword");
    HardSword.setItemMeta(HardSwordMeta);
    HardSword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
    HardSword.addEnchantment(Enchantment.DURABILITY, 2);
    return HardSword;
  }
  
  public ItemStack NoviceDiaSword()
  {
    ItemStack HardSword = new ItemStack(Material.DIAMOND_SWORD);
    ItemMeta HardSwordMeta = HardSword.getItemMeta();
    ArrayList<String> HardSwordLore = new ArrayList<String>();
    HardSwordLore.add("One of the most precious");
    HardSwordLore.add("Tools Around");
    HardSwordMeta.setLore(HardSwordLore);
    HardSwordMeta.setDisplayName(ChatColor.DARK_AQUA + "Novice Diamond Sword");
    HardSword.setItemMeta(HardSwordMeta);
    HardSword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
    HardSword.addEnchantment(Enchantment.DURABILITY, 3);
    return HardSword;
  }
  
  public ItemStack MasterDiaSword()
  {
    ItemStack HardSword = new ItemStack(Material.DIAMOND_SWORD);
    ItemMeta HardSwordMeta = HardSword.getItemMeta();
    ArrayList<String> HardSwordLore = new ArrayList<String>();
    HardSwordLore.add("One of the most precious");
    HardSwordLore.add("Tools Around");
    HardSwordMeta.setLore(HardSwordLore);
    HardSwordMeta.setDisplayName(ChatColor.DARK_AQUA + "Master Diamond Sword");
    HardSword.setItemMeta(HardSwordMeta);
    HardSword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
    HardSword.addEnchantment(Enchantment.DURABILITY, 3);
    return HardSword;
  }
  
  public ItemStack GodDiaSword()
  {
    ItemStack HardSword = new ItemStack(Material.DIAMOND_SWORD);
    ItemMeta HardSwordMeta = HardSword.getItemMeta();
    ArrayList<String> HardSwordLore = new ArrayList<String>();
    HardSwordLore.add("One of the most precious");
    HardSwordLore.add("Tools Around");
    HardSwordMeta.setLore(HardSwordLore);
    HardSwordMeta.setDisplayName(ChatColor.DARK_AQUA + "God Diamond Sword");
    HardSword.setItemMeta(HardSwordMeta);
    HardSword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
    HardSword.addEnchantment(Enchantment.DURABILITY, 3);
    HardSword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
    return HardSword;
  }
  
  public ItemStack ForgedGoldPick()
  {
    ItemStack HardPick = new ItemStack(Material.GOLDEN_PICKAXE);
    ItemMeta HardPickMeta = HardPick.getItemMeta();
    ArrayList<String> HardPickLore = new ArrayList<String>();
    HardPickLore.add("One of the most precious");
    HardPickLore.add("Tools Around");
    HardPickMeta.setLore(HardPickLore);
    HardPickMeta.setDisplayName(ChatColor.DARK_AQUA + "Forged Gold Pick");
    HardPick.setItemMeta(HardPickMeta);
    HardPick.addEnchantment(Enchantment.DIG_SPEED, 2);
    HardPick.addEnchantment(Enchantment.DURABILITY, 2);
    return HardPick;
  }
  
  public ItemStack NoviceGoldPick()
  {
    ItemStack HardPick = new ItemStack(Material.GOLDEN_PICKAXE);
    ItemMeta HardPickMeta = HardPick.getItemMeta();
    ArrayList<String> HardPickLore = new ArrayList<String>();
    HardPickLore.add("One of the most precious");
    HardPickLore.add("Tools Around");
    HardPickMeta.setLore(HardPickLore);
    HardPickMeta.setDisplayName(ChatColor.DARK_AQUA + "Novice Gold Pick");
    HardPick.setItemMeta(HardPickMeta);
    HardPick.addEnchantment(Enchantment.DIG_SPEED, 3);
    HardPick.addEnchantment(Enchantment.DURABILITY, 3);
    return HardPick;
  }
  
  public ItemStack MasterGoldPick()
  {
    ItemStack HardPick = new ItemStack(Material.GOLDEN_PICKAXE);
    ItemMeta HardPickMeta = HardPick.getItemMeta();
    ArrayList<String> HardPickLore = new ArrayList<String>();
    HardPickLore.add("One of the most precious");
    HardPickLore.add("Tools Around");
    HardPickMeta.setLore(HardPickLore);
    HardPickMeta.setDisplayName(ChatColor.DARK_AQUA + "Master Gold Pick");
    HardPick.setItemMeta(HardPickMeta);
    HardPick.addEnchantment(Enchantment.DIG_SPEED, 5);
    HardPick.addEnchantment(Enchantment.DURABILITY, 3);
    return HardPick;
  }
  
  public ItemStack GodGoldPick()
  {
    ItemStack HardPick = new ItemStack(Material.GOLDEN_PICKAXE);
    ItemMeta HardPickMeta = HardPick.getItemMeta();
    ArrayList<String> HardPickLore = new ArrayList<String>();
    HardPickLore.add("One of the most precious");
    HardPickLore.add("Tools Around");
    HardPickMeta.setLore(HardPickLore);
    HardPickMeta.setDisplayName(ChatColor.DARK_AQUA + "God Gold Pick");
    HardPick.setItemMeta(HardPickMeta);
    HardPick.addEnchantment(Enchantment.DIG_SPEED, 5);
    HardPick.addEnchantment(Enchantment.DURABILITY, 3);
    HardPick.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
    return HardPick;
  }
}
