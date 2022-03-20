package com.factoriaf5.rps.domain.models;

import com.factoriaf5.rps.domain.contracts.InterfaceAction;

public class Paper implements InterfaceAction{

    public String name = "p";

    public String getAction(){
        return name;
    }

    public String getName(){
        return name;
    }

}
