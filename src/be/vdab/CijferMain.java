package be.vdab;

import java.util.Optional;

public class CijferMain {
    private static Optional<Integer> eersteCijfer(String string){
        for (var index = 0;index != string.length();index++){
            var teken = string.charAt(index);
            if (Character.isDigit(teken)){
                return Optional.of(Character.getNumericValue(teken));
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        var optioneelCijfer = eersteCijfer("all4you");
        optioneelCijfer.ifPresent(cijfer -> System.out.println(cijfer));
        optioneelCijfer = eersteCijfer("wrong");
        optioneelCijfer.ifPresent(cijfer -> System.out.println(cijfer));
    }
}
