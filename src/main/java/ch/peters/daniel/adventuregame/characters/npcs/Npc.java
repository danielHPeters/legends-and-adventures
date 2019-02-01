package ch.peters.daniel.adventuregame.characters.npcs;

import ch.peters.daniel.adventuregame.characters.GameCharacter;
import ch.peters.daniel.adventuregame.characters.professions.Profession;
import ch.peters.daniel.adventuregame.items.Item;

import java.util.List;

/**
 * NPC object.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Npc extends GameCharacter {
  private boolean hostile;
  private Profession profession;

  public Npc(String name, Gender gender, List<Item> inventory, Profession profession) {
    this.name = name;
    this.gender = gender;
    this.inventory = inventory;
    this.profession = profession;
    this.hostile = false;
  }

  public void idleAction() {
    this.profession.doWork();
  }
}
