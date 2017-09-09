package com.fortis.designmode.create.builder;

public abstract class PlayModelBuilder {

    protected PlayModel playModel = new PlayModel();

    public abstract void dispayMenu();
    public abstract void displayPlayList();
    public abstract void displayMainView();
    public abstract void displayControl();

    public abstract boolean isMenuValid();
    public abstract boolean isPlayListValid();
    public abstract boolean isMainViewValid();
    public abstract boolean isControlValid();

    public PlayModel createPlayModel(){
        return playModel;
    }
}
