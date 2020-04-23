package com.bayamp.santaclara2020.data.utils;

import java.io.*;
import java.util.Properties;

public class PropertyUtils {
    private static Properties prop=null;
    private static final String CONFIG_FILE_PATH="src/test/resources/data/config.properties";

    public static String getProperty(String propertyName) throws IOException {

        if(prop==null) {
            prop = new Properties();
            File file = new File(CONFIG_FILE_PATH);
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(file);
                prop.load(inputStream);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return prop.getProperty(propertyName);
    }

}