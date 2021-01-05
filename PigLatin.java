import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PigLatin{

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    if (s[0].equals("a")||s[0].equals("e")||s[0].equals("i")||s[0].equals("o")||s[0].equals("u")) {
      s = s + "hay";
    }
    else {
      String ss = "";
      ss = ss.substring(1,ss.length()) + ss.substring(0,1) +"ay";

    }
    return s;

  }
}
