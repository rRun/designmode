package com.fortis.designmode.struct.composite;

public class BUnit implements Unit{
    @Override
    public void sendNotifaction(String notif) {
        System.out.println("B :" + notif);
    }
}
