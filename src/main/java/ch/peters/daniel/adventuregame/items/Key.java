package ch.peters.daniel.adventuregame.items;

/**
 * Key as Item. Uses id for unique identification.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Key extends Item {
  /**
   * Specify for which object the key is used for.
   */
  private String keyId;

  public Key(String name, String description, String keyId) {
    super(name, description);
    this.keyId = keyId;
  }
}
