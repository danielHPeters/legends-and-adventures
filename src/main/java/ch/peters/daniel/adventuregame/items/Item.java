package ch.peters.daniel.adventuregame.items;

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
