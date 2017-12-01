package adventuregame.items;

import java.util.List;

/**
 * Item class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Item {
  private String name;
  private String description;
  private List<String> properties;

  /**
   * Default constructor. Requires item name and description.
   *
   * @param name        name of the item
   * @param description details of item
   */
  public Item(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() {
    return this.name;
  }

  public String getDescription() {
    return description;
  }

  public List<String> getProperties() {
    return properties;
  }
}
