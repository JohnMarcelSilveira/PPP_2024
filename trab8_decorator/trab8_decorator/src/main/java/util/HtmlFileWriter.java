package util;

import java.io.FileWriter;
import java.io.IOException;

public class HtmlFileWriter {
    public static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
