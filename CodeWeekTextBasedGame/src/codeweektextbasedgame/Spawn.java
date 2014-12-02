

package codeweektextbasedgame;


import static codeweektextbasedgame.CodeWeekTextBasedGame.TA1;
import static codeweektextbasedgame.CodeWeekTextBasedGame.text;
import java.util.Random;


public class Spawn {
    public static void evaluate(){
        Random spawnrand = new Random();
        CodeWeekTextBasedGame.posX = spawnrand.nextInt(10);
        
        TA1.append("\nYou have spawned at "+CodeWeekTextBasedGame.posX+","+CodeWeekTextBasedGame.posY+".");
        TA1.append("\nThe Corrupted Mother Board is in a random location with the Y position of 10");
        while(CodeWeekTextBasedGame.playing){
        switch(text){
            
            case "moveN":
               CodeWeekTextBasedGame.posY+=1;
               TA1.append("\nYou are now at "+CodeWeekTextBasedGame.posX+","+CodeWeekTextBasedGame.posY+".");
                
                
            break;
            
            case "moveS":
                CodeWeekTextBasedGame.posY-=1;
                TA1.append("\nYou are now at "+CodeWeekTextBasedGame.posX+","+CodeWeekTextBasedGame.posY+".");
                
            break;
            
            case "moveW":
                CodeWeekTextBasedGame.posX-=1;
                TA1.append("\nYou are now at "+CodeWeekTextBasedGame.posX+","+CodeWeekTextBasedGame.posY+".");
                
            break;
                
            case "moveE":
                CodeWeekTextBasedGame.posX+=1;
                TA1.append("\nYou are now at "+CodeWeekTextBasedGame.posX+","+CodeWeekTextBasedGame.posY+".");
                
            break;
                
            case "quit":
                
                
                
            break;
                
            default:
            TA1.append("\nI don't know how to "+text+".");
                
                
            break;
        }
            
        }
        
    }
}
