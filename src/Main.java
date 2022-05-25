import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
Streams 01
Exercise: Streams 1

Inside the src folder define a file called file.txt that has the following lines:

hello
how
are you
?
create a tester class that uses the Stream API to try to read each line of file.txt
catch a potential IOException
 */
public class Main {
    public static void main(String[] args) {

        String path = "C://Users/Davide/IdeaProjects/Develhope/Esercizio61/src/file.txt";
/*
        String[] stringToWrite  = {" ","hello","how","are you","?"};
        CreateFile createFile = new CreateFile();

        createFile.write(stringToWrite,path);
*/
        try (
                Stream<String> stream = Files.lines(Paths.get(path))
        ) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
