/*
 * The MIT License
 *
 * Copyright 2017 d.peters.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package adventuregame.magic;

/**
 *
 * This class is used to generate effects for spells and abilities
 * @author d.peters
 */
public class Effect {

    /**
     * What the effect does (eg. healing, damage etc.)
     */
    private final EMechanic mechanic;
    
    /**
     * The magnitude of the effect
     */
    private final double value;
    
    /**
     * Duration of the effect
     */
    private final double duration;

    /**
     * Default constructor sets the mechanic, the value and the duration of the effect
     * @param mechanic what the effect does (eg. damaga, healing, poison etc)
     * @param value the magnitude of the effect
     * @param duration duration of the effect
     */
    public Effect(EMechanic mechanic, double value, double duration) {
        this.mechanic = mechanic;
        this.value = value;
        this.duration = duration;
    }

}
