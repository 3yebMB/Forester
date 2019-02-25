import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final String FILE_NAME = "forest.txt";
        File file = new File(FILE_NAME);
        char[] forest = new char[(int) file.length()];

        try {
            FileReader fr = new FileReader(file);
            fr.read(forest);
            Counter_m1 m1 = new Counter_m1(forest);
            m1.info();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
