package ch.peters.daniel.adventuregame.characters.player;

import ch.peters.daniel.adventuregame.characters.GameCharacter;
import ch.peters.daniel.adventuregame.items.Item;

import java.util.List;

/**
 * Player object.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Player extends GameCharacter {
  private String playerId;

  public Player(String name, Gender gender, List<Item> inventory) {
    this.name = name;
    this.gender = gender;
    this.inventory = inventory;
  }
}
