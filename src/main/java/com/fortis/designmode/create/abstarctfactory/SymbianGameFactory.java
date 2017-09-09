package com.fortis.designmode.create.abstarctfactory;

public class SymbianGameFactory implements GameFactory{
    @Override
    public InterfaceController getInterfaceController() {
        return new SymbianInterfaceController();
    }

    @Override
    public OperationController getOperationController() {
        return new SymbianOperationController();
    }
}
