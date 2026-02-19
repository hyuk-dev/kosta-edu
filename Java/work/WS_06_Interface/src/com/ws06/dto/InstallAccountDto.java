package com.ws06.dto;

public class InstallAccountDto extends AccountDto {
    int period;
    int amount;

    public InstallAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, int period, int amount) {
        super(accountSeq, accountNumber, balance, userSeq);
        this.period = period;
        this.amount = amount;
    }

    public InstallAccountDto() {
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "InstallAccountDto{" +
                "period=" + period +
                ", amount=" + amount +
                "} " + super.toString();
    }
}
