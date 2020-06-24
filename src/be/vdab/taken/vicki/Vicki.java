package be.vdab.taken.vicki;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Vicki {
    private static final Path PATH = Path.of("/data/acteurs-actrices.csv");
    public static void main(String[] args) {
        try(var steam = Files.lines(PATH)){
            System.out.println(
                    steam.map(regel->regel.split(";")[0])
                         .anyMatch(voornaam->"Vicki".equals(voornaam))
                    ?"komt voor":"komt niet voor"
            );
        } catch( IOException ex){
            ex.printStackTrace();
        }
    }
}
