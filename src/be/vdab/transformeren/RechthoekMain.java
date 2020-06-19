package be.vdab.transformeren;

import java.util.stream.Stream;

public class RechthoekMain {
    public static void main(String[] args) {
        Stream.of(new Rechthoek(6,2),new Rechthoek(3,1),new Rechthoek(5,4))
                .map(rechthoek -> rechthoek.getOppervlakte())
                .sorted()
                .forEach(System.out::println);
    }
}
