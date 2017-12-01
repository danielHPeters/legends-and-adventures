package adventuregame.characters.player;

import adventuregame.characters.GameCharacter;
import adventuregame.items.Item;

import java.util.List;

/**
 * Player object.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Player extends GameCharacter {
  private String playerId;

  /**
   * Default Constructor.
   *
   * @param name      player name
   * @param gender    player gender
   * @param inventory player inventory
   */
  public Player(String name, String gender, List<Item> inventory) {
    this.name = name;
    this.gender = gender;
    this.inventory = inventory;
  }
}
