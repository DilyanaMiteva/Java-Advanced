import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAPicture_09 {
    private static final String PICTURE_PATH = "src/streamsFilesAndDirectoriesExercises/resources/picture.jpg";
    private static final String PICTURE_COPY_PATH = "src/streamsFilesAndDirectoriesExercises/resources/picture-copy.jpg";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(PICTURE_PATH);
             FileOutputStream fos = new FileOutputStream(PICTURE_COPY_PATH)) {
            int oneByte = fis.read();
            while (oneByte != -1) {
                fos.write(oneByte);
                oneByte = fis.read();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
