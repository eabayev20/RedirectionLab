import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PigLatin{

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    if (s.substring(0,1).equals("a")|s.substring(0,1).equals("e")||s.substring(0,1).equals("i")||s.substring(0,1).equals("o")||s.substring(0,1).equals("u")) {
      s = s + "hay";
      return s;
    }
    else {
      String ss = "";
      ss = s.substring(1,s.length()) + s.substring(0,1) +"ay";
      return ss;
    }


  }
  public static String pigLatin(String s){
    s = s.toLowerCase();


  }
}
