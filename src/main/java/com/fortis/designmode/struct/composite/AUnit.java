package com.fortis.designmode.struct.composite;

public class AUnit implements Unit{
    @Override
    public void sendNotifaction(String notif) {
        System.out.println("A :" + notif);
    }
}
