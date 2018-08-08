/*
 * CST338
 * Final Project
 * Danny Tran
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import java.util.Calendar;


/*
 * MVC Model
 * ControllerZ is the Controller
 */

public class ControllerZ
{

   public static void main(String[] args)
   {
      ZodiacGUI myHoroscope = new ZodiacGUI("AstroTwins | Astrostyle");
      myHoroscope.setVisible(true);
      
      ZInit.init(myHoroscope);
   }

}

class EndingListener implements ActionListener
{
   public void actionPerformed(ActionEvent e)
   {
      String actionCommand = e.getActionCommand();

      //Console Check
      System.out.print("Button Pressed: ");
      System.out.println(actionCommand);


      //Get date
      Calendar cal = Calendar.getInstance();
      int day = cal.get(Calendar.DAY_OF_WEEK); //Sun:1 --> Sat:7

      //Horoscope      
      String mySign = actionCommand.toLowerCase();
      String today = "";

      switch(day)
      {
         case 2: today = "monday";
            break;
         case 3: today = "tuesday";
            break;
         case 4: today = "wednesday";
            break;
         case 5: today = "thursday";
            break;
         case 6: today = "friday";
            break;
         default: today = "weekend";
            break;
      }

      String myScope = HoroscopeScrapper.getHoroscope(mySign, today);
      
      ZInit.myHoroscope.pnlCenterText.removeAll();
      
      JTextArea horoText = new JTextArea(25, 40);
      horoText.setText(myScope);
      horoText.setLineWrap(true);
      horoText.setWrapStyleWord(true);
      
      ZInit.myHoroscope.pnlCenterText.add(horoText);
     
   }
}

class ZInit
{
   static ZodiacGUI myHoroscope;
   
   static void init(ZodiacGUI gui)
   {
      myHoroscope = gui;
   }
}
