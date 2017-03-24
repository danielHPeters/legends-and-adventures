/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.items;

/**
 *
 * @author Daniel
 */
public class GameKey extends Item {

    /**
     * Specify for which object the key is used for
     */
    private String keyId;

    /**
     *
     * @param name
     * @param description
     * @param keyId
     */
    public GameKey(String name, String description, String keyId) {
        super(name, description);
        this.keyId = keyId;
    }

}
