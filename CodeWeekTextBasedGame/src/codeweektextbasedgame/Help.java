package codeweektextbasedgame;

public class Help {
    
    public String evaluate(){
        
        String newline = "\n";
        
        return (//All commands used in game should be displayed here.
                //Use newline between commands
                
                "Commands: "+newline+newline+
                "new - begins a new game"+newline+
                "up - moves up one unit"+newline+
                "down - moves down one unit" +newline+
                "left - moves left one unit" +newline+
                "right - moves right one unit"+newline+
                "attack - attacks enemy one same square"+newline+newline+
                "This game is a text based Dungeons and Dragons"+newline+
                "The commands are above, and you must defeat the Corrupted Mother Board"+newline+
                "Enjoy! Created by, Gabe S, Corey P, Erich V, and Zeke S."+newline+newline
                
                );
               
    }
    
}
