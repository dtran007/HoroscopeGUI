
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;



import java.util.Calendar;

import java.util.GregorianCalendar;

public class ZodiacGUI extends JFrame
{
   
   public JPanel pnlWestButton;
   public JPanel pnlEastButton;
   public JPanel pnlSouthClock;
   public JLabel clockLabel;
   public JPanel pnlCenterText;
   
   public ZodiacGUI(String title)
   {
      super(title);
      
      setSize(800, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBackground(Color.GREEN);
      setLayout(new BorderLayout());
      
      //title
      String titleGUI = "Daily Horoscope";
      JLabel guiLabel = new JLabel(titleGUI);
      guiLabel.setFont(new Font("Serif", Font.PLAIN, 20));
      guiLabel.setHorizontalAlignment(JLabel.CENTER);
      add(guiLabel,BorderLayout.NORTH);
      
      //Clock
      clockLabel = new JLabel("");
      clockLabel.setFont(new Font("Serif", Font.PLAIN, 20));
      clockLabel.setHorizontalAlignment(JLabel.CENTER);
      add(clockLabel,BorderLayout.SOUTH);
      clock();
      setVisible(true);
      
      
      //pnlCenterText
      pnlCenterText = new JPanel();
      add(pnlCenterText,BorderLayout.CENTER);      
      
      //Text Pane
      /*
      JTextPane zPane = new JTextPane();
      zPane.setPreferredSize(new Dimension(200, 200));
      add(zPane,BorderLayout.CENTER);
      */
      
      //pnlWestButton
      pnlWestButton = new JPanel();
      pnlWestButton.setLayout(new GridLayout(6, 1));
      add(pnlWestButton,BorderLayout.WEST);
      
      //West Buttons
      JButton z1Button = new JButton("Aquarius");
      EndingListener z1Ear = new EndingListener();
      z1Button.addActionListener(z1Ear);
      pnlWestButton.add(z1Button);
      
      JButton z2Button = new JButton("Pisces");
      EndingListener z2Ear = new EndingListener();
      z2Button.addActionListener(z2Ear);
      pnlWestButton.add(z2Button);
      
      JButton z3Button = new JButton("Aries");
      EndingListener z3Ear = new EndingListener();
      z3Button.addActionListener(z3Ear);
      pnlWestButton.add(z3Button);
      
      JButton z4Button = new JButton("Taurus");
      EndingListener z4Ear = new EndingListener();
      z4Button.addActionListener(z4Ear);
      pnlWestButton.add(z4Button);
      
      JButton z5Button = new JButton("Gemini");
      EndingListener z5Ear = new EndingListener();
      z5Button.addActionListener(z5Ear);
      pnlWestButton.add(z5Button);
      
      JButton z6Button = new JButton("Cancer");
      EndingListener z6Ear = new EndingListener();
      z6Button.addActionListener(z6Ear);
      pnlWestButton.add(z6Button);

      
      
      //pnlEastButton
      pnlEastButton = new JPanel();
      pnlEastButton.setLayout(new GridLayout(6, 1));
      add(pnlEastButton,BorderLayout.EAST);
      
      //East Buttons
      
      JButton z7Button = new JButton("Leo");
      EndingListener z7Ear = new EndingListener();
      z7Button.addActionListener(z7Ear);
      pnlEastButton.add(z7Button);
      
      JButton z8Button = new JButton("Virgo");
      EndingListener z8Ear = new EndingListener();
      z8Button.addActionListener(z8Ear);
      pnlEastButton.add(z8Button);
      
      JButton z9Button = new JButton("Libra");
      EndingListener z9Ear = new EndingListener();
      z9Button.addActionListener(z9Ear);
      pnlEastButton.add(z9Button);
      
      JButton z10Button = new JButton("Scorpio");
      EndingListener z10Ear = new EndingListener();
      z10Button.addActionListener(z10Ear);
      pnlEastButton.add(z10Button);
      
      JButton z11Button = new JButton("Sagittarius");
      EndingListener z11Ear = new EndingListener();
      z11Button.addActionListener(z11Ear);
      pnlEastButton.add(z11Button);
      
      JButton z12Button = new JButton("Capricorn");
      EndingListener z12Ear = new EndingListener();
      z12Button.addActionListener(z12Ear);
      pnlEastButton.add(z12Button);
      
   }


   public void clock()
   {
      Thread clock = new Thread()
      {
         public void run()
         {
            try 
            {
               while(true)
               {
                  Calendar cal = new GregorianCalendar();
                  int day = cal.get(Calendar.DAY_OF_MONTH);
                  int month = cal.get(Calendar.MONTH)+1; //Greg Cal starts 0
                  int year = cal.get(Calendar.YEAR);

                  int second = cal.get(Calendar.SECOND);
                  int minute = cal.get(Calendar.MINUTE);
                  int hour = cal.get(Calendar.HOUR);

                  clockLabel.setText("Date "+year+"/"+month+"/"+day+
                        "  Time "+hour+":"+minute+":"+second);

                  Thread.sleep(1000);
               }
            }
            catch(InterruptedException e)
            {
               System.out.println(e.toString());
            }
         }
      };
      clock.start();
   }
      
}



