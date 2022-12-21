package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {
    private static Properties config;
    static {
        try {
            String path = "src/config.properties";
            FileInputStream fileInputStream = new FileInputStream(path);
            config = new Properties();
            config.load(fileInputStream);
            fileInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Properties file contain error");
        }
    }
    public static String getProperties(String name){
        return config.getProperty(name);
    }
}
