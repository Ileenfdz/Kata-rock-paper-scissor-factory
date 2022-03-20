package com.factoriaf5.rps.domain.models;

import com.factoriaf5.rps.domain.contracts.InterfaceAction;

public class ActionFactory {

    public InterfaceAction getAction(String actionType) {

        if (actionType.equals("r")) {
            return new Rock();
        } else if (actionType.equals("p")) {
            return new Paper();
        } else if (actionType.equals("s")) {
            return new Scissor();
        }
        return null;
    }

}
