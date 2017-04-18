import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAndWrite {

  public void readWrite(String fromFile, String toFile) {
    try {
      Path sourceFile = Paths.get(fromFile);
      Path destinationFile = Paths.get(toFile);

      List<String> lines = Files.readAllLines(sourceFile);
      Files.write(destinationFile, lines, Charset.defaultCharset());

    } catch (Exception e) {
      System.out.println("Woops, and error has occurred: " + e.getClass());
    }
  }
}
