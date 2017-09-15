package com.fortis.designmode.behavior.command;

public class CreateCommand extends Command {
    public CreateCommand(BoardSreen sreen) {
        super(sreen);
    }

    @Override
    public void execute() {
        this.getBoardSreen().create();
    }
}
