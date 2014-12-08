

package codeweektextbasedgame;


import static codeweektextbasedgame.CodeWeekTextBasedGame.TA1;
import static codeweektextbasedgame.CodeWeekTextBasedGame.text;
import java.util.Random;


public class Spawn {
    
    static boolean openingMessageNotPlayed = true;
    
    public static void evaluate(){
            CodeWeekTextBasedGame.posX = CodeWeekTextBasedGame.universalRandom.nextInt(11);
            CodeWeekTextBasedGame.posY = 0;
            
        if(openingMessageNotPlayed){
            TA1.append("\nYou have spawned at "+CodeWeekTextBasedGame.posX+","+CodeWeekTextBasedGame.posY+".");
            TA1.append("\nThe Corrupted Mother Board is in a random location with the Y position of 10");
            
            CodeWeekTextBasedGame.health = CodeWeekTextBasedGame.totalHealth;
            CodeWeekTextBasedGame.armor = 5;
            CodeWeekTextBasedGame.attack = 5;
            openingMessageNotPlayed = false;
        }
        
        
        }
            
        }
        
    

