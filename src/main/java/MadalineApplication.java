import java.io.File;

public class MadalineApplication {

    public static void main(String... args) {
        MadalineNetwork madaline = new MadalineNetwork(new File("src/main/resources/patterns.txt"));
        madaline.showOutput(new File("src/main/resources/example-input.txt"));

    }
}
