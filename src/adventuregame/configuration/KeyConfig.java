package adventuregame.configuration;

import adventuregame.actions.KeyAction;
import javafx.scene.input.KeyCode;

/**
 * Keyboard configuration.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class KeyConfig {
  private KeyCode key;
  private KeyAction action;

  public KeyConfig(KeyCode key, KeyAction action) {
    this.key = key;
    this.action = action;
  }
}
