import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javax.swing.JButton;
import javax.swing.JFrame;
public class ControllerZ
{

   public static void main(String[] args)
   {
      ZodiacGUI myHoroscope = new ZodiacGUI("Horoscope GUI");
      myHoroscope.setVisible(true);

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
      
      
   }
}
