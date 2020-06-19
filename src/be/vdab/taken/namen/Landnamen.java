package be.vdab.taken.namen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Landnamen {

    private static final Path LANDCODES = Path.of("/data/landcodes.txt");

    public static void main(String[] args) {
        try (var stream = Files.lines(LANDCODES)){
            stream.map(regel -> regel.substring(regel.indexOf(" ")+1))
                    .sorted()
                    .forEach(naam -> System.out.println(naam));
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }




}
