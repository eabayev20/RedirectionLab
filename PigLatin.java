import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PigLatin{

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    if (s.substring(0,1).equals("a")||s.substring(0,1).equals("e")||s.substring(0,1).equals("i")||s.substring(0,1).equals("o")||s.substring(0,1).equals("u")) {
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

    String sss = "";
    String[] d = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    int count = 0;
    int al = d.length;
    if (s.length() <= 2) {
      if (s.substring(0,1).equals("a")||s.substring(0,1).equals("e")||s.substring(0,1).equals("i")||s.substring(0,1).equals("o")||s.substring(0,1).equals("u")) {
        s = s + "hay";
        return s ;
      }
      else {
        String ss = "";
        ss = s.substring(1,s.length()) + s.substring(0,1) +"ay";
        return ss;
      }
    }
    else {
    for (int i = 0; i != al; i++) {
      if (s.substring(0,2).equals(d[i])) {
        sss = s.substring(2,s.length()) + s.substring(0,2) + "ay";
        return sss;
      }
    }
    if (s.substring(0,1).equals("a")||s.substring(0,1).equals("e")||s.substring(0,1).equals("i")||s.substring(0,1).equals("o")||s.substring(0,1).equals("u")) {
      s = s + "hay";
      return s ;
    }
    else {
      String ss = "";
      ss = s.substring(1,s.length()) + s.substring(0,1) +"ay";
      return ss ;
    }
}
}
  public static String pigLatinBest(String s){
    s = s.toLowerCase();

    String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    int ccount = 0;
    for (int i = 0; i != alpha.length; i++) {
      if (s.substring(0,1).equals(alpha[i])) {
        ccount = ccount + 1;
      }

    }
    if (ccount == 0) {
      return s;
    }
    ccount = 0;
    String ending = "";
    for (int i = 0; i != alpha.length; i++) {
      if (s.substring(s.length()).equals(alpha[i])) {
        ccount = ccount + 1;
      }
      else {

      }
    }
    if (ccount == 0) {
      ending = s.substring(s.length());
      s = s.substring(0,s.length());
    }


    String sss = "";
    String[] d = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    int count = 0;
    int al = d.length;
    if (s.length() <= 2) {
      if (s.substring(0,1).equals("a")||s.substring(0,1).equals("e")||s.substring(0,1).equals("i")||s.substring(0,1).equals("o")||s.substring(0,1).equals("u")) {
        s = s + "hay"+ ending;
        return s ;
      }
      else {
        String ss = "";
        ss = s.substring(1,s.length()) + s.substring(0,1) +"ay" + ending;
        return ss ;
      }
    }
    else {
    for (int i = 0; i != al; i++) {
      if (s.substring(0,2).equals(d[i])) {
        sss = s.substring(2,s.length()) + s.substring(0,2) + "ay" + ending;
        return sss;
      }
    }
    if (s.substring(0,1).equals("a")||s.substring(0,1).equals("e")||s.substring(0,1).equals("i")||s.substring(0,1).equals("o")||s.substring(0,1).equals("u")) {
      s = s + "hay" + ending;
      return s;
    }
    else {
      String ss = "";
      ss = s.substring(1,s.length()) + s.substring(0,1) +"ay" + ending;
      return ss ;
    }
}


  }
  public static void foo(String fileName) throws FileNotFoundException{

    Scanner in = new Scanner(new File(fileName));
    while (in.hasNext()) {
      String line = in.nextLine();
      String add = "";
      Scanner in2 = new Scanner(line);
      while (in2.hasNext()) {

        String word = in2.next();

        String word2 = pigLatin(word);

          add = add + word2;


          add = add + " ";
      }
      System.out.println(add);
    }
  }





//hi




  public static void main(String[]args){
      String fileName = "sonnet.txt";
      try{
         foo(fileName);

      }catch(FileNotFoundException e){
        System.out.println("File not found: " + fileName);
        System.exit(1);
      }

}
}
