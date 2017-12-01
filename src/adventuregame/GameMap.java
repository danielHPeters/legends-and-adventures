package adventuregame;

import adventuregame.characters.player.Player;
import adventuregame.rooms.Room;
import java.util.List;

/**
 * Game map implementation.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class GameMap {

  public List<Room> rooms;

  public List<Player> activePlayers;
}
