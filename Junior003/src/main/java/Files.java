import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Spliterator;


public class Files {
    public static void main(String[] args) throws IOException {
        File dir = new File(".");
        String[] names = dir.list();

        File file = new File("temp.txt");
        System.out.println(file.length());
        FileInputStream input = new FileInputStream(file);
        int length = input.available();

        byte[] data = new byte[length];
        input.read(data);

       String text = new String(data);
        System.out.println(text);

        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        String newText = System.lineSeparator() + "Hello world files!";
        byte[] newTextBytes = newText.getBytes();
        fileOutputStream.write(newTextBytes);
        fileOutputStream.close();






    }
}
