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
    String[] d;
    String sss = "";
    String[] d = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    int count = 0;
    int al = d.length;
    for (int i = 0; i != al; i++) {
      if (s.substring(0,2).equals(d[i])) {
        sss = s.substring(2,s.length()) + s.substring(0,2) + "ay";
        return sss;
      }
    }
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
}
