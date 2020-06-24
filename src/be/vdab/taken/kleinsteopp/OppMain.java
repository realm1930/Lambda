package be.vdab.taken.kleinsteopp;

import java.util.List;

public class OppMain {
    public static void main(String[] args) {
        var rechthoeken = List.of(
                 new Opp(1,3), new Opp(2,2),
                new Opp(3,3));
        var kleinsteOpp = rechthoeken.stream()
                .mapToInt(opp -> opp.getOppervlakte())
                .min();
        kleinsteOpp.ifPresent(oppervlakte -> {
            System.out.println(oppervlakte);
            rechthoeken.stream()
                    .filter(opp -> opp.getOppervlakte() == oppervlakte)
                    .forEach(opp -> System.out.println(opp));
        });

    }
}
