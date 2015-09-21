package ua.dp.mign.writers;

import java.io.FileWriter;
import java.io.IOException;

/* Implementation */
public class FileMessageWriter implements MessageWriter {

    public FileMessageWriter(String fileName) throws IOException {
        this.writer = new FileWriter(fileName);
    }

    @Override
    public void write(String message) {
        try {
            writer.append(message);
            writer.flush();
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private FileWriter writer;
}
