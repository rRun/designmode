package com.fortis.designmode.create.builder;

public class PlayModelController {
    public PlayModel construct(PlayModelBuilder builder){

        if (builder.isMainViewValid()){
            builder.displayMainView();
        }

        if (builder.isControlValid()){
            builder.displayControl();
        }

        if (builder.isMenuValid()){
            builder.dispayMenu();
        }

        if (builder.isPlayListValid()){
            builder.displayPlayList();
        }

        return builder.createPlayModel();
    }
}
