package com.javaex.ex08;

import java.util.Scanner;

public class Account {

	private String accountNo;
	private int balance;

	// 생성자 작성
	public Account(String accountNo) {

	}

	// 필요한 메소드 작성
	Scanner sc = new Scanner(System.in);

	public void deposit(int money) {
		balance += money;

	}

	public void withdraw(int money) {
		balance -= money;
	}

	public void showBalance() {
		System.out.print("잔고액> " + balance);
	}
}
