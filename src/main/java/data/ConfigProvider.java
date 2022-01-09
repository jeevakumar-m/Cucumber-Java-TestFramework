package data;

import Common.Constants;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigProvider {

    private static Properties propertyFile;

    static {
        BufferedReader fileReader;
        try
        {
            fileReader=new BufferedReader(new FileReader(Constants.configFilePath));
            propertyFile= new Properties();
            propertyFile.load(fileReader);
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValueOf(String key)
    {
        return propertyFile.getProperty(key);
    }

}
