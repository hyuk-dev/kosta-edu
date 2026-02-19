package com.ws06.dto;

public class LoanAccountDto extends AccountDto {
    String mortgage;

    public LoanAccountDto(String mortgage) {
        this.mortgage = mortgage;
    }

    public LoanAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, String mortgage) {
        super(accountSeq, accountNumber, balance, userSeq);
        this.mortgage = mortgage;
    }

    public String getMortgage() {
        return mortgage;
    }

    public void setMortgage(String mortgage) {
        this.mortgage = mortgage;
    }

    @Override
    public String toString() {
        return "LoanAccountDto{" +
                "mortgage='" + mortgage + '\'' +
                "} " + super.toString();
    }
}
