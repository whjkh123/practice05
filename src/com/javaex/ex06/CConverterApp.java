package com.javaex.ex06;

public class CConverterApp {

	public static void main(String[] args) {

		double dollar;
		double won;

		CConverter.setRate(1118.70);

		// 100만원을 달러로 출력하기
		double result01 = CConverter.toDoller(1000000);
		System.out.println("100만원은 " + result01 + "달러 입니다.");

		// 100달려를 원으로 출력하기
		double result02 = CConverter.toKWR(100);
		System.out.println("100달러는 " + result02 + "원 입니다.");

	}

}
