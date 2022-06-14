import java.util.Scanner;
import java.util.ArrayList;

/*
   Developed by Roman AKA Caleb Graham for OGCraft
   ToDo:
      - Fix any bugs that arrise
*/

public class MagicConfigMaker
{
   public static void main(String str[])
   {
      Scanner s = new Scanner(System.in);
      
      ArrayList<String> Title = new ArrayList<String>();
      ArrayList<String> Name = new ArrayList<String>();
      ArrayList<String> Item = new ArrayList<String>();
      ArrayList<String> Lore = new ArrayList<String>();
      ArrayList<String> Commands = new ArrayList<String>();
      ArrayList<String> Permission = new ArrayList<String>();
      ArrayList<String> Noise = new ArrayList<String>();
      ArrayList<String> FireColor = new ArrayList<String>();
      ArrayList<String> Ammount = new ArrayList<String>();
      ArrayList<String> Color = new ArrayList<String>();
      ArrayList<String> Selected = new ArrayList<String>();
      int MenuSelect = 0;
      int TypeSelect = 0;
      int LoreLines = 0;
      int tempInt = 0;
      String temp = "";

      ArrayList<Boolean> Glowing = new ArrayList<Boolean>();
      ArrayList<Boolean> Sound = new ArrayList<Boolean>();
      ArrayList<Boolean> Firework = new ArrayList<Boolean>();
      int Loop = -1;
      
      System.out.println("Developed by Caleb Graham A.K.A. Roman for use of OGCraft.");
      System.out.println("If you find any bugs please message me on discord at _roman_emperor_#0177.\n");
      
      System.out.println("Spigot Item List: https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html#BEEF \n\n");
      
      
      while(true)
      {
         /*
         Menu for choosing type of config
            1. Voucher Permission Maker
            2. Money Voucher
            3. Quests 
            4. Other Voucher
            5. Crate Key
            6. Reset rNether
            7. Reset rEnd
            8. Exit and print Vouchers & Crate Configs
         */
         MenuSelect = 0;
         System.out.println("What type of config are you making: \n\t 1. Voucher Permission Maker \n\t 2. Money Voucher \n\t 3. Quests  \n\t 4. Other  Voucher (manual input of more) \n\t 5. Crate Key \n\t 6. Reset rNether (Admin Only) \n\t 7. Reset rEnd (Admin Only) \n\t 8. Exit and print Vouchers & Crate Configs");
         MenuSelect = s.nextInt();
         s.nextLine();
         
         //Voucher Permission Maker
         if(MenuSelect==1)
         {
            Loop++;
            Item.add("PAPER");
            Noise.add("CLICK");
            FireColor.add("Green, Lime");
            Glowing.add(true);
            Sound.add(true);
            Firework.add(true);
            Ammount.add("");
            Color.add("");
            Selected.add("1");
            
            System.out.println("What would you like the title to be:");
            temp = s.nextLine();
            Title.add(temp.toLowerCase());
            
            System.out.println("What do you want it to be named:");
            Name.add(s.nextLine());
            System.out.println("What is the permission: ");
            Permission.add(s.nextLine());
            
            Commands.add("      - 'lp user %Player% parent add " + Permission.get(Loop) + " server=survival'");
            
            
            
            Lore.add("      - '&7Use this voucher to redeem &2" + Name.get(Loop) + "'\n      - '&7&l(&6&l!&7&l) &7Right click to redeem.'");
         }
         
         //Money Voucher
         else if(MenuSelect==2)
         {
            Loop++;
            Item.add("PAPER");
            Noise.add("CLICK");
            FireColor.add("Green, Lime");
            Glowing.add(true);
            Sound.add(true);
            Firework.add(true);
            Permission.add("");
            Color.add("");
            Selected.add("2");
            
            System.out.println("What would you like the title to be:");
            temp = s.nextLine();
            Title.add(temp.toLowerCase());
            
            System.out.println("What is it's name:");
            Name.add(s.nextLine());
            
            System.out.println("How much money:");
            Ammount.add(s.nextLine());
            
            Commands.add("      - 'eco give {player} " + Ammount.get(Loop) + "'");
            Lore.add("      - '&7Use this voucher to redeem &2$" + Ammount.get(Loop) + "'\n      - '&7&l(&6&l!&7&l) &7Right click to redeem.'"); 
         }
         
         //Quests (Simplified)
         else if(MenuSelect ==3)
         {
            Quests quest = new Quests();
            
            System.out.println("What is the TaskID (In file no spaces):");
            temp = s.nextLine();
            quest.setTaskID(temp);
            
            System.out.println("What is the Quest Name (Displayed):");
            temp = s.nextLine();
            quest.setQuestName(temp);
            
            System.out.println("What is the Type:\n");
            
            //Looks wrong in editor but looks good in jar-ed files
            System.out.println("01. block place \t\t\t11. crafting \t\t\t21. milking \t\t\t31. citizens deliver ");
            System.out.println("02. block place certain\t\t\t12. deal damage \t\t22. mob killing \t\t32. citizens interact");
            System.out.println("03. block break\t\t\t\t13. distance from \t\t23. mob killing certain \t33. essentials balance");
            System.out.println("04. block break certain\t\t\t14. enchanting \t\t\t24. permission \t\t\t34. essentials money earn");
            System.out.println("05. breeding \t\t\t\t15. exp earn \t\t\t25. player killing \t\t35. shopGUI+ buy certain");
            System.out.println("06. brewing \t\t\t\t16. farming \t\t\t26. playtime \t\t\t36. shopGUI+ sell certain");
            System.out.println("07. bucket empty \t\t\t17. farming certain \t\t27. position \t\t\t37. votingPlugin Vote");
            System.out.println("08. bucket fill \t\t\t18. fishing \t\t\t28. shearing ");
            System.out.println("09. command \t\t\t\t19. fishing certain \t\t29. taming ");
            System.out.println("10. consume \t\t\t\t20. inventory \t\t\t30. walking ");
      
            TypeSelect = s.nextInt();
            s.nextLine();
            quest.setType(TypeSelect);
            
            if(quest.getSelection()==1 || quest.getSelection()==2 || quest.getSelection()==3 || quest.getSelection()==4 || quest.getSelection()==5 || quest.getSelection()==6 || quest.getSelection()==7 || quest.getSelection()==8 || quest.getSelection()==10 || quest.getSelection()==11 || quest.getSelection()==12 || quest.getSelection()==14 || quest.getSelection()==15 || quest.getSelection()==16 || quest.getSelection()==17 || quest.getSelection()==18 || quest.getSelection()==19 || quest.getSelection()==20 || quest.getSelection()==21 || quest.getSelection()==22 || quest.getSelection()==23 || quest.getSelection()==25 || quest.getSelection()==28 || quest.getSelection()==29 || quest.getSelection()==30 || quest.getSelection()==31 || quest.getSelection()==33 || quest.getSelection()==34 || quest.getSelection()==35 || quest.getSelection()==36 || quest.getSelection()==37)
            {
               System.out.println("What is the amount required to complete:");   
               temp = s.nextLine();
               quest.setAmount(temp);
            }
            else if(quest.getSelection()==9)
            {
               System.out.println("What command do you want to execute:");
               temp = s.nextLine();
               quest.setAmount(temp);
            }
            else if(quest.getSelection()==13 || quest.getSelection()==27)
            {
               System.out.println("How close do they need to get (blocks):");   
               temp = s.nextLine();
               quest.setAmount(temp);
            }
            
            else if(quest.getSelection()==24 || quest.getSelection()==32)
            {
               //Doesn't need anything here, put it here for some reason and then felt the need to add a comment to justify it, i don't know why don't judge me
            }
            
            else if(quest.getSelection()==26)
            {
               System.out.println("How long do they need to play to achieve:");
               temp = s.nextLine();
               quest.setAmount(temp);
            }
            
            System.out.println("How many lines of Pre-lore would you like (number): ");
            LoreLines = s.nextInt();
            s.nextLine();  //For some reason this has to be there, it does garbage collection or something for scanner
            temp = "";
            for(int i=0; i<LoreLines; i++) 
            {
               System.out.println("What would you like the lore line " + (i+1) + " to say: ");
               temp += s.nextLine();
               if(i<LoreLines-1)
               {
                  temp += "\"\n    - \"";
               }
            }
            temp += "\"";
            quest.setLoreNormal(temp);
            
            //Add material 
            System.out.println("What item do you want displayed (Underscore_Between_Words, Spigot names):");
            temp = s.nextLine();
            quest.setItemDisplayed(temp.toUpperCase());
            temp = "";
            
            System.out.println("How many lines of rewards would you like (number): ");
            LoreLines = s.nextInt();
            s.nextLine();  //For some reason this has to be there, it does garbage collection or something for scanner
            temp = "";
            for(int i=0; i<LoreLines; i++) 
            {
               System.out.println("What would you like reward line " + (i+1) + " to say: ");
               temp += s.nextLine();
               temp += "\"";
               if(i<LoreLines-1)
               {
                  temp += "\n  - \"";
               }
            }
            if(LoreLines==0)
            {
               temp += "\"";
            }
            quest.setReward(temp);
            
            System.out.println("Are there prerequisits (1 for yes, 0 for no):");
            temp = s.nextLine();
            if(temp.equals(1))
            {
               System.out.println("What are the prerequisits:");
               temp = s.nextLine();
               quest.setPreReq(temp);
            }
            else
            {
               quest.setPreReq("0");
            }
            
            System.out.println("What catagory is it in:");
            temp = s.nextLine();
            quest.setCatagory(temp);
            
            System.out.println("Is the quest repeatable (1 for yes, 0 for no):");
            temp = s.nextLine();
            quest.setRepeatable(temp);
            
            if(temp.equals("1"))
            {
               System.out.println("Is there a cooldown (1 for yes, 0 for no):");
               temp = s.nextLine();
               quest.setCooldown(temp);
               
               if(temp.equals("1"))
               {
                  System.out.println("How long until they can repeat (Minutes):");
                  temp = s.nextLine();
                  quest.setTime(temp);
               }
               else
               {
                  quest.setTime("0");
               }
            }
            else
            {
               quest.setTime("0");
            }
            
            System.out.println("What is the sort order:");
            temp = s.nextLine();
            quest.setSortOrder(temp);
            
            System.out.println(quest.toString());
         }
         
         
         
         
         //Other
         else if(MenuSelect ==4)
         {
            Selected.add("4");
            Loop++;
            System.out.println("What would you like the title to be:");
            temp = s.nextLine();
            Title.add(temp.toLowerCase());
         
            System.out.println("What would you like it to be named: ");
            Name.add(s.nextLine());
         
            System.out.println("What would you like the item to be: ");
            temp = s.nextLine();
            Item.add(temp.toUpperCase());
            
            System.out.println("How many lines of lore would you like (number): ");
            LoreLines = s.nextInt();
            s.nextLine();  //For some reason this has to be there, it does garbage collection or something for scanner
            temp = "      - ";
            for(int i=0; i<LoreLines; i++) 
            {
               System.out.println("What would you like the lore line " + (i+1) + " to say: ");
               temp += s.nextLine();
               if(i<LoreLines-1)
               {
                  temp += "\n      - ";
               }
            }
            Lore.add(temp);
            
            System.out.println("Glowing (1 for true, 0 for false):");
            temp =s.nextLine();
            if(temp.equals("1"))
               Glowing.add(true);
            else
               Glowing.add(false);
            
            temp = "      - '";
            System.out.println("What commands do you want executed:");
            temp += s.nextLine();
            temp += "'";
            Commands.add(temp);
            temp = "";
            
            System.out.println("Sound (1 for true, 0 for false):");
            temp = s.nextLine();
            if(temp.equals("1"))
            {
               Sound.add(true);
               System.out.println("What noise:");
               temp = s.nextLine();
               Noise.add(temp.toUpperCase());
            }
            else
            {
               Sound.add(false);
               Noise.add("");
            }
            temp = "";
            
            
            System.out.println("Fireworks (1 for true, 0 for false):");
            temp =s.nextLine();
            if(temp.equals("1"))
            {
               Firework.add(true);
               System.out.println("What colors (Capitol first letter and comma and space between):");
               FireColor.add(s.nextLine());
            }
            else
            {
               Firework.add(false);
               FireColor.add("");
            }
            temp = "";

         }
         
         
         
         //Crate Key
         else if(MenuSelect==5)
         {
            Loop++;
            Title.add("");
            Item.add("");
            Noise.add("");
            FireColor.add("");
            Lore.add("");
            Glowing.add(true);
            Sound.add(true);
            Firework.add(true);
            Permission.add("");
            Ammount.add("");
            Commands.add("");
            Selected.add("5");
            
            System.out.println("What do you want it to be named (do not put key in name):");
            Name.add(s.nextLine());
            System.out.println("What color do you want it to be:");
            System.out.println("1. black \t10. blue");
            System.out.println("2. dark blue \t11. green");
            System.out.println("3. dark green \t12. aqua");
            System.out.println("4. dark aqua \t13. red");
            System.out.println("5. dark red \t14. light purple");
            System.out.println("6. dark purple \t15. yellow");
            System.out.println("7. gold \t16. white");
            System.out.println("8. gray \t17. minecoin gold");
            System.out.println("9. dark gray");
            tempInt = s.nextInt();
            s.nextLine();  //Garbage collection
            switch(tempInt)
            {
            case 1:
               Color.add("&0");
            case 2:
               Color.add("&1");
            case 3:
               Color.add("&2");
            case 4:
               Color.add("&3");
            case 5:
               Color.add("&4");
            case 6:
               Color.add("&5");
            case 7:
               Color.add("&6");
            case 8:
               Color.add("&7");
            case 9:
               Color.add("&8");
            case 10:
               Color.add("&9");
            case 11:
               Color.add("&a");
            case 12:
               Color.add("&b");
            case 13:
               Color.add("&c");
            case 14:
               Color.add("&d");
            case 15:
               Color.add("&e");
            case 16:
               Color.add("&f");
            case 17:
               Color.add("&g");
            }
         }
         
         //Reset Resourse Nether
         else if(MenuSelect==6)
         {
            System.out.println("To reset rNether (Admin Only) \n\nStep 1 - Stop the server (Press enter when done)");
            s.nextLine();
            System.out.println("Step 2 - Delete the world folder rNether (Press enter when done)");
            s.nextLine();
            System.out.println("Step 3 - Start server (Press enter when done)");
            s.nextLine();
            System.out.println("Step 4 - Type /mv create rNether nether (Press enter when done)");
            s.nextLine();
            System.out.println("Step 5 - Do /setwarp rNether in a safe location (Press enter when done)");
            s.nextLine();
            System.out.println("Step 6 - Do /holo reload then /holo movehere rNether (Press enter when done)");
            s.nextLine();
            System.out.println("Step 7 - Do //wand and select a safe box around the new spawn area for the world with the wooden axe (Press enter when done)");
            s.nextLine();
            System.out.println("Step 8 - Type /rg redefine rNetherSpawn (Press enter when done)");
            s.nextLine();
            System.out.println("Your Done :D\n");
         }
         
         //Reset Resourse End
         else if(MenuSelect==7)
         {
            System.out.println("To reset rEnd (Admin Only) \n\nStep 1 - Stop the server (Press enter when done)");
            s.nextLine();
            System.out.println("Step 2 - Delete the world folder rEnd (Press enter when done)");
            s.nextLine();
            System.out.println("Step 3 - Start server (Press enter when done)");
            s.nextLine();
            System.out.println("Step 4 - Type /mv create rEnd end (Press enter when done)");
            s.nextLine();
            System.out.println("Step 5 - Do /setwarp rEnd in a safe location (Press enter when done)");
            s.nextLine();
            System.out.println("Step 6 - Do /holo reload then /holo movehere rEnd (Press enter when done)");
            s.nextLine();
            System.out.println("Step 7 - Do //wand and select a safe box around the new spawn area for the world with the wooden axe (Press enter when done)");
            s.nextLine();
            System.out.println("Step 8 - Type /rg redefine rEnd (Press enter when done)");
            s.nextLine();
            System.out.println("Your Done :D\n");
         }
         
         
         
         else  //Print all
         {
            System.out.println("\nDeveloped by Caleb Graham A.K.A. Roman for use of OGCraft.\n");
            for(int i=0; i<Loop+1; i++)
            {
               if(Selected.get(i).equals("1") || Selected.get(i).equals("2") || Selected.get(i).equals("4"))
               {
                  System.out.println("  " + Title.get(i) + ":");
                  System.out.println("    Item: '" + Item.get(i) + "'");
                  System.out.println("    Name: '" + Name.get(i) + "'");
                  System.out.println("    Lore:");
                  System.out.println(Lore.get(i));
                  System.out.println("    Player: ''");
                  System.out.println("    Glowing: " + Glowing.get(i));
                  System.out.println("    Commands:");
                  System.out.println(Commands.get(i));
                  System.out.println("    Options:");
                  System.out.println("      Sound:");
                  System.out.println("        Toggle: " + Sound.get(i));
                  System.out.println("         - '" + Noise.get(i) + "'");
                  System.out.println("      Firework:");
                  System.out.println("        Toggle: " + Firework.get(i));
                  System.out.println("        Colors: '" + FireColor.get(i) + "'");
                  System.out.println("");
               }
               else if(Selected.get(i).equals("5"))
               {
               
                  System.out.println("NOTE: IF THERE IS A ? AFTER NAME INSTEAD OF SECTION CHARACTER THEN DELETE IT AND PUT SECTION CHARACTER (Get it by pressing ALT+0167 or go to http://www.unicode-symbol.com/u/00A7.html and copy paste)\n");
                  System.out.println("name: §d" + Name.get(i) + " Key");
                  System.out.println("virtual: false");
                  System.out.println("item:");
                  System.out.println("  material: TRIPWIRE_HOOK");
                  System.out.println("  amount: 1");
                  System.out.println("  durability: 0");
                  System.out.println("  name: '" + Color.get(i) + Name.get(i) + " Key'");
                  System.out.println("  lore:");
                  System.out.println("  - '&bUse this key to open " + Color.get(i) + Name.get(i) + " &bcrate!");
                  System.out.println("  enchanted: true");
                  System.out.println("  item-flags: []");
                  System.out.println("  unbreakable: false");
               }
            }            
            System.exit(0);
         }
      }
   }
}