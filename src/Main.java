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
//            System.out.println(Arrays.toString(forest));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
