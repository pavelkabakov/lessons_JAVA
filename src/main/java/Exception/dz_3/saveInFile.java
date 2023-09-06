package Exception.dz_3;

import java.io.FileWriter;
import java.io.IOException;

public class saveInFile {

    public static void writeToFile(String string, String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename + ".txt", true)) {
            // запись всей строки
            String text = "Hello Gold!";
            writer.write(string);
            writer.append('\n');

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());// for test
            throw new IOException(ex.getMessage());
        }
    }
}
