

package codeweektextbasedgame;
import static codeweektextbasedgame.CodeWeekTextBasedGame.TA1;


public class mTurn {
    
   public static int baseHealth = 1;
   public static int baseAttack = 1;
   public static int plusHealth = 0;
   public static int plusAttack = 0;
   public static int health = baseHealth+plusHealth;
   public static int cmPosX = CodeWeekTextBasedGame.winPlaceX;
   public static int cmPosY = 10;
   public static String[] preName = new String[9];
   public static String[] name = new String[9];
   public static String finalName = new String();
   

   
    public mTurn() {
        
        
        name[0] = "Bug";
        name[1] = "Glitch";
        name[2] = "Virus";
        name[3] = "Uncommented Code";
        name[4] = "Spam";
        name[5] = "Corrupted Game File";
        name[6] = "Melted Circuit";
        name[7] = "Broken Cooling Fan";
        name[8] = "Wiped Hard Drive";
        

        preName[0] = "Weak";
        preName[1] = "Injured";
        preName[2] = "Hearty";
        preName[3] = "Mischevious";
        preName[4] = "Villainous";
        preName[5] = "Monstrous";
        preName[6] = "Evil";
        preName[7] = "Demonic";
        preName[8] = "Fatal";
        

        
        
    }
    
   public static void spawn(){
       if(CodeWeekTextBasedGame.posY==cmPosY && CodeWeekTextBasedGame.posX==cmPosX){
           finalName = "Corrupted Mother Board";           
           TA1.append("\nYou Found the "+ finalName +"!"); 
           plusAttack = 9;
           plusHealth = 29;


       }else{
           plusAttack = CodeWeekTextBasedGame.universalRandom.nextInt(9);
           plusHealth = CodeWeekTextBasedGame.universalRandom.nextInt(9);
           finalName = preName[plusAttack]+" "+name[plusHealth];
           TA1.append("\nYou run into a "+finalName+".");

       }
       attack();
   }

   public static void attack(){
       if(CodeWeekTextBasedGame.universalRandom.nextInt(10)+1 >= CodeWeekTextBasedGame.armor){
           CodeWeekTextBasedGame.health -= (baseAttack+plusAttack);
           TA1.append("\nThe "+finalName+" hits and you lose "+(baseAttack+plusAttack)+" hitpoints.");
           TA1.append("\nYou have "+CodeWeekTextBasedGame.health+" hitpoints out of "+CodeWeekTextBasedGame.totalHealth+" hitpoints.");
       }else{
       TA1.append("\nThe "+finalName+" misses.");
       }
       if(CodeWeekTextBasedGame.health <= 0){
           TA1.append("\nYou were killed by the "+finalName+".");
           TA1.append("\nTry Again? Type in new!");
           CodeWeekTextBasedGame.playing = false;
       }else{
        CodeWeekTextBasedGame.playerAttack();   
       }
           
   }



}
