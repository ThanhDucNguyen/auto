package udigo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Configuration {

    private static Configuration instance;

    private Properties configProps = new Properties();

    private Logger logger = LoggerFactory.getLogger(Configuration.class);

    public void loadTestProperties() {
        try {
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("properties/local.properties");
            configProps.load(inputStream);
        } catch (IOException ex) {
            logger.info(ex.getMessage());
        }
    }

    public String getTestProperty(String property) {
        String result = configProps.getProperty(property);
        if (result == null) {
            throw new RuntimeException("Could not resolve config key " + property + ". Please check it is defined");
        }
        return result;
    }

    public Configuration() {
        loadTestProperties();
    }

    public static Configuration get() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }
}
