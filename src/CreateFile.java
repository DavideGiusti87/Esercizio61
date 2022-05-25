/*
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


Streams 01
Exercise: Streams 1
Inside the src folder define a file called file.txt that has the following lines:

hello
how
are you
?
create a tester class that uses the Stream API to try to read each line of file.txt
catch a potential IOException

public class CreateFile {

    public void write(String[] ars, String filePath) {
        try (
                FileWriter writer = new FileWriter(filePath);
                PrintWriter pw = new PrintWriter(writer)
        ) {

            for (String s : ars) {
                pw.println(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void read(String filePath) {
        try (
                Stream<String> stream = Files.lines(Paths.get(filePath))
        ) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/

