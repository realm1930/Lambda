package be.vdab;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

public class StringMain {

    private static final Path PATH = Path.of("/data/languages.txt");

    public static void main(String[] args) {

        "lambdafun".chars().forEach(unicode-> System.out.println((char) unicode));

        try (var stream  = Files.lines(PATH)){
            stream.forEach(regel -> System.out.println(regel));
        } catch (IOException ex){
            ex.printStackTrace(System.err);
        }

        Stream.iterate(1, vorigGetal -> vorigGetal+2)
                .limit(25)
                .forEach(onevenGetal -> System.out.println(onevenGetal));




    }
}
