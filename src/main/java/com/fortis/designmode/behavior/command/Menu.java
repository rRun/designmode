package com.fortis.designmode.behavior.command;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> items ;
    public Menu(){
        this.items = new ArrayList<MenuItem>();
    }

    public void addMenuItem(MenuItem item){
        this.items.add(item);
    }

    public void click(int index){
        MenuItem item = this.items.get(index);
        item.click();
    }
}
