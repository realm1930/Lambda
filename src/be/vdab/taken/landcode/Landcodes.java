package be.vdab.taken.landcode;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class Landcodes {
    private static final Path LANDCODES = Path.of("/data/landcodes.txt");
    private static Optional<String> landNaam(String landcode) {
        try (var reader = Files.newBufferedReader(LANDCODES)) {
            for (String regel; (regel = reader.readLine()) != null; ) {
                var spatieIndex = regel.indexOf(' ');
                if (landcode.equals(regel.substring(0, spatieIndex))) {
                    return Optional.of(regel.substring(spatieIndex + 1));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Optional.empty();
    }

    public static void main(String[] args){
        landNaam("BE").ifPresent(landNaam -> System.out.println(landNaam));
        landNaam("FR").ifPresent(landNaam -> System.out.println(landNaam));
        landNaam("IT").ifPresent(landNaam -> System.out.println(landNaam));
        landNaam("II").ifPresent(landNaam -> System.out.println(landNaam));
    }

}
