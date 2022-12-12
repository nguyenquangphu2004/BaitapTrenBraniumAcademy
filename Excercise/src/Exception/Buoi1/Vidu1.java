package Exception.Buoi1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vidu1 {
    public static void main(String[] args) {
       try {
           SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
           String birthDay = "05-02-2004";

           Date date = dateFormat.parse(birthDay);
       } catch (ParseException e) {
//           throw e;
           e.printStackTrace();
       }

        System.out.println("Cac cau lenh phia duoi");

    }
}