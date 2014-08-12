package com.buzzyog.hubmenu.wardrobe;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class WardrobeShop implements Listener {

       public static Inventory WardrobeShopInv;
       private static Inventory invlh;
       private static Inventory invlc;
       private static Inventory invll;
       private static Inventory invlb;
       
       
       public static void openWardrobeShop(Player p) {
               WardrobeShopInv = Bukkit.getServer().createInventory(null, 36, "            §2§lWardrobe Shop");
               invlh = Bukkit.getServer().createInventory(null, 36, "§2Choose Your Hat");
               invlc = Bukkit.getServer().createInventory(null, 36, "§2Choose Your Shirt");
               invll = Bukkit.getServer().createInventory(null, 36, "§2Choose Your Pants");
               invlb = Bukkit.getServer().createInventory(null, 36, "§2Choose Your Boots");
               
               ItemStack lh = new ItemStack(Material.LEATHER_HELMET, 1);
               ItemStack ch = new ItemStack(Material.CHAINMAIL_HELMET, 1);
               ItemStack ih = new ItemStack(Material.IRON_HELMET, 1);
               ItemStack gh = new ItemStack(Material.GOLD_HELMET, 1);
               ItemStack dh = new ItemStack(Material.DIAMOND_HELMET, 1);
               
               ItemStack lc = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
               ItemStack cc = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
               ItemStack ic = new ItemStack(Material.IRON_CHESTPLATE, 1);
               ItemStack gc = new ItemStack(Material.GOLD_CHESTPLATE, 1);
               ItemStack dc = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
               
               ItemStack ll = new ItemStack(Material.LEATHER_LEGGINGS, 1);
               ItemStack cl = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
               ItemStack il = new ItemStack(Material.IRON_LEGGINGS, 1);
               ItemStack gl = new ItemStack(Material.GOLD_LEGGINGS, 1);
               ItemStack dl = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
               
               ItemStack lb = new ItemStack(Material.LEATHER_BOOTS, 1);
               ItemStack cb = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
               ItemStack ib = new ItemStack(Material.IRON_BOOTS, 1);
               ItemStack gb = new ItemStack(Material.GOLD_BOOTS, 1);
               ItemStack db = new ItemStack(Material.DIAMOND_BOOTS, 1);
               
               ItemStack WEB1 = new ItemStack(Material.WEB, 1);
               ItemMeta WEBmeta1 = WEB1.getItemMeta();
               WEB1.setAmount(1);
               WEBmeta1.setDisplayName("§9§lChoose Your Color");
               WEB1.setItemMeta(WEBmeta1);
               ItemStack WEB2 = new ItemStack(Material.WEB, 1);
               ItemMeta WEBmeta2 = WEB2.getItemMeta();
               WEB2.setAmount(2);
               WEBmeta2.setDisplayName("§9§lChoose Your Color");
               WEB2.setItemMeta(WEBmeta2);
               ItemStack WEB3 = new ItemStack(Material.WEB, 1);
               ItemMeta WEBmeta3 = WEB3.getItemMeta();
               WEB3.setAmount(3);
               WEBmeta3.setDisplayName("§9§lChoose Your Color");
               WEB3.setItemMeta(WEBmeta3);
               ItemStack WEB4 = new ItemStack(Material.WEB, 1);
               WEB4.setAmount(4);
               ItemMeta WEBmeta4 = WEB4.getItemMeta();
               WEBmeta4.setDisplayName("§9§lChoose Your Color");
               WEB4.setItemMeta(WEBmeta4);
               
               
               
               ItemStack white = new ItemStack(Material.INK_SACK, 1, (short)15);
               ItemMeta whitemeta = white.getItemMeta();
               whitemeta.setDisplayName("White");
               white.setItemMeta(whitemeta);
               
               ItemStack orange = new ItemStack(Material.INK_SACK, 1, (short)14);
               ItemMeta orangemeta = orange.getItemMeta();
               orangemeta.setDisplayName("Orange");
               orange.setItemMeta(orangemeta);
               
               ItemStack magenta = new ItemStack(Material.INK_SACK, 1, (short)13);
               ItemMeta magentameta = magenta.getItemMeta();
               magentameta.setDisplayName("Magenta");
               magenta.setItemMeta(magentameta);
               
               ItemStack lightblue = new ItemStack(Material.INK_SACK, 1, (short)12);
               ItemMeta lightbluemeta = lightblue.getItemMeta();
               lightbluemeta.setDisplayName("Light Blue");
               lightblue.setItemMeta(lightbluemeta);
               
               ItemStack yellow = new ItemStack(Material.INK_SACK, 1, (short)11);
               ItemMeta yellowmeta = yellow.getItemMeta();
               yellowmeta.setDisplayName("Yellow");
               yellow.setItemMeta(yellowmeta);
               
               ItemStack lime = new ItemStack(Material.INK_SACK, 1, (short)10);
               ItemMeta limemeta = lime.getItemMeta();
               limemeta.setDisplayName("Lime Green");
               lime.setItemMeta(limemeta);
               
               ItemStack pink = new ItemStack(Material.INK_SACK, 1, (short)9);
               ItemMeta pinkmeta = pink.getItemMeta();
               pinkmeta.setDisplayName("Pink");
               pink.setItemMeta(pinkmeta);
               
               ItemStack gray = new ItemStack(Material.INK_SACK, 1, (short)8);
               ItemMeta graymeta = gray.getItemMeta();
               graymeta.setDisplayName("Gray");
               gray.setItemMeta(graymeta);
               
               ItemStack silver = new ItemStack(Material.INK_SACK, 1, (short)7);
               ItemMeta silvermeta = silver.getItemMeta();
               silvermeta.setDisplayName("Silver");
               silver.setItemMeta(silvermeta);
               
               ItemStack cyan = new ItemStack(Material.INK_SACK, 1, (short)6);
               ItemMeta cyanmeta = cyan.getItemMeta();
               cyanmeta.setDisplayName("Cyan");
               cyan.setItemMeta(cyanmeta);
               
               ItemStack purple = new ItemStack(Material.INK_SACK, 1, (short)5);
               ItemMeta purplemeta = purple.getItemMeta();
               purplemeta.setDisplayName("Purple");
               purple.setItemMeta(purplemeta);
               
               ItemStack blue = new ItemStack(Material.INK_SACK, 1, (short)4);
               ItemMeta bluemeta = blue.getItemMeta();
               bluemeta.setDisplayName("Blue");
               blue.setItemMeta(bluemeta);
               
               ItemStack brown = new ItemStack(Material.INK_SACK, 1, (short)3);
               ItemMeta brownmeta = brown.getItemMeta();
               brownmeta.setDisplayName("Brown");
               brown.setItemMeta(brownmeta);
               
               ItemStack green = new ItemStack(Material.INK_SACK, 1, (short)2);
               ItemMeta greenmeta = green.getItemMeta();
               greenmeta.setDisplayName("Green");
               green.setItemMeta(greenmeta);
               
               ItemStack red = new ItemStack(Material.INK_SACK, 1, (short)1);
               ItemMeta redmeta = red.getItemMeta();
               redmeta.setDisplayName("Red");
               red.setItemMeta(redmeta);
               
               ItemStack black = new ItemStack(Material.INK_SACK, 1, (short)0);
               ItemMeta blackmeta = black.getItemMeta();
               blackmeta.setDisplayName("Black");
               black.setItemMeta(blackmeta);
               
               
               
               ItemStack glass5 = new ItemStack(Material.GLASS, 1);
               glass5.setAmount(1);
               ItemMeta glassmeta5 = glass5.getItemMeta();
               glassmeta5.setDisplayName("§bClear");
               glass5.setItemMeta(glassmeta5);
               
               ItemStack arrow = new ItemStack(Material.ARROW, 1);
               arrow.setAmount(1);
               ItemMeta arrowmeta = arrow.getItemMeta();
               arrowmeta.setDisplayName("§cCancel");
               arrow.setItemMeta(arrowmeta);
               
               ItemStack glass1 = new ItemStack(Material.GLASS, 1);
               ItemMeta glassmeta1 = glass1.getItemMeta();
               glass1.setAmount(1);
               glassmeta1.setDisplayName("§9Clear Your Hat");
               glass1.setItemMeta(glassmeta1);
               ItemStack glass2 = new ItemStack(Material.GLASS, 1);
               ItemMeta glassmeta2 = glass2.getItemMeta();
               glass2.setAmount(2);
               glassmeta2.setDisplayName("§9Clear Your Shirt");
               glass2.setItemMeta(glassmeta2);
               ItemStack glass3 = new ItemStack(Material.GLASS, 1);
               ItemMeta glassmeta3 = glass3.getItemMeta();
               glass3.setAmount(3);
               glassmeta3.setDisplayName("§9Clear Your Pants");
               glass3.setItemMeta(glassmeta3);
               ItemStack glass4 = new ItemStack(Material.GLASS, 1);
               glass4.setAmount(4);
               ItemMeta glassmeta4 = glass4.getItemMeta();
               glassmeta4.setDisplayName("§9Clear Your Boots");
               glass4.setItemMeta(glassmeta4);
             
               WardrobeShopInv.setItem(2, lh);
               WardrobeShopInv.setItem(3, ch);
               WardrobeShopInv.setItem(4, ih);
               WardrobeShopInv.setItem(5, gh);
               WardrobeShopInv.setItem(6, dh);
               
               WardrobeShopInv.setItem(11, lc);
               WardrobeShopInv.setItem(12, cc);
               WardrobeShopInv.setItem(13, ic);
               WardrobeShopInv.setItem(14, gc);
               WardrobeShopInv.setItem(15, dc);
               
               WardrobeShopInv.setItem(20, ll);
               WardrobeShopInv.setItem(21, cl);
               WardrobeShopInv.setItem(22, il);
               WardrobeShopInv.setItem(23, gl);
               WardrobeShopInv.setItem(24, dl);

               WardrobeShopInv.setItem(29, lb);
               WardrobeShopInv.setItem(30, cb);
               WardrobeShopInv.setItem(31, ib);
               WardrobeShopInv.setItem(32, gb);
               WardrobeShopInv.setItem(33, db);
               
               
               WardrobeShopInv.setItem(0, WEB1);
               WardrobeShopInv.setItem(9, WEB2);
               WardrobeShopInv.setItem(18, WEB3);
               WardrobeShopInv.setItem(27, WEB4);
               
               
               WardrobeShopInv.setItem(8, glass1);
               WardrobeShopInv.setItem(17, glass2);
               WardrobeShopInv.setItem(26, glass3);
               WardrobeShopInv.setItem(35, glass4);
               
               
               invlh.setItem(0, white);
               invlh.setItem(1, orange);
               invlh.setItem(2, magenta);
               invlh.setItem(3, lightblue);
               invlh.setItem(4, yellow);
               invlh.setItem(5, lime);
               invlh.setItem(6, pink);
               invlh.setItem(7, gray);
               invlh.setItem(8, silver);
               
               invlh.setItem(10, cyan);
               invlh.setItem(11, purple);
               invlh.setItem(12, blue);
               invlh.setItem(13, brown);
               invlh.setItem(14, green);
               invlh.setItem(15, red);
               invlh.setItem(16, black);
               
               invlh.setItem(30, glass5);
               invlh.setItem(32, arrow);
               
               
               invlc.setItem(0, white);
               invlc.setItem(1, orange);
               invlc.setItem(2, magenta);
               invlc.setItem(3, lightblue);
               invlc.setItem(4, yellow);
               invlc.setItem(5, lime);
               invlc.setItem(6, pink);
               invlc.setItem(7, gray);
               invlc.setItem(8, silver);
               
               invlc.setItem(10, cyan);
               invlc.setItem(11, purple);
               invlc.setItem(12, blue);
               invlc.setItem(13, brown);
               invlc.setItem(14, green);
               invlc.setItem(15, red);
               invlc.setItem(16, black);
               
               invlc.setItem(30, glass5);
               invlc.setItem(32, arrow);
               
               
               invll.setItem(0, white);
               invll.setItem(1, orange);
               invll.setItem(2, magenta);
               invll.setItem(3, lightblue);
               invll.setItem(4, yellow);
               invll.setItem(5, lime);
               invll.setItem(6, pink);
               invll.setItem(7, gray);
               invll.setItem(8, silver);
               
               invll.setItem(10, cyan);
               invll.setItem(11, purple);
               invll.setItem(12, blue);
               invll.setItem(13, brown);
               invll.setItem(14, green);
               invll.setItem(15, red);
               invll.setItem(16, black);
               
               invll.setItem(30, glass5);
               invll.setItem(32, arrow);
               
               
               invlb.setItem(0, white);
               invlb.setItem(1, orange);
               invlb.setItem(2, magenta);
               invlb.setItem(3, lightblue);
               invlb.setItem(4, yellow);
               invlb.setItem(5, lime);
               invlb.setItem(6, pink);
               invlb.setItem(7, gray);
               invlb.setItem(8, silver);
               
               invlb.setItem(10, cyan);
               invlb.setItem(11, purple);
               invlb.setItem(12, blue);
               invlb.setItem(13, brown);
               invlb.setItem(14, green);
               invlb.setItem(15, red);
               invlb.setItem(16, black);
               
               invlb.setItem(30, glass5);
               invlb.setItem(32, arrow);
       }
     

      
       public void show(Player p) {
               p.openInventory(WardrobeShopInv);
       }
     
       
       @EventHandler
       public void onInventoryClick(InventoryClickEvent event) {
         Player player = (Player)event.getWhoClicked();
         ItemStack clicked = event.getCurrentItem();
         Inventory inventory = event.getInventory();
         
         
         
         ItemStack glass1 = new ItemStack(Material.GLASS, 1);
         ItemMeta glassmeta1 = glass1.getItemMeta();
         glassmeta1.setDisplayName("§9Clear Your Hat");
         glass1.setItemMeta(glassmeta1);
         ItemStack glass2 = new ItemStack(Material.GLASS, 1);
         ItemMeta glassmeta2 = glass2.getItemMeta();
         glassmeta2.setDisplayName("§9Clear Your Shirt");
         glass2.setItemMeta(glassmeta2);
         ItemStack glass3 = new ItemStack(Material.GLASS, 1);
         ItemMeta glassmeta3 = glass3.getItemMeta();
         glassmeta3.setDisplayName("§9Clear Your Pants");
         glass3.setItemMeta(glassmeta3);
         ItemStack glass4 = new ItemStack(Material.GLASS, 1);
         ItemMeta glassmeta4 = glass4.getItemMeta();
         glassmeta4.setDisplayName("§9Clear Your Boots");
         glass4.setItemMeta(glassmeta4);
         
         ItemStack lh = new ItemStack(Material.LEATHER_HELMET, 1);
         ItemStack lc = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         ItemStack ll = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         ItemStack lb = new ItemStack(Material.LEATHER_BOOTS, 1);
         
         ItemStack whiteh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta whitehmeta = (LeatherArmorMeta) whiteh.getItemMeta();
         whitehmeta.setColor(Color.WHITE);
         whiteh.setItemMeta(whitehmeta);
         ItemStack whitecp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta whitecpmeta = (LeatherArmorMeta) whitecp.getItemMeta();
         whitecpmeta.setColor(Color.TEAL);
         whitecp.setItemMeta(whitecpmeta);
         ItemStack whitel = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         LeatherArmorMeta whitelmeta = (LeatherArmorMeta) whitel.getItemMeta();
         whitelmeta.setColor(Color.WHITE);
         whitel.setItemMeta(whitelmeta);
         ItemStack whiteb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta whitebmeta = (LeatherArmorMeta) whiteb.getItemMeta();
         whitebmeta.setColor(Color.WHITE);
         whiteb.setItemMeta(whitebmeta);
         
         
         ItemStack orangeh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta orangehmeta = (LeatherArmorMeta) orangeh.getItemMeta();
         orangehmeta.setColor(Color.ORANGE);
         orangeh.setItemMeta(orangehmeta);
         ItemStack orangecp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta orangecpmeta = (LeatherArmorMeta) orangecp.getItemMeta();
         orangecpmeta.setColor(Color.ORANGE);
         orangecp.setItemMeta(orangecpmeta);
         ItemStack orangel = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta orangelmeta = (LeatherArmorMeta) orangel.getItemMeta();
         orangelmeta.setColor(Color.ORANGE);
         orangel.setItemMeta(orangelmeta);
         ItemStack orangeb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta orangebmeta = (LeatherArmorMeta) orangeb.getItemMeta();
         orangebmeta.setColor(Color.ORANGE);
         orangeb.setItemMeta(orangebmeta);
         
         ItemStack magentah = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta magentahmeta = (LeatherArmorMeta) magentah.getItemMeta();
         magentahmeta.setColor(Color.fromBGR(216, 76, 178));
         magentah.setItemMeta(magentahmeta);
         ItemStack magentacp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta magentacpmeta = (LeatherArmorMeta) magentacp.getItemMeta();
         magentacpmeta.setColor(Color.fromBGR(216, 76, 178));
         magentacp.setItemMeta(magentacpmeta);
         ItemStack magental = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta magentalmeta = (LeatherArmorMeta) magental.getItemMeta();
         magentalmeta.setColor(Color.fromBGR(216, 76, 178));
         magental.setItemMeta(magentalmeta);
         ItemStack magentab = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta magentabmeta = (LeatherArmorMeta) magentab.getItemMeta();
         magentabmeta.setColor(Color.fromBGR(216, 76, 178));
         magentab.setItemMeta(magentabmeta);
         
         ItemStack lightblueh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta lightbluehmeta = (LeatherArmorMeta) lightblueh.getItemMeta();
         lightbluehmeta.setColor(Color.fromBGR(216, 153, 102));
         lightblueh.setItemMeta(lightbluehmeta);
         ItemStack lightbluecp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta lightbluecpmeta = (LeatherArmorMeta) lightbluecp.getItemMeta();
         lightbluecpmeta.setColor(Color.fromBGR(216, 153, 102));
         lightbluecp.setItemMeta(lightbluecpmeta);
         ItemStack lightbluel = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta lightbluelmeta = (LeatherArmorMeta) lightbluel.getItemMeta();
         lightbluelmeta.setColor(Color.fromBGR(216, 153, 102));
         lightbluel.setItemMeta(lightbluelmeta);
         ItemStack lightblueb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta lightbluebmeta = (LeatherArmorMeta) lightblueb.getItemMeta();
         lightbluebmeta.setColor(Color.fromBGR(216, 153, 102));
         lightblueb.setItemMeta(lightbluebmeta);
        
         ItemStack yellowh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta yellowhmeta = (LeatherArmorMeta) yellowh.getItemMeta();
         yellowhmeta.setColor(Color.YELLOW);
         yellowh.setItemMeta(yellowhmeta);
         ItemStack yellowcp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta yellowcpmeta = (LeatherArmorMeta) yellowcp.getItemMeta();
         yellowcpmeta.setColor(Color.YELLOW);
         yellowcp.setItemMeta(yellowcpmeta);
         ItemStack yellowl = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta yellowlmeta = (LeatherArmorMeta) yellowl.getItemMeta();
         yellowlmeta.setColor(Color.YELLOW);
         yellowl.setItemMeta(yellowlmeta);
         ItemStack yellowb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta yellowbmeta = (LeatherArmorMeta) yellowb.getItemMeta();
         yellowbmeta.setColor(Color.YELLOW);
         yellowb.setItemMeta(yellowbmeta);
         
         ItemStack limeh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta limehmeta = (LeatherArmorMeta) limeh.getItemMeta();
         limehmeta.setColor(Color.LIME);
         limeh.setItemMeta(limehmeta);
         ItemStack limecp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta limecpmeta = (LeatherArmorMeta) limecp.getItemMeta();
         limecpmeta.setColor(Color.LIME);
         limecp.setItemMeta(limecpmeta);
         ItemStack limel = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta limelmeta = (LeatherArmorMeta) limel.getItemMeta();
         limelmeta.setColor(Color.LIME);
         limel.setItemMeta(limelmeta);
         ItemStack limeb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta limebmeta = (LeatherArmorMeta) limeb.getItemMeta();
         limebmeta.setColor(Color.LIME);
         limeb.setItemMeta(limebmeta);
         
         ItemStack pinkh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta pinkhmeta = (LeatherArmorMeta) pinkh.getItemMeta();
         pinkhmeta.setColor(Color.fromBGR(165, 127, 242));
         pinkh.setItemMeta(pinkhmeta);
         ItemStack pinkcp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta pinkcpmeta = (LeatherArmorMeta) pinkcp.getItemMeta();
         pinkcpmeta.setColor(Color.fromBGR(165, 127, 242));
         pinkcp.setItemMeta(pinkcpmeta);
         ItemStack pinkl = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta pinklmeta = (LeatherArmorMeta) pinkl.getItemMeta();
         pinklmeta.setColor(Color.fromBGR(165, 127, 242));
         pinkl.setItemMeta(pinklmeta);
         ItemStack pinkb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta pinkbmeta = (LeatherArmorMeta) pinkb.getItemMeta();
         pinkbmeta.setColor(Color.fromBGR(165, 127, 242));
         pinkb.setItemMeta(pinkbmeta);
         
         ItemStack grayh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta grayhmeta = (LeatherArmorMeta) grayh.getItemMeta();
         grayhmeta.setColor(Color.GRAY);
         grayh.setItemMeta(grayhmeta);
         ItemStack graycp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta graycpmeta = (LeatherArmorMeta) graycp.getItemMeta();
         graycpmeta.setColor(Color.GRAY);
         graycp.setItemMeta(graycpmeta);
         ItemStack grayl = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta graylmeta = (LeatherArmorMeta) grayl.getItemMeta();
         graylmeta.setColor(Color.GRAY);
         grayl.setItemMeta(graylmeta);
         ItemStack grayb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta graybmeta = (LeatherArmorMeta) grayb.getItemMeta();
         graybmeta.setColor(Color.GRAY);
         grayb.setItemMeta(graybmeta);
         
         ItemStack silverh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta silverhmeta = (LeatherArmorMeta) silverh.getItemMeta();
         silverhmeta.setColor(Color.SILVER);
         silverh.setItemMeta(silverhmeta);
         ItemStack silvercp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta silvercpmeta = (LeatherArmorMeta) silvercp.getItemMeta();
         silvercpmeta.setColor(Color.SILVER);
         silvercp.setItemMeta(silvercpmeta);
         ItemStack silverl = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta silverlmeta = (LeatherArmorMeta) silverl.getItemMeta();
         silverlmeta.setColor(Color.SILVER);
         silverl.setItemMeta(silverlmeta);
         ItemStack silverb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta silverbmeta = (LeatherArmorMeta) silverb.getItemMeta();
         silverbmeta.setColor(Color.SILVER);
         silverb.setItemMeta(silverbmeta);
         
         ItemStack cyanh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta cyanhmeta = (LeatherArmorMeta) cyanh.getItemMeta();
         cyanhmeta.setColor(Color.fromBGR(153, 127, 76));
         cyanh.setItemMeta(cyanhmeta);
         ItemStack cyancp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta cyancpmeta = (LeatherArmorMeta) cyancp.getItemMeta();
         cyancpmeta.setColor(Color.fromBGR(153, 127, 76));
         cyancp.setItemMeta(cyancpmeta);
         ItemStack cyanl = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta cyanlmeta = (LeatherArmorMeta) cyanl.getItemMeta();
         cyanlmeta.setColor(Color.fromBGR(153, 127, 76));
         cyanl.setItemMeta(cyanlmeta);
         ItemStack cyanb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta cyanbmeta = (LeatherArmorMeta) cyanb.getItemMeta();
         cyanbmeta.setColor(Color.fromBGR(153, 127, 76));
         cyanb.setItemMeta(cyanbmeta);
         
         ItemStack purpleh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta purplehmeta = (LeatherArmorMeta) purpleh.getItemMeta();
         purplehmeta.setColor(Color.PURPLE);
         purpleh.setItemMeta(purplehmeta);
         ItemStack purplecp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta purplecpmeta = (LeatherArmorMeta) purplecp.getItemMeta();
         purplecpmeta.setColor(Color.PURPLE);
         purplecp.setItemMeta(purplecpmeta);
         ItemStack purplel = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta purplelmeta = (LeatherArmorMeta) purplel.getItemMeta();
         purplelmeta.setColor(Color.PURPLE);
         purplel.setItemMeta(purplelmeta);
         ItemStack purpleb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta purplebmeta = (LeatherArmorMeta) purpleb.getItemMeta();
         purplebmeta.setColor(Color.PURPLE);
         purpleb.setItemMeta(purplebmeta);
         
         ItemStack blueh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta bluehmeta = (LeatherArmorMeta) blueh.getItemMeta();
         bluehmeta.setColor(Color.fromBGR(178, 76, 51));
         blueh.setItemMeta(bluehmeta);
         ItemStack bluecp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta bluecpmeta = (LeatherArmorMeta) bluecp.getItemMeta();
         bluecpmeta.setColor(Color.fromBGR(178, 76, 51));
         bluecp.setItemMeta(bluecpmeta);
         ItemStack bluel = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta bluelmeta = (LeatherArmorMeta) bluel.getItemMeta();
         bluelmeta.setColor(Color.fromBGR(178, 76, 51));
         bluel.setItemMeta(bluelmeta);
         ItemStack blueb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta bluebmeta = (LeatherArmorMeta) blueb.getItemMeta();
         bluebmeta.setColor(Color.fromBGR(178, 76, 51));
         blueb.setItemMeta(bluebmeta);
         
         ItemStack brownh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta brownhmeta = (LeatherArmorMeta) brownh.getItemMeta();
         brownhmeta.setColor(Color.fromBGR(51, 76, 102));
         brownh.setItemMeta(brownhmeta);
         ItemStack browncp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta browncpmeta = (LeatherArmorMeta) browncp.getItemMeta();
         browncpmeta.setColor(Color.fromBGR(51, 76, 102));
         browncp.setItemMeta(browncpmeta);
         ItemStack brownl = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta brownlmeta = (LeatherArmorMeta) brownl.getItemMeta();
         brownlmeta.setColor(Color.fromBGR(51, 76, 102));
         brownl.setItemMeta(brownlmeta);
         ItemStack brownb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta brownbmeta = (LeatherArmorMeta) brownb.getItemMeta();
         brownbmeta.setColor(Color.fromBGR(51, 76, 102));
         brownb.setItemMeta(brownbmeta);
         
         ItemStack greenh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta greenhmeta = (LeatherArmorMeta) greenh.getItemMeta();
         greenhmeta.setColor(Color.GREEN);
         greenh.setItemMeta(greenhmeta);
         ItemStack greencp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta greencpmeta = (LeatherArmorMeta) greencp.getItemMeta();
         greencpmeta.setColor(Color.GREEN);
         greencp.setItemMeta(greencpmeta);
         ItemStack greenl = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta greenlmeta = (LeatherArmorMeta) greenl.getItemMeta();
         greenlmeta.setColor(Color.GREEN);
         greenl.setItemMeta(greenlmeta);
         ItemStack greenb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta greenbmeta = (LeatherArmorMeta) greenb.getItemMeta();
         greenbmeta.setColor(Color.GREEN);
         greenb.setItemMeta(greenbmeta);
         
         ItemStack redh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta redhmeta = (LeatherArmorMeta) redh.getItemMeta();
         redhmeta.setColor(Color.RED);
         redh.setItemMeta(redhmeta);
         ItemStack redcp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta redcpmeta = (LeatherArmorMeta) redcp.getItemMeta();
         redcpmeta.setColor(Color.RED);
         redcp.setItemMeta(redcpmeta);
         ItemStack redl = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta redlmeta = (LeatherArmorMeta) redl.getItemMeta();
         redlmeta.setColor(Color.RED);
         redl.setItemMeta(redlmeta);
         ItemStack redb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta redbmeta = (LeatherArmorMeta) redb.getItemMeta();
         redbmeta.setColor(Color.RED);
         redb.setItemMeta(redbmeta);
         
         ItemStack blackh = new ItemStack(Material.LEATHER_HELMET, 1);
         LeatherArmorMeta blackhmeta = (LeatherArmorMeta) blackh.getItemMeta();
         blackhmeta.setColor(Color.BLACK);
         blackh.setItemMeta(blackhmeta);
         ItemStack blackcp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta blackcpmeta = (LeatherArmorMeta) blackcp.getItemMeta();
         blackcpmeta.setColor(Color.BLACK);
         blackcp.setItemMeta(blackcpmeta);
         ItemStack blackl = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         LeatherArmorMeta blacklmeta = (LeatherArmorMeta) blackl.getItemMeta();
         blacklmeta.setColor(Color.BLACK);
         blackl.setItemMeta(blacklmeta);
         ItemStack blackb = new ItemStack(Material.LEATHER_BOOTS, 1);
         LeatherArmorMeta blackbmeta = (LeatherArmorMeta) blackb.getItemMeta();
         blackbmeta.setColor(Color.BLACK);
         blackb.setItemMeta(blackbmeta);
         
         
         if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
           (clicked.getType() == Material.LEATHER_HELMET)) {
           event.setCancelled(true);
           player.closeInventory();
           player.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.LEATHER_CHESTPLATE)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.LEATHER_LEGGINGS)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.LEATHER_BOOTS)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS, 1));
             
             
             
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.CHAINMAIL_HELMET)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.CHAINMAIL_CHESTPLATE)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.CHAINMAIL_LEGGINGS)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.CHAINMAIL_BOOTS)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS, 1));
       
             
             
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.IRON_HELMET)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.IRON_CHESTPLATE)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.IRON_LEGGINGS)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.IRON_BOOTS)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS, 1));
             
                   
             
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.GOLD_HELMET)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setHelmet(new ItemStack(Material.GOLD_HELMET, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.GOLD_CHESTPLATE)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setChestplate(new ItemStack(Material.GOLD_CHESTPLATE, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.GOLD_LEGGINGS)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setLeggings(new ItemStack(Material.GOLD_LEGGINGS, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.GOLD_BOOTS)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setBoots(new ItemStack(Material.GOLD_BOOTS, 1));
             
             
                      
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.DIAMOND_HELMET)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.DIAMOND_CHESTPLATE)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.DIAMOND_LEGGINGS)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS, 1));
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.DIAMOND_BOOTS)) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS, 1));
             
             
             
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.GLASS) &&
                 clicked.getAmount() == 1) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setHelmet(null);
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.GLASS) &&
                 clicked.getAmount() == 2) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setChestplate(null);
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.GLASS) &&
                 clicked.getAmount() == 3) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setLeggings(null);
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.GLASS) &&
                 clicked.getAmount() == 4) {
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setBoots(null);
             
             
             
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.WEB) &&
                 clicked.getAmount() == 1) {
             event.setCancelled(true);
             player.closeInventory();
             player.openInventory(invlh);
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.WEB) &&
                 clicked.getAmount() == 2) {
             event.setCancelled(true);
             player.closeInventory();
             player.openInventory(invlc);
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.WEB) &&
                 clicked.getAmount() == 3) {
             event.setCancelled(true);
             player.closeInventory();
             player.openInventory(invll);
         }else if ((inventory.getName().equals(WardrobeShopInv.getName())) && 
                 (clicked.getType() == Material.WEB) &&
                 clicked.getAmount() == 4) {
             event.setCancelled(true);
             player.closeInventory();
             player.openInventory(invlb);
             
             
             
         }else if ((inventory.getName().equals(invlh.getName())) && 
                  (clicked.getType() == Material.ARROW)){
             event.setCancelled(true);
             player.closeInventory();
             player.openInventory(WardrobeShopInv);
         }else if ((inventory.getName().equals(invlc.getName())) && 
                 (clicked.getType() == Material.ARROW)){
            event.setCancelled(true);
            player.closeInventory();
            player.openInventory(WardrobeShopInv);
         }else if ((inventory.getName().equals(invll.getName())) && 
                 (clicked.getType() == Material.ARROW)){
            event.setCancelled(true);
            player.closeInventory();
            player.openInventory(WardrobeShopInv);
         }else if ((inventory.getName().equals(invlb.getName())) && 
                 (clicked.getType() == Material.ARROW)){
            event.setCancelled(true);
            player.closeInventory();
            player.openInventory(WardrobeShopInv);
             
             
             
         }else if ((inventory.getName().equals(invlh.getName())) && 
                 (clicked.getType() == Material.GLASS)){
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setHelmet(lh);
         }else if ((inventory.getName().equals(invlc.getName())) && 
                 (clicked.getType() == Material.GLASS)){
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setChestplate(lc);
         }else if ((inventory.getName().equals(invll.getName())) && 
                 (clicked.getType() == Material.GLASS)){
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setLeggings(ll);
         }else if ((inventory.getName().equals(invlb.getName())) && 
                 (clicked.getType() == Material.GLASS)){
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setBoots(lb);
             
             
             
         }else if ((inventory.getName().equals(invlh.getName())) && 
                  (clicked.getItemMeta().getDisplayName().contains("White"))){
             event.setCancelled(true);
             player.closeInventory();
             player.getInventory().setHelmet(whiteh);
         }else if ((inventory.getName().equals(invlc.getName())) && 
                 (clicked.getItemMeta().getDisplayName().contains("White"))){
            event.setCancelled(true);
            player.closeInventory();
            player.getInventory().setChestplate(whitecp);
         }else if ((inventory.getName().equals(invll.getName())) && 
                 (clicked.getItemMeta().getDisplayName().contains("White"))){
            event.setCancelled(true);
            player.closeInventory();
            player.getInventory().setLeggings(whitel);
         }else if ((inventory.getName().equals(invlb.getName())) && 
                 (clicked.getItemMeta().getDisplayName().contains("White"))){
            event.setCancelled(true);
            player.closeInventory();
            player.getInventory().setBoots(whiteb);
            
            
         }else if ((inventory.getName().equals(invlh.getName())) && 
                 (clicked.getItemMeta().getDisplayName().contains("Orange"))){
            event.setCancelled(true);
            player.closeInventory();
            player.getInventory().setHelmet(orangeh);
        }else if ((inventory.getName().equals(invlc.getName())) && 
                (clicked.getItemMeta().getDisplayName().contains("Orange"))){
           event.setCancelled(true);
           player.closeInventory();
           player.getInventory().setChestplate(orangecp);
        }else if ((inventory.getName().equals(invll.getName())) && 
                (clicked.getItemMeta().getDisplayName().contains("Orange"))){
           event.setCancelled(true);
           player.closeInventory();
           player.getInventory().setLeggings(orangel);
        }else if ((inventory.getName().equals(invlb.getName())) && 
                (clicked.getItemMeta().getDisplayName().contains("Orange"))){
           event.setCancelled(true);
           player.closeInventory();
           player.getInventory().setBoots(orangeb);
           
           
        }else if ((inventory.getName().equals(invlh.getName())) && 
                (clicked.getItemMeta().getDisplayName().contains("Magenta"))){
           event.setCancelled(true);
           player.closeInventory();
           player.getInventory().setHelmet(magentah);
       }else if ((inventory.getName().equals(invlc.getName())) && 
               (clicked.getItemMeta().getDisplayName().contains("Magenta"))){
          event.setCancelled(true);
          player.closeInventory();
          player.getInventory().setChestplate(magentacp);
       }else if ((inventory.getName().equals(invll.getName())) && 
               (clicked.getItemMeta().getDisplayName().contains("Magenta"))){
          event.setCancelled(true);
          player.closeInventory();
          player.getInventory().setLeggings(magental);
       }else if ((inventory.getName().equals(invlb.getName())) && 
               (clicked.getItemMeta().getDisplayName().contains("Magenta"))){
          event.setCancelled(true);
          player.closeInventory();
          player.getInventory().setBoots(magentab);
          
          
       }else if ((inventory.getName().equals(invlh.getName())) && 
               (clicked.getItemMeta().getDisplayName().contains("Light Blue"))){
          event.setCancelled(true);
          player.closeInventory();
          player.getInventory().setHelmet(lightblueh);
      }else if ((inventory.getName().equals(invlc.getName())) && 
              (clicked.getItemMeta().getDisplayName().contains("Light Blue"))){
         event.setCancelled(true);
         player.closeInventory();
         player.getInventory().setChestplate(lightbluecp);
      }else if ((inventory.getName().equals(invll.getName())) && 
              (clicked.getItemMeta().getDisplayName().contains("Light Blue"))){
         event.setCancelled(true);
         player.closeInventory();
         player.getInventory().setLeggings(lightbluel);
      }else if ((inventory.getName().equals(invlb.getName())) && 
              (clicked.getItemMeta().getDisplayName().contains("Light Blue"))){
         event.setCancelled(true);
         player.closeInventory();
         player.getInventory().setBoots(lightblueb);
         
         
      }else if ((inventory.getName().equals(invlh.getName())) && 
              (clicked.getItemMeta().getDisplayName().contains("Yellow"))){
         event.setCancelled(true);
         player.closeInventory();
         player.getInventory().setHelmet(yellowh);
     }else if ((inventory.getName().equals(invlc.getName())) && 
             (clicked.getItemMeta().getDisplayName().contains("Yellow"))){
        event.setCancelled(true);
        player.closeInventory();
        player.getInventory().setChestplate(yellowcp);
     }else if ((inventory.getName().equals(invll.getName())) && 
             (clicked.getItemMeta().getDisplayName().contains("Yellow"))){
        event.setCancelled(true);
        player.closeInventory();
        player.getInventory().setLeggings(yellowl);
     }else if ((inventory.getName().equals(invlb.getName())) && 
             (clicked.getItemMeta().getDisplayName().contains("Yellow"))){
        event.setCancelled(true);
        player.closeInventory();
        player.getInventory().setBoots(yellowb);
        
        
     }else if ((inventory.getName().equals(invlh.getName())) && 
             (clicked.getItemMeta().getDisplayName().contains("Lime Green"))){
        event.setCancelled(true);
        player.closeInventory();
        player.getInventory().setHelmet(limeh);
    }else if ((inventory.getName().equals(invlc.getName())) && 
            (clicked.getItemMeta().getDisplayName().contains("Lime Green"))){
       event.setCancelled(true);
       player.closeInventory();
       player.getInventory().setChestplate(limecp);
    }else if ((inventory.getName().equals(invll.getName())) && 
            (clicked.getItemMeta().getDisplayName().contains("Lime Green"))){
       event.setCancelled(true);
       player.closeInventory();
       player.getInventory().setLeggings(limel);
    }else if ((inventory.getName().equals(invlb.getName())) && 
            (clicked.getItemMeta().getDisplayName().contains("Lime Green"))){
       event.setCancelled(true);
       player.closeInventory();
       player.getInventory().setBoots(limeb);
       
       
    }else if ((inventory.getName().equals(invlh.getName())) && 
            (clicked.getItemMeta().getDisplayName().contains("Pink"))){
       event.setCancelled(true);
       player.closeInventory();
       player.getInventory().setHelmet(pinkh);
   }else if ((inventory.getName().equals(invlc.getName())) && 
           (clicked.getItemMeta().getDisplayName().contains("Pink"))){
      event.setCancelled(true);
      player.closeInventory();
      player.getInventory().setChestplate(pinkcp);
   }else if ((inventory.getName().equals(invll.getName())) && 
           (clicked.getItemMeta().getDisplayName().contains("Pink"))){
      event.setCancelled(true);
      player.closeInventory();
      player.getInventory().setLeggings(pinkl);
   }else if ((inventory.getName().equals(invlb.getName())) && 
           (clicked.getItemMeta().getDisplayName().contains("Pink"))){
      event.setCancelled(true);
      player.closeInventory();
      player.getInventory().setBoots(pinkb);
      
      
   }else if ((inventory.getName().equals(invlh.getName())) && 
           (clicked.getItemMeta().getDisplayName().contains("Gray"))){
      event.setCancelled(true);
      player.closeInventory();
      player.getInventory().setHelmet(grayh);
  }else if ((inventory.getName().equals(invlc.getName())) && 
          (clicked.getItemMeta().getDisplayName().contains("Gray"))){
     event.setCancelled(true);
     player.closeInventory();
     player.getInventory().setChestplate(graycp);
  }else if ((inventory.getName().equals(invll.getName())) && 
          (clicked.getItemMeta().getDisplayName().contains("Gray"))){
     event.setCancelled(true);
     player.closeInventory();
     player.getInventory().setLeggings(grayl);
  }else if ((inventory.getName().equals(invlb.getName())) && 
          (clicked.getItemMeta().getDisplayName().contains("Gray"))){
     event.setCancelled(true);
     player.closeInventory();
     player.getInventory().setBoots(grayb);
     
     
  }else if ((inventory.getName().equals(invlh.getName())) && 
          (clicked.getItemMeta().getDisplayName().contains("Silverr"))){
     event.setCancelled(true);
     player.closeInventory();
     player.getInventory().setHelmet(silverh);
 }else if ((inventory.getName().equals(invlc.getName())) && 
         (clicked.getItemMeta().getDisplayName().contains("Silverr"))){
    event.setCancelled(true);
    player.closeInventory();
    player.getInventory().setChestplate(silvercp);
 }else if ((inventory.getName().equals(invll.getName())) && 
         (clicked.getItemMeta().getDisplayName().contains("Silverr"))){
    event.setCancelled(true);
    player.closeInventory();
    player.getInventory().setLeggings(silverl);
 }else if ((inventory.getName().equals(invlb.getName())) && 
         (clicked.getItemMeta().getDisplayName().contains("Silverr"))){
    event.setCancelled(true);
    player.closeInventory();
    player.getInventory().setBoots(silverb);
    
    
 }else if ((inventory.getName().equals(invlh.getName())) && 
         (clicked.getItemMeta().getDisplayName().contains("Cyan"))){
    event.setCancelled(true);
    player.closeInventory();
    player.getInventory().setHelmet(cyanh);
}else if ((inventory.getName().equals(invlc.getName())) && 
        (clicked.getItemMeta().getDisplayName().contains("Cyan"))){
   event.setCancelled(true);
   player.closeInventory();
   player.getInventory().setChestplate(cyancp);
}else if ((inventory.getName().equals(invll.getName())) && 
        (clicked.getItemMeta().getDisplayName().contains("Cyan"))){
   event.setCancelled(true);
   player.closeInventory();
   player.getInventory().setLeggings(cyanl);
}else if ((inventory.getName().equals(invlb.getName())) && 
        (clicked.getItemMeta().getDisplayName().contains("Cyan"))){
   event.setCancelled(true);
   player.closeInventory();
   player.getInventory().setBoots(cyanb);
   
   
}else if ((inventory.getName().equals(invlh.getName())) && 
        (clicked.getItemMeta().getDisplayName().contains("Purple"))){
   event.setCancelled(true);
   player.closeInventory();
   player.getInventory().setHelmet(purpleh);
}else if ((inventory.getName().equals(invlc.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Purple"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setChestplate(purplecp);
}else if ((inventory.getName().equals(invll.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Purple"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setLeggings(purplel);
}else if ((inventory.getName().equals(invlb.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Purple"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setBoots(purpleb);
  
  
}else if ((inventory.getName().equals(invlh.getName())) && 
        (clicked.getItemMeta().getDisplayName().contains("Blue"))){
   event.setCancelled(true);
   player.closeInventory();
   player.getInventory().setHelmet(blueh);
}else if ((inventory.getName().equals(invlc.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Blue"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setChestplate(bluecp);
}else if ((inventory.getName().equals(invll.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Blue"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setLeggings(bluel);
}else if ((inventory.getName().equals(invlb.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Blue"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setBoots(blueb);
  
  
}else if ((inventory.getName().equals(invlh.getName())) && 
        (clicked.getItemMeta().getDisplayName().contains("Brown"))){
   event.setCancelled(true);
   player.closeInventory();
   player.getInventory().setHelmet(brownh);
}else if ((inventory.getName().equals(invlc.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Brown"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setChestplate(browncp);
}else if ((inventory.getName().equals(invll.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Brown"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setLeggings(brownl);
}else if ((inventory.getName().equals(invlb.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Brown"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setBoots(brownb);
  
  
}else if ((inventory.getName().equals(invlh.getName())) && 
        (clicked.getItemMeta().getDisplayName().contains("Green"))){
   event.setCancelled(true);
   player.closeInventory();
   player.getInventory().setHelmet(greenh);
}else if ((inventory.getName().equals(invlc.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Green"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setChestplate(greencp);
}else if ((inventory.getName().equals(invll.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Green"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setLeggings(greenl);
}else if ((inventory.getName().equals(invlb.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Green"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setBoots(greenb);
  
  
}else if ((inventory.getName().equals(invlh.getName())) && 
        (clicked.getItemMeta().getDisplayName().contains("Red"))){
   event.setCancelled(true);
   player.closeInventory();
   player.getInventory().setHelmet(redh);
}else if ((inventory.getName().equals(invlc.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Red"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setChestplate(redcp);
}else if ((inventory.getName().equals(invll.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Red"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setLeggings(redl);
}else if ((inventory.getName().equals(invlb.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Red"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setBoots(redb);
  
  
}else if ((inventory.getName().equals(invlh.getName())) && 
        (clicked.getItemMeta().getDisplayName().contains("Black"))){
   event.setCancelled(true);
   player.closeInventory();
   player.getInventory().setHelmet(blackh);
}else if ((inventory.getName().equals(invlc.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Black"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setChestplate(blackcp);
}else if ((inventory.getName().equals(invll.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Black"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setLeggings(blackl);
}else if ((inventory.getName().equals(invlb.getName())) && 
       (clicked.getItemMeta().getDisplayName().contains("Black"))){
  event.setCancelled(true);
  player.closeInventory();
  player.getInventory().setBoots(blackb);
            
            
         }
    } 
       
       public boolean onCommand(CommandSender sender, Command cmd, String label, String[] a)
       {
         Player player = (Player)sender;
         if (cmd.getName().equalsIgnoreCase("menu"))
         {
           if (a.length == 1) {
             if (a[0].equalsIgnoreCase("wardrobemenu"))
             {
               player.openInventory(WardrobeShop.WardrobeShopInv);
             }
           }
         }
     	return false;
       }
      
}