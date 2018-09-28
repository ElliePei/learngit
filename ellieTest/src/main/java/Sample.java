import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Sample {
    public void readTest() throws FileNotFoundException {
        Properties prop = new Properties();
        //FileInputStream fis = new FileInputStream("sample.properties");
        String aa = System.getProperty("ssp.config");
        System.out.println("aa is " + " " + aa);
//        InputStream config = this.getClass().getResourceAsStream("test.properties");
//        System.out.println(config + " " + config);


        FileInputStream fis =
                new FileInputStream(aa);
        try {
            prop.load(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }
        prop.list(System.out);
        System.out.println("\nThe foo property: " + prop.getProperty("foo"));

    }
}
