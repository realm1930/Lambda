package be.vdab;

import java.util.stream.Stream;

public class Count {
    public static void main(String[] args) {
        System.out.println(Stream.of(",",",",",",",",",").count());
    }
}
