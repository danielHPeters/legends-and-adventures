/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.characters.dialogue;

import adventuregame.characters.interfaces.ITalker;

/**
 * Definition of a dialogue
 * @author Daniel
 */
public class Dialogue {
    
    /**
     * The sender of the message
     */
    private ITalker sender;
    
    /**
     * The recipient of the message
     */
    private ITalker receiver;
    
    /**
     * The message to be sent
     */
    private String message;
    
    /**
     * 
     * @param sender
     * @param receiver
     * @param message 
     */
    public Dialogue(ITalker sender, ITalker receiver, String message){
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }
}
