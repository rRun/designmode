package com.fortis.designmode.behavior.command;

import org.junit.Test;

public class CommandTest {
    @Test
    public void excute(){
        Menu menu = new Menu();
        BoardSreen screen = new BoardSreen();
        menu.addMenuItem(new MenuItem(new CreateCommand(screen)));
        menu.addMenuItem(new MenuItem(new OpenCommand(screen)));
        menu.addMenuItem(new MenuItem(new EditCommand(screen)));

        menu.click(0);
        menu.click(1);
        menu.click(2);
    }
}
