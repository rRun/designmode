package com.fortis.designmode.create.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayModelControllerTest {

    @Test
    public void play(){
        PlayModelController controller = new PlayModelController();
        PlayModel playModel = controller.construct(new SimplePlayModelBuilder());

    }
}