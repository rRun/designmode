package com.fortis.designmode.create.builder;

public class SimplePlayModelBuilder extends PlayModelBuilder {
    @Override
    public void dispayMenu() {
        System.out.println("简单模式：");
        playModel.menu();
    }

    @Override
    public void displayPlayList() {
        System.out.println("简单模式：");
        playModel.playList();
    }

    @Override
    public void displayMainView() {
        System.out.println("简单模式：");
        playModel.mainView();
    }

    @Override
    public void displayControl() {
        System.out.println("简单模式：");
        playModel.control();
    }

    @Override
    public boolean isMenuValid() {
        return false;
    }

    @Override
    public boolean isPlayListValid() {
        return false;
    }

    @Override
    public boolean isMainViewValid() {
        return true;
    }

    @Override
    public boolean isControlValid() {
        return true;
    }
}
