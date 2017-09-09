package com.fortis.designmode.create.abstarctfactory;

public interface GameFactory {
    public InterfaceController getInterfaceController();
    public OperationController getOperationController();
}
