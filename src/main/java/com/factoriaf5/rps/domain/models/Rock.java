package com.factoriaf5.rps.domain.models;

import com.factoriaf5.rps.domain.contracts.InterfaceAction;

public class Rock implements InterfaceAction{

    public String name = "r";

    public String getAction(){
        return name;
    }
    
    public String getName(){
        return name;
    }
}
