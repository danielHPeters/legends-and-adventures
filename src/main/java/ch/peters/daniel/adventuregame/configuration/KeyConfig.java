package ch.peters.daniel.adventuregame.configuration;

import ch.peters.daniel.adventuregame.actions.KeyAction;
import javafx.scene.input.KeyCode;

/**
 * Keyboard configuration.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
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
