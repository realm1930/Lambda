package be.vdab.transformeren;

import java.util.stream.Stream;

public class MapTransform {
    public static void main(String[] args) {
        Stream.of("sla","wortel","kool","biet")
                .map(groente -> groente.length())
                .forEach(lengte -> System.out.println(lengte));
    }
}
