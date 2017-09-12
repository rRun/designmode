package com.fortis.designmode.struct.composite;

public class MyCompany extends CompanyInterface implements Unit {
    @Override
    public boolean add(Unit unit) {
        return this.units.add(unit);
    }

    @Override
    public boolean remove(Unit unit) {
        return this.units.remove(unit);
    }

    @Override
    public Unit getUnit(int index) {
        return this.units.get(index);
    }

    @Override
    public void sendNotifaction(String notif) {
        for (Unit unit:this.units) {
            unit.sendNotifaction(notif);
        }
    }
}
