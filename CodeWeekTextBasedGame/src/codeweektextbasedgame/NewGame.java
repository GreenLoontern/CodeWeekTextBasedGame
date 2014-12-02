package codeweektextbasedgame;

import static codeweektextbasedgame.CodeWeekTextBasedGame.TA1;
import static codeweektextbasedgame.CodeWeekTextBasedGame.text;

public class NewGame {
    
    public void evaluate(){
            if(CodeWeekTextBasedGame.playing != true){
                TA1.append("\nYou Have Started a New Game.");
                CodeWeekTextBasedGame.playing = true;
                Spawn.evaluate();
            }else{
                TA1.append("\nA Game is Already Running.");
            }
                 

    }
    
}
