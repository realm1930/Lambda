package be.vdab.taken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ArtistenAlbums {
    private static final Path PATH = Path.of("/data/albumsartists.txt");
    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)){
            var perArtiest = stream.collect(Collectors.groupingBy(
                    regel -> regel.substring(regel.indexOf(";")+1)
            ));
            perArtiest.entrySet().stream()
                    .sorted((entry1,entry2)->entry1.getKey().compareTo(entry2.getKey()))
                    .forEach(entry -> {
                        System.out.println(entry.getKey());
                        entry.getValue().stream()
                                .map(regel -> regel.substring(0,regel.indexOf(",")))
                                .sorted()
                                .forEach(album -> System.out.println("\t"+album));
                    });
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
