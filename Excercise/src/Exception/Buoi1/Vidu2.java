package Exception.Buoi1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Vidu2 {
    public static void main(String[] args)  {

       File file = new File("input.txt");
       String a1 = "";
       String a2 = "",
               a3 = "",
               a4 = "",
               a5 = "",
               a6 = "";
        try {
            Scanner readFile = new Scanner(file);
            while(readFile.hasNextLine()) {
                try {
                    var words = readFile.nextLine().split(";");
                     a1 = words[0];
                     a2 = words[1];
                     a3 = words[2];
                     a4 = words[3];
                     a5 = words[4];
                     a6 = words[5];
                } catch (ArrayIndexOutOfBoundsException e) {
                    e.printStackTrace();
                }


            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6);

    }



}
