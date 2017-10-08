package adventuregame.configuration;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Configuration file handler.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class ConfigFileHandler {
  private final File configFile;
  private Properties props;
  private BufferedReader reader;
  private BufferedWriter writer;

  /**
   * Default constructor.
   */
  public ConfigFileHandler() {
    this.configFile = new File("settings.cfg");
    try {
      this.props = new Properties();
      this.reader = new BufferedReader(new FileReader(configFile));
      this.writer = new BufferedWriter(new FileWriter(configFile));
    } catch (IOException ex) {
      Logger.getLogger(ConfigFileHandler.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  /**
   * Load saved settings.
   */
  public void loadSettings() {
    try {
      this.props.load(this.reader);
    } catch (IOException ex) {
      Logger.getLogger(ConfigFileHandler.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  /**
   * Save settings to config file.
   *
   * @param key   setting key
   * @param value setting value
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
