import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SystemConfig {
    public static void main(String args[]) throws FileNotFoundException {
        System.out.println(System.getProperty("ssp.config"));
        Sample sample = new Sample();
        sample.readTest();

    }


}
