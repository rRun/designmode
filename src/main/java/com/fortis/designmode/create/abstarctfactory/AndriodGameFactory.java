package com.fortis.designmode.create.abstarctfactory;

public class AndriodGameFactory implements GameFactory{
    @Override
    public InterfaceController getInterfaceController() {
        AndroidInterfaceController androidInterfaceController = new AndroidInterfaceController();
        return androidInterfaceController;
    }

    @Override
    public OperationController getOperationController() {
        return new AndroidOperationController();
    }
}
