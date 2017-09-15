package com.fortis.designmode.behavior.responsibility_chain;

public class Report {
    public String reason;//原因
    public int days;//天数
    public String reject;//拒绝原因

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public boolean passed;

    public Report(String reason,int days){
        this.reason = reason;
        this.days = days;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getReject() {
        return reject;
    }

    public void setReject(String reject) {
        this.reject = reject;
    }
}
