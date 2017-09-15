package com.fortis.designmode.behavior.command;

public abstract class Command {
    public BoardSreen getBoardSreen() {
        return boardSreen;
    }

    public void setBoardSreen(BoardSreen boardSreen) {
        this.boardSreen = boardSreen;
    }

    public Command(BoardSreen sreen){
        this.boardSreen = sreen;
    }

    private BoardSreen boardSreen;

    public abstract void execute();
}
