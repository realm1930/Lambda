package be.vdab.taken.laatsteland;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LaatsteLand {
    private static final Path PATH = Path.of("/data/landcodes.txt");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)){
            stream.map(regel -> regel.substring(regel.indexOf(' ')+1))
                  .max((naam1,naam2) -> naam1.compareToIgnoreCase(naam2))
                  .ifPresent(grootsteNaam -> System.out.println(grootsteNaam));
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
