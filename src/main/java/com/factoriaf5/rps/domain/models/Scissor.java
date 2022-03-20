package com.factoriaf5.rps.domain.models;

import com.factoriaf5.rps.domain.contracts.InterfaceAction;

public class Scissor implements InterfaceAction{

    public String name = "s";

    public String getAction(){
        return name;
    }
    
    public String getName(){
        return name;
    }

}
