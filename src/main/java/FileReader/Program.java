package FileReader;

/*
FileReader(String fileName)
FileReader(File file)
FileReader(FileDescriptor fd)
 */

import java.io.*;

public class Program {

    public static void main(String[] args) {

        try(FileReader reader = new FileReader("notes3.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
