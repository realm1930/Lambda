package be.vdab.taken.namen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Artiestennamen {
    private static final Path PATH = Path.of("/data/albumsartists.txt");

    public static void main(String[] args) {

        try (var reader = Files.lines(PATH)){

            reader.map(regel -> regel.substring(regel.indexOf(",")+1))
                    .distinct()
                    .sorted()
                    .forEach(naam -> System.out.println(naam));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
