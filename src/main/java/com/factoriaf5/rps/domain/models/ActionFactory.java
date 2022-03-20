package com.factoriaf5.rps.domain.models;

public class ActionFactory {

    public Action getAction(String type) {

        if (type.equalsIgnoreCase("r")) {
            return new Rock();
        } else if (type.equalsIgnoreCase("p")) {
            return new Paper();
        } else if (type.equalsIgnoreCase("s")) {
            return new Scissor();
        }
        return null;
    }

}
