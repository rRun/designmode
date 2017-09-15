package com.fortis.designmode.struct.flyweight;

public class Coordinate {
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    private String site;

    public Coordinate(String site){
        this.site = site;
    }
}
