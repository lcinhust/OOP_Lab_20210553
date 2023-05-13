import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        String filename = "OtherProjects/hust.soict.globalict.garbage/src/test.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }

        startTime = System.currentTimeMillis();

        StringBuilder outputString = new StringBuilder();
        for (byte b : inputBytes) {
            outputString.append((char)b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
