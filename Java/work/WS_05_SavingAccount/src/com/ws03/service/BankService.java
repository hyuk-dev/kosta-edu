package com.ws06.service;
/**
 * 고객과 계좌에 관련된 서비스
 * (Business Logic 을 처리하는 객체)
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import assignment0210.Account;
import com.ws06.dto.*;

public class BankService {
	//final은 고정값= 값변경불가 (반드시 초기화 필수)
	final int ACCOUNT_SIZE = 10; /**계좌 최대개수*/
	final int USER_SIZE = 5;/**고객 최대개수 */
	
	int ACCOUNT_CURRENT_SIZE; //0 /** 현재계좌의 개수 - 저장된 계좌의수 */
	int USER_CURRENT_SIZE; //0 /**현재 고객의 개수 - 저장된 고객의 수 */
	
	List<UserDto> userList = new ArrayList<UserDto>();//null-> 주소값
	List<AccountDto> accountList = new ArrayList<AccountDto>() ; //null
	
	/**
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다
	 * */
	public BankService() {

			userList = new ArrayList<UserDto>();
			accountList = new ArrayList<AccountDto>();

			userList.add( new UserDto(111, "홍길동", "hong@gildong@com", "010-1111-1111", false) );
			userList.add( new UserDto(222, "이길동", "lee@gildong@com", "010-2222-2222", true) );
			userList.add( new UserDto(333, "삼길동", "sam@gildong@com", "010-3333-3333", false) );

			accountList.add( new InstallAccountDto(20, "00200202002002", 1000, 111, 12, 10000) );

			accountList.add( new SavingAccountDto(10, "00100101001001", 500, 111, 100) );

			accountList.add( new LoanAccountDto(60, "00600606006006", 500, 333, "House") );
			accountList.add( new LoanAccountDto(30, "00300303003003", 0, 111, "Building") );

			accountList.add( new SavingAccountDto(70, "00700707007007", 500, 333, 200) );

			accountList.add( new LoanAccountDto(50, "00500505005005", 200, 222, "Car") );
			accountList.add( new SavingAccountDto(40, "00400404004004", 1000, 222, 50) );

		 
	}//생성자 끝

	/**
	 *  전체 계좌 목록을 리턴한다.
	 */
	public List<AccountDto> getAccountList() {
		return accountList;
	}

	/**
	 * 잔액 기준 정렬 후 전체 조회
	 */
	public List<AccountDto> getAccountListSortByBalance() {
		List<AccountDto> pastedAccountList = accountList;
		Collections.sort(pastedAccountList);
		return pastedAccountList;
	}

	/**
	 * 사용자 일련번호로 정렬 후 전체 조회
	 */
	public List<AccountDto> getAccountListSortByUserSeq() {
		List<AccountDto> pastedAccountList = accountList;
		Collections.sort(pastedAccountList, new UserSeqSort());
		return pastedAccountList;
	}

    /**
	  특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드를 작성한다
	*/
	public List<AccountDto> getAccountList(int userSeq) { // 100 
//		 int searchAccountCount=0; //인수로 전달된 userSeq에 해당하는 계좌의 개수를 체크
//		System.out.println(accountList.get(1).getUserSeq());
//		 //리턴해서 나갈 배열의 개수를 미리 알아내여 선언하기 위해 반복문필요
//		 for(int i=0; i < ACCOUNT_CURRENT_SIZE ; i++) {
//				if( accountList.get(i).getUserSeq()  == userSeq) {
//					 //찾았다!!
//					searchAccountCount++;
//				}
//		}
			List<AccountDto> foundAccountList = new ArrayList<>();
			for(AccountDto ad : accountList) {
				if(ad.getUserSeq() == userSeq) {
					foundAccountList.add(ad);
				}
			}
			//위에서 찾은 정보를 바탕으로  AccountDto배열에서 계좌정보를 찾아서  리턴해준다.
			//찾은 고객의 계좌의 수만큼 배열을 생성해서 그 배열을 리턴
//			if(searchAccountCount==0)
//				return null;
//
//			AccountDto [] searchAccountDtoList =  new AccountDto [searchAccountCount];
//
//			int count=0;
//			for(int i=0; i < ACCOUNT_CURRENT_SIZE ; i++) {
//				if( accountList.get(i).getUserSeq()  == userSeq) {
//					searchAccountDtoList[count++] =  accountList.get(i);
//				}
//			}

			
			return foundAccountList;
	}
	
	
	/**
	   특정 사용자의 고객 정보를 리턴 하는 메소드를 작성한다
	   
	   @param : 고객의 sequence
	   @return : null이면 고객의정보없다 
	**/
	public UserDto getUserDetail(int userSeq) {
//		for(int i=0; i< USER_CURRENT_SIZE ; i++) {
//			System.out.println(userSeq);
//			if(userList.get(i).getUserSeq() == userSeq) {
//				//찾았다.
//				return userList.get(i);
//			}
//		}
		for(UserDto ud : userList) {
			if(ud.getUserSeq() == userSeq) {
				return ud;
			}
		}
		
		return null;
	}

}

class UserSeqSort implements Comparator<AccountDto> {

	@Override
	public int compare(AccountDto o1, AccountDto o2) {
		return o1.getUserSeq() - o2.getUserSeq();
	}
}


