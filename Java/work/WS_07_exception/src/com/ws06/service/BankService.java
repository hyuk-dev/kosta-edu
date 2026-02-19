package com.ws06.service;

import com.ws06.dto.AccountDto;
import com.ws06.dto.UserDto;
import com.ws06.exception.BalanceLackException;
import com.ws06.exception.UserAccountNotFoundException;

import java.util.List;

public interface BankService {
    List<AccountDto> getAccountList(int userSeq);
    UserDto getUserDetail(int userSeq);
    List<AccountDto> getAccountList();
    List<AccountDto> getAccountListSortByBalance();
    List<AccountDto> getAccountListSortByUserSeq();
    AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException;
    int withdraw(int userSeq, int accountSeq, int amount) throws BalanceLackException, UserAccountNotFoundException;
}
