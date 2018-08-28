package ch.peters.daniel.adventuregame.characters.dialogue;

import ch.peters.daniel.adventuregame.characters.interfaces.Talker;

/**
 * Definition of a dialogue.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Dialogue {
  private Talker sender;
  private Talker receiver;
  private String message;

  public Dialogue(Talker sender, Talker receiver, String message) {
    this.sender = sender;
    this.receiver = receiver;
    this.message = message;
  }
}
