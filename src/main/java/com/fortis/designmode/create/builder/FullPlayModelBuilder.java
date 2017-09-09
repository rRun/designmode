package com.fortis.designmode.create.builder;

public class FullPlayModelBuilder extends PlayModelBuilder {
    @Override
    public void dispayMenu() {
        System.out.println("完整模式：");
        playModel.menu();
    }

    @Override
    public void displayPlayList() {
        System.out.println("完整模式：");
        playModel.playList();
    }

    @Override
    public void displayMainView() {
        System.out.println("完整模式：");
        playModel.mainView();
    }

    @Override
    public void displayControl() {
        System.out.println("完整模式：");
        playModel.control();
    }

    @Override
    public boolean isMenuValid() {
        return true;
    }

    @Override
    public boolean isPlayListValid() {
        return true;
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
