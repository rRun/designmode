package com.fortis.designmode.behavior.responsibility_chain;

public class Congress extends Role {
    @Override
    public void handleReport(Report report) {
        if (report.days < 10 && !report.passed){
            if (report.reason == null){
                report.reject ="没有请假理由";
                report.passed = false;
            }else {
                report.passed = true;
            }

        }else {
            this.getNextRole().handleReport(report);
        }
    }
}
