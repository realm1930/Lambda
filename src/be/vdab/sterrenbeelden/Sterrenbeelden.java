package be.vdab.sterrenbeelden;

import java.nio.file.Files;
import java.nio.file.Path;

public class Sterrenbeelden {
    private static final Path PATH = Path.of("/data/sterrenbeelden.txt");

    public static void main(String[] args) {
        try (var reader = Files.newBufferedReader(PATH)){
            for (String regel; (regel = reader.readLine()) != null;){
                System.out.println(regel.toUpperCase());
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
