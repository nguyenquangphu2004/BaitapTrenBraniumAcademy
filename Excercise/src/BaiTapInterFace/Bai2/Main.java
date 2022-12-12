package BaiTapInterFace.Bai2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transport> transports = new ArrayList<>();

        Transport transport1 = new Car1();
        transport1.setWeight(150);

        Transport transport2 = new Car1();
        transport2.setWeight(50);

        Transport transport3 = new Car1();
        transport3.setWeight(200);

        Transport transport4 = new Car1();
        transport4.setWeight(100);


        transports.add(transport1);
        transports.add(transport2);
        transports.add(transport3);
        transports.add(transport4);
                Collections.sort(transports);

        for (var item :
                transports) {
            System.out.println(item);
        }
//        Collections.sort(transports);
//
//        for (var item :
//                transports) {
//            System.out.println(item);
//        }





    }
}
