
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;

public class ZodiacGUI extends JFrame
{
   
   public ZodiacGUI(String title)
   {
      super(title);
      
      setSize(800, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBackground(Color.GREEN);
      setLayout(new BorderLayout());
   }

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub
      ZodiacGUI myGUI = new ZodiacGUI("Sup");
      myGUI.setVisible(true);
   }

}
