package be.vdab.taken.oneven;

import java.util.ArrayList;
import java.util.Scanner;


public class OnevenGetallen {

    public static void main(String[] args) {
        var getallen = new ArrayList<Integer>();
        try (var scanner = new Scanner(System.in)){
            for (int getal; (getal = scanner.nextInt()) != 0;){
                getallen.add(getal);
            }
            getallen.stream()
                    .filter(getal -> getal % 2 == 1)
                    .sorted((getal1,getal2) -> getal2 - getal1)
                    .distinct()
                    .forEach(getal -> System.out.println(getal));

            }
        }


    }


