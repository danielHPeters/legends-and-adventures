/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.characters.player;

import adventuregame.characters.GameCharacter;
import adventuregame.items.Item;
import java.util.List;

/**
 *
 * @author d.peters
 */
public class Player extends GameCharacter {

    /**
     *
     */
    private String playerId;

    /**
     * Default Constructor
     *
     * @param name
     * @param gender
     * @param inventory
     */
    public Player(String name, String gender, List<Item> inventory) {

        this.name = name;
        this.gender = gender;
        this.inventory = inventory;

    }
}
