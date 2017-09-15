package com.fortis.designmode.behavior.command;

public class OpenCommand extends Command {

    public OpenCommand(BoardSreen sreen) {
        super(sreen);
    }

    @Override
    public void execute() {
        this.getBoardSreen().open();
    }
}
