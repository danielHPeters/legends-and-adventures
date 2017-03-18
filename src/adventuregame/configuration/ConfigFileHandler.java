/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.configuration;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class ConfigFileHandler {

    /**
     *
     */
    private final File CONFIG_FILE = new File("settings.cfg");

    /**
     *
     */
    private Properties props;

    /**
     *
     */
    private BufferedReader reader;

    /**
     *
     */
    private BufferedWriter writer;

    /**
     *
     */
    public ConfigFileHandler() {

        try {
            this.props = new Properties();
            this.reader = new BufferedReader(new FileReader(this.CONFIG_FILE));
            this.writer = new BufferedWriter(new FileWriter(this.CONFIG_FILE));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConfigFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     */
    public void loadSettings() {

        try {

            this.props.load(this.reader);
        } catch (IOException ex) {
            Logger.getLogger(ConfigFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * 
     * @param key
     * @param value 
     */
    public void saveSetting(String key, String value) {
        try {

            this.props.setProperty(key, value);
            this.props.store(this.writer, key);
        } catch (IOException ex) {
            Logger.getLogger(ConfigFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Properties getProps() {
        return props;
    }
}
