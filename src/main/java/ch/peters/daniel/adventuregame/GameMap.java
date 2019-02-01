package ch.peters.daniel.adventuregame;

import ch.peters.daniel.adventuregame.characters.player.Player;
import ch.peters.daniel.adventuregame.rooms.Room;

import java.util.List;

/**
 * Game map implementation.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class GameMap {
  private List<Room> rooms;
  private List<Player> activePlayers;

  public GameMap(List<Room> rooms, List<Player> activePlayers) {
    this.rooms = rooms;
    this.activePlayers = activePlayers;
  }

  public List<Room> getRooms() {
    return rooms;
  }

  public List<Player> getActivePlayers() {
    return activePlayers;
  }
}
