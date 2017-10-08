package adventuregame.characters.dialogue;

import adventuregame.characters.interfaces.ITalker;

/**
 * Definition of a dialogue.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Dialogue {
  /**
   * The sender of the message.
   */
  private ITalker sender;
  /**
   * The recipient of the message.
   */
  private ITalker receiver;
  /**
   * The message to be sent.
   */
  private String message;

  /**
   * Default constructor.
   *
   * @param sender   sender
   * @param receiver receiver
   * @param message  message
   */
  public Dialogue(ITalker sender, ITalker receiver, String message) {
    this.sender = sender;
    this.receiver = receiver;
    this.message = message;
  }
}
