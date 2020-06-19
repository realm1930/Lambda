package be.vdab;

import java.util.stream.Stream;

public class allMatchMain {
    public static void main(String[] args) {
        System.out.println(
                Stream.of("slaa","wort","kool","biet")
                    .allMatch(groente -> groente.length() == 4));

    }
}
