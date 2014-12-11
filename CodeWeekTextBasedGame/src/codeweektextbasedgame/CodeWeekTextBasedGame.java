package codeweektextbasedgame;

import static codeweektextbasedgame.mTurn.cmPosX;
import static codeweektextbasedgame.mTurn.cmPosY;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;




@SuppressWarnings("serial")
public class CodeWeekTextBasedGame extends JFrame implements ActionListener {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 440;
    public static final String TITLE = "Text Based Coding Game";
    mTurn monster = new mTurn();
    
    //Class object declarations
    Help help = new Help();
    
	public CodeWeekTextBasedGame() {
		add(new Panel());
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(TITLE); // Window Parameters

		initComponents();
                TF1.requestFocusInWindow();
	}

	public static void main(String[] args) {
		new CodeWeekTextBasedGame();

	}
        
// ==========================================================================

	// Variable Declaration

	public final static String newline = "\n"; // For conveinence purposes
	public final static String doubleline = "\n" + "\n"; // For conveinence
        public final static int totalHealth = 20;
        public final static int maxArmor = 9;
        public final static int maxAttack = 10;
															// purposes
	public static Random universalRandom = new Random();
        public static int bonusAttack = 0;
        public static int heals = 0;
        public static String text = "";
        public static int health = totalHealth;
        public static int bonusArmor = 0;
        public static int armor = 5;
        public static int attack = 5;
	public static String location = "menu";
	public static String lastLocation = "";
        public final static int winPlaceX = universalRandom.nextInt(11);
	public static JScrollPane SP1 = new JScrollPane();
	public static JTextField TF1 = new JTextField();
	public static JTextArea TA1 = new JTextArea(/*Opening words go here*/
                                                      "Welcome to " + TITLE + ", a text based game promoting Code Week!"
                                                    + newline + "" /*Don't change past here in the opening message*/ + newline+" If you need help, type in the command \" help \" ");
        public static boolean playing = false;
        public static int posX = 0;
        public static int posY = 0;

	// End Variable Declaration

	// ==========================================================================

	// set gui components and opening text

	private void initComponents() {

		TA1.setEditable(false);
		TF1.addActionListener(this);
		TF1.setVisible(true);

		TA1.setColumns(20);
		TA1.setRows(10);
		SP1.setViewportView(TA1);
                

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														SP1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														600, Short.MAX_VALUE)
												.addComponent(TF1))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(SP1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										440, Short.MAX_VALUE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(TF1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));

		pack();
	}// Just set all window text components

	@Override
	public void actionPerformed(ActionEvent evt) {
		text = TF1.getText();               
                
                
                
                NewGame newgame = new NewGame();
                
                //Beginning text game stuff goes here
                
                switch(text){

                    //Possible commands go below
                    
                    case "new": //Starts a new game
                        
                        newgame.evaluate();
                        
                    break;    
                    
                    case "help": //displays commands to user
                        
                        TA1.append(doubleline + "//" + text + "//" + doubleline);
                        
                        TA1.append(help.evaluate());
                        
                    break;
                  
            
                    case "up":
                        TA1.append(doubleline + "//" + text + "//" + doubleline);
                        if(playing){
                            
                            if(posY<=9){
                                CodeWeekTextBasedGame.posY+=1;
                                TA1.append("\nYou are now at "+CodeWeekTextBasedGame.posX+","+CodeWeekTextBasedGame.posY+".");
                                TA1.append("\nYou have "+health+" hitpoints out of "+totalHealth+" hitpoints.");
                                
                                if(universalRandom.nextInt(3) == 0||(CodeWeekTextBasedGame.posY==cmPosY && CodeWeekTextBasedGame.posX==cmPosX)){
                                monster.spawn();
                                }
                            }else
                            TA1.append("\nYou cannot move farther up.");
                        }else
                        TA1.append("\nYou are not currently playing a game.\n In order to start a game type in \"new\".");
                
                    break;
            
                    case "down":
                        TA1.append(doubleline + "//" + text + "//" + doubleline);
                        if(playing){
                            
                            if(posY>=1){
                                CodeWeekTextBasedGame.posY-=1;
                                TA1.append("\nYou are now at "+CodeWeekTextBasedGame.posX+","+CodeWeekTextBasedGame.posY+".");
                                TA1.append("\nYou have "+health+" hitpoints out of "+totalHealth+" hitpoints.");
                                
                                if(universalRandom.nextInt(3) == 0||(CodeWeekTextBasedGame.posY==cmPosY && CodeWeekTextBasedGame.posX==cmPosX)){
                                monster.spawn();
                                }
                            }else
                            TA1.append("\nYou cannot move farther down.");
                            
                        }else
                        TA1.append("\nYou are not currently playing a game.\n In order to start a game type in \"new\".");
                
                    break;
            
                    case "left":
                        TA1.append(doubleline + "//" + text + "//" + doubleline);
                        if(playing){
                            
                            if(posX>=1){
                                CodeWeekTextBasedGame.posX-=1;
                                TA1.append("\nYou are now at "+CodeWeekTextBasedGame.posX+","+CodeWeekTextBasedGame.posY+".");
                                TA1.append("\nYou have "+health+" hitpoints out of "+totalHealth+" hitpoints.");
                                
                                if(universalRandom.nextInt(3) == 0||(CodeWeekTextBasedGame.posY==cmPosY && CodeWeekTextBasedGame.posX==cmPosX)){
                                 monster.spawn();
                                }
                            }else
                            TA1.append("\nYou cannot move farther left.");
                        }else
                        TA1.append("\nYou are not currently playing a game.\n In order to start a game type in \"new\".");
                        
                       
                
                    break;
                
                    case "right":
                        TA1.append(doubleline + "//" + text + "//" + doubleline);
                        if(playing){
                            
                            if(posX<=9){
                                CodeWeekTextBasedGame.posX+=1;
                                TA1.append("\nYou are now at "+CodeWeekTextBasedGame.posX+","+CodeWeekTextBasedGame.posY+".");
                                TA1.append("\nYou have "+health+" hitpoints out of "+totalHealth+" hitpoints.");
                                
                                if(universalRandom.nextInt(3) == 0||(CodeWeekTextBasedGame.posY==cmPosY && CodeWeekTextBasedGame.posX==cmPosX)){
                                monster.spawn();
                                }
                            }else
                            TA1.append("\nYou cannot move farther right.");
                        }else
                        TA1.append("\nYou are not currently playing a game.\n In order to start a game type in \"new\".");
                        
                        
                
                    break;
                
                
                   
                    default: //If we don't have a command, it goes here
                        
                        TA1.append(doubleline + "//" + text + "//" + doubleline);
                        
                        TA1.append("I don't know how to " + text + "." + newline);
                    
                    break;
                    
                }
                
                //delete the text in the TextField
		TF1.selectAll();
                TF1.setText("");

		// Make sure the new text is visible, even if there
		// was a selection in the text area.
		TA1.setCaretPosition(TA1.getDocument().getLength());

	}
        public static void playerAttack(){
       
           mTurn.health -= attack;
           TA1.append("\nYou deal "+attack+" hitpoints to the "+mTurn.finalName+".");
           if(mTurn.health <= 0){
               TA1.append("\nThe "+mTurn.finalName+" dies.");
               if(mTurn.finalName == "Corrupted Mother Board"){
                   TA1.append("\nYou defeated the Corrupted Mother Board, thus restoring yourself into your own realm.");
                   TA1.append("\n"+doubleline+"Thank you for playing. This game was made in support of CodeWeek. \nCheck out Hour of Code online to learn more.");
                   TA1.append("\nPlay Again? Type in new!");
                   playing = false;
               }else{
               if(universalRandom.nextInt(2) == 0){
                   bonusAttack = universalRandom.nextInt(5)+1;
                   TA1.append("\nYou recieve "+bonusAttack+" bonus attack from the experience of the fight.");
                   if(attack+bonusAttack <= maxAttack){
                   attack+= bonusAttack;
                   }else{
                   attack = maxAttack;    
                   }
               }
               if(universalRandom.nextInt(2) == 0){
                   heals = universalRandom.nextInt(5)+1;
                   TA1.append("\nYou recieve "+heals+" health from the scavengeable corpse.");
                   if(health+heals <= totalHealth){
                   health+= heals;
                   }else{
                   health = totalHealth;    
                   }
                if(universalRandom.nextInt(2) == 0){
                   bonusArmor = universalRandom.nextInt(5)+1;
                   TA1.append("\nYou recieve "+bonusArmor+" armor from the hide of the beast.");
                   if(armor+bonusArmor <= maxArmor){
                   armor+= bonusArmor;
                   }else{
                   armor = maxArmor;    
                   }
                }
                TA1.append("\nYou have "+CodeWeekTextBasedGame.health+" hitpoints out of "+CodeWeekTextBasedGame.totalHealth+" hitpoints.");
               }}
           }else{
            mTurn.attack();
           }
           
      

        }

}

/*
Ha Reference to pi. Ha.




Made By Gabe, Corey, and Zeke.




Lol.
*/