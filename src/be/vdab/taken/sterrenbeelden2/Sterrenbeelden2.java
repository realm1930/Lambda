package be.vdab.taken.sterrenbeelden2;

import java.nio.file.Files;
import java.nio.file.Path;

public class Sterrenbeelden2 {
    private static final Path PATH = Path.of("/data/sterrenbeelden.txt");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)){
            stream.map(String::toUpperCase)
                    .forEach(System.out::println);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
