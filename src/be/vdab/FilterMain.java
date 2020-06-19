package be.vdab;

import java.util.stream.Stream;

public class FilterMain {
    public static void main(String[] args) {
        Stream.of("sla","wortel","kool","biet")
        .filter(groente -> groente.length() == 4)
        .forEach(groente -> System.out.println(groente));
    }
}
