package be.vdab;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMap {
    public static void main(String[] args) {
        var groentePerLengte= Stream.of("sla","kool","wortel","biet")
                .collect(Collectors.groupingBy(groente -> groente.length()));
        groentePerLengte.entrySet().stream()
                .forEach(entry -> {
                    System.out.print(entry.getKey());
                    entry.getValue().stream().forEach(groente -> System.out.print(groente));
                    System.out.println();
                });
    }
}
