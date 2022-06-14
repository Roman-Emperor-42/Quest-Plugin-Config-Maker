import java.util.Scanner;

public class Quests
{
   private String Catagory = "";
   private String TaskID = ""; 
   private String Task = "";
   private String Type = "";
   private String Amount = "";
   private String QuestName = "";
   private String LoreNormal = "";  //Lore Before Quest is Started
   private String LoreStarted = ""; //Lore While Quest is Being Completed
   private String ItemDisplayed = "";
   private String Reward = "";
   private String PreReq = "";
   private String Time = "";
   private String SortOrder = "";
   private String Blocks = "";
   private String tempStr = "";
   private String Bucket = "";
   private String x = "";
   private String y = "";
   private String z = "";
   private String World = "    - ";
   private String Mob = "";
   private String Permission = "";
   private String Mode = "";
   private String MobNames = "";
   private String ItemName = "\"";
   private String ItemLore = "       - \"";
   private String itemID = "";
   private String shopID = "";
   private String NpcName = "";
   private String Item = "";
   
   private int tempInt = 0;
   private int Selection = 0;
   private int CoreProtTime = 0;
   private int SpecificName = 0;
   
   private boolean SpecWorlds = false;
   private boolean CoreProtect = false;
   private boolean AFK = false;
   private boolean RemoveWhenComplete = false;
   private boolean IgnoreCase = false;
   private boolean BrokenReverse = false;
   private boolean Hostile = false;
   private boolean Repeatable = false;
   private boolean Cooldown = false;
   
   Scanner s = new Scanner(System.in);
   
   public void setCatagory(String s)
   {
      Catagory = s;
   }
   
   public void setTaskID(String s)
   {
      TaskID = s;
   }
   
   public void setType(int sel)
   {
      Selection = sel;
      switch(sel)
      {
         case 1:  //Done
            Type = "blockplace";
            Task = "amount";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 2:  //Done
            Type = "blockplacecertain";
            Task = "amount";
            System.out.println("How many types of blocks:");
            tempInt = s.nextInt();
            s.nextLine();     //garbage collection
            Blocks = "   - ";
            for(int i=0; i<tempInt; i++)
            {
               System.out.println("Enter Block " + (i+1) + "(Underscores_Between_Words):");
               tempStr = s.nextLine();
               Blocks += tempStr.toUpperCase();
               if(i<tempInt-1)
               {
                  Blocks += "\n     - ";
               }
            }
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            System.out.println("Remove from total if (same) blocks are broken (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt == 1)
               BrokenReverse = true;
            
            break;
            
         case 3:  //Done
            Type = "blockbreak";
            Task = "amount";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 4:  //Done
            Type = "blockbreakcertain";
            Task = "amount";
            System.out.println("How many types of blocks:");
            tempInt = s.nextInt();
            s.nextLine();     //garbage collection
            Blocks = "   - ";
            for(int i=0; i<tempInt; i++)
            {
               System.out.println("Enter Block " + (i+1) + "(Underscores_Between_Words):");
               tempStr = s.nextLine();
               Blocks += tempStr.toUpperCase();
               if(i<tempInt-1)
               {
                  Blocks += "\n     - ";
               }
            }
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            System.out.println("Remove from total if (same) blocks are broken (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt == 1)
               BrokenReverse = true;
               
            System.out.println("Search core-protect database for past block places (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt ==1)
            {
               CoreProtect = true;
               System.out.println("How far back do you want to look (Seconds):");
               CoreProtTime = s.nextInt();
               s.nextLine();
            }
            break;
            
         case 5:  //Done
            Type = "breeding";
            Task = "amount";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 6:  //Done
            Type = "brewing";
            Task = "amount";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 7:  //Done
            Type = "bucketempty";
            Task = "amount";
            System.out.println("What type of bucket: \n1. Mile \n2. Water \n3. Lava");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
               Bucket = "MILK_BUCKET";
            else if(tempInt==2)
               Bucket = "WATER_BUCKET";
            else
               Bucket = "LAVA_BUCKET"; 
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 8:  //Done
            Type = "bucketfill";
            Task = "amount";
            System.out.println("What type of bucket: \n1. Mile \n2. Water \n3. Lava");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
               Bucket = "MILK_BUCKET";
            else if(tempInt==2)
               Bucket = "WATER_BUCKET";
            else
               Bucket = "LAVA_BUCKET";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 9:  //Done
            Type = "command";            
            Task = "command";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            System.out.println("Would you like to ignore case (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
               IgnoreCase = true;
            break;
            
         case 10: //Done
            Type = "consume";
            Task = "item";
            
            System.out.println("What item consumed (underscore_between_words):");
            tempStr = s.nextLine();
            Blocks = tempStr.toUpperCase();

            
            System.out.println("Only with specific name, quest item or normal item (1 for specific name, 2 for quest item, 3 for normal):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecificName = 1;
               System.out.println("What's the name of the item (Include color codes)");
               ItemName = "\"" + s.nextLine() + "\"";
               System.out.println("What is the item's lore (Enter to skip):");
               ItemLore += s.nextLine() + "\"";
            }
            
            else if(tempInt==2)
            {
               SpecificName =2;
               System.out.println("Whats the name of the quest item");
               ItemName = "\"" + s.nextLine() + "\"";
            }
            
            
            
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 11: //Done
            Type = "crafting";
            Task = "item";
            System.out.println("What item needs to be crafted (underscore_between_words):");
            tempStr = s.nextLine();
            Blocks = tempStr.toUpperCase();
            
            System.out.println("Only with specific name, quest item or normal item (1 for specific name, 2 for quest item, 3 for normal):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecificName = 1;
               System.out.println("What's the name of the item (Include color codes)");
               ItemName = "\"" + s.nextLine() + "\"";
               System.out.println("What is the item's lore (Enter to skip):");
               ItemLore += s.nextLine() + "\"";
            }
            
            else if(tempInt==2)
            {
               SpecificName =2;
               System.out.println("Whats the name of the quest item");
               ItemName = "\"" + s.nextLine() + "\"";
            }

            
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 12: //Done
            Type = "dealdamage";
            Task = "amount";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 13: //done
            Type = "distancefrom";
            System.out.println("Whats the x cordinate:");
               x = s.nextLine();
            System.out.println("Whats the y cordinate:");
               y = s.nextLine();
            System.out.println("Whats the z cordinate:");
               z = s.nextLine();
            
            SpecWorlds = true;
            System.out.println("How many worlds:");
            tempInt = s.nextInt();
            s.nextLine(); 
            World = "   - \"";
            for(int i=0; i<tempInt; i++)
            {
               System.out.println("Enter world " + (i+1));
               tempStr = s.nextLine();
               World += tempStr.toLowerCase();
               World += "\"";
               if(i<tempInt-1)
               {
                  World += "\n    - \"";
               }
            }
            break;
            
         case 14: //Done
            Type = "enchanting";
            Task = "amount";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 15: //Done
            Type = "expearn";
            Task = "amount";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 16: //Done
            Type = "farming";
            Task = "amount";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 17: //Done
            Type = "farmingcertain";
            Task = "amount";
            System.out.println("How many types of crops:");
            tempInt = s.nextInt();
            s.nextLine();     //garbage collection
            Blocks = "   - ";
            for(int i=0; i<tempInt; i++)
            {
               System.out.println("Enter crop " + (i+1) + "(Underscores_Between_Words):");
               tempStr = s.nextLine();
               Blocks += tempStr.toUpperCase();
               if(i<tempInt-1)
               {
                  Blocks += "\n   - ";
               }
            }
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 18: //Done
            Type = "fishing";
            Task = "amount";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 19: //Done
            Type = "fishingcertain";
            Task = "item";
            System.out.println("What item needs fished (underscore_between_words):");
            tempStr = s.nextLine();
            Blocks = tempStr.toUpperCase();
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 20: //Done
            Type = "inventory";
            Task = "item";
            System.out.println("What item needs to be in their inventory (underscore_between_words):");
            tempStr = s.nextLine();
            Blocks = tempStr.toUpperCase();
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            System.out.println("Remove item when completed (1 for yes 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
               RemoveWhenComplete = true;
            break;
            
         case 21: //Done
            Type = "milking";
            Task = "amount";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 22://Done
            Type = "mobkilling";
            Task = "amount";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            System.out.println("Only count hostile mobs (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
               Hostile = true;
            break;
            
         case 23: //Done
            Type = "mobkillingcertain";
            Task = "amount";
            System.out.println("What mob: ");
            tempStr = s.nextLine();
            Mob = tempStr.toUpperCase();
            System.out.println("Only with certain name (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               System.out.println("How many different names:");
               tempInt = s.nextInt();
               s.nextLine();
               MobNames  = "    - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter name (Include color codes if present)" + (i+1));
                  tempStr = s.nextLine();
                  MobNames += tempStr.toUpperCase() + "\"\n";
                  if(i<tempInt-1)
                  {
                     MobNames  += "    - \"";
                  }
               }
            }
            else
            {
               MobNames = "0";
            }
            
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 24: //Done
            Type = "permission";
            Task = "permission";
            System.out.println("What permission do you want it to be:");
            Permission = s.nextLine();
            break;
            
         case 25: //Done
            Type = "playerkilling";
            Task = "amount";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 26: //Done
            Type = "playtime";
            Task = "minutes";
            System.out.println("Ignore AFK Time (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
               AFK = true;
            break;
            
         case 27: //Done
            Type = "position";
            System.out.println("Whats the x cordinate:");
               x = s.nextLine();
            System.out.println("Whats the y cordinate:");
               y = s.nextLine();
            System.out.println("Whats the z cordinate:");
               z = s.nextLine();
            SpecWorlds = true;
            System.out.println("How many worlds:");
            tempInt = s.nextInt();
            s.nextLine();
            World = "   - \"";
            for(int i=0; i<tempInt; i++)
            {
               System.out.println("Enter world " + (i+1));
               tempStr = s.nextLine();
               World += tempStr.toLowerCase();
               World += "\"";
               if(i<tempInt-1)
               {
                  World += "\n    - \"";
               }
            }
            break;
            
         case 28: //Done
            Type = "shearing";
            Task = "amount";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 29: //Done
            Type = "taming";
            Task = "amount";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            break;
            
         case 30:    //Done
            Type = "walking";
            Task = "distance";
            System.out.println("Specify World (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               SpecWorlds = true;
               System.out.println("How many worlds:");
               tempInt = s.nextInt();
               s.nextLine();
               World = "   - \"";
               for(int i=0; i<tempInt; i++)
               {
                  System.out.println("Enter world " + (i+1));
                  tempStr = s.nextLine();
                  World += tempStr.toLowerCase();
                  World += "\"";
                  if(i<tempInt-1)
                  {
                     World += "\n    - \"";
                  }
               }
            }
            System.out.println("Would you like to specify mode required to complete (1 for yes, 0 for no):");
            tempInt = s.nextInt();
            s.nextLine();
            if(tempInt==1)
            {
               System.out.println("What mode of transportation:");
               System.out.println("1. boat\t5. walking");
               System.out.println("2. horse\t6. running");
               System.out.println("3. pig\t7. swimming");
               System.out.println("4. sneaking");
               tempInt = s.nextInt();
               s.nextLine();
               switch(tempInt)
               {
                  case 1:
                     Mode = "boat";
                     break;
                  case 2:
                     Mode = "horse";
                     break;
                  case 3:
                     Mode = "pig";
                     break;
                  case 4:
                     Mode = "sneaking";
                     break;
                  case 5:
                     Mode = "walking";
                     break;
                  case 6:
                     Mode = "running";
                     break;
                  case 7:
                     Mode = "swimming";
                     break;
               }
            }
            break;
            
            case 31: //Working on
               Type = "citizens_deliver";
               Task = "amount";
               System.out.println("What is the NPC's name (case sensitive):");
               NpcName = s.nextLine();
               System.out.println("What is the item that needs delivered (underscores_between_words, spigot names):");
               tempStr = s.nextLine();
               Item = tempStr.toUpperCase();
               System.out.println("Remove items when completed (1 for yes, 0 for no):");
               tempStr = s.nextLine();
               if(tempStr.equals("1"))
               {
                  RemoveWhenComplete = true;
               }
               else
               {
                  RemoveWhenComplete = false;
               }
               System.out.println("Specify World (1 for yes, 0 for no):");
               tempInt = s.nextInt();
               s.nextLine();
               if(tempInt==1)
               {
                  SpecWorlds = true;
                  System.out.println("How many worlds:");
                  tempInt = s.nextInt();
                  s.nextLine();
                  World = "   - \"";
                  for(int i=0; i<tempInt; i++)
                  {
                     System.out.println("Enter world " + (i+1));
                     tempStr = s.nextLine();
                     World += tempStr.toLowerCase();
                     World += "\"";
                     if(i<tempInt-1)
                     {
                        World += "\n    - \"";
                     }
                  }
               }
               break;
               
            case 32: //Needs a lot of stuff
               Type = "citizens_interact";
               System.out.println("What is the NPC's name (case sensitive):");
               NpcName = s.nextLine();
               System.out.println("Specify World (1 for yes, 0 for no):");
               tempInt = s.nextInt();
               s.nextLine();
               if(tempInt==1)
               {
                  SpecWorlds = true;
                  System.out.println("How many worlds:");
                  tempInt = s.nextInt();
                  s.nextLine();
                  World = "   - \"";
                  for(int i=0; i<tempInt; i++)
                  {
                     System.out.println("Enter world " + (i+1));
                     tempStr = s.nextLine();
                     World += tempStr.toLowerCase();
                     World += "\"";
                     if(i<tempInt-1)
                     {
                        World += "\n    - \"";
                     }
                  }
               }
               break;
               
            case 33: //Done
               Type = "essentials_balance";
               Task = "amount";
               break;
               
            case 34: //Done
               Type = "essentials_moneyearn";
               Task = "amount";
               break;
               
            case 35: //Done
               Type = "shopguiplus_buycertain";
               Task = "amount";
               System.out.println("What is the shopID (Underscores_between_words): ");
               tempStr = s.nextLine();
               shopID = tempStr;
               System.out.println("What is the itemID (Underscores_between_words): ");
               tempStr = s.nextLine();
               itemID = tempStr;
               break;
               
            case 36: //Done
               Type = "shopguiplus_sellcertain";
               Task = "amount";
               System.out.println("What is the shopID (Underscores_between_words): ");
               tempStr = s.nextLine();
               shopID = tempStr;
               System.out.println("What is the itemID (Underscores_between_words): ");
               tempStr = s.nextLine();
               itemID = tempStr;
               break;
               
            case 37: //Done
               Type = "votingplugin_vote";
               Task = "amount";
               break;
      
      }
   }
   
   public void setAmount(String s)
   {
      Amount = s;
   }
   
   public void setQuestName(String s)
   {
      QuestName = s;
   }
   
   public void setLoreNormal(String s)    
   {
      LoreNormal = s;
   }
   
   public void setItemDisplayed(String s)
   {
      ItemDisplayed = s;
   }
   
   public void setReward(String s)     
   {
      Reward = s;
   }
   
   public void setPreReq(String s)
   {
      PreReq = s;
   }
   
   public void setTime(String s)
   {
      Time = s;
   }
   
   public void setSortOrder(String s)
   {
      SortOrder = s;
   }
   
   public void setRepeatable(String s)
   {
      if(s.equals("1"))
      {
         Repeatable = true;
      }
      else
      {
         Repeatable = false;
         setCooldown("0");
         setTime("0");
      }
   }
   
   public void setCooldown(String s)
   {
      if(s.equals("1"))
      {
         Cooldown = true;
      }
      else
      {
         Cooldown = false;
         setTime("0");
      }
   }
   
   public int getSelection()
   {
      return Selection;
   }
   
   
   
   public String toString()
   {
      String ret = "";
      
      ret += "\n\nFile Name: " + Catagory + TaskID + ".yml\n\n";
      
      ret += "tasks:\n";
      ret += "  " + Catagory + TaskID + ": \n";
      ret += "\n    type: \"" + Type + "\"\n";
      
      
      
      
      if(Selection==1 || Selection ==3 || Selection==6 || Selection==12 || Selection==14 || Selection==15 || Selection==16 || Selection==18 || Selection==21 || Selection==25 || Selection==28 || Selection==29 || Selection==33 || Selection==34 || Selection==37)  //Blocks placed\broke general, Brewing, deal damage
      {
         ret += "    "+ Task + ": " + Amount;
         if(SpecWorlds)
            ret += "\n    worlds: \n " + World;
      }
      
      //Block Place Certain, Block Break Certain
      else if(Selection==2)
      {
         ret += "    "+ Task + ":  " + Amount;
         ret += "\n    blocks: ";
         ret += "\n  " + Blocks;
         ret += "\n    reverse-if-broken: " + BrokenReverse;
         if(SpecWorlds)
            ret += "\n    worlds: \n " + World;

      }
      
      //Block break certain
      else if(Selection==4)
      {
         ret += "    "+ Task + ": " + Amount;
         ret += "\n    blocks: ";
         ret += "\n  " + Blocks;
         ret += "\n    "+ Task + ": " + Amount;
         ret += "\n    reverse-if-broken: " + BrokenReverse;
         ret += "\n    check-coreprotect: " + CoreProtect;
         ret += "\n    check-coreprotect-time: " + CoreProtTime;
         if(SpecWorlds)
            ret += "\n    worlds: \n " + World;
      }
      
      else if(Selection==7 || Selection==8)  //Bucket empty/fill
      {
         ret += "  Bucket: " + Bucket;
         ret += "\n    "+ Task + ": " + Amount;
         if(SpecWorlds)
            ret += "\n    worlds: \n " + World;
      }
      
      else if(Selection==9)   //command
      {
         ret += "    "+ Task + ": \"" + Amount + "\"";
         ret += "\n    ignore-case: " + IgnoreCase;
         if(SpecWorlds)
            ret += "\n    worlds: \n " + World;
      }
      
      else if(Selection==10)  //Consume
      {
         if(SpecificName==1)
         {
            ret += "    item: ";
            ret += "\n      name: " + ItemName;
            ret += "\n      type: " + Blocks;
            ret += "\n      Lore: \n" + ItemLore; 
            ret += "\n    amount: " + Amount;
            if(SpecWorlds)
               ret += "\n    worlds: \n " + World;
         }
         
         else if(SpecificName==2)
         {
            ret += "    item: ";
            ret += "\n      quest-item: " + ItemName;
            ret += "\n    amount: " + Amount;
            if(SpecWorlds)
               ret += "\n    worlds: \n " + World;
         }
         
         else
         {
            ret += "    item: " + Blocks;
            ret += "\n    amount: " + Amount;
            if(SpecWorlds)
               ret += "\n    worlds: \n " + World;
         }
      }
      
      else if(Selection==11)  //Crafting
      {
         if(SpecificName==1)
         {
            ret += "    item: ";
            ret += "\n      name: " + ItemName;
            ret += "\n      type: " + Blocks;
            ret += "\n      Lore: \n" + ItemLore; 
            ret += "\n    amount: " + Amount;
            if(SpecWorlds)
               ret += "\n    worlds: \n " + World;
         }
         
         else if(SpecificName==2)
         {
            ret += "    item: ";
            ret += "\n      quest-item: " + ItemName;
            ret += "\n    amount: " + Amount;
            if(SpecWorlds)
               ret += "\n    worlds: \n " + World;
         }
         
         else
         {
            ret += "    item: " + Blocks;
            ret += "\n    amount: " + Amount;
            if(SpecWorlds)
               ret += "\n    worlds: \n " + World;
         }
      }
      
      
      else if(Selection==19)   //fishing certain
      {
         ret += "    item: " + Blocks;
         ret += "\n    amount: " + Amount;
         if(SpecWorlds)
            ret += "\n    worlds: \n " + World;
      }
      
      else if(Selection==13 || Selection==27)   //Distance From, Position
      {
         ret += "    x: " + x;
         ret += "\n    y: " + y;
         ret += "\n    z: " + z;
         ret += "\n    world: \n " + World;
         ret += "\n    distance-padding: " + Amount;
      }
      
      else if(Selection==17)  //Farming Certain
      {
         ret += "    "+ Task + ": " + Amount;
         ret += "\n    blocks: ";
         ret += "\n    " + Blocks;
         ret += "\n    "+ Task + ": " + Amount;
         if(SpecWorlds)
            ret += "\n    worlds: \n " + World;
      }
      
      else if(Selection==20)  //Inventory
      {
         ret += "    item: " + Blocks;
         ret += "\n    amount: " + Amount;
         ret += "\n    remove-items-when-complete: " + RemoveWhenComplete;
         if(SpecWorlds)
            ret += "\n    worlds: \n " + World;
      }
      
      else if(Selection==22)  // Mob Killing
      {
         ret += "    "+ Task + ": " + Amount;
         ret += "\n    hostile: " + Hostile;
         if(SpecWorlds)
            ret += "\n    worlds: \n" + World;
      }
      
      else if(Selection==23)  // Mob Killing Certain
      {
         ret += "    "+ Task + ": " + Amount;
         ret += "\n    mob: " + Mob;   
         if(!(MobNames.equals("0")))
            ret += "\n    names: \n" + MobNames;
         if(SpecWorlds)
            ret += "\n    worlds: \n " + World;
      }
      
      else if(Selection==24)  //Permission
      {
         ret += "    " + Task + ": \"" + Permission + "\"";
      }
      
      else if(Selection==26)  //Playtime
      {
         ret += "    "+ Task + ": " + Amount;
         ret += "\n    ignore-afk: " + AFK;
      }
      
      else if(Selection==30)  //Walking
      {
         ret += "    "+ Task + ": " + Amount;
         ret += "\n    mode: " + Mode;
         if(SpecWorlds)
            ret += "\n    worlds: \n " + World;
      }
      
      else if(Selection==31)
      {
         ret += "    npc-name: \"" + NpcName + "\"";
         ret += "\n    item: " + Item;
         ret += "\n    "+ Task + ": " + Amount;
         ret += "\n    remove-items-when-complete: " + RemoveWhenComplete;
         if(SpecWorlds)
            ret += "\n    worlds: \n " + World;
      }
      
      else if(Selection==32)
      {
         ret += "    npc-name: \"" + NpcName + "\"";
         if(SpecWorlds)
            ret += "\n    worlds: \n " + World;

      }
      
      else if(Selection==35 || Selection==36)
      {
         ret += "    shop-id: " + shopID;
         ret += "\n    item-id: " + itemID;
         ret += "\n    "+ Task + ": " + Amount;
      }
      
      ret += "\n\ndisplay:\n\n";
      ret += "  name: \"&c" + QuestName + "\"\n";
      ret += "  lore-normal:\n";
      ret += "    - \"" + LoreNormal + "\n";
      ret += "\n  lore-started:\n";
      ret += "    - \"" + "&7Your current progression:\"\n    -  \"&7 - &f{" + Catagory + TaskID + ":progress}&7/" + Amount + "\""  + "\n";
      ret += "\n  type: \"" + ItemDisplayed + "\"";
      ret += "\n\nrewards:\n";
      ret += "  - \"msg {player} You just completed &a" + QuestName + "&f!\"";
      ret += "\n  - \"" + Reward + "\n";
      ret += "\n\nplaceholders: \n";
      ret += "\n\n\n";
      ret += "options: \n";
      ret += "  category: \"" + Catagory + "\"\n";
      ret += "  repeatable: " + Repeatable + "\n";
      if(!(PreReq.equals("0")))
      {
         ret += "  requires: \n";
         ret += "   - \"" + PreReq + "\"\n";
      }
      ret += "  cooldown:\n";
      ret += "    enabled: True\n";
      ret += "    time: ";
      if(!(Time.equals("0")))
      {
         ret += Time + "\n";
      }
      else
      {
         ret += "1440 \n";
      }
      
      ret += "  sort-order: " + SortOrder + "\n";
      
      return ret;
   }  
}