package com.ws06.dto;

public class SavingAccountDto extends AccountDto{
    int transferFee;
    public SavingAccountDto() {}

    public SavingAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, int transferFee) {
        super(accountSeq, accountNumber, balance, userSeq);
        this.transferFee = transferFee;
    }

    public int getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(int transferFee) {
        this.transferFee = transferFee;
    }

    @Override
    public String toString() {
        return "SavingAccountDto{" +
                "transferFee=" + transferFee +
                "} " + super.toString();
    }
}
