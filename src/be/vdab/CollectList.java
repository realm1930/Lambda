package be.vdab;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectList {
    public static List<String> gesorteerdeGroenten(){
        return Stream.of("sla","wortel","kool","biet")
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(gesorteerdeGroenten());
    }
}
