package utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;

public class Properties {
    public static final Properties INSTANCE = new Properties();

    public String readProperties(String name, String propertyPass) {

        final String dir = System.getProperty("user.dir");
        FileInputStream fis;
        java.util.Properties property = new java.util.Properties();
        try {
            fis = new FileInputStream(dir + propertyPass);
            property.load(fis);
            return property.getProperty(name);

        } catch (IOException e) {
            System.err.println("error, properties file not found!");
        }
        return null;
    }

    public static final ObjectMapper MAPPER = new ObjectMapper();
}