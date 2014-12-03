package codeweektextbasedgame;

import static codeweektextbasedgame.CodeWeekTextBasedGame.TA1;


public class NewGame {
    
    public void evaluate(){
            if(CodeWeekTextBasedGame.playing != true){
                TA1.append("\n\n\nYou Have Started a New Game.");
                CodeWeekTextBasedGame.playing = true;
                Spawn.evaluate();
            }else{
                TA1.append("\nA Game is Already Running.");
            }
                 

    }
    
}
