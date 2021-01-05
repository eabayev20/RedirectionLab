import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MakeStars{

    //this is void, but could return an answer if that is what your file is meant to do.
    public static void foo(String fileName) throws FileNotFoundException{
      String base = "*";
      Scanner in = new Scanner(new File(fileName));
      while (in.hasNext()) {
        String line = in.nextLine();
        String add = "";
        Scanner in2 = new Scanner(line);
        while (in2.hasNext()) {
          int l = 0;
          String word = in2.next();
          l = word.length();

          for (int i = 0; i != l; i++) {
            add = add + base;

          }
            add = add + " ";
        }
        System.out.println(add);
      }
    }










    public static void main(String[]args){
        String fileName = "book.txt";
        try{
           foo(fileName);

        }catch(FileNotFoundException e){
          System.out.println("File not found: " + fileName);
          System.exit(1);
        }

  }
}
