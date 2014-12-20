package com.pos.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by alexandrenguyen on 20/12/14.
 */
public class Configuration {

    public static String CONFIG_FILE = "config.properties";
    private List<MetaConfig> metas;
    Properties prop = new Properties();
    InputStream input = null;

    public Configuration() {

        metas = new ArrayList<MetaConfig>();

        //Loading configuration file
        try {
            input = new FileInputStream(CONFIG_FILE);
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public MetaConfig getMeta(String metaName) {

        String metaValue = null;

        metaValue = prop.getProperty(metaName);

        MetaConfig metaConfig = new MetaConfig();
        metaConfig.setMetaName(metaName);
        metaConfig.setMetaValue(metaValue);

        return metaConfig;
    }
}
