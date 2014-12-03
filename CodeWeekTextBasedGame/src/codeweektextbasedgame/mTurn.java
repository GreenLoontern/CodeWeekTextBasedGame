

package codeweektextbasedgame;
import static codeweektextbasedgame.CodeWeekTextBasedGame.TA1;

public class mTurn {
    
   public static int basehealth = 1;
   public static int basearmor = 5;
   public static int baseAttack = 1;
   public static int plusArmor = 0;
   public static int plusHealth = 0;
   public static int plusAttack = 0;
   public static int cmPosX = 0;
   public static int cmPosY = 0;
   public static String[] preName = new String[8];
   public static String[] name = new String[8];

   
    public mTurn() {

        name[0] = " Bug";
        name[1] = " Glitch";
        name[2] = " Virus";
        name[3] = " Uncommented Code";
        name[4] = " Spam";
        name[5] = " Corrupted Game File";
        name[6] = " Melted Circuit";
        name[7] = " Broken Cooling Fan";
        name[8] = " Wiped Hard Drive";
        

        preName[0] = " Weak";
        preName[1] = " Injured";
        preName[2] = " Hearty";
        preName[3] = " Mischevious";
        preName[4] = " Villainous";
        preName[5] = " Monstrous";
        preName[6] = " Evil";
        preName[7] = " Demonic";
        preName[8] = " Fatal";
        
        cmPosX = CodeWeekTextBasedGame.universalRandom.nextInt(10);
        cmPosY = 10;
    }
    
   public static void spawn(){
       if(CodeWeekTextBasedGame.posY!=cmPosY && CodeWeekTextBasedGame.posX!=cmPosX){
           TA1.append("\nYou run into a "+preName[CodeWeekTextBasedGame.universalRandom.nextInt(8)]+name[CodeWeekTextBasedGame.universalRandom.nextInt(8)]+".");
       }
   }
   public static void move(){
       
   }
   public static void attack(){
       
   }



}
