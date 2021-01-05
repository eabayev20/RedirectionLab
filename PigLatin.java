import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PigLatin{

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    if (ss.substring(0,1).equals("a")|ss.substring(0,1).equals("e")||ss.substring(0,1).equals("i")||ss.substring(0,1).equals("o")||ss.substring(0,1).equals("u")) {
      s = s + "hay";
    }
    else {
      String ss = "";
      ss = ss.substring(1,ss.length()) + ss.substring(0,1) +"ay";

    }
    return s;

  }
}
