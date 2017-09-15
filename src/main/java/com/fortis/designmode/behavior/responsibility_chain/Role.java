package com.fortis.designmode.behavior.responsibility_chain;

public abstract class Role {

    private Role nextRole;

    public abstract void handleReport(Report report);

    public Role getNextRole() {
        return nextRole;
    }

    public void setNextRole(Role nextRole) {
        this.nextRole = nextRole;
    }

}
