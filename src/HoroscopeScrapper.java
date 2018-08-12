/*
 * HoroscopeGUI
 * Danny Tran
 */

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//Preconditions Note: Jsoup must be added as part of build library


/*
 * MVC Model
 * HoroscopeScrapper is the Model
 */

public class HoroscopeScrapper
{

   /********* Horoscope Signs ***********
      aquarius, //Jan20-Feb18
      pisces, //Feb19-Mar20
      aries, //Mar21-Apr19
      taurus, //Apr20-May20
      gemini, //May21-Jun20
      cancer, //Jun21-Jul22
      leo, //Jul23-Aug22
      virgo, //Aug23-Sep22
      libra, //Sep23-Oct22
      scorpio, //Oct23-Nov21
      sagittarius, //Nov22-Dec21
      capricorn, //Dec22-Jan19

    ***********************************/


   /*
    * String day must be all undercase
    */

   public static String getHoroscope(String sign, String day)
   {
      String horoscope = "Horoscope Pending...";
      String website = "http://astrostyle.com/daily-horoscopes/"+sign+"-daily-horoscope/";

      try 
      {
         Document doc = Jsoup.connect(website).get();

         String title = doc.title();
         System.out.println(title);

         Element horo = doc.getElementById(day);
         System.out.println(horo.toString());

         Elements paragraph = horo.getElementsByTag("p");

         horoscope = paragraph.text();
         System.out.println(horoscope);
         return horoscope;

      }
      catch(IOException ex) 
      {
         System.out.println (ex.toString());
         return horoscope;
      }
   }   
}
