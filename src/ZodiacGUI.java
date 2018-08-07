
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.SwingConstants;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZodiacGUI extends JFrame
{
   
   public JPanel pnlWestButton, pnlEastButton;
   
   public ZodiacGUI(String title)
   {
      super(title);
      
      setSize(800, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBackground(Color.GREEN);
      setLayout(new BorderLayout());
      
      //pnlWestButton
      pnlWestButton = new JPanel();
      pnlWestButton.setLayout(new GridLayout(6, 1));
      add(pnlWestButton,BorderLayout.WEST);
      
      //West Buttons
      JButton z1Button = new JButton("Zodiac1");
      EndingListener z1Ear = new EndingListener();
      z1Button.addActionListener(z1Ear);
      pnlWestButton.add(z1Button);
      
      JButton z2Button = new JButton("Zodiac2");
      EndingListener z2Ear = new EndingListener();
      z2Button.addActionListener(z2Ear);
      pnlWestButton.add(z2Button);
      
      JButton z3Button = new JButton("Zodiac3");
      EndingListener z3Ear = new EndingListener();
      z3Button.addActionListener(z3Ear);
      pnlWestButton.add(z3Button);
      
      JButton z4Button = new JButton("Zodiac4");
      EndingListener z4Ear = new EndingListener();
      z4Button.addActionListener(z4Ear);
      pnlWestButton.add(z4Button);
      
      JButton z5Button = new JButton("Zodiac5");
      EndingListener z5Ear = new EndingListener();
      z5Button.addActionListener(z5Ear);
      pnlWestButton.add(z5Button);
      
      JButton z6Button = new JButton("Zodiac6");
      EndingListener z6Ear = new EndingListener();
      z6Button.addActionListener(z6Ear);
      pnlWestButton.add(z6Button);

      
      
      //pnlEastButton
      pnlEastButton = new JPanel();
      pnlEastButton.setLayout(new GridLayout(6, 1));
      add(pnlEastButton,BorderLayout.EAST);
      
      //East Buttons
      
      JButton z7Button = new JButton("Zodiac7");
      EndingListener z7Ear = new EndingListener();
      z7Button.addActionListener(z7Ear);
      pnlEastButton.add(z7Button);
      
      JButton z8Button = new JButton("Zodiac8");
      EndingListener z8Ear = new EndingListener();
      z8Button.addActionListener(z8Ear);
      pnlEastButton.add(z8Button);
      
      JButton z9Button = new JButton("Zodiac9");
      EndingListener z9Ear = new EndingListener();
      z9Button.addActionListener(z9Ear);
      pnlEastButton.add(z9Button);
      
      JButton z10Button = new JButton("Zodiac10");
      EndingListener z10Ear = new EndingListener();
      z10Button.addActionListener(z10Ear);
      pnlEastButton.add(z10Button);
      
      JButton z11Button = new JButton("Zodiac11");
      EndingListener z11Ear = new EndingListener();
      z11Button.addActionListener(z11Ear);
      pnlEastButton.add(z11Button);
      
      JButton z12Button = new JButton("Zodiac12");
      EndingListener z12Ear = new EndingListener();
      z12Button.addActionListener(z12Ear);
      pnlEastButton.add(z12Button);
      
   }

   public static void main(String[] args)
   {
      //Testing GUI
      ZodiacGUI myGUI = new ZodiacGUI("Gui Title");
      myGUI.setVisible(true);
   }

}

class EndingListener implements ActionListener
{
   public void actionPerformed(ActionEvent e)
   {
      String actionCommand = e.getActionCommand();
      if(actionCommand.equals("Bye"))
      {
         System.out.println("Closing Program. Goodbye!");
         System.exit(0);
      }
   }
}
