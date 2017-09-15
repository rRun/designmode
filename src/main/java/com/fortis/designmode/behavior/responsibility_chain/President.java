package com.fortis.designmode.behavior.responsibility_chain;

public class President extends Role {
    @Override
    public void handleReport(Report report) {
        if (report.days>30){
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
