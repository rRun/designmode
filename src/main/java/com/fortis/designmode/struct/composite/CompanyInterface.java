package com.fortis.designmode.struct.composite;

import java.util.ArrayList;

public abstract class CompanyInterface {
    protected ArrayList<Unit> units = new ArrayList<Unit>();

    public abstract boolean add(Unit unit);
    public abstract boolean remove(Unit unit);
    public abstract Unit getUnit(int index);


}
