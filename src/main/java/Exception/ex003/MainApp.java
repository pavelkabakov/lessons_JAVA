package Exception.ex003;

import java.io.File;
        import java.io.FileReader;
        import java.io.IOException;

public class MainApp {
    public static void main(String args[]) {
        FileReader reader = null;
        try {
            reader = new FileReader(new
                    File("file.txt"));
// Полезная работа, связанная с чтением файла..
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}