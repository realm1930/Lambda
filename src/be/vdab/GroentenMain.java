package be.vdab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class GroentenMain {
    public static void main(String[] args) {
        var heiligeGetallen = new LinkedHashSet<Integer>();
        heiligeGetallen.add(1);
        heiligeGetallen.add(3);
        heiligeGetallen.add(4);
        heiligeGetallen.add(7);
        heiligeGetallen.stream().forEach(getal -> System.out.println(getal));

        var talen = new LinkedHashMap<String, String>();
        talen.put("NL", "Nederlands");
        talen.put("FR","Frans");
        System.out.println("----");
        System.out.println(talen.entrySet());
        System.out.println(talen.keySet());
        System.out.println("---");
        talen.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+":"+entry.getValue()));
        talen.keySet().stream().forEach(entry -> System.out.println(entry+":"+talen.get(entry)));
    }
}
