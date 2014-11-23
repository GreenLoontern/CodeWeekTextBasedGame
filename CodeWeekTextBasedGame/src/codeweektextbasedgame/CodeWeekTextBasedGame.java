package codeweektextbasedgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;




@SuppressWarnings("serial")
public class CodeWeekTextBasedGame extends JFrame implements ActionListener {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 440;
    public static final String TITLE = "Code Week Text Based Game";
    
	public CodeWeekTextBasedGame() {
		add(new Panel());
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(TITLE); // Window Parameters

		initComponents();

	}

	public static void main(String[] args) {
		new CodeWeekTextBasedGame();

	}
        
// ==========================================================================

	// Variable Declaration

	public final static String newline = "\n"; // For conveinence purposes
	public final static String doubleline = "\n" + "\n"; // For conveinence
															// purposes
	public static String text = "";
	public static String location = "menu";
	public static String lastLocation = "";
	public static JScrollPane SP1 = new JScrollPane();
	public static JTextField TF1 = new JTextField();
	public static JTextArea TA1 = new JTextArea(/*Opening words go here*/
                                                      "Welcome to " + TITLE + ", a text based game promoting Code Week!"
                                                    + newline + "" /*Don't change past here in the opening message*/ + doubleline);

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

                //Beginning text game stuff goes here
                
                switch(text){
                    
                    //Possible commands go below
                    
                    default:
                        
                        TA1.append("//" + text + "//" + doubleline);
                        
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

}

